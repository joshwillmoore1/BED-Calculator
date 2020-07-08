package firstscene;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

/**
 *
 * @author Joshua W. Moore
 *
 * Functions derived from the following sources: 
 * Jones and Hopewell 2019 - A9
 * Moore et al. 'ongoing' - MA9 
 * Jones and Hopewell 2019 - Proton conversions
 * Woolley et al. 2018 - BED time-dependence
 *
 */


public class bedFunctions {

    //GLOBAL CONSTANTS
    public static double GKShift = 1.0508; //for shift to 120Gy @ 0.1185% gkshift = 1.0508
    public static double alpha_low = 0.06;
    public static double beta_low = 0.03;

    public static double gamma50_0 = 11.3764;
    public static double D50_0 = 76.5571;

    public static double gamma50_1 = 9.5675;
    public static double D50_1 = 64.3842;

    public static double gamma50_2 = 10.7338;
    public static double D50_2 = 72.2328;

    public static double gamma50_3 = 11.1428;
    public static double D50_3 = 74.9850;

    public static double EPSILON = 1e-8;

    public static double x = 0.5295; //partition coefficent - to be revised using new data
    public static double k = 2; //reference alpha/beta
    
    //constants for the M_A9 equation
    public static double a_ma9 = 0.3639;
    public static double b_ma9  = 0.0266;

    //GENERIC FUNCTIONS
    
    
    //NUMERICAL APPROX. FOR ERF FCN
    public static double erf(double z) {
        double t = (double) (1.0 / (1.0 + 0.5 * Math.abs(z)));

        double ans = (double) (1 - t * Math.exp(-z * z - 1.26551223
                + t * (1.00002368
                + t * (0.37409196
                + t * (0.09678418
                + t * (-0.18628806
                + t * (0.27886807
                + t * (-1.13520398
                + t * (1.48851587
                + t * (-0.82215223
                + t * (0.17087277)))))))))));
        if (z >= 0) {
            return ans;
        } else {
            return -ans;
        }

    }

    //BISECTION METHOD FOR SOLVING FOR ZEROS - this only works for functions with one argument 
    public static double Bisection(double a, double b, DoubleUnaryOperator func) {
        double EP = bedFunctions.EPSILON;

        if (func.applyAsDouble(a) * func.applyAsDouble(b) >= 0) {
            System.out.println("You have not assumed"
                    + " right a and B");
        }
        double c = a;
        while ((b - a) >= EP) {
            c = (a + b) / 2;
            if (func.applyAsDouble(c) == 0.0) {
                break;
            } else if (func.applyAsDouble(c) * func.applyAsDouble(a) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        return c;
    }

    //BISECTION METHOD FOR SOLVING FOR ZEROS - this only works for functions with two arguments
    public static double Bisection2(double a, double b, DoubleBinaryOperator func, double other_parameter) {
        double EP = bedFunctions.EPSILON;

        if (func.applyAsDouble(a, other_parameter) * func.applyAsDouble(b, other_parameter) >= 0) {
            System.out.println("You have not assumed"
                    + " right a and b");
        }
        double c = a;
        while ((b - a) >= EP) {
            c = (a + b) / 2;
            if (func.applyAsDouble(c, other_parameter) == 0.0) {
                break;
            } else if (func.applyAsDouble(c, other_parameter) * func.applyAsDouble(a, other_parameter) < 0) {
                b = c;
            } else {
                a = c;
            }
        }
        return c;
    }
    
    
    
   

    //Radiosurgey functions
    public static double repair(double mu, double time) {
        return (2 / (mu * time)) * (1 - ((1 - Math.exp(-1 * mu * time)) / (mu * time)));
    }

    public static double meanTime(double g, double T, double n) {
        return (1 / n) * (T - g * (n - 1));
    }

    public static double M_A9(double T) {
        double a = bedFunctions.a_ma9;
        double b = bedFunctions.b_ma9;

        return (a / b) * (1 - Math.exp(-b * T));
    }

    public static double GuidenceBEDret(double TreatTime, double BED2, double BED_RPER, double scale) {

        return (BED2 * BED_RPER) * 0.01 - scale * bedFunctions.M_A9(TreatTime);
    }

    public static double GKBED(double m_1, double m_2, double T, double g, double n, double D, double k) {

        double d = D / n;

        double t = meanTime(g, T, n);

        return (x * n * d * (1 + (d / k) * ((n - 1) * repair(m_1, T) + repair(m_1, t))) + (1 - x) * n * d * (1 + (d / k) * ((n - 1) * repair(m_2, T) + repair(m_2, t))));
    }
    
    
    
    

    //Probit curve functions
    public static double genericProbit(double Dinit, double G, double D) {
        return (double) (0.01 - 0.5 * (1 + bedFunctions.erf((double) (0.70710678118 * (G * (((Dinit) / D) - 1))))));
    }

    public static double genericShift(double s, double d, double Gamma, double D50, double Ref, double Conservative) {
        double refShift = GKShift * (0.05 * Ref - 5);

        return (double) (0.01 - 0.5 * (1 + bedFunctions.erf((double) (0.70710678118 * (Gamma * (((s + d * (1 - (Conservative) * 0.01)) / D50) - 1))) + refShift)));
    }

    public static double genericProbitShift(double Dinit, double s, double riskPercent, double gamma, double D50) {
        double riskProb = riskPercent * 0.01;

        return (double) (riskProb - 0.5 * (1 + bedFunctions.erf((double) (0.70710678118 * (gamma * (((s + Dinit) / D50) - 1))))));

    }
    
    
    
    

    //Dose functions
    public static double HU_totaleq(double d, double s, double Gamma, double D50, double percentage) {
        double P = percentage * 0.01;

        return (double) (P - 0.5 * (1 + bedFunctions.erf((double) (0.70710678118 * (Gamma * (((s + d) / D50) - 1))))));
    }

    public static double p_eqn(double Risk_percentage) {
        return Risk_percentage * 0.01;
    }

    
    
    
    
    //BED Percentage calculations
    public static double BEDinit(double D, double n) {
        double d = D / n;
        return (D * (1 + d / k));

    }

    public static double BED1_pc_human(double BEDinit, double Dtol_Hu) {

        return (BEDinit / (Dtol_Hu * 2)) * 100;
    }

    public static double BED1_pc(double Dret_0shift) {
        return (44 / Dret_0shift) * 100;
    }

    public static double genericBED21_pc(double Dret_i_shift, double Dret_0shift) {
        return (Dret_i_shift / Dret_0shift) * 100;
    }

    public static double BED_Rper(double Dtol_Hu) {
        return Dtol_Hu * 2;
    }

    public static double BED1(double bedinit, double Dtol_hu) {

        return (bedinit / (bedFunctions.BED_Rper(Dtol_hu))) * 100;
    }

    
    
    
    
    //generic functions for bed to obtain r values
    public static double BED2_generic_r_i(double a, double bed2, double bed1, double BED, double s0, double s1) {

        return (double) (bed2 - 100 * (1 - bed1 * 0.01) * (1 + (Math.pow(1 - bed1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s0 * (bed1 - BED / (1 + s1 * a))))));

    }

    
    
    
    
    
    
    //repair functions for long-time tissue repair
    public static double r(double t, double r_1, double r_2, double r_3) {

        double Tiro = (double) 0.19;
        double m = 0; // to be overwritten later

        double a = 3 * (Tiro * r_1) / (Tiro - 1) - 3 * (Tiro * r_2) / (Tiro - 2) + (Tiro * r_3) / (Tiro - 3);
        double b = (double) (-0.5 * ((5 * Tiro + 6) * r_1) / (Tiro - 1) + (4 * Tiro + 3) * r_2 / (Tiro - 2) - 0.5 * (3 * Tiro + 2) * (r_3) / (Tiro - 3));
        double c = (double) (0.5 * (Tiro + 5) * (r_1) / (Tiro - 1) - (Tiro + 4) * (r_2) / (Tiro - 2) + 0.5 * (Tiro + 3) * (r_3) / (Tiro - 3));
        double d = (double) (-0.5 * (r_1) / (Tiro - 1) + (r_2) / (Tiro - 2) - 0.5 * (r_3) / (Tiro - 3));

        if (t < Tiro) {
            return 0;
        } else {
            return m = (double) (a + b * t + c * Math.pow(t, 2) + d * Math.pow(t, 3));
        }

    }

    
    
    
    
    
    //dose functions to calculate retreatment dose for photon retreatments
    public static double dosefcn(double d, double bed2, double bed_r, double ret_fractions) {

        return (double) (bed2 * bed_r * 0.01 - (ret_fractions * d + ret_fractions * d * d * 0.5));

    }

    
    
    
    
    
    //standard probit curves used for all calculations - see Woolley et al. 2018
    public static DoubleUnaryOperator probit0 = (double Dinit) -> (0.01 - 0.5 * (1 + bedFunctions.erf((double) (0.70710678118 * (gamma50_0 * (((Dinit) / D50_0) - 1))))));

    public static DoubleUnaryOperator probit1 = (double Dret1) -> (0.01 - 0.5 * (1 + bedFunctions.erf((double) (0.70710678118 * (gamma50_1 * (((Dret1) / D50_1) - 1))))));

    public static DoubleUnaryOperator probit2 = (double Dret2) -> (0.01 - 0.5 * (1 + bedFunctions.erf((double) (0.70710678118 * (gamma50_2 * (((Dret2) / D50_2) - 1))))));

    public static DoubleUnaryOperator probit3 = (double Dret3) -> (0.01 - 0.5 * (1 + bedFunctions.erf((double) (0.70710678118 * (gamma50_3 * (((Dret3) / D50_3) - 1))))));

    
    
    
    
    
    
    
    //proton retreatment functions - see Jones and Hopewell 2019.
    public static double alpha_u_4_RE() {
        return (10.57 / 3.92) * (1 - Math.exp(-3.92 * bedFunctions.alpha_low));
    }

    public static double Ahi_4_RE(double retreat_letx, double retreat_letu, double retreat_letc) {

        return alpha_low + (bedFunctions.alpha_u_4_RE() - alpha_low) * (retreat_letx - retreat_letc) / (retreat_letu - retreat_letc);
    }

    public static double beta_u_4_RE() {
        return 0.06 * (1 - Math.exp(-50 * beta_low));
    }

    public static double Bhi_4_RE(double retreat_letx, double retreat_letu, double retreat_letc) {

        return beta_low + (beta_u_4_RE() - beta_low) * (retreat_letx - retreat_letc) / (retreat_letu - retreat_letc);
    }

    public static double d_low_2_4_RE(double retreat_d, double retreat_letx, double retreat_letu, double retreat_letc) {

        return 1 / (2 * beta_low) * (-alpha_low + Math.pow(alpha_low * alpha_low + 4 * Ahi_4_RE(retreat_letx, retreat_letu, retreat_letc) * beta_low * retreat_d + 4 * Bhi_4_RE(retreat_letx, retreat_letu, retreat_letc) * beta_low * retreat_d * retreat_d, 0.5));

    }

    public static double d_low_2_4_RE_CHECK(double d_hi, double retreat_letx, double retreat_letu, double retreat_letc) {

        return 1 / (2 * beta_low) * (-alpha_low + Math.pow(alpha_low * alpha_low + 4 * Ahi_4_RE(retreat_letx, retreat_letu, retreat_letc) * beta_low * d_hi + 4 * Bhi_4_RE(retreat_letx, retreat_letu, retreat_letc) * beta_low * d_hi * d_hi, 0.5));

    }
    
    

}