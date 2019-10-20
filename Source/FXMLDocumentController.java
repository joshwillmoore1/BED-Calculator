/*
 * Any computational issues related to the use of the GUI can 
 * be reported on the appropriate GitHub page under "issues". 
 *  Note Thomas E. Woolley and Joshua W. Moore are mathematicians
 *  and are unable to supply any help on any particular medical application.
 * These should be directed to the local clinical specialist of the user.
 */
package firstscene;

import java.awt.Font;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Slider;
import java.text.DecimalFormat;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class FXMLDocumentController implements Initializable {

    @FXML
    public Text BEDret_text;

    @FXML
    public Text Nominaltext31;

    @FXML
    public Text tissue_text_3;

    @FXML
    public Text tissue_text_2;

    @FXML
    public Text letx_ret_warn_4;

    @FXML
    public Text letc_ret_warn_4;

    @FXML
    public Text letu_ret_warn_4;

    @FXML
    public Text letc_warn_4;

    @FXML
    public Label RETFRAC_WARN_4;

    @FXML
    public Tab tab3;

    @FXML
    public NumberAxis NumAxis14;

    @FXML
    public Text warn_bed_4;

    @FXML
    public Text warn_bed_3;

    @FXML
    public Text nom_text_4;

    @FXML
    public Tab tab4;

    @FXML
    public Tab tab1;

    @FXML
    public NumberAxis NumAxis12;

    @FXML
    public Tab tab2;

    @FXML
    public Rectangle rect_4;

    @FXML
    public NumberAxis NumAxis13;

    @FXML
    public Text warn_bed_2;

    @FXML
    public Text letu_warn_2;

    @FXML
    public Text Nominaltext32;

    @FXML
    public Text final_last_2;

    @FXML
    public Text final_2;

    @FXML
    public Text Label_InitDose_3;

    @FXML
    public Text Label_InitDose_4;

    @FXML
    public Text letx_warn_4;

    @FXML
    public Text letx_warn_3;

    @FXML
    public Text letx_warn_2;

    @FXML
    public TextField RiskOfMyel;

    @FXML
    public Text Label_InitDose_2;

    @FXML
    public Text p_value_4;

    @FXML
    public NumberAxis NumAxis242;

    @FXML
    public TextField letx_3;

    @FXML
    public Button reset_4;

    @FXML
    public Rectangle rect_3;

    @FXML
    public CheckBox dose_select_4;

    @FXML
    public TextField letx_2;

    @FXML
    public TextField letx_4;

    @FXML
    public NumberAxis NumAxis22;

    @FXML
    public Button reset_2;

    @FXML
    public Button reset_3;

    @FXML
    public Text Num_Warn_1;

    @FXML
    public Text Num_Warn_3;

    @FXML
    public Text Label_initfrac;

    @FXML
    public Text Num_Warn_2;

    @FXML
    public NumberAxis NumAxis24;

    @FXML
    public Text BEDinit_text;

    @FXML
    public Text Num_Warn_4;

    @FXML
    public Text letc_text_3;

    @FXML
    public Text final_4;

    @FXML
    public Text final_last_4;

    @FXML
    public Text ret_frac_out_4;

    @FXML
    public Label BED_label;

    @FXML
    public Label run_1;

    @FXML
    public Label RBE_IN_TEXT_4;

    @FXML
    public TextField DHIGH_4;

    @FXML
    public TextField DHIGH_2;

    @FXML
    public TextField letc_3;

    @FXML
    public Label RETFRAC_WARN_2;

    @FXML
    public TextField s0_1;

    @FXML
    public Text s0_warn;

    @FXML
    public Label NumOfYearslabel;

    @FXML
    public TextField initalDose;

    @FXML
    public Text nom_text_2;

    @FXML
    public Button reset;

    @FXML
    public NumberAxis CatAxis242;

    @FXML
    public Button key_3;

    @FXML
    public Button key_2;

    @FXML
    public TextField RetreatFrac_3;

    @FXML
    public Button RdntBtn3;

    @FXML
    public Text Bed_over_1;

    @FXML
    public Text Nominaltext;

    @FXML
    public NumberAxis NumAxis2;

    @FXML
    public Text letx_text_4;

    @FXML
    public NumberAxis NumAxis1;

    @FXML
    public Text letx_text_2;

    @FXML
    public Text letu_text_3;

    @FXML
    public Text letx_text_3;

    @FXML
    public Text letu_text_4;

    @FXML
    public Text ret_frac_out_3;

    @FXML
    public Text final_3;

    @FXML
    public Text final_last_3;

    @FXML
    public Label out;

    @FXML
    public Text letu_text_2;

    @FXML
    public Text BEDret_text_2;

    @FXML
    public Text p_low;

    @FXML
    public Text tissue_text_21;

    @FXML
    public Text nom_text_21;

    @FXML
    public LineChart<?, ?> chart2_3;

    @FXML
    public TextField RetreatFrac;

    @FXML
    public LineChart<?, ?> chart2_4;

    @FXML
    public Label percentagelabel;

    @FXML
    public LineChart<?, ?> chart2_2;

    @FXML
    public Text eqn1_text;

    @FXML
    public Button key;

    @FXML
    public Slider BEDslider;

    @FXML
    public Text d_hi_4;

    @FXML
    public Text ret_frac_out_2;

    @FXML
    public Slider PercentageSlider;

    @FXML
    public Text ret_frac_out_1;

    @FXML
    public Text final_1;

    @FXML
    public Text final_last_1;

    @FXML
    public Text eqn3_text_4;

    @FXML
    public Text BEDR_text1;

    @FXML
    public Text s0_text_3;

    @FXML
    public Text s1_text_3;

    @FXML
    public Text Bed_over_3;

    @FXML
    public TextField s0_3;

    @FXML
    public TextField s1_3;

    @FXML
    public TextField bed_3;

    @FXML
    public Text s0_text_4;

    @FXML
    public Text s1_text_4;

    @FXML
    public Text p_value_3;

    @FXML
    public Text p_value_2;

    @FXML
    public Text p_value_1;

    @FXML
    public Text Bed_over_4;

    @FXML
    public TextField s0_4;

    @FXML
    public TextField s1_4;

    @FXML
    public TextField bed_4;

    @FXML
    public Label nominal_tol_3;

    @FXML
    public Text nominal_text_3;

    @FXML
    public Text BEDret_text_3;

    @FXML
    public Text BEDret_text_4;

    @FXML
    public NumberAxis CatAxis2;

    @FXML
    public NumberAxis CatAxis1;

    @FXML
    public Slider NumOfYearsSlider;

    @FXML
    public Text eqn3_text_2;

    @FXML
    public Text eqn3_text_3;

    @FXML
    public Text letc_text_2;

    @FXML
    public Text d_hi_2;

    @FXML
    public Text initfrac_text;

    @FXML
    public Text p_low_2;

    @FXML
    public Text numFrac_text_1;

    @FXML
    public Text numFrac_text_2;

    @FXML
    public Text numFrac_text_3;

    @FXML
    public Text numFrac_text_4;

    @FXML
    public Text initfrac_text_4;

    @FXML
    public Text initfrac_text_3;

    @FXML
    public Text p_low_3;

    @FXML
    public Text initfrac_text_2;

    @FXML
    public Text p_low_4;

    @FXML
    public Button RdntBtn3_3;

    @FXML
    public Button RdntBtn3_2;

    @FXML
    public Button RdntBtn3_4;

    @FXML
    public AnchorPane Anchor_1;

    @FXML
    public Rectangle rect_1;

    @FXML
    public Text Label_InitDose;

    @FXML
    public TextField NumFrac_2;

    @FXML
    public TextField letc_2;

    @FXML
    public ScatterChart<?, ?> chart1_4;

    @FXML
    public Text BED1_text;

    @FXML
    public ScatterChart<?, ?> chart1_2;

    @FXML
    public TextField NumFrac_4;

    @FXML
    public ScatterChart<?, ?> chart1_3;

    @FXML
    public TextField NumFrac_3;

    @FXML
    public TextField NumFrac;

    @FXML
    public TextField s1_1;

    @FXML
    public Text s1_warn;

    @FXML
    public Text RBE_text_3;

    @FXML
    public Text p_high;

    @FXML
    public NumberAxis CatAxis13;

    @FXML
    public NumberAxis CatAxis12;

    @FXML
    public CheckBox RBE_CHECKBOX_4;

    @FXML
    public CheckBox RBE_CHECKBOX_3;

    @FXML
    public CheckBox RBE_CHECKBOX_2;

    @FXML
    public NumberAxis CatAxis14;

    @FXML
    public Text eqn2_text_4;

    @FXML
    public Text eqn2_text_3;

    @FXML
    public Text BED2_text_4;

    @FXML
    public Text ProDose_4;

    @FXML
    public Button Calculate;

    @FXML
    public Text BEDR_text_4;

    @FXML
    public Text ProDose_2;

    @FXML
    public Text eqn3_text;

    @FXML
    public NumberAxis CatAxis22;

    @FXML
    public Text BEDR_text_3;

    @FXML
    public Text BEDR_text_2;

    @FXML
    public ProgressBar prog;

    @FXML
    public TextField initalDose_2;

    @FXML
    public Text BED2_text_3;

    @FXML
    public NumberAxis CatAxis24;

    @FXML
    public TextField initalDose_4;

    @FXML
    public Text BED2_text_2;

    @FXML
    public TextField initalDose_3;

    @FXML
    public Text eqn2_text_2;

    @FXML
    public LineChart<?, ?> chart2;

    @FXML
    public ScatterChart<?, ?> chart1;

    @FXML
    public Text nom_text;

    @FXML
    public Text nominal_text_2;

    @FXML
    public Label nominal_tol_2;

    @FXML
    public Text Nominaltext311;

    @FXML
    public Button Calculate_4;

    @FXML
    public TextField Percentage_4;

    @FXML
    public Text s0_text;

    @FXML
    public Text eqn2_text;

    @FXML
    public Button Calculate_3;

    @FXML
    public TextField Percentage_3;

    @FXML
    public Button Calculate_2;

    @FXML
    public TextField Percentage_2;

    @FXML
    public Text BEDR2_TEXT_3;

    @FXML
    public TextField Percentage_1;

    @FXML
    public Text BEDR2_TEXT_2;

    @FXML
    public Text letc_warn_3;

    @FXML
    public Text letu_warn_3;

    @FXML
    public Text letu_warn_4;

    @FXML
    public TextField RiskOfMyel_4;

    @FXML
    public TextField letc_4;

    @FXML
    public TextField RiskOfMyel_2;

    @FXML
    public Text BEDR2_TEXT;

    @FXML
    public TextField RiskOfMyel_3;

    @FXML
    public Label out_4;

    @FXML
    public Label run_2;

    @FXML
    public Label out_3;

    @FXML
    public Label out_2;

    @FXML
    public TextField s0_2;

    @FXML
    public TextField s1_2;

    @FXML
    public TextField bed_2;

    @FXML
    public Text s0_text_2;

    @FXML
    public Text s1_text_2;

    @FXML
    public Text Bed_over_2;

    @FXML
    public Text s1_text;

    @FXML
    public Label run_3;

    @FXML
    public Label run_4;

    @FXML
    public TextField NumOfYears_1;

    @FXML
    public CheckBox dose_select_2;

    @FXML
    public Label s0_label;

    @FXML
    public Label Dret_text_2;

    @FXML
    public TextField NumOfYears_3;

    @FXML
    public TextField NumOfYears_2;

    @FXML
    public TextField NumOfYears_4;

    @FXML
    public Text eqn1_text_2;

    @FXML

    public AnchorPane Anchor_2;

    @FXML
    public Rectangle rect_2;

    @FXML
    public Text BEDinit_text_2;

    @FXML
    public Text eqn1_text_3;

    @FXML
    public Text BEDinit_text_3;

    @FXML
    public Text letc_warn_2;

    @FXML
    public Label Dret_text_4;

    @FXML
    public Text BED1_text_3;

    @FXML
    public Text eqn1_text_4;

    @FXML
    public Text warn_bed;

    @FXML
    public Text BED1_text_4;

    @FXML
    public Text Dret_text;

    @FXML
    public Text p_high_4;

    @FXML
    public Text Dret_text_3;

    @FXML
    public Text p_high_3;

    @FXML
    public Label s1_label;

    @FXML
    public Text p_high_2;

    @FXML
    public Text Label_initfrac_3;

    @FXML
    public Text Label_initfrac_2;

    @FXML
    public Text tissue_text;

    @FXML
    public Text Label_initfrac_4;

    @FXML
    public Text Per_Warn_2;

    @FXML
    public Text Per_Warn_1;

    @FXML
    public Text BEDR2_TEXT_4;

    @FXML

    public TabPane TabPane_1;

    @FXML
    public Text Per_Warn_4;

    @FXML
    public Text letc_text_4;

    @FXML
    public Text num_ret_frac_1;

    @FXML
    public Text num_ret_frac_2;

    @FXML
    public AnchorPane Anchor_4;

    @FXML
    public AnchorPane Anchor_3;

    @FXML
    public Text num_ret_frac_3;

    @FXML
    public Text num_ret_frac_4;

    @FXML
    public Text Per_Warn_3;

    @FXML
    public Text bed_warn;

    @FXML
    public Text BED2_text;

    @FXML
    public TextField letu_2;

    @FXML
    public TextField bed_1;

    @FXML
    public Text BED1_text_2;

    @FXML
    public Text BEDinit_text_4;

    @FXML
    public TextField letu_4;

    @FXML
    public TextField letu_3;

    @FXML
    public CheckBox RBE_RET_CHECKBOX_4;

    @FXML
    public Text letu_ret_text_4;

    @FXML
    public Text letc_ret_text_4;

    @FXML
    public Text letx_ret_text_4;

    @FXML
    public TextField letu_ret_4;

    @FXML
    public TextField letx_ret_4;

    @FXML
    public TextField letc_ret_4;

    public FXMLDocumentController() {

    }

    public void initialize(URL url, ResourceBundle rb) {

        //DATA FOR STANDARD PLOTS - Rodent plots
        XYChart.Series series1 = new XYChart.Series();
        //series1.setName("Morrisxb");
        series1.getData().add(new XYChart.Data(22, 75));
        series1.getData().add(new XYChart.Data(40, 78));
        series1.getData().add(new XYChart.Data(80, 49));

        XYChart.Series series1_4 = new XYChart.Series();

        series1_4.getData().add(new XYChart.Data(22, 75));
        series1_4.getData().add(new XYChart.Data(40, 78));
        series1_4.getData().add(new XYChart.Data(80, 49));

        XYChart.Series series1_2 = new XYChart.Series();

        series1_2.getData().add(new XYChart.Data(22, 75));
        series1_2.getData().add(new XYChart.Data(40, 78));
        series1_2.getData().add(new XYChart.Data(80, 49));

        XYChart.Series series1_3 = new XYChart.Series();

        series1_3.getData().add(new XYChart.Data(22, 75));
        series1_3.getData().add(new XYChart.Data(40, 78));
        series1_3.getData().add(new XYChart.Data(80, 49));

        XYChart.Series series2 = new XYChart.Series();
        //series2.setName("Morrisbb");
        series2.getData().add(new XYChart.Data(82, 54));

        XYChart.Series series2_4 = new XYChart.Series();
        //series2.setName("Morrisbb");
        series2_4.getData().add(new XYChart.Data(82, 54));

        XYChart.Series series2_2 = new XYChart.Series();
        //series2.setName("Morrisbb");
        series2_2.getData().add(new XYChart.Data(82, 54));

        XYChart.Series series2_3 = new XYChart.Series();
        //series2.setName("Morrisbb");
        series2_3.getData().add(new XYChart.Data(82, 54));

        XYChart.Series series3 = new XYChart.Series();
        //series3.setName("Wong140");
        series3.getData().add(new XYChart.Data(47, 68.5));
        series3.getData().add(new XYChart.Data(71, 51.5));
        series3.getData().add(new XYChart.Data(89, 48.1));

        XYChart.Series series3_4 = new XYChart.Series();
        //series3.setName("Wong140");
        series3_4.getData().add(new XYChart.Data(47, 68.5));
        series3_4.getData().add(new XYChart.Data(71, 51.5));
        series3_4.getData().add(new XYChart.Data(89, 48.1));

        XYChart.Series series3_2 = new XYChart.Series();
        //series3.setName("Wong140");
        series3_2.getData().add(new XYChart.Data(47, 68.5));
        series3_2.getData().add(new XYChart.Data(71, 51.5));
        series3_2.getData().add(new XYChart.Data(89, 48.1));

        XYChart.Series series3_3 = new XYChart.Series();
        //series3.setName("Wong140");
        series3_3.getData().add(new XYChart.Data(47, 68.5));
        series3_3.getData().add(new XYChart.Data(71, 51.5));
        series3_3.getData().add(new XYChart.Data(89, 48.1));

        XYChart.Series series4 = new XYChart.Series();
        //series4.setName("Wong196");
        series4.getData().add(new XYChart.Data(47, 68.2));
        series4.getData().add(new XYChart.Data(71, 56.4));
        series4.getData().add(new XYChart.Data(89, 61.8));

        XYChart.Series series4_4 = new XYChart.Series();
        //series4.setName("Wong196");
        series4_4.getData().add(new XYChart.Data(47, 68.2));
        series4_4.getData().add(new XYChart.Data(71, 56.4));
        series4_4.getData().add(new XYChart.Data(89, 61.8));

        XYChart.Series series4_2 = new XYChart.Series();
        //series4.setName("Wong196");
        series4_2.getData().add(new XYChart.Data(47, 68.2));
        series4_2.getData().add(new XYChart.Data(71, 56.4));
        series4_2.getData().add(new XYChart.Data(89, 61.8));

        XYChart.Series series4_3 = new XYChart.Series();
        //series4.setName("Wong196");
        series4_3.getData().add(new XYChart.Data(47, 68.2));
        series4_3.getData().add(new XYChart.Data(71, 56.4));
        series4_3.getData().add(new XYChart.Data(89, 61.8));

        XYChart.Series series5 = new XYChart.Series();
        //series5.setName("Wong93");
        series5.getData().add(new XYChart.Data(25, 81));
        series5.getData().add(new XYChart.Data(50, 70));
        series5.getData().add(new XYChart.Data(75, 58));
        series5.getData().add(new XYChart.Data(90, 42));

        XYChart.Series series5_4 = new XYChart.Series();
        //series5.setName("Wong93");
        series5_4.getData().add(new XYChart.Data(25, 81));
        series5_4.getData().add(new XYChart.Data(50, 70));
        series5_4.getData().add(new XYChart.Data(75, 58));
        series5_4.getData().add(new XYChart.Data(90, 42));

        XYChart.Series series5_2 = new XYChart.Series();
        //series5.setName("Wong93");
        series5_2.getData().add(new XYChart.Data(25, 81));
        series5_2.getData().add(new XYChart.Data(50, 70));
        series5_2.getData().add(new XYChart.Data(75, 58));
        series5_2.getData().add(new XYChart.Data(90, 42));

        XYChart.Series series5_3 = new XYChart.Series();
        //series5.setName("Wong93");
        series5_3.getData().add(new XYChart.Data(25, 81));
        series5_3.getData().add(new XYChart.Data(50, 70));
        series5_3.getData().add(new XYChart.Data(75, 58));
        series5_3.getData().add(new XYChart.Data(90, 42));

        XYChart.Series series6 = new XYChart.Series();
        //series6.setName("Kogel1982");
        series6.getData().add(new XYChart.Data(67.7, 67.7));
        series6.getData().add(new XYChart.Data(66.5, 66.5));

        XYChart.Series series6_4 = new XYChart.Series();
        //series6.setName("Kogel1982");
        series6_4.getData().add(new XYChart.Data(67.7, 67.7));
        series6_4.getData().add(new XYChart.Data(66.5, 66.5));

        XYChart.Series series6_2 = new XYChart.Series();
        //series6.setName("Kogel1982");
        series6_2.getData().add(new XYChart.Data(67.7, 67.7));
        series6_2.getData().add(new XYChart.Data(66.5, 66.5));

        XYChart.Series series6_3 = new XYChart.Series();
        //series6.setName("Kogel1982");
        series6_3.getData().add(new XYChart.Data(67.7, 67.7));
        series6_3.getData().add(new XYChart.Data(66.5, 66.5));

        XYChart.Series series7 = new XYChart.Series();
        // series7.setName("Kolgel1991");
        series7.getData().add(new XYChart.Data(50, 90));
        series7.getData().add(new XYChart.Data(70, 71.1));
        series7.getData().add(new XYChart.Data(90, 35));

        XYChart.Series series7_4 = new XYChart.Series();
        // series7.setName("Kolgel1991");
        series7_4.getData().add(new XYChart.Data(50, 90));
        series7_4.getData().add(new XYChart.Data(70, 71.1));
        series7_4.getData().add(new XYChart.Data(90, 35));

        XYChart.Series series7_2 = new XYChart.Series();
        // series7.setName("Kolgel1991");
        series7_2.getData().add(new XYChart.Data(50, 90));
        series7_2.getData().add(new XYChart.Data(70, 71.1));
        series7_2.getData().add(new XYChart.Data(90, 35));

        XYChart.Series series7_3 = new XYChart.Series();
        // series7.setName("Kolgel1991");
        series7_3.getData().add(new XYChart.Data(50, 90));
        series7_3.getData().add(new XYChart.Data(70, 71.1));
        series7_3.getData().add(new XYChart.Data(90, 35));

        //line chart data
        XYChart.Series series8 = new XYChart.Series();
        series8.getData().add(new XYChart.Data(100, 0));
        series8.getData().add(new XYChart.Data(0, 100));

        XYChart.Series series8_4 = new XYChart.Series();
        series8_4.getData().add(new XYChart.Data(100, 0));
        series8_4.getData().add(new XYChart.Data(0, 100));

        XYChart.Series series8_2 = new XYChart.Series();
        series8_2.getData().add(new XYChart.Data(100, 0));
        series8_2.getData().add(new XYChart.Data(0, 100));

        XYChart.Series series8_3 = new XYChart.Series();
        series8_3.getData().add(new XYChart.Data(100, 0));
        series8_3.getData().add(new XYChart.Data(0, 100));

        XYChart.Series series9 = new XYChart.Series();
        XYChart.Series series10 = new XYChart.Series();
        XYChart.Series series11 = new XYChart.Series();
        XYChart.Series series12 = new XYChart.Series();
        XYChart.Series series13 = new XYChart.Series();
        XYChart.Series series14 = new XYChart.Series();
        XYChart.Series series15 = new XYChart.Series();

        XYChart.Series series9_2 = new XYChart.Series();
        XYChart.Series series10_2 = new XYChart.Series();
        XYChart.Series series11_2 = new XYChart.Series();
        XYChart.Series series12_2 = new XYChart.Series();
        XYChart.Series series13_2 = new XYChart.Series();
        XYChart.Series series14_2 = new XYChart.Series();
        XYChart.Series series15_2 = new XYChart.Series();

        XYChart.Series series9_4 = new XYChart.Series();
        XYChart.Series series10_4 = new XYChart.Series();
        XYChart.Series series11_4 = new XYChart.Series();
        XYChart.Series series12_4 = new XYChart.Series();
        XYChart.Series series13_4 = new XYChart.Series();
        XYChart.Series series14_4 = new XYChart.Series();
        XYChart.Series series15_4 = new XYChart.Series();

        XYChart.Series series9_3 = new XYChart.Series();
        XYChart.Series series10_3 = new XYChart.Series();
        XYChart.Series series11_3 = new XYChart.Series();
        XYChart.Series series12_3 = new XYChart.Series();
        XYChart.Series series13_3 = new XYChart.Series();
        XYChart.Series series14_3 = new XYChart.Series();
        XYChart.Series series15_3 = new XYChart.Series();

        // plot as a line graph and use css to manipluate the style of line
        chart1.getData().addAll(series1, series2, series3, series4, series5, series6, series7);
        chart2.getData().add(series8);

        chart1_4.getData().addAll(series1_4, series2_4, series3_4, series4_4, series5_4, series6_4, series7_4);
        chart2_4.getData().add(series8_4);

        chart1_2.getData().addAll(series1_2, series2_2, series3_2, series4_2, series5_2, series6_2, series7_2);
        chart2_2.getData().add(series8_2);

        chart1_3.getData().addAll(series1_3, series2_3, series3_3, series4_3, series5_3, series6_3, series7_3);
        chart2_3.getData().add(series8_3);

        //charts customisation - see css file for more 
        chart1.setLegendVisible(false);
        chart2.setLegendVisible(false);
        chart2.setAnimated(false);

        chart1_4.setLegendVisible(false);
        chart2_4.setLegendVisible(false);
        chart2_4.setAnimated(false);

        chart1_2.setLegendVisible(false);
        chart2_2.setLegendVisible(false);
        chart2_2.setAnimated(false);

        chart1_3.setLegendVisible(false);
        chart2_3.setLegendVisible(false);
        chart2_3.setAnimated(false);

        chart1.setHorizontalGridLinesVisible(false);
        chart1.setVerticalGridLinesVisible(false);

        chart1_4.setHorizontalGridLinesVisible(false);
        chart1_4.setVerticalGridLinesVisible(false);

        chart1_2.setHorizontalGridLinesVisible(false);
        chart1_2.setVerticalGridLinesVisible(false);

        chart1_3.setHorizontalGridLinesVisible(false);
        chart1_3.setVerticalGridLinesVisible(false);

        chart2.setHorizontalGridLinesVisible(false);
        chart2.setVerticalGridLinesVisible(false);
        chart2.setOpacity(1);
        chart2.setCreateSymbols(false);

        chart2_4.setHorizontalGridLinesVisible(false);
        chart2_4.setVerticalGridLinesVisible(false);
        chart2_4.setOpacity(1);
        chart2_4.setCreateSymbols(false);

        chart2_2.setHorizontalGridLinesVisible(false);
        chart2_2.setVerticalGridLinesVisible(false);
        chart2_2.setOpacity(1);
        chart2_2.setCreateSymbols(false);

        chart2_3.setHorizontalGridLinesVisible(false);
        chart2_3.setVerticalGridLinesVisible(false);
        chart2_3.setOpacity(1);
        chart2_3.setCreateSymbols(false);

        CatAxis2.setLabel("BED\u2081(%)");
        NumAxis2.setLabel("BED\u2082(%)");
        CatAxis1.setLabel("BED\u2081(%)");
        NumAxis1.setLabel("BED\u2082(%)");

        CatAxis24.setLabel("BED\u2081(%)");
        NumAxis24.setLabel("BED\u2082(%)");
        CatAxis14.setLabel("BED\u2081(%)");
        NumAxis14.setLabel("BED\u2082(%)");

        CatAxis22.setLabel("BED\u2081(%)");
        NumAxis22.setLabel("BED\u2082(%)");
        CatAxis12.setLabel("BED\u2081(%)");
        NumAxis12.setLabel("BED\u2082(%)");

        CatAxis242.setLabel("BED\u2081(%)");
        NumAxis242.setLabel("BED\u2082(%)");
        CatAxis13.setLabel("BED\u2081(%)");
        NumAxis13.setLabel("BED\u2082(%)");

        eqn1_text.setText("BED\u1D62\u2099\u1D62\u209c(Gy)   =   BED\u2081(%)   of   BED\u1D63(Gy)");
        eqn2_text.setText("BED\u1D63\u2091\u209C(Gy)   =   BED\u2082(%)   of   BED\u1D63(Gy)");
        eqn3_text.setText("Photon retreatment:");
        final_1.setText("fractions (n\u1D63\u2091\u209C) of ");
        final_last_1.setText("Gy (d\u1D63\u2091\u209C)");

        eqn1_text_2.setText("BED\u1D62\u2099\u1D62\u209C(Gy)   =   BED\u2081(%)   of   BED\u1D63(Gy)");
        eqn2_text_2.setText("BED\u1D63\u2091\u209C(Gy)   =   BED\u2082(%)   of   BED\u1D63(Gy)");
        eqn3_text_2.setText("Proton retreatment:");
        final_2.setText("fractions (n\u1D63\u2091\u209C) of ");
        final_last_2.setText("Gy (d\u1D63\u2091\u209C)");

        eqn1_text_3.setText("BED\u1D62\u2099\u1D62\u209C(Gy)   =   BED\u2081(%)   of   BED\u1D63(Gy)");
        eqn2_text_3.setText("BED\u1D63\u2091\u209C(Gy)   =   BED\u2082(%)   of   BED\u1D63(Gy)");
        eqn3_text_3.setText("Photon retreatment:");
        final_3.setText("fractions (n\u1D63\u2091\u209C) of ");
        final_last_3.setText("Gy (d\u1D63\u2091\u209C)");

        eqn1_text_4.setText("BED\u1D62\u2099\u1D62\u209C(Gy)   =   BED\u2081(%)   of   BED\u1D63(Gy)");
        eqn2_text_4.setText("BED\u1D63\u2091\u209C(Gy)   =   BED\u2082(%)   of   BED\u1D63(Gy)");
        eqn3_text_4.setText("Proton retreatment:");
        final_4.setText("fractions (n\u1D63\u2091\u209C) of ");
        final_last_4.setText("Gy (d\u1D63\u2091\u209C)");

        //USE UNICODE FOR THE SUBSCRIPTS FOR TAB1 TEXTS///////////////////////////
        Label_InitDose.setText("Photon initial total dose, D\u1D62\u2099\u1D62\u209C (Gy)");
        Label_initfrac.setText("Photon initial dose per fraction (Gy) \n d\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209C");
        s0_text.setText("s\u2080");
        s1_text.setText("s\u2081");
        nom_text.setText("Nominal tolerated BED\u1D63 (Gy)");
        tissue_text.setText("Reference \u03B1/\u03B2 (Gy)");
        num_ret_frac_1.setText("Number of retreatment fractions, n\u1D63\u2091\u209C");
        numFrac_text_1.setText("Number of initial fractions, n\u1D62\u2099\u1D62\u209C");
        out.setStyle("-fx-background-color:LIGHTGREY");
        Bed_over_1.setText("B\u035EE\u035ED");
        // Bed_over_1.setText("B\u0332E\u0332D\u0332"); //for MAC USE - ABOVE FOR WINDOWS

        /////////////UNICODE FOR TAB2 TEXT//////////////////////////////
        Label_InitDose_2.setText("Photon initial total dose, D\u1D62\u2099\u1D62\u209C (Gy)");
        Label_initfrac_2.setText("Photon initial dose per fraction (Gy) \n d\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209C");
        tissue_text_2.setText("Reference \u03B1/\u03B2 (Gy)");
        out_2.setStyle("-fx-background-color:LIGHTGREY");
        letu_text_2.setText("Maximum bio-efficiency, \n LET\u1D64 (KeV/\u03bcm)");
        letx_text_2.setText("Operative LET\u2093 (KeV/\u03bcm)");
        d_hi_2.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
        letc_text_2.setText("Control photon reference LET\u1D63 (KeV/\u03bcm)");
        s0_text_2.setText("s\u2080");
        s1_text_2.setText("s\u2081");
        Bed_over_2.setText("B\u035EE\u035ED");
        num_ret_frac_2.setText("Number of retreatment fractions, n\u1D63\u2091\u209C");
        numFrac_text_2.setText("Number of initial fractions, n\u1D62\u2099\u1D62\u209C");
        nominal_tol_2.setStyle("-fx-background-color:LIGHTGREY");
        nominal_text_2.setText("Nominal tolerated BED\u1D63 (Gy)");
        Dret_text_2.setStyle("-fx-background-color:LIGHTGREY");

        //TAB4//
        Label_initfrac_4.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209C");
        Label_InitDose_4.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
        tissue_text_21.setText("Reference \u03B1/\u03B2 (Gy)");
        out_4.setStyle("-fx-background-color:LIGHTGREY");
        numFrac_text_4.setText("Number of initial fractions, n\u1D62\u2099\u1D62\u209C");
        RBE_IN_TEXT_4.setStyle("-fx-background-color:LIGHTGREY");
        s0_text_4.setText("s\u2080");
        s1_text_4.setText("s\u2081");
        Bed_over_4.setText("B\u035EE\u035ED");
        num_ret_frac_4.setText("Number of retreatment fractions, n\u1D63\u2091\u209C");
        Dret_text_4.setStyle("-fx-background-color:LIGHTGREY");

        letu_ret_text_4.setText("Maximum bio-efficiency for retreatment, LET\u1D64 (KeV/\u03bcm)");
        letx_ret_text_4.setText("Operative retreatment LET\u2093 (KeV/\u03bcm)");
        letc_ret_text_4.setText("Control photon reference for retreatment LET\u1D63(KeV/\u03bcm)");

        letu_text_4.setText("Maximum bio-efficiency for treatment, LET\u1D64 (KeV/\u03bcm)");
        letx_text_4.setText("Operative treatment LET\u2093 (KeV/\u03bcm)");
        d_hi_4.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
        letc_text_4.setText("Control photon reference \nfor treatment LET\u1D63 (KeV/\u03bcm)");

        //TAB3//
        Label_initfrac_3.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209C");
        Label_InitDose_3.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
        nominal_text_3.setText("Nominal tolerated BED\u1D63 (Gy)");
        tissue_text_3.setText("Reference \u03B1/\u03B2 (Gy)");
        numFrac_text_3.setText("Number of initial fractions, n\u1D62\u2099\u1D62\u209C");
        out_3.setStyle("-fx-background-color:LIGHTGREY");
        letu_text_3.setText("Maximum bio-efficiency, \n LET\u1D64 (KeV/\u03bcm)");
        letx_text_3.setText("Operative LET\u2093 (KeV/\u03bcm)");
        letc_text_3.setText("Control photon reference LET\u1D63 (KeV/\u03bcm)");
        s0_text_3.setText("s\u2080");
        s1_text_3.setText("s\u2081");
        Bed_over_3.setText("B\u035EE\u035ED");
        nominal_tol_3.setStyle("-fx-background-color:LIGHTGREY");
        num_ret_frac_3.setText("Number of retreatment fractions, n\u1D63\u2091\u209C");

        ////CODE FOR THE CHECKBOX FOR TAB 2//////////////////////////////////////////
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
                if (RBE_CHECKBOX_2.isSelected()) {
                    letx_2.setDisable(true);
                    letx_text_2.setOpacity(0.3);
                    letx_2.setOpacity(0.3);
                    letu_2.setDisable(true);
                    letu_2.setOpacity(0.3);
                    letu_text_2.setOpacity(0.3);
                    letc_2.setDisable(true);
                    letc_2.setOpacity(0.3);
                    letc_text_2.setOpacity(0.3);
                    out_2.setText("1.1");

                } else {
                    letx_2.setDisable(false);
                    letx_text_2.setOpacity(1);
                    letx_2.setOpacity(1);
                    letu_2.setDisable(false);
                    letu_2.setOpacity(1);
                    letu_text_2.setOpacity(1);
                    letc_2.setDisable(false);
                    letc_2.setOpacity(1);
                    letc_text_2.setOpacity(1);
                    out_2.setText("");
                }
            }

        };

        // set event to checkbox 
        RBE_CHECKBOX_2.setOnAction(event);

        EventHandler<ActionEvent> event4 = new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
                if (RBE_CHECKBOX_4.isSelected()) {
                    letx_4.setDisable(true);
                    letx_text_4.setOpacity(0.3);
                    letx_4.setOpacity(0.3);
                    letu_4.setDisable(true);
                    letu_4.setOpacity(0.3);
                    letu_text_4.setOpacity(0.3);
                    letc_4.setDisable(true);
                    letc_4.setOpacity(0.3);
                    letc_text_4.setOpacity(0.3);
                    RBE_IN_TEXT_4.setText("1.1");
                } else {
                    letx_4.setDisable(false);
                    letx_text_4.setOpacity(1);
                    letx_4.setOpacity(1);
                    letu_4.setDisable(false);
                    letu_4.setOpacity(1);
                    letu_text_4.setOpacity(1);
                    letc_4.setDisable(false);
                    letc_4.setOpacity(1);
                    letc_text_4.setOpacity(1);
                    RBE_IN_TEXT_4.setText("");
                }
            }

        };

        // set event to checkbox 
        RBE_CHECKBOX_4.setOnAction(event4);

        EventHandler<ActionEvent> event9 = new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
                if (RBE_RET_CHECKBOX_4.isSelected()) {
                    letx_ret_4.setDisable(true);
                    letx_ret_text_4.setOpacity(0.3);
                    letx_ret_4.setOpacity(0.3);
                    letu_ret_4.setDisable(true);
                    letu_ret_4.setOpacity(0.3);
                    letu_ret_text_4.setOpacity(0.3);
                    letc_ret_4.setDisable(true);
                    letc_ret_4.setOpacity(0.3);
                    letc_ret_text_4.setOpacity(0.3);
                    out_4.setText("1.1");
                } else {
                    letx_ret_4.setDisable(false);
                    letx_ret_text_4.setOpacity(1);
                    letx_ret_4.setOpacity(1);
                    letu_ret_4.setDisable(false);
                    letu_ret_4.setOpacity(1);
                    letu_ret_text_4.setOpacity(1);
                    letc_ret_4.setDisable(false);
                    letc_ret_4.setOpacity(1);
                    letc_ret_text_4.setOpacity(1);
                    out_4.setText("");

                }
            }

        };

        // set event to checkbox 
        RBE_RET_CHECKBOX_4.setOnAction(event9);

        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
                if (RBE_CHECKBOX_3.isSelected()) {
                    letx_3.setDisable(true);
                    letx_text_3.setOpacity(0.3);
                    letx_3.setOpacity(0.3);
                    letu_3.setDisable(true);
                    letu_3.setOpacity(0.3);
                    letu_text_3.setOpacity(0.3);
                    letc_3.setDisable(true);
                    letc_3.setOpacity(0.3);
                    letc_text_3.setOpacity(0.3);
                    out_3.setText("1.1");
                } else {
                    letx_3.setDisable(false);
                    letx_text_3.setOpacity(1);
                    letx_3.setOpacity(1);
                    letu_3.setDisable(false);
                    letu_3.setOpacity(1);
                    letu_text_3.setOpacity(1);
                    letc_3.setDisable(false);
                    letc_3.setOpacity(1);
                    letc_text_3.setOpacity(1);
                    out_3.setText("");
                }
            }

        };

        // set event to checkbox 
        RBE_CHECKBOX_3.setOnAction(event3);

        //MAKE THE POPUP FOR NOTATION
        key.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Popup_window.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();

                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    stage.setTitle("Information");
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setResizable(false);
                    stage.show();
                } catch (Exception e) {
                    System.out.println("Cannot display new window");
                }
            }
        });
        key_2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Popup_window.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();

                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("Information");
                    stage.setResizable(false);
                    stage.show();
                } catch (Exception e) {
                    System.out.println("Cannot display new window");
                }
            }
        });

        key_3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Popup_window.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();

                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("Information");
                    stage.setResizable(false);
                    stage.show();
                } catch (Exception e) {
                    System.out.println("Cannot display new window");
                }
            }
        });

//initially the rodent data will not show on the plot
        chart1.setVisible(false);
        chart1_4.setVisible(false);
        chart1_2.setVisible(false);
        chart1_3.setVisible(false);

        Calculate.setOnMouseExited((event8) -> {
            run_1.setVisible(false);

        });

        Calculate_2.setOnMouseExited((event8) -> {
            run_2.setVisible(false);

        });

        Calculate_3.setOnMouseExited((event8) -> {
            run_3.setVisible(false);

        });

        Calculate_4.setOnMouseExited((event8) -> {
            run_4.setVisible(false);

        });

        letu_2.setOnMouseClicked((event6) -> {
            AlertBox.display("WARNING", "CHANGE LET\u1D64 ONLY FOR ION USE");
            letu_2.setOnMouseClicked(null);
        });

        letu_ret_4.setOnMouseClicked((event6) -> {
            AlertBox.display("WARNING", "CHANGE LET\u1D64 ONLY FOR ION USE");
            letu_ret_4.setOnMouseClicked(null);
        });

        letu_3.setOnMouseClicked((event6) -> {
            AlertBox.display("WARNING", "CHANGE LET\u1D64 ONLY FOR ION USE");
            letu_3.setOnMouseClicked(null);
        });

        letu_4.setOnMouseClicked((event6) -> {
            AlertBox.display("WARNING", "CHANGE LET\u1D64 ONLY FOR ION USE");
            letu_4.setOnMouseClicked(null);
        });

        Anchor_4.setOnMouseMoved((event7) -> {
            if (DHIGH_4.getText().isEmpty() || NumOfYears_4.getText().isEmpty() || Percentage_4.getText().isEmpty()) {
                Calculate_4.setDisable(true);
                Calculate_4.setOpacity(0.3);

            } else {
                Calculate_4.setDisable(false);
                Calculate_4.setOpacity(1);
            }
        });

        rect_4.setOnMouseClicked((event12) -> {
            if (DHIGH_4.getText().isEmpty() || NumOfYears_4.getText().isEmpty() || Percentage_4.getText().isEmpty()) {
                InputRequired.display("WARNING", "Inputs required");
            }
            if (NumOfYears_4.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> NumOfYears_4.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> NumOfYears_4.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }
            if (Percentage_4.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> Percentage_4.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> Percentage_4.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }
            if (DHIGH_4.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> DHIGH_4.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> DHIGH_4.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }
        });

        Anchor_3.setOnMouseMoved((event7) -> {
            if (NumOfYears_3.getText().isEmpty() || Percentage_3.getText().isEmpty()) {
                Calculate_3.setDisable(true);
                Calculate_3.setOpacity(0.3);

            } else {
                Calculate_3.setDisable(false);
                Calculate_3.setOpacity(1);
            }
        });

        rect_3.setOnMouseClicked((event12) -> {
            if (NumOfYears_3.getText().isEmpty() || Percentage_3.getText().isEmpty()) {
                InputRequired.display("WARNING", "Inputs required");
            }

            if (NumOfYears_3.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> NumOfYears_3.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> NumOfYears_3.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }
            if (Percentage_3.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> Percentage_3.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> Percentage_3.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }

        });

        Anchor_2.setOnMouseMoved((event7) -> {
            if (DHIGH_2.getText().isEmpty() || NumOfYears_2.getText().isEmpty() || Percentage_2.getText().isEmpty()) {
                Calculate_2.setDisable(true);
                Calculate_2.setOpacity(0.3);

            } else {
                Calculate_2.setDisable(false);
                Calculate_2.setOpacity(1);
            }
        });

        rect_2.setOnMouseClicked((event12) -> {
            if (DHIGH_2.getText().isEmpty() || NumOfYears_2.getText().isEmpty() || Percentage_2.getText().isEmpty()) {
                InputRequired.display("WARNING", "Inputs required");
            }

            if (NumOfYears_2.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> NumOfYears_2.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> NumOfYears_2.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }

            if (Percentage_2.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> Percentage_2.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> Percentage_2.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }

            if (DHIGH_2.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> DHIGH_2.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> DHIGH_2.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }
        });

        Anchor_1.setOnMouseMoved((event7) -> {
            if (NumOfYears_1.getText().isEmpty() || Percentage_1.getText().isEmpty()) {
                Calculate.setDisable(true);
                Calculate.setOpacity(0.3);

            } else {
                Calculate.setDisable(false);
                Calculate.setOpacity(1);
            }
        });

        rect_1.setOnMouseClicked((event12) -> {
            if (NumOfYears_1.getText().isEmpty() || Percentage_1.getText().isEmpty()) {
                InputRequired.display("WARNING", "Inputs required");
            }

            if (NumOfYears_1.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> NumOfYears_1.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> NumOfYears_1.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }

            if (Percentage_1.getText().isEmpty()) {
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.05), evt -> Percentage_1.setVisible(false)),
                        new KeyFrame(Duration.seconds(0.1), evt -> Percentage_1.setVisible(true)));
                timeline.setCycleCount(5);
                timeline.play();
            }
        });

        RiskOfMyel_4.textProperty().addListener((ov, onHidden, onShown) -> {
            DecimalFormat df6 = new DecimalFormat("#.######");
            double p = Double.parseDouble(RiskOfMyel_4.getText()) / 100;
            p_value_4.setText("p-value = " + df6.format(p));
        });

        RiskOfMyel_3.textProperty().addListener((ov, onHidden, onShown) -> {
            DecimalFormat df6 = new DecimalFormat("#.######");
            double p = Double.parseDouble(RiskOfMyel_3.getText()) / 100;
            p_value_3.setText("p-value = " + df6.format(p));
        });

        RiskOfMyel_2.textProperty().addListener((ov, onHidden, onShown) -> {
            DecimalFormat df6 = new DecimalFormat("#.######");
            double p = Double.parseDouble(RiskOfMyel_2.getText()) / 100;
            p_value_2.setText("p-value = " + df6.format(p));
        });

        RiskOfMyel.textProperty().addListener((ov, onHidden, onShown) -> {
            DecimalFormat df6 = new DecimalFormat("#.######");
            double p = Double.parseDouble(RiskOfMyel.getText()) / 100;
            p_value_1.setText("p-value = " + df6.format(p));
        });

        //Code to change from proton to ion //
        Calculate_2.setOnMouseMoved((event7) -> {
            if (Double.parseDouble(letu_2.getText()) != 30.5) {
                d_hi_2.setText("Ion retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                nom_text_2.setText("Estimated RBE for ion retreatment");
                eqn3_text_2.setText("Ion retreatment:");
                tab2.setText("Photon Initial - Ion Retreatment");
                RBE_CHECKBOX_2.setDisable(true);
                RBE_CHECKBOX_2.setOpacity(0.3);
            } else if (letu_2.getText() == "") {
                d_hi_2.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                nom_text_2.setText("Estimated RBE for proton retreatment");
                eqn3_text_2.setText("Proton retreatment:");
                tab2.setText("Photon Initial - Proton Retreatment");
                RBE_CHECKBOX_2.setDisable(false);
                RBE_CHECKBOX_2.setOpacity(1);

            } else {
                d_hi_2.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                nom_text_2.setText("Estimated RBE for proton retreatment");
                eqn3_text_2.setText("Proton retreatment:");
                tab2.setText("Photon Initial - Proton Retreatment");
                RBE_CHECKBOX_2.setDisable(false);
                RBE_CHECKBOX_2.setOpacity(1);

            }
        });

        letu_2.setOnMouseMoved((event7) -> {
            if (Double.parseDouble(letu_2.getText()) != 30.5) {
                d_hi_2.setText("Ion retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                nom_text_2.setText("Estimated RBE for ion retreatment");
                eqn3_text_2.setText("Ion retreatment:");
                tab2.setText("Photon Initial - Ion Retreatment");
                RBE_CHECKBOX_2.setDisable(true);
                RBE_CHECKBOX_2.setOpacity(0.3);
            } else if (letu_2.getText() == "") {
                d_hi_2.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                nom_text_2.setText("Estimated RBE for proton retreatment");
                eqn3_text_2.setText("Proton retreatment:");
                tab2.setText("Photon Initial - Proton Retreatment");
                RBE_CHECKBOX_2.setDisable(false);
                RBE_CHECKBOX_2.setOpacity(1);

            } else {
                d_hi_2.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                nom_text_2.setText("Estimated RBE for proton retreatment");
                eqn3_text_2.setText("Proton retreatment:");
                tab2.setText("Photon Initial - Proton Retreatment");
                RBE_CHECKBOX_2.setDisable(false);
                RBE_CHECKBOX_2.setOpacity(1);

            }
        });

        Calculate_3.setOnMouseMoved((event7) -> {
            if (Double.parseDouble(letu_3.getText()) != 30.5) {
                Label_initfrac_3.setText("Ion initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_3.setText("Ion initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                RBE_text_3.setText("Estimated RBE for ion initial treatment");
                tab3.setText("Ion Initial - Photon Retreatment");
                RBE_CHECKBOX_3.setDisable(true);
                RBE_CHECKBOX_3.setOpacity(0.3);
            } else if (letu_3.getText() == "") {
                Label_initfrac_3.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_3.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                RBE_text_3.setText("Estimated RBE for proton initial treatment");
                tab3.setText("Proton Initial - Photon Retreatment");
                RBE_CHECKBOX_3.setDisable(false);
                RBE_CHECKBOX_3.setOpacity(1);

            } else {
                Label_initfrac_3.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_3.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                RBE_text_3.setText("Estimated RBE for proton initial treatment");
                tab3.setText("Proton Initial - Photon Retreatment");
                RBE_CHECKBOX_3.setDisable(false);
                RBE_CHECKBOX_3.setOpacity(1);
            }
        });
        letu_3.setOnMouseMoved((event7) -> {
            if (Double.parseDouble(letu_3.getText()) != 30.5) {
                Label_initfrac_3.setText("Ion initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_3.setText("Ion initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                RBE_text_3.setText("Estimated RBE for ion initial treatment");
                tab3.setText("Ion Initial - Photon Retreatment");
                RBE_CHECKBOX_3.setDisable(true);
                RBE_CHECKBOX_3.setOpacity(0.3);
            } else if (letu_3.getText() == "") {
                Label_initfrac_3.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_3.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                RBE_text_3.setText("Estimated RBE for proton initial treatment");
                tab3.setText("Proton Initial - Photon Retreatment");
                RBE_CHECKBOX_3.setDisable(false);
                RBE_CHECKBOX_3.setOpacity(1);
            } else {
                Label_initfrac_3.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_3.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                RBE_text_3.setText("Estimated RBE for proton initial treatment");
                tab3.setText("Proton Initial - Photon Retreatment");
                RBE_CHECKBOX_3.setDisable(false);
                RBE_CHECKBOX_3.setOpacity(1);
            }
        });

        letu_4.setOnMouseMoved((event7) -> {
            if (Double.parseDouble(letu_4.getText()) != 30.5 && Double.parseDouble(letu_ret_4.getText()) == 30.5) {
                Label_initfrac_4.setText("Ion initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Ion initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_4.setText("Estimated RBE for initial ion treatment");
                tab4.setText("Ion Initial - Proton Retreatment");
                nom_text_21.setText("Estimated RBE for proton retreatment");
                d_hi_4.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Proton retreatment:");
                RBE_CHECKBOX_4.setDisable(true);
                RBE_CHECKBOX_4.setOpacity(0.3);
                RBE_RET_CHECKBOX_4.setDisable(false);
                RBE_RET_CHECKBOX_4.setOpacity(1);

            } else if (Double.parseDouble(letu_4.getText()) == 30.5 && Double.parseDouble(letu_ret_4.getText()) != 30.5) {
                Label_initfrac_4.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_21.setText("Estimated RBE for initial proton treatment");
                tab4.setText("Proton Initial - Ion Retreatment");
                nom_text_21.setText("Estimated RBE for ion retreatment");
                d_hi_4.setText("Ion retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Ion retreatment:");
                RBE_CHECKBOX_4.setDisable(false);
                RBE_CHECKBOX_4.setOpacity(1);
                RBE_RET_CHECKBOX_4.setDisable(true);
                RBE_RET_CHECKBOX_4.setOpacity(0.3);
            } else if (Double.parseDouble(letu_4.getText()) != 30.5 && Double.parseDouble(letu_ret_4.getText()) != 30.5) {
                Label_initfrac_4.setText("Ion initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Ion initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_21.setText("Estimated RBE for initial ion treatment");
                tab4.setText("Ion Initial - Ion Retreatment");
                nom_text_21.setText("Estimated RBE for ion retreatment");
                d_hi_4.setText("Ion retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Ion retreatment:");
                RBE_CHECKBOX_4.setDisable(true);
                RBE_CHECKBOX_4.setOpacity(0.3);
                RBE_RET_CHECKBOX_4.setDisable(true);
                RBE_RET_CHECKBOX_4.setOpacity(0.3);

            } else {
                Label_initfrac_4.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_4.setText("Estimated RBE for initial proton treatment");
                tab4.setText("Proton Initial - Proton Retreatment");
                nom_text_21.setText("Estimated RBE for proton retreatment");
                d_hi_4.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Proton retreatment:");
                RBE_CHECKBOX_4.setDisable(false);
                RBE_CHECKBOX_4.setOpacity(1);
                RBE_RET_CHECKBOX_4.setDisable(false);
                RBE_RET_CHECKBOX_4.setOpacity(1);

            }
        });
        letu_ret_4.setOnMouseMoved((event7) -> {
            if (Double.parseDouble(letu_4.getText()) != 30.5 && Double.parseDouble(letu_ret_4.getText()) == 30.5) {
                Label_initfrac_4.setText("Ion initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Ion initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_4.setText("Estimated RBE for initial ion treatment");
                tab4.setText("Ion Initial - Proton Retreatment");
                nom_text_21.setText("Estimated RBE for proton retreatment");
                d_hi_4.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Proton retreatment:");
                RBE_CHECKBOX_4.setDisable(true);
                RBE_CHECKBOX_4.setOpacity(0.3);
                RBE_RET_CHECKBOX_4.setDisable(false);
                RBE_RET_CHECKBOX_4.setOpacity(1);

            } else if (Double.parseDouble(letu_4.getText()) == 30.5 && Double.parseDouble(letu_ret_4.getText()) != 30.5) {
                Label_initfrac_4.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_21.setText("Estimated RBE for initial proton treatment");
                tab4.setText("Proton Initial - Ion Retreatment");
                nom_text_21.setText("Estimated RBE for ion retreatment");
                d_hi_4.setText("Ion retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Ion retreatment:");
                RBE_CHECKBOX_4.setDisable(false);
                RBE_CHECKBOX_4.setOpacity(1);
                RBE_RET_CHECKBOX_4.setDisable(true);
                RBE_RET_CHECKBOX_4.setOpacity(0.3);
            } else if (Double.parseDouble(letu_4.getText()) != 30.5 && Double.parseDouble(letu_ret_4.getText()) != 30.5) {
                Label_initfrac_4.setText("Ion initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Ion initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_21.setText("Estimated RBE for initial ion treatment");
                tab4.setText("Ion Initial - Ion Retreatment");
                nom_text_21.setText("Estimated RBE for ion retreatment");
                d_hi_4.setText("Ion retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Ion retreatment:");
                RBE_CHECKBOX_4.setDisable(true);
                RBE_CHECKBOX_4.setOpacity(0.3);
                RBE_RET_CHECKBOX_4.setDisable(true);
                RBE_RET_CHECKBOX_4.setOpacity(0.3);

            } else {
                Label_initfrac_4.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_4.setText("Estimated RBE for initial proton treatment");
                tab4.setText("Proton Initial - Proton Retreatment");
                nom_text_21.setText("Estimated RBE for proton retreatment");
                d_hi_4.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Proton retreatment:");
                RBE_CHECKBOX_4.setDisable(false);
                RBE_CHECKBOX_4.setOpacity(1);
                RBE_RET_CHECKBOX_4.setDisable(false);
                RBE_RET_CHECKBOX_4.setOpacity(1);

            }
        });

        Calculate_4.setOnMouseMoved((event7) -> {
            if (Double.parseDouble(letu_4.getText()) != 30.5 && Double.parseDouble(letu_ret_4.getText()) == 30.5) {
                Label_initfrac_4.setText("Ion initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Ion initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_4.setText("Estimated RBE for initial ion treatment");
                tab4.setText("Ion Initial - Proton Retreatment");
                nom_text_21.setText("Estimated RBE for proton retreatment");
                d_hi_4.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Proton retreatment:");
                RBE_CHECKBOX_4.setDisable(true);
                RBE_CHECKBOX_4.setOpacity(0.3);
                RBE_RET_CHECKBOX_4.setDisable(false);
                RBE_RET_CHECKBOX_4.setOpacity(1);

            } else if (Double.parseDouble(letu_4.getText()) == 30.5 && Double.parseDouble(letu_ret_4.getText()) != 30.5) {
                Label_initfrac_4.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_21.setText("Estimated RBE for initial proton treatment");
                tab4.setText("Proton Initial - Ion Retreatment");
                nom_text_21.setText("Estimated RBE for ion retreatment");
                d_hi_4.setText("Ion retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Ion retreatment:");
                RBE_CHECKBOX_4.setDisable(false);
                RBE_CHECKBOX_4.setOpacity(1);
                RBE_RET_CHECKBOX_4.setDisable(true);
                RBE_RET_CHECKBOX_4.setOpacity(0.3);
            } else if (Double.parseDouble(letu_4.getText()) != 30.5 && Double.parseDouble(letu_ret_4.getText()) != 30.5) {
                Label_initfrac_4.setText("Ion initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Ion initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_21.setText("Estimated RBE for initial ion treatment");
                tab4.setText("Ion Initial - Ion Retreatment");
                nom_text_21.setText("Estimated RBE for ion retreatment");
                d_hi_4.setText("Ion retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Ion retreatment:");
                RBE_CHECKBOX_4.setDisable(true);
                RBE_CHECKBOX_4.setOpacity(0.3);
                RBE_RET_CHECKBOX_4.setDisable(true);
                RBE_RET_CHECKBOX_4.setOpacity(0.3);

            } else {
                Label_initfrac_4.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_4.setText("Estimated RBE for initial proton treatment");
                tab4.setText("Proton Initial - Proton Retreatment");
                nom_text_21.setText("Estimated RBE for proton retreatment");
                d_hi_4.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Proton retreatment:");
                RBE_CHECKBOX_4.setDisable(false);
                RBE_CHECKBOX_4.setOpacity(1);
                RBE_RET_CHECKBOX_4.setDisable(false);
                RBE_RET_CHECKBOX_4.setOpacity(1);

            }
        });

        letu_2.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letu_2.getText()) < 0) {
                letu_2.setText("30.5");
                letu_warn_2.setVisible(true);
            } else if (letu_2.getText() == null) {
                letu_warn_2.setVisible(false);
            } else {
                letu_warn_2.setVisible(false);
            }

        });
        letu_3.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letu_3.getText()) < 0) {
                letu_3.setText("30.5");
                letu_warn_3.setVisible(true);
            } else if (letu_3.getText() == null) {
                letu_warn_3.setVisible(false);
            } else {
                letu_warn_3.setVisible(false);
            }
        });

        letc_3.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letc_3.getText()) < 0.2 || Double.parseDouble(letc_3.getText()) > 0.6) {
                letc_warn_3.setVisible(true);
                letc_3.setText("0.22");
                // letc_warn_3.setVisible(true);
            } else if (letc_3.getText() == null) {

                letc_warn_3.setVisible(false);
            } else {
                letc_warn_3.setVisible(false);
            }
        });

        letc_2.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letc_2.getText()) < 0.2 || Double.parseDouble(letc_2.getText()) > 0.6) {
                letc_warn_2.setVisible(true);
                letc_2.setText("0.22");

            } else if (letc_2.getText() == null) {

                letc_warn_2.setVisible(false);
            } else {
                letc_warn_2.setVisible(false);
            }
        });

        letc_4.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letc_4.getText()) < 0.2 || Double.parseDouble(letc_4.getText()) > 0.6) {
                letc_warn_4.setVisible(true);
                letc_4.setText("0.22");

            } else if (letc_4.getText() == null) {

                letc_warn_4.setVisible(false);
            } else {
                letc_warn_4.setVisible(false);
            }
        });

        letc_ret_4.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letc_ret_4.getText()) < 0.2 || Double.parseDouble(letc_ret_4.getText()) > 0.6) {
                letc_ret_warn_4.setVisible(true);
                letc_ret_4.setText("0.22");

            } else if (letc_ret_4.getText() == null) {

                letc_ret_warn_4.setVisible(false);
            } else {
                letc_ret_warn_4.setVisible(false);
            }
        });

        letu_4.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letu_4.getText()) < 0) {
                letu_4.setText("30.5");
                letu_warn_4.setVisible(true);
            } else if (letu_4.getText() == null) {
                letu_warn_4.setVisible(false);
            } else {
                letu_warn_4.setVisible(false);
            }
        });

        letu_ret_4.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letu_ret_4.getText()) < 0) {
                letu_ret_4.setText("30.5");
                letu_ret_warn_4.setVisible(true);
            } else if (letu_ret_4.getText() == null) {
                letu_ret_warn_4.setVisible(false);
            } else {
                letu_ret_warn_4.setVisible(false);
            }
        });

        letx_ret_4.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letx_ret_4.getText()) < 0) {
                letx_ret_4.setText("1");
                letx_ret_warn_4.setVisible(true);
            } else if (letx_ret_4.getText() == null) {
                letx_ret_warn_4.setVisible(false);
            } else {
                letx_ret_warn_4.setVisible(false);
            }
        });

        letx_4.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letx_4.getText()) < 0) {
                letx_4.setText("1");
                letx_warn_4.setVisible(true);
            } else if (letx_4.getText() == null) {
                letx_warn_4.setVisible(false);
            } else {
                letx_warn_4.setVisible(false);
            }
        });

        letx_3.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letx_3.getText()) < 0) {
                letx_3.setText("1");
                letx_warn_3.setVisible(true);
            } else if (letx_3.getText() == null) {
                letx_warn_3.setVisible(false);
            } else {
                letx_warn_3.setVisible(false);
            }
        });

        letx_2.setOnMouseExited((event7) -> {
            if (Double.parseDouble(letx_2.getText()) < 0) {
                letx_2.setText("1");
                letx_warn_2.setVisible(true);
            } else if (letx_2.getText() == null) {
                letx_warn_2.setVisible(false);
            } else {
                letx_warn_2.setVisible(false);
            }
        });

        bed_1.setOnMouseExited((event7) -> {
            if (Double.parseDouble(bed_1.getText()) > 45 || Double.parseDouble(bed_1.getText()) < 0) {
                bed_1.setText("35");
                bed_warn.setVisible(true);
            } else if (bed_1.getText() == null) {
                bed_warn.setVisible(false);
            } else {
                bed_warn.setVisible(false);
            }
        });

        s1_1.setOnMouseExited((event7) -> {
            if (Double.parseDouble(s1_1.getText()) > 1 || Double.parseDouble(s1_1.getText()) < 0) {
                s1_1.setText("0.1");
                s1_warn.setVisible(true);
            } else if (s1_1.getText() == null) {
                s1_warn.setVisible(false);
            } else {
                s1_warn.setVisible(false);
            }
        });

        s0_1.setOnMouseExited((event7) -> {
            if (Double.parseDouble(s0_1.getText()) > 1 || Double.parseDouble(s0_1.getText()) < 0) {
                s0_1.setText("0.15");
                s0_warn.setVisible(true);
            } else if (s0_1.getText() == null) {
                s0_warn.setVisible(false);
            } else {
                s0_warn.setVisible(false);
            }
        });

        NumOfYears_1.setOnMouseExited((event7) -> {
            if (Double.parseDouble(NumOfYears_1.getText()) > 5 || Double.parseDouble(NumOfYears_1.getText()) < 0) {
                NumOfYears_1.setText("2");
                Num_Warn_1.setVisible(true);
            } else if (NumOfYears_1.getText() == null) {
                Num_Warn_1.setVisible(false);
            } else {
                Num_Warn_1.setVisible(false);
            }
        });

        Percentage_1.setOnMouseExited((event7) -> {
            if (Double.parseDouble(Percentage_1.getText()) > 20 || Double.parseDouble(Percentage_1.getText()) < 0) {
                Percentage_1.setText("0");
                Per_Warn_1.setVisible(true);
            } else if (Percentage_1.getText() == null) {
                Per_Warn_1.setVisible(false);
            } else {
                Per_Warn_1.setVisible(false);
            }
        });

        NumOfYears_2.setOnMouseExited((event7) -> {
            if (Double.parseDouble(NumOfYears_2.getText()) > 5 || Double.parseDouble(NumOfYears_2.getText()) < 0) {
                NumOfYears_2.setText("2");
                Num_Warn_2.setVisible(true);
            } else if (NumOfYears_2.getText() == null) {
                Num_Warn_2.setVisible(false);
            } else {
                Num_Warn_2.setVisible(false);
            }
        });

        Percentage_2.setOnMouseExited((event7) -> {
            if (Double.parseDouble(Percentage_2.getText()) > 20 || Double.parseDouble(Percentage_2.getText()) < 0) {
                Percentage_2.setText("0");
                Per_Warn_2.setVisible(true);
            } else if (Percentage_2.getText() == null) {
                Per_Warn_2.setVisible(false);
            } else {
                Per_Warn_2.setVisible(false);
            }
        });

        NumOfYears_3.setOnMouseExited((event7) -> {
            if (Double.parseDouble(NumOfYears_3.getText()) > 5 || Double.parseDouble(NumOfYears_3.getText()) < 0) {
                NumOfYears_3.setText("2");
                Num_Warn_3.setVisible(true);
            } else if (NumOfYears_3.getText() == null) {
                Num_Warn_3.setVisible(false);
            } else {
                Num_Warn_3.setVisible(false);
            }
        });

        Percentage_3.setOnMouseExited((event7) -> {
            if (Double.parseDouble(Percentage_3.getText()) > 20 || Double.parseDouble(Percentage_3.getText()) < 0) {
                Percentage_3.setText("0");
                Per_Warn_3.setVisible(true);
            } else if (Percentage_3.getText() == null) {
                Per_Warn_3.setVisible(false);
            } else {
                Per_Warn_3.setVisible(false);
            }
        });

        NumOfYears_4.setOnMouseExited((event7) -> {
            if (Double.parseDouble(NumOfYears_4.getText()) > 5 || Double.parseDouble(NumOfYears_4.getText()) < 0) {
                NumOfYears_4.setText("2");
                Num_Warn_4.setVisible(true);
            } else if (NumOfYears_4.getText() == null) {
                Num_Warn_4.setVisible(false);
            } else {
                Num_Warn_4.setVisible(false);
            }
        });

        Percentage_4.setOnMouseExited((event7) -> {
            if (Double.parseDouble(Percentage_4.getText()) > 20 || Double.parseDouble(Percentage_4.getText()) < 0) {
                Percentage_4.setText("0");
                Per_Warn_4.setVisible(true);
            } else if (Percentage_4.getText() == null) {
                Per_Warn_4.setVisible(false);
            } else {
                Per_Warn_4.setVisible(false);
            }
        });

//CALCULATION BUTTON//
        Calculate.setOnAction(new EventHandler<ActionEvent>() {

            //ROOT FINDER USING THE BISECTION METHOD
            public double probit0(double Dinit) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((Dinit) / D50_0) - 1))))));
            }

            public double Dret_0(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit0(a) * probit0(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit0(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit0(c) * probit0(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit1(double Dret1) {
                double gamma50_1 = (double) 9.5675;
                double D50_1 = (double) 64.3842;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((Dret1) / D50_1) - 1))))));  // Need the shift factor for conservative
            }

            public double Dret_1(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit1(a) * probit1(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit1(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit1(c) * probit1(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit2(double Dret2) {
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((Dret2) / D50_2) - 1))))));
            }

            public double Dret_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit2(a) * probit2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit2(c) * probit2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double probit3(double Dret3) {
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((Dret3) / D50_3) - 1))))));
            }

            public double Dret_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit3(a) * probit3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit3(c) * probit3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
            //CALCULATING BEDS

            //////////////////Shifting for conservative factors for Human data/////////////////////////
            public double shifth0(double s) {
                double gamma50_0 = (double) 11.3764;
                double C = (double) Double.parseDouble(Percentage_1.getText());
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + 54.8 * (1 - (C) * 0.01)) / D50_0) - 1))))));
            }

            public double shiftch(double a, double b) {
                double EPSILON = (double) 0.001;

                if (shifth0(a) * shifth0(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shifth0(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shifth0(c) * shifth0(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftm0(double s, double d) {
                double gamma50_0 = (double) 11.3764;
                double C = (double) Double.parseDouble(Percentage_1.getText());
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + d * (1 - (C) * 0.01)) / D50_0) - 1))))));
            }

            public double shiftc(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_0(30, 70);
                //double D = BED_Rper(0);
                //double shift = shiftch(-1,20);

                if (shiftm0(a, d) * shiftm0(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftm0(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftm0(c, d) * shiftm0(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_1(double s, double d) {
                double gamma50_1 = (double) 9.5675;
                double C = (double) Double.parseDouble(Percentage_1.getText());
                double D50_1 = (double) 64.3842;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((s + d * (1 - (C) * 0.01)) / D50_1) - 1))))));
            }

            public double shift1(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_1(30, 70);

                if (shiftD_1(a, d) * shiftD_1(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_1(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_1(c, d) * shiftD_1(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_2(double s, double d) {
                double C = (double) Double.parseDouble(Percentage_1.getText());
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;
                //double D = Dret_2(30,200);

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((s + d * (1 - (C) * 0.01)) / D50_2) - 1))))));
            }

            public double shift2(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_2(30, 70);

                if (shiftD_2(a, d) * shiftD_2(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_2(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_2(c, d) * shiftD_2(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_3(double s, double d) {
                double C = (double) Double.parseDouble(Percentage_1.getText());
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((s + d * (1 - (C) * 0.01)) / D50_3) - 1))))));  // Need the shift factor for conservative
            }

            public double shift3(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_3(30, 70);

                if (shiftD_3(a, d) * shiftD_3(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_3(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_3(c, d) * shiftD_3(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            ///////////////////////////////////////New Dret_0 ... Dret_3 with shift added to them//////////////
            public double probit0shift(double Dinit, double s) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                double P = 0.01 * Double.parseDouble(RiskOfMyel.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + Dinit) / D50_0) - 1))))));
                // return (double) (p_eqn(d,shift) - 0.5*(1+erf((double) (0.70710678118*(gamma50_0*(((s+Dinit)/D50_0)-1)))))); 
            }

            public double Dret_0shift(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shiftc((double) -0.1, 15);
                //  double shift = shiftch((double) -0.1,20);
                //  double d0 = BED_Rper(0);

                if (probit0shift(a, s) * probit0shift(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit0shift(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit0shift(c, s) * probit0shift(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit1shift(double Dret1, double s) {
                double gamma50_1 = (double) 9.5675;
                double D50_1 = (double) 64.3842;
                double P = 0.01 * Double.parseDouble(RiskOfMyel.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((s + Dret1) / D50_1) - 1))))));
                // return (double) (p_eqn(d,shift) - 0.5*(1+erf((double) (0.70710678118*(gamma50_1*(((s+Dret1)/D50_1)-1))))));  
            }

            public double Dret_1shift(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift1((double) -0.1, 15);
                //double shift = shiftch((double) -0.1,20);
                //double d0 = BED_Rper(0);

                if (probit1shift(a, s) * probit1shift(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit1shift(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit1shift(c, s) * probit1shift(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit2shift(double Dret1, double s) {
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;
                double P = 0.01 * Double.parseDouble(RiskOfMyel.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((s + Dret1) / D50_2) - 1))))));
                // return (double) (p_eqn(d,shift) - 0.5*(1+erf((double) (0.70710678118*(gamma50_2*(((s+Dret1)/D50_2)-1))))));  
            }

            public double Dret_2shift(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift2((double) -0.1, 15);
                // double shift = shiftch((double) -0.1,20);
                // double d0 = BED_Rper(0);

                if (probit2shift(a, s) * probit2shift(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit2shift(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit2shift(c, s) * probit2shift(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit3shift(double Dret1, double s) {
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;
                double P = 0.01 * Double.parseDouble(RiskOfMyel.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((s + Dret1) / D50_3) - 1))))));

            }

            public double Dret_3shift(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift3((double) -0.5, 15);

                if (probit3shift(a, s) * probit3shift(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit3shift(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit3shift(c, s) * probit3shift(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double HU_totaleq(double d, double s) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                double P = (double) (0.01 * Double.parseDouble(RiskOfMyel.getText()));

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + d) / D50_0) - 1))))));
            }

            public double Dtol_Hu(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shiftch((double) -0.1, 20);

                if (HU_totaleq(a, s) * HU_totaleq(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (HU_totaleq(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (HU_totaleq(c, s) * HU_totaleq(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            ////////////////////////////////BED PERCENT CALCULATIONS/////////////////////////////////////////////  
            public double BED1_pc_human() {
                double INIT = Double.parseDouble(initalDose.getText());
                double FRAC = Double.parseDouble(NumFrac.getText());
                double k = INIT / FRAC;

                return (INIT * (1 + k / 2) / (Dtol_Hu(0, 120) * 2)) * 100;
            }

            public double BED1_pc() {
                return (44 / Dret_0shift(0, 120)) * 100;
            }

            public double BED21_pc() {
                return (Dret_1shift(30, 80) / Dret_0shift(0, 80)) * 100;
            }

            public double BED22_pc() {
                return (Dret_2shift(30, 80) / Dret_0shift(0, 80)) * 100;
            }

            public double BED23_pc() {
                return (Dret_3shift(30, 80) / Dret_0shift(30, 80)) * 100;
            }

            ///////////////// Risk p calculation///////////////////////////////////////////////////////////////////
            public double p_eqn(double d, double shiftch) {
                return Double.parseDouble(RiskOfMyel.getText()) / 100;

            }

            ///////////////////////////////////////////////////////////////////////////////////  
            //BED OF PERCENTAGE R - NOMINAL VALUE
            public double BED_Rper(double a) {
                return Dtol_Hu(0, 120) * 2;

            }

            public double BED1(double a) {
                double INIT = Double.parseDouble(initalDose.getText());
                double FRAC = Double.parseDouble(NumFrac.getText());
                double k = INIT / FRAC;
                return ((INIT * (1 + k / 2)) / (BED_Rper(a))) * 100;

            }
            /////////////////////GETTING THE VALUES FOR r(1),r(2) and r(3)//////////////////////////////////////

            public double BED2_r1(double a) {
                double B = (double) Double.parseDouble(bed_1.getText());
                double s_0 = (double) Double.parseDouble(s0_1.getText());
                double s_1 = (double) Double.parseDouble(s1_1.getText());
                double B1 = BED1_pc();

                return (double) (BED21_pc() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));

            }

            public double r_1(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r1(a) * BED2_r1(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r1(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r1(c) * BED2_r1(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double BED2_r2(double a) {
                double B = (double) Double.parseDouble(bed_1.getText());
                double s_0 = (double) Double.parseDouble(s0_1.getText());
                double s_1 = (double) Double.parseDouble(s1_1.getText());
                double B1 = BED1_pc();

                return (double) (BED22_pc() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));
            }

            public double r_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r2(a) * BED2_r2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r2(c) * BED2_r2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double BED2_r3(double a) {
                double B = (double) Double.parseDouble(bed_1.getText());
                double s_0 = (double) Double.parseDouble(s0_1.getText());
                double s_1 = (double) Double.parseDouble(s1_1.getText());
                double B1 = BED1_pc();

                return (double) (BED23_pc() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));
            }

            public double r_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r3(a) * BED2_r3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r3(c) * BED2_r3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
//DEFINING THE r(t) FUNCTION - MAKE MORE EFFICIENT

            public double r(double t) {
                double Tiro = (double) 0.19;
                double m;
                double r_1 = r_1(0, 200);
                double r_2 = r_2(0, 200);
                double r_3 = r_3(0, 200);

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
            //////////// BED2 for the graph ////////////////////////////////////////

            public double BED2_FINAL(double a) {
                double B = (double) Double.parseDouble(bed_1.getText());
                double s_0 = (double) Double.parseDouble(s0_1.getText());
                double s_1 = (double) Double.parseDouble(s1_1.getText());
                double t = (double) Double.parseDouble(NumOfYears_1.getText());

                if (a < 100) {
                    return (double) (100 * (1 - a * 0.01) * (1 + (Math.pow(1 - a * 0.01, -r(t) / (r(t) + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (a - B / (1 + s_1 * r(t)))))));
                } else {
                    return 0;
                }
            }
            ////////////////////////BED2 FOR TEXT LABEL//////////////////////////////////////////////

            public double BED2(double a) {
                double B = (double) Double.parseDouble(bed_1.getText());
                double s_0 = (double) Double.parseDouble(s0_1.getText());
                double s_1 = (double) Double.parseDouble(s1_1.getText());
                double t = (double) Double.parseDouble(NumOfYears_1.getText());
                double B1 = BED1(0);

                return (double) (100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -r(t) / (r(t) + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * r(t)))))));

            }
            //////// Function to find the Dret/n(r) ////////////////////////////

            public double dosefcn(double d) {
                double n = Double.parseDouble(RetreatFrac.getText());
                return (double) (BED2(500) * BED_Rper(500) * 0.01 - (n * d + n * d * d / 2));

            }

            public double dose(double a, double b) {
                double EPSILON = (double) 0.001;

                if (dosefcn(a) * dosefcn(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (dosefcn(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (dosefcn(c) * dosefcn(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
//create new series for each button pressed 

            @Override
            public void handle(ActionEvent event) {

                long startTime = System.nanoTime();

                series9.getData().clear();
                series10.getData().clear();
                series11.getData().clear();
                series12.getData().clear();
                series13.getData().clear();
                series14.getData().clear();
                series15.getData().clear();

                warn_bed.setVisible(false);
                p_high.setVisible(false);
                p_low.setVisible(false);
                out.setVisible(true);
                BED1_text.setVisible(true);
                BEDinit_text.setVisible(true);
                BEDR_text1.setVisible(true);
                BEDR2_TEXT.setVisible(true);
                BED2_text.setVisible(true);
                BEDret_text.setVisible(true);
                Dret_text.setVisible(true);

                DecimalFormat df2 = new DecimalFormat("#.##");
                double D = BED_Rper(0);
                double S = shiftch(-1, 20);

                ///////////////////WARNINGS//////////////////////////////////////////////     
                if (BED1_pc_human() > 100) {
                    warn_bed.setVisible(true);
                    warn_bed.setText("WARNING: INITIAL DOSE OVER TOLERANCE");
                    p_high.setVisible(false);
                    p_low.setVisible(false);
                    BED1_text.setText("NA");
                    BEDinit_text.setText("NA");
                    BEDR_text1.setText("NA");
                    BEDR2_TEXT.setText("NA");
                    BED2_text.setText("NA");
                    BEDret_text.setText("NA");
                    Dret_text.setText("NA");
                    out.setText("NA");
                    ret_frac_out_1.setText("NA");
                    run_1.setVisible(true);

                } else if (p_eqn(D, S) > 0.999) {
                    p_high.setVisible(true);
                    p_high.setText("WARNING: RISK GREATER THAN 99.9%");
                    BED1_text.setText("NA");
                    BEDinit_text.setText("NA");
                    BEDR_text1.setText("NA");
                    BEDR2_TEXT.setText("NA");
                    BED2_text.setText("NA");
                    BEDret_text.setText("NA");
                    Dret_text.setText("NA");
                    out.setText("NA");
                    ret_frac_out_1.setText("NA");
                    warn_bed.setVisible(false);
                    p_low.setVisible(false);
                    run_1.setVisible(true);

                } else if (p_eqn(D, S) < 1e-5) {
                    p_low.setVisible(true);
                    p_low.setText("WARNING: RISK LESS THAN 0.001%");
                    BED1_text.setText("NA");
                    BEDinit_text.setText("NA");
                    BEDR_text1.setText("NA");
                    BEDR2_TEXT.setText("NA");
                    BED2_text.setText("NA");
                    BEDret_text.setText("NA");
                    Dret_text.setText("NA");
                    out.setText("NA");
                    ret_frac_out_1.setText("NA");
                    warn_bed.setVisible(false);
                    p_high.setVisible(false);
                    run_1.setVisible(true);

                } else {

                    double INIT = Double.parseDouble(initalDose.getText());
                    double FRAC = Double.parseDouble(NumFrac.getText());
                    double k = INIT / FRAC;
                    initfrac_text.setText(df2.format(k));
                    ret_frac_out_1.setText(RetreatFrac.getText());

//CODE FOR THE LABELS BEDS
                    BED1_text.setText(df2.format(BED1(500)));

                    BEDinit_text.setText(df2.format((INIT * (1 + k / 2))));

                    BEDR_text1.setText(df2.format((BED_Rper(500))));

                    BEDR2_TEXT.setText(df2.format(BED_Rper(500)));

                    BED2_text.setText(df2.format(BED2(500)));

                    BEDret_text.setText(df2.format((BED2(500) * (BED_Rper(500))) / 100));

                    Dret_text.setText(df2.format(dose(0, 20)));

                    out.setText(df2.format(BED_Rper(500)));

                    warn_bed.setVisible(false);
                    p_high.setVisible(false);
                    p_low.setVisible(false);
                    out.setVisible(true);
                    BED1_text.setVisible(true);
                    BEDinit_text.setVisible(true);
                    BEDR_text1.setVisible(true);
                    BEDR2_TEXT.setVisible(true);
                    BED2_text.setVisible(true);
                    BEDret_text.setVisible(true);
                    Dret_text.setVisible(true);
                    run_1.setVisible(true);

                }

// VERFICATION OF THE TEXTFIELD DATA
                try {
                    double RiskVal = Double.parseDouble(RiskOfMyel.getText());
                    if (RiskVal > 0 && RiskVal < 100) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.1;
                        RiskOfMyel.setText("0.1");
                    }
                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    RiskOfMyel.setText("0.1");
                }

                try {
                    double RiskVal = Double.parseDouble(bed_1.getText());
                    if (RiskVal > 0 && RiskVal < 45) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 35;
                        bed_1.setText("35");
                    }
                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    bed_1.setText("35");
                }

                try {
                    double RiskVal = Double.parseDouble(s1_1.getText());
                    if (RiskVal > 0.01 && RiskVal < 1) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.1;
                        s1_1.setText("0.1");
                    }
                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    s1_1.setText("0.1");
                }

                try {
                    double RiskVal = Double.parseDouble(s0_1.getText());
                    if (RiskVal > 0.03 && RiskVal < 1) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.15;
                        s0_1.setText("0.15");
                    }
                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    s0_1.setText("0.15");
                }

                try {
                    double RiskVal = Double.parseDouble(NumOfYears_1.getText());
                    if (RiskVal >= 0 && RiskVal <= 5) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 2;
                        NumOfYears_1.setText("1");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    NumOfYears_1.setText("2");
                }

                try {
                    double RiskVal = Double.parseDouble(Percentage_1.getText());
                    if (RiskVal >= 0 && RiskVal <= 20) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0;
                        Percentage_1.setText("0");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    Percentage_1.setText("0");
                }

                try {
                    double InitalVal = Double.parseDouble(initalDose.getText());
                    if (InitalVal > 0) {
                        InitalVal = InitalVal;
                    } else {
                        InitalVal = 40;
                        initalDose.setText("40");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    initalDose.setText("40");
                }

                try {
                    int NumVal = Integer.parseInt(NumFrac.getText());
                    if (NumVal > 0) {
                        NumVal = NumVal;
                    } else {
                        NumVal = 20;
                        NumFrac.setText("20");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    NumFrac.setText("20");
                }

                try {
                    int RetVal = Integer.parseInt(RetreatFrac.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 20;
                        RetreatFrac.setText("20");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    RetreatFrac.setText("20");

                }

//PUT VALUES OF BED2 INTO AN ARRAY
                double BED2Array[] = new double[101];
                for (int j = 0; j < 101; j++) {

                    double value1 = BED2_FINAL(j);
                    BED2Array[j] = value1;
                }

                //NEED TO MAKE A NEW SERIES EACH TIME THE FUNCTION IS CALLED!!! MAKE A IF STATEMENT FOR THIS        
                for (int i = 0; i < 101; i++) {

                    series9.getData().add(new XYChart.Data(i, BED2Array[i]));
                }
                series10.getData().add(new XYChart.Data(BED1_pc(), BED21_pc()));
                series11.getData().add(new XYChart.Data(BED1_pc(), BED22_pc()));

                series12.getData().add(new XYChart.Data(BED1_pc(), BED23_pc()));

                series13.getData().add(new XYChart.Data(BED1_pc_human(), BED2_FINAL(BED1_pc_human())));
                series14.getData().add(new XYChart.Data(0, BED2_FINAL(BED1_pc_human())));
                series14.getData().add(new XYChart.Data(BED1_pc_human(), BED2_FINAL(BED1_pc_human())));

                series15.getData().add(new XYChart.Data(BED1_pc_human(), 0));
                series15.getData().add(new XYChart.Data(BED1_pc_human(), BED2_FINAL(BED1_pc_human())));

                chart2.getData().addAll(series9, series10, series11, series12, series13, series14, series15);

                long endTime = System.nanoTime();
                long totalTime = endTime - startTime;
                System.out.println("Total time for calculation " + totalTime / 1e9 + " seconds");

            }

        });
        ////////////////////////////// CALCULATION BUTTON FOR TAB 4 ///////////////////////////////////////////////  

        Calculate_4.setOnAction(new EventHandler<ActionEvent>() {

            public double alpha_u_4_IN() {
                return (10.57 / 3.92) * (1 - Math.exp(-3.92 * alpha_low));
            }

            public double Ahi_4_IN() {
                double letx = Double.parseDouble(letx_4.getText());
                double letu = Double.parseDouble(letu_4.getText());
                double letc = Double.parseDouble(letc_4.getText());

                return alpha_low + (alpha_u_4_IN() - alpha_low) * (letx - letc) / (letu - letc);
            }

            public double beta_u_4_IN() {
                return 0.06 * (1 - Math.exp(-50 * beta_low));
            }

            public double Bhi_4_IN() {
                double letx = Double.parseDouble(letx_4.getText());
                double letu = Double.parseDouble(letu_4.getText());
                double letc = Double.parseDouble(letc_4.getText());

                return beta_low + (beta_u_4_IN() - beta_low) * (letx - letc) / (letu - letc);

            }

            public double d_low_2_4_IN() {
                double d_hi = Double.parseDouble(initalDose_4.getText()) / Double.parseDouble(NumFrac_4.getText());

                return 1 / (2 * beta_low) * (-alpha_low + Math.pow(alpha_low * alpha_low + 4 * Ahi_4_IN() * beta_low * d_hi + 4 * Bhi_4_IN() * beta_low * d_hi * d_hi, 0.5));

            }

            public double RBE_4_IN() {
                double d_hi = Double.parseDouble(initalDose_4.getText()) / Double.parseDouble(NumFrac_4.getText());
                DecimalFormat df2 = new DecimalFormat("#.##");
                double m;
                if (RBE_CHECKBOX_4.isSelected()) {
                    return 1.1;
                } else {
                    m = (d_low_2_4_IN() / d_hi);
                }
                return Math.round(m * 100d) / 100d;

            }

            public double alpha_u_4_RE() {
                return (10.57 / 3.92) * (1 - Math.exp(-3.92 * alpha_low));
            }

            public double Ahi_4_RE() {
                double letx = Double.parseDouble(letx_ret_4.getText());
                double letu = Double.parseDouble(letu_ret_4.getText());
                double letc = Double.parseDouble(letc_ret_4.getText());

                return alpha_low + (alpha_u_4_RE() - alpha_low) * (letx - letc) / (letu - letc);
            }

            public double beta_u_4_RE() {
                return 0.06 * (1 - Math.exp(-50 * beta_low));
            }

            public double Bhi_4_RE() {
                double letx = Double.parseDouble(letx_ret_4.getText());
                double letu = Double.parseDouble(letu_ret_4.getText());
                double letc = Double.parseDouble(letc_ret_4.getText());

                return beta_low + (beta_u_4_RE() - beta_low) * (letx - letc) / (letu - letc);

            }

            public double d_low_2_4_RE() {
                double d_hi = Double.parseDouble(DHIGH_4.getText());

                return 1 / (2 * beta_low) * (-alpha_low + Math.pow(alpha_low * alpha_low + 4 * Ahi_4_RE() * beta_low * d_hi + 4 * Bhi_4_RE() * beta_low * d_hi * d_hi, 0.5));

            }

            public double RBE_4_RE() {
                double d_hi = Double.parseDouble(DHIGH_4.getText());
                if (RBE_RET_CHECKBOX_4.isSelected()) {
                    return 1.1;
                } else {
                    return d_low_2_4_RE() / d_hi;
                }

            }
////////////////////////// TAB2 EQNS SAME AS PHOTON /////////////////////////////

            public double probit0_4(double Dinit) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((Dinit) / D50_0) - 1))))));
            }

            public double Dret_0_4(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit0_4(a) * probit0_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit0_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit0_4(c) * probit0_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit1_4(double Dret1) {
                double gamma50_1 = (double) 9.5675;
                double D50_1 = (double) 64.3842;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((Dret1) / D50_1) - 1))))));
            }

            public double Dret_1_4(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit1_4(a) * probit1_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit1_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit1_4(c) * probit1_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit2_4(double Dret2) {
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((Dret2) / D50_2) - 1))))));
            }

            public double Dret_2_4(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit2_4(a) * probit2_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit2_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit2_4(c) * probit2_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double probit3_4(double Dret3) {
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((Dret3) / D50_3) - 1))))));
            }

            public double Dret_3_4(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit3_4(a) * probit3_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit3_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit3_4(c) * probit3_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
            //CALCULATING BEDS

            //////////////////Shifting for conservative factors for Human data/////////////////////////
            public double shifth0_4(double s) {
                double gamma50_0 = (double) 11.3764;
                double C = (double) Double.parseDouble(Percentage_4.getText());
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + 54.8 * (1 - (C) * 0.01)) / D50_0) - 1))))));
            }

            public double shiftch_4(double a, double b) {
                double EPSILON = (double) 0.001;

                if (shifth0_4(a) * shifth0_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shifth0_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shifth0_4(c) * shifth0_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftm0_4(double s, double d) {
                double gamma50_0 = (double) 11.3764;
                double C = (double) Double.parseDouble(Percentage_4.getText());
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + d * (1 - (C) * 0.01)) / D50_0) - 1))))));
            }

            public double shiftc_4(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_0_4(30, 70);
                //double D = BED_Rper(0);
                //double shift = shiftch(-1,20);

                if (shiftm0_4(a, d) * shiftm0_4(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftm0_4(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftm0_4(c, d) * shiftm0_4(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_1_4(double s, double d) {
                double gamma50_1 = (double) 9.5675;
                double C = (double) Double.parseDouble(Percentage_4.getText());
                double D50_1 = (double) 64.3842;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((s + d * (1 - (C) * 0.01)) / D50_1) - 1))))));
            }

            public double shift1_4(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_1_4(30, 70);

                if (shiftD_1_4(a, d) * shiftD_1_4(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_1_4(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_1_4(c, d) * shiftD_1_4(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_2_4(double s, double d) {
                double C = (double) Double.parseDouble(Percentage_4.getText());
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((s + d * (1 - (C) * 0.01)) / D50_2) - 1))))));
            }

            public double shift2_4(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_2_4(30, 70);

                if (shiftD_2_4(a, d) * shiftD_2_4(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_2_4(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_2_4(c, d) * shiftD_2_4(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_3_4(double s, double d) {
                double C = (double) Double.parseDouble(Percentage_4.getText());
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((s + d * (1 - (C) * 0.01)) / D50_3) - 1))))));
            }

            public double shift3_4(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_3_4(30, 70);

                if (shiftD_3_4(a, d) * shiftD_3_4(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_3_4(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_3_4(c, d) * shiftD_3_4(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            ///////////////////////////////////////New Dret_0 ....Dret_3 with shift added to them//////////////
            public double probit0shift_4(double Dinit, double s) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_4.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + Dinit) / D50_0) - 1))))));

            }

            public double Dret_0shift_4(double a, double b) {
                double EPSILON = (double) 0.0001;
                double s = shiftc_4((double) -0.1, 15);

                if (probit0shift_4(a, s) * probit0shift_4(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit0shift_4(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit0shift_4(c, s) * probit0shift_4(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit1shift_4(double Dret1, double s) {
                double gamma50_1 = (double) 9.5675;
                double D50_1 = (double) 64.3842;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_4.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((s + Dret1) / D50_1) - 1))))));

            }

            public double Dret_1shift_4(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift1_4((double) -0.1, 15);

                if (probit1shift_4(a, s) * probit1shift_4(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit1shift_4(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit1shift_4(c, s) * probit1shift_4(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit2shift_4(double Dret1, double s) {
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_4.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((s + Dret1) / D50_2) - 1))))));

            }

            public double Dret_2shift_4(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift2_4((double) -0.1, 15);

                if (probit2shift_4(a, s) * probit2shift_4(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit2shift_4(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit2shift_4(c, s) * probit2shift_4(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit3shift_4(double Dret1, double s) {
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_4.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((s + Dret1) / D50_3) - 1))))));

            }

            public double Dret_3shift_4(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift3_4((double) -0.5, 15);

                if (probit3shift_4(a, s) * probit3shift_4(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit3shift_4(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit3shift_4(c, s) * probit3shift_4(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double HU_totaleq_4(double d, double s) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                double P = (double) (0.01 * Double.parseDouble(RiskOfMyel_4.getText()));

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + d) / D50_0) - 1))))));
            }

            public double Dtol_Hu_4(double a, double b) {
                double EPSILON = (double) 0.0001;
                double s = shiftch_4((double) -0.1, 20);

                if (HU_totaleq_4(a, s) * HU_totaleq_4(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (HU_totaleq_4(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (HU_totaleq_4(c, s) * HU_totaleq_4(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            ///////////////////////////////////Percentage BED calculations - paper //////////////////////////////////////////  
            public double BED1_pc_human_4() {
                double INIT = Double.parseDouble(initalDose_4.getText()) / Double.parseDouble(NumFrac_4.getText());
                double FRAC = Double.parseDouble(NumFrac_4.getText());
                double k = (RBE_4_IN() * INIT);

                return (k * FRAC * (1 + k / 2) / (Dtol_Hu_4(0, 120) * 2)) * 100;
            }

            public double BED1_pc_4() {
                return (44 / Dret_0shift_4(0, 120)) * 100;

            }

            public double BED21_pc_4() {
                return (Dret_1shift_4(30, 80) / Dret_0shift_4(0, 80)) * 100;
            }

            public double BED22_pc_4() {
                return (Dret_2shift_4(30, 80) / Dret_0shift_4(0, 80)) * 100;
            }

            public double BED23_pc_4() {
                return (Dret_3shift_4(30, 80) / Dret_0shift_4(30, 80)) * 100;
            }

            ///////////////// P_CALC FROM MATLAB ///////////////////////////////////////////////////////////////////
            public double p_eqn_4(double d, double shiftch) {
                return Double.parseDouble(RiskOfMyel_4.getText()) / 100;

            }

            ///////////////////////////////////////////////////////////////////////////////////  
            //BED OF PERCENTAGE R - NOMINAL VALUE
            public double BED_Rper_4(double a) {
                DecimalFormat f = new DecimalFormat("##.##");
                double k = Dtol_Hu_4(0, 120) * 2;
                return Double.parseDouble(f.format(k));

            }

            public double BED1_4(double a) {
                double INIT = Double.parseDouble(initalDose_4.getText()) / Double.parseDouble(NumFrac_4.getText());
                double FRAC = Double.parseDouble(NumFrac_4.getText());
                double k = RBE_4_IN() * INIT;

                return ((k * FRAC * (1 + (k) / 2)) / (BED_Rper_4(a))) * 100;

            }
            /////////////////////GETTING THE VALUES FOR r(1),r(2) and r(3)//////////////////////////////////////

            public double BED2_r1_4(double a) {
                double B = Double.parseDouble(bed_4.getText());
                double s_0 = Double.parseDouble(s0_4.getText());
                double s_1 = Double.parseDouble(s1_4.getText());
                double B1 = BED1_pc_4();

                return (double) (BED21_pc_4() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));

            }

            public double r_1_4(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r1_4(a) * BED2_r1_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r1_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r1_4(c) * BED2_r1_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double BED2_r2_4(double a) {
                double B = Double.parseDouble(bed_4.getText());
                double s_0 = Double.parseDouble(s0_4.getText());
                double s_1 = Double.parseDouble(s1_4.getText());
                double B1 = BED1_pc_4();

                return (double) (BED22_pc_4() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));

            }

            public double r_2_4(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r2_4(a) * BED2_r2_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r2_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r2_4(c) * BED2_r2_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double BED2_r3_4(double a) {
                double B = Double.parseDouble(bed_4.getText());
                double s_0 = Double.parseDouble(s0_4.getText());
                double s_1 = Double.parseDouble(s1_4.getText());
                double B1 = BED1_pc_4();

                return (double) (BED23_pc_4() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));

            }

            public double r_3_4(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r3_4(a) * BED2_r3_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r3_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r3_4(c) * BED2_r3_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
//DEFINING THE r(t) FUNCTION - MAKE MORE EFFICIENT

            public double r_4(double t) {
                double Tiro = (double) 0.19;
                double m;
                double r_1 = r_1_4(0, 200);
                double r_2 = r_2_4(0, 200);
                double r_3 = r_3_4(0, 200);

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
            //////////// BED2 for the graph ////////////////////////////////////////

            public double BED2_FINAL_4(double a) {
                double B = Double.parseDouble(bed_4.getText());
                double s_0 = Double.parseDouble(s0_4.getText());
                double s_1 = Double.parseDouble(s1_4.getText());
                double t = (double) Double.parseDouble(NumOfYears_4.getText());

                if (a < 100) {
                    return (double) (100 * (1 - a * 0.01) * (1 + (Math.pow(1 - a * 0.01, -r_4(t) / (r_4(t) + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (a - B / (1 + s_1 * r_4(t)))))));
                } else {
                    return 0;
                }
            }
            ////////////////////////BED2 FOR TEXT LABEL//////////////////////////////////////////////

            public double BED2__4(double a) {
                double B = Double.parseDouble(bed_4.getText());
                double s_0 = Double.parseDouble(s0_4.getText());
                double s_1 = Double.parseDouble(s1_4.getText());
                double t = (double) Double.parseDouble(NumOfYears_4.getText());

                double B1 = BED1_4(0);

                return (double) (100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -r_4(t) / (r_4(t) + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * r_4(t)))))));

            }
            //////// Function to find the n(r) ////////////////////////////

            public double dosefcn_4(double n) {
                double D = Double.parseDouble(DHIGH_4.getText());
                if (RBE_CHECKBOX_4.isSelected()) {
                    double d = D * RBE_4_RE();
                    return (double) (BED2__4(500) * BED_Rper_4(500) * 0.01 - (n * d + n * d * d / 2));

                } else {
                    double d = D * RBE_4_RE();
                    return (double) (BED2__4(500) * BED_Rper_4(500) * 0.01 - (n * d + n * d * d / 2));
                }

            }

            public double dose_4(double a, double b) {
                double EPSILON = (double) 0.0001;
                DecimalFormat f = new DecimalFormat("##.##");

                if (dosefcn_4(a) * dosefcn_4(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (dosefcn_4(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (dosefcn_4(c) * dosefcn_4(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }

                return c;

            }

            public double roundedBEDret_4(double d, double n, double RBE) {

                return (double) (BED2__4(500) * BED_Rper_4(500) * 0.01 - (n * RBE * d + n * d * d * RBE * RBE / 2));

            }

            public double roundedFracDose_4(double a, double b) {
                double EPSILON = (double) 0.0001;
                double n = Math.round(dose_4(0, 50));

                double RBE = RBE_4_RE();

                if (roundedBEDret_4(a, n, RBE) * roundedBEDret_4(b, n, RBE) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (roundedBEDret_4(c, n, RBE) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (roundedBEDret_4(c, n, RBE) * roundedBEDret_4(a, n, RBE) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }

                return c;

            }

            public double d_low_2_4_RE_CHECK(double d_hi) {

                return 1 / (2 * beta_low) * (-alpha_low + Math.pow(alpha_low * alpha_low + 4 * Ahi_4_RE() * beta_low * d_hi + 4 * Bhi_4_RE() * beta_low * d_hi * d_hi, 0.5));

            }

            @Override
            public void handle(ActionEvent event) {

                long startTime = System.nanoTime();

                series9_4.getData().clear();
                series10_4.getData().clear();
                series11_4.getData().clear();
                series12_4.getData().clear();
                series13_4.getData().clear();
                series14_4.getData().clear();
                series15_4.getData().clear();

                warn_bed_4.setVisible(false);
                RETFRAC_WARN_4.setVisible(false);
                p_high_4.setVisible(false);
                p_low_4.setVisible(false);
                out_4.setVisible(true);
                BED1_text_4.setVisible(true);
                BEDinit_text_4.setVisible(true);
                BEDR_text_4.setVisible(true);
                BEDR2_TEXT_4.setVisible(true);
                BED2_text_4.setVisible(true);
                BEDret_text_4.setVisible(true);
                Dret_text_4.setVisible(true);
                ProDose_4.setVisible(true);

                try {
                    double RiskVal = Double.parseDouble(RiskOfMyel_4.getText());
                    if (RiskVal > 0 && RiskVal < 100) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.1;
                        RiskOfMyel_4.setText("0.1");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    RiskOfMyel_4.setText("0.1");
                }

                try {
                    double RiskVal = Double.parseDouble(s0_4.getText());
                    if (RiskVal > 0 && RiskVal < 1) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.15;
                        s0_4.setText("0.15");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    s0_4.setText("0.15");
                }

                try {
                    double RiskVal = Double.parseDouble(s1_4.getText());
                    if (RiskVal > 0 && RiskVal < 1) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.1;
                        s1_4.setText("0.1");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    s1_4.setText("0.1");
                }

                try {
                    double RiskVal = Double.parseDouble(bed_4.getText());
                    if (RiskVal > 0 && RiskVal < 45) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 45;
                        s0_4.setText("45");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    s0_4.setText("45");
                }

                try {
                    double RiskVal = Double.parseDouble(NumOfYears_4.getText());
                    if (RiskVal >= 0 && RiskVal <= 5) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 2;
                        NumOfYears_4.setText("2");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    NumOfYears_4.setText("2");
                }

                try {
                    double InitalVal = Double.parseDouble(initalDose_4.getText());
                    if (InitalVal > 0) {
                        InitalVal = InitalVal;
                    } else {
                        InitalVal = 1.3;
                        initalDose_4.setText("1.3");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    initalDose_4.setText("40");
                }

                try {
                    int NumVal = Integer.parseInt(NumFrac_4.getText());
                    if (NumVal > 0) {
                        NumVal = NumVal;
                    } else {
                        NumVal = 20;
                        NumFrac_4.setText("20");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    NumFrac_3.setText("20");
                }

                try {
                    double RetVal = Double.parseDouble(letx_4.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 1;
                        letx_4.setText("1");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    letx_4.setText("1");

                }

                try {
                    double InitalVal = Double.parseDouble(initalDose_4.getText());
                    if (InitalVal > 0) {
                        InitalVal = InitalVal;
                    } else {
                        InitalVal = 1.3;
                        initalDose_4.setText("1.3");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    initalDose_4.setText("1.3");
                }

                try {
                    int NumVal = Integer.parseInt(NumFrac_4.getText());
                    if (NumVal > 0) {
                        NumVal = NumVal;
                    } else {
                        NumVal = 30;
                        NumFrac_4.setText("30");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    NumFrac_4.setText("30");
                }

                try {
                    double RetVal = Double.parseDouble(DHIGH_4.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 2;
                        DHIGH_4.setText("2");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    DHIGH_4.setText("2");

                }

                try {
                    double RetVal = Double.parseDouble(bed_4.getText());
                    if (RetVal > 0 && RetVal <= 45) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 35;
                        bed_4.setText("35");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    bed_4.setText("35");

                }

                try {
                    double RetVal = Double.parseDouble(letu_4.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 30.5;
                        letu_4.setText("30.5");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    letu_4.setText("30.5");

                }
                DecimalFormat df2 = new DecimalFormat("0.##");
                double INIT = Double.parseDouble(initalDose_4.getText());
                double FRAC = Double.parseDouble(NumFrac_4.getText());
                double k = (RBE_4_IN() * FRAC * INIT) / FRAC;
                initfrac_text_4.setText(df2.format(INIT / FRAC));

//CODE FOR THE LABELS BEDS 
                double D = BED_Rper_4(0);
                double S = shiftch_4(-1, 20);
                double n = dose_4(0, 50);

                if (BED1_pc_human_4() > 100) {
                    warn_bed_4.setVisible(true);
                    warn_bed_4.setText("WARNING: INITIAL DOSE OVER TOLERANCE");
                    p_high_4.setVisible(false);
                    p_low_4.setVisible(false);
                    BED1_text_4.setText("NA");
                    BEDinit_text_4.setText("NA");
                    BEDR_text_4.setText("NA");
                    BEDR2_TEXT_4.setText("NA");
                    BED2_text_4.setText("NA");
                    BEDret_text_4.setText("NA");
                    Dret_text_4.setText("NA");
                    ProDose_4.setText("NA");
                    RBE_IN_TEXT_4.setText("NA");
                    out_4.setText("NA");
                    ret_frac_out_4.setText("NA");
                    run_4.setVisible(true);
                    RETFRAC_WARN_4.setVisible(false);
                } else if (p_eqn_4(D, S) > 0.999) {
                    p_high_4.setVisible(true);
                    p_high_4.setText("WARNING: RISK GREATER THAN 99.9%");
                    BED1_text_4.setText("NA");
                    BEDinit_text_4.setText("NA");
                    BEDR_text_4.setText("NA");
                    BEDR2_TEXT_4.setText("NA");
                    BED2_text_4.setText("NA");
                    BEDret_text_4.setText("NA");
                    Dret_text_4.setText("NA");
                    ProDose_4.setText("NA");
                    ret_frac_out_4.setText("NA");
                    RBE_IN_TEXT_4.setText("NA");
                    out_4.setText("NA");
                    warn_bed_4.setVisible(false);
                    p_low_4.setVisible(false);
                    run_4.setVisible(true);
                    RETFRAC_WARN_4.setVisible(false);
                } else if (p_eqn_4(D, S) < 1e-5) {
                    p_low_4.setVisible(true);
                    p_low_4.setText("WARNING: RISK LESS THAN 0.001%");
                    BED1_text_4.setText("NA");
                    BEDinit_text_4.setText("NA");
                    BEDR_text_4.setText("NA");
                    BEDR2_TEXT_4.setText("NA");
                    BED2_text_4.setText("NA");
                    BEDret_text_4.setText("NA");
                    RBE_IN_TEXT_4.setText("NA");
                    Dret_text_4.setText("NA");
                    out_4.setText("NA");
                    ret_frac_out_4.setText("NA");
                    ProDose_4.setText("NA");
                    warn_bed_4.setVisible(false);
                    p_high_4.setVisible(false);
                    run_4.setVisible(true);
                } else if (Math.round(n * 100) / 100 < 1) {
                    p_low_4.setVisible(false);

                    BED1_text_4.setText("NA");
                    BEDinit_text_4.setText("NA");
                    BEDR_text_4.setText("NA");
                    BEDR2_TEXT_4.setText("NA");
                    BED2_text_4.setText("NA");
                    BEDret_text_4.setText("NA");
                    Dret_text_4.setText(df2.format(n));
                    out_4.setText("NA");
                    ret_frac_out_4.setText("NA");
                    RBE_IN_TEXT_4.setText("NA");
                    ProDose_4.setText("NA");
                    warn_bed_4.setVisible(false);
                    p_high_4.setVisible(false);
                    run_4.setVisible(true);
                    RETFRAC_WARN_4.setVisible(true);

                } else {

                    initfrac_text_4.setText(df2.format(INIT / FRAC));
                    double Q = (INIT / FRAC) * RBE_4_IN();
                    ret_frac_out_4.setText(df2.format(n));
                    double d_hi = Double.parseDouble(DHIGH_4.getText());

//CODE FOR THE LABELS BEDS
                    BED1_text_4.setText(df2.format(BED1_4(500)));
                    BEDinit_text_4.setText(df2.format((Q * FRAC * (1 + Q / 2))));
                    BEDR_text_4.setText(df2.format((BED_Rper_4(500))));
                    BEDR2_TEXT_4.setText(df2.format(BED_Rper_4(500)));
                    BED2_text_4.setText(df2.format(BED2__4(500)));
                    BEDret_text_4.setText(df2.format((BED2__4(500) * (BED_Rper_4(500))) / 100));
                    Dret_text_4.setText(df2.format(dose_4(0, 50)));
                    out_4.setText(df2.format(RBE_4_RE()));
                    RBE_IN_TEXT_4.setText(df2.format(RBE_4_IN()));
                    ProDose_4.setText(df2.format(d_hi));

                    warn_bed_4.setVisible(false);
                    p_high_4.setVisible(false);
                    p_low_4.setVisible(false);
                    out_4.setVisible(true);
                    BED1_text_4.setVisible(true);
                    BEDinit_text_4.setVisible(true);
                    BEDR_text_4.setVisible(true);
                    BEDR2_TEXT_4.setVisible(true);
                    BED2_text_4.setVisible(true);
                    BEDret_text_4.setVisible(true);
                    Dret_text_4.setVisible(true);
                    ProDose_4.setVisible(true);
                    run_4.setVisible(true);
                    RETFRAC_WARN_4.setVisible(false);

                }

                ////CODE FOR THE DOSE SUGGESTION////
                if (!dose_select_4.isSelected()) {

                    n = Math.round(n * 1000.0) / 1000.0;

                    double n0 = Double.parseDouble(df2.format(n - Math.floor(n)));

                    double n1 = Math.round(n * 1000.0) / 1000.0;
                    double n2 = Math.round((n1 - Math.floor(n)) * 1000.0) / 1000.0;

                    if ((n - Math.floor(n)) < 0.5 && n0 != 0) {
                        String d = df2.format(n);
                        String f = df2.format(Math.round(n));
                        DecimalFormat df3 = new DecimalFormat("0.0000");
                        double r_dret = roundedFracDose_4(0, 20);
                        String r = df3.format(r_dret);
                        double d_low = d_low_2_4_RE_CHECK(r_dret);

                        double r2 = Math.round(d_low / r_dret * 100.0) / 100.0;
                        double r3 = Math.round(RBE_4_RE() * 100.0) / 100.0;

                        String s = "Retreatment fraction is not an integer " + "(" + d + ")" + "\n" + "Action taken: increased the retreatment dose to " + r + "\nto get " + f + " retreatment fractions.\nThe adjusted dose has been transferred to the input box.\n \n𝐏𝐥𝐞𝐚𝐬𝐞 𝐫𝐞-𝐜𝐚𝐥𝐜𝐮𝐥𝐚𝐭𝐞.";
                        DHIGH_4.setText(r);

                        if (r2 != r3 && !RBE_RET_CHECKBOX_4.isSelected()) {
                            r = "𝐧𝐨𝐭 𝐚𝐯𝐚𝐢𝐥𝐚𝐛𝐥𝐞*";
                            s = "Retreatment fraction is not an integer " + "(" + d + ")" + "\n" + "Action taken: increased the retreatment dose to " + r + "\nto get " + f + " retreatment fractions.\nThe adjusted dose has been transferred to the input box.\n \n𝐏𝐥𝐞𝐚𝐬𝐞 𝐫𝐞-𝐜𝐚𝐥𝐜𝐮𝐥𝐚𝐭𝐞.\n \n*Dose not given as it would change estimated \nRBE for retreatment";

                        }

                        DoseSuggest.display("Dose adjustment", s);
                    } else if ((n - Math.floor(n)) > 0.5 && n0 != 0) {
                        String d = df2.format(n);
                        String f = df2.format(Math.round(n));
                        DecimalFormat df3 = new DecimalFormat("0.0000");
                        double r_dret = roundedFracDose_4(0, 20);
                        String r = df3.format(r_dret);
                        double d_low = d_low_2_4_RE_CHECK(r_dret);

                        double r2 = Math.round(d_low / r_dret * 100.0) / 100.0;
                        double r3 = Math.round(RBE_4_RE() * 100.0) / 100.0;
                        String s = "Retreatment fraction is not an integer " + "(" + d + ")" + "\n" + "Action taken: decreased the retreatment dose to " + r + "\nto get " + f + " retreatment fractions.\nThe adjusted dose has been transferred to the input box.";
                        DHIGH_4.setText(r);
                        if (r2 != r3 && !RBE_RET_CHECKBOX_4.isSelected()) {

                            Font myFont = new Font("Segoe UI", Font.BOLD | Font.ITALIC, 0);

                            r = "𝐧𝐨𝐭 𝐚𝐯𝐚𝐢𝐥𝐚𝐛𝐥𝐞*";
                            System.out.println(df2.format(d_low / r_dret));
                            System.out.println(df2.format(RBE_4_RE()));
                            System.out.println(r2);
                            s = "Retreatment fraction is not an integer " + "(" + d + ")" + "\n" + "Action taken: decreased the retreatment dose to " + r + "\nto get " + f + " retreatment fractions.\nThe adjusted dose has been transferred to the input box.\n \n*Dose not given as it would change estimated\n RBE for retreatment";
                        }

                        DoseSuggest.display("Dose adjustment", s);
                    } else {
                    }
                }

                double BED2Array_4[] = new double[101];
                for (int j = 0; j < 101; j++) {

                    double value1 = BED2_FINAL_4(j);
                    BED2Array_4[j] = value1;
                }

                for (int i = 0; i < 101; i++) {
                    series9_4.getData().add(new XYChart.Data(i, BED2Array_4[i]));
                }
                series10_4.getData().add(new XYChart.Data(BED1_pc_4(), BED21_pc_4()));
                series11_4.getData().add(new XYChart.Data(BED1_pc_4(), BED22_pc_4()));

                series12_4.getData().add(new XYChart.Data(BED1_pc_4(), BED23_pc_4()));

                series13_4.getData().add(new XYChart.Data(BED1_pc_human_4(), BED2_FINAL_4(BED1_pc_human_4())));
                series14_4.getData().add(new XYChart.Data(0, BED2_FINAL_4(BED1_pc_human_4())));
                series14_4.getData().add(new XYChart.Data(BED1_pc_human_4(), BED2_FINAL_4(BED1_pc_human_4())));

                series15_4.getData().add(new XYChart.Data(BED1_pc_human_4(), 0));
                series15_4.getData().add(new XYChart.Data(BED1_pc_human_4(), BED2_FINAL_4(BED1_pc_human_4())));

                chart2_4.getData().addAll(series9_4, series10_4, series11_4, series12_4, series13_4, series14_4, series15_4);

                System.out.println("Initial RBE = " + RBE_4_IN());

                long endTime = System.nanoTime();
                long totalTime = endTime - startTime;
                System.out.println("Total time for calculation " + totalTime / 1e9 + " seconds");
            }

        });

        ///  CALCULATOR BUTTON FOR TAB 2//////////////////////////////////////////////////
        Calculate_2.setOnAction(new EventHandler<ActionEvent>() {

            public double alpha_u_2() {
                return (10.57 / 3.92) * (1 - Math.exp(-3.92 * alpha_low));
            }

            public double Ahi_2() {
                double letx = Double.parseDouble(letx_2.getText());
                double letu = Double.parseDouble(letu_2.getText());
                double letc = Double.parseDouble(letc_2.getText());

                return alpha_low + (alpha_u_2() - alpha_low) * (letx - letc) / (letu - letc);
            }

            public double beta_u_2() {
                return 0.06 * (1 - Math.exp(-50 * beta_low));
            }

            public double Bhi_2() {
                double letx = Double.parseDouble(letx_2.getText());
                double letu = Double.parseDouble(letu_2.getText());
                double letc = Double.parseDouble(letc_2.getText());

                return beta_low + (beta_u_2() - beta_low) * (letx - letc) / (letu - letc);

            }

            public double d_low_2() {
                double d_hi = Double.parseDouble(DHIGH_2.getText());

                return 1 / (2 * beta_low) * (-alpha_low + Math.pow(alpha_low * alpha_low + 4 * Ahi_2() * beta_low * d_hi + 4 * Bhi_2() * beta_low * d_hi * d_hi, 0.5));

            }

            public double RBE_2() {
                double d_hi = Double.parseDouble(DHIGH_2.getText());
                if (RBE_CHECKBOX_2.isSelected()) {
                    return 1.1;
                } else {
                    return d_low_2() / d_hi;
                }

            }
////////////////////////// TAB2 EQNS SAME AS PHOTON /////////////////////////////

            public double probit0_2(double Dinit) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((Dinit) / D50_0) - 1))))));
            }

            public double Dret_0_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit0_2(a) * probit0_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit0_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit0_2(c) * probit0_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit1_2(double Dret1) {
                double gamma50_1 = (double) 9.5675;
                double D50_1 = (double) 64.3842;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((Dret1) / D50_1) - 1))))));  // Need the shift factor for conservative
            }

            public double Dret_1_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit1_2(a) * probit1_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit1_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit1_2(c) * probit1_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit2_2(double Dret2) {
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((Dret2) / D50_2) - 1))))));
            }

            public double Dret_2_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit2_2(a) * probit2_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit2_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit2_2(c) * probit2_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double probit3_2(double Dret3) {
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((Dret3) / D50_3) - 1))))));
            }

            public double Dret_3_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit3_2(a) * probit3_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit3_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit3_2(c) * probit3_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
            //CALCULATING BEDS

            //////////////////Shifting for conservative factors for Human data/////////////////////////
            public double shifth0_2(double s) {
                double gamma50_0 = (double) 11.3764;
                double C = (double) Double.parseDouble(Percentage_2.getText());
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + 54.8 * (1 - (C) * 0.01)) / D50_0) - 1))))));
            }

            public double shiftch_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (shifth0_2(a) * shifth0_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shifth0_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shifth0_2(c) * shifth0_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftm0_2(double s, double d) {
                double gamma50_0 = (double) 11.3764;
                double C = (double) Double.parseDouble(Percentage_2.getText());
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + d * (1 - (C) * 0.01)) / D50_0) - 1))))));
            }

            public double shiftc_2(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_0_2(30, 80);

                if (shiftm0_2(a, d) * shiftm0_2(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftm0_2(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftm0_2(c, d) * shiftm0_2(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_1_2(double s, double d) {
                double gamma50_1 = (double) 9.5675;
                double C = (double) Double.parseDouble(Percentage_2.getText());
                double D50_1 = (double) 64.3842;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((s + d * (1 - (C) * 0.01)) / D50_1) - 1))))));
            }

            public double shift1_2(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_1_2(30, 80);

                if (shiftD_1_2(a, d) * shiftD_1_2(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_1_2(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_1_2(c, d) * shiftD_1_2(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_2_2(double s, double d) {
                double C = (double) Double.parseDouble(Percentage_2.getText());
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((s + d * (1 - (C) * 0.01)) / D50_2) - 1))))));
            }

            public double shift2_2(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_2_2(30, 80);

                if (shiftD_2_2(a, d) * shiftD_2_2(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_2_2(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_2_2(c, d) * shiftD_2_2(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_3_2(double s, double d) {
                double C = (double) Double.parseDouble(Percentage_2.getText());
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((s + d * (1 - (C) * 0.01)) / D50_3) - 1))))));
            }

            public double shift3_2(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_3_2(30, 80);

                if (shiftD_3_2(a, d) * shiftD_3_2(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_3_2(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_3_2(c, d) * shiftD_3_2(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            ///////////////////////////////////////New Dret_0 ....Dret_3 with shift added to them//////////////
            public double probit0shift_2(double Dinit, double s) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_2.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + Dinit) / D50_0) - 1))))));

            }

            public double Dret_0shift_2(double a, double b) {
                double EPSILON = (double) 0.0001;
                double s = shiftc_2((double) -0.1, 15);

                if (probit0shift_2(a, s) * probit0shift_2(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit0shift_2(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit0shift_2(c, s) * probit0shift_2(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit1shift_2(double Dret1, double s) {
                double gamma50_1 = (double) 9.5675;
                double D50_1 = (double) 64.3842;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_2.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((s + Dret1) / D50_1) - 1))))));

            }

            public double Dret_1shift_2(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift1_2((double) -0.1, 15);

                if (probit1shift_2(a, s) * probit1shift_2(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit1shift_2(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit1shift_2(c, s) * probit1shift_2(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit2shift_2(double Dret1, double s) {
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_2.getText());
                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((s + Dret1) / D50_2) - 1))))));

            }

            public double Dret_2shift_2(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift2_2((double) -0.1, 15);

                if (probit2shift_2(a, s) * probit2shift_2(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit2shift_2(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit2shift_2(c, s) * probit2shift_2(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit3shift_2(double Dret1, double s) {
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_2.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((s + Dret1) / D50_3) - 1))))));

            }

            public double Dret_3shift_2(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift3_2((double) -0.1, 15);

                if (probit3shift_2(a, s) * probit3shift_2(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit3shift_2(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit3shift_2(c, s) * probit3shift_2(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double HU_totaleq_2(double d, double s) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                double P = (double) (0.01 * Double.parseDouble(RiskOfMyel_2.getText()));

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + d) / D50_0) - 1))))));
            }

            public double Dtol_Hu_2(double a, double b) {
                double EPSILON = (double) 0.0001;
                double s = shiftch_2((double) -0.1, 15);

                if (HU_totaleq_2(a, s) * HU_totaleq_2(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (HU_totaleq_2(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (HU_totaleq_2(c, s) * HU_totaleq_2(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            ///////////////////////////////BED PERCENTAGE CALCULATIONS//////////////////////////////////////////////  
            public double BED1_pc_human_2() {
                double INIT = Double.parseDouble(initalDose_2.getText());
                double FRAC = Double.parseDouble(NumFrac_2.getText());
                double k = INIT / FRAC;

                return (INIT * (1 + k / 2) / (Dtol_Hu_2(30, 80) * 2)) * 100;
            }

            public double BED1_pc_2() {
                return (44 / Dret_0shift_2(30, 80)) * 100;

            }

            public double BED21_pc_2() {
                return (Dret_1shift_2(30, 80) / Dret_0shift_2(30, 80)) * 100;
            }

            public double BED22_pc_2() {
                return (Dret_2shift_2(30, 80) / Dret_0shift_2(30, 80)) * 100;
            }

            public double BED23_pc_2() {
                return (Dret_3shift_2(30, 80) / Dret_0shift_2(30, 80)) * 100;
            }

            ///////////////// P_CALC FROM MATLAB ///////////////////////////////////////////////////////////////////
            public double p_eqn_2(double d, double shiftch) {

                return Double.parseDouble(RiskOfMyel_2.getText()) / 100;

            }

            ///////////////////////////////////////////////////////////////////////////////////  
            //BED OF PERCENTAGE R - NOMINAL VALUE
            public double BED_Rper_2(double a) {
                return Dtol_Hu_2(30, 80) * 2;

            }

            public double BED1_2(double a) {
                double INIT = Double.parseDouble(initalDose_2.getText());
                double FRAC = Double.parseDouble(NumFrac_2.getText());
                double k = INIT / FRAC;
                return ((INIT * (1 + k / 2)) / (BED_Rper_2(a))) * 100;

            }
            /////////////////////GETTING THE VALUES FOR r(1),r(2) and r(3)//////////////////////////////////////

            public double BED2_r1_2(double a) {
                double B = Double.parseDouble(bed_2.getText());
                double s_0 = Double.parseDouble(s0_2.getText());
                double s_1 = Double.parseDouble(s1_2.getText());
                double B1 = BED1_pc_2();
                return (double) (BED21_pc_2() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));

            }

            public double r_1_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r1_2(a) * BED2_r1_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r1_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r1_2(c) * BED2_r1_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double BED2_r2_2(double a) {
                double B = Double.parseDouble(bed_2.getText());
                double s_0 = Double.parseDouble(s0_2.getText());
                double s_1 = Double.parseDouble(s1_2.getText());
                double B1 = BED1_pc_2();

                return (double) (BED22_pc_2() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));

            }

            public double r_2_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r2_2(a) * BED2_r2_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r2_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r2_2(c) * BED2_r2_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double BED2_r3_2(double a) {
                double B = Double.parseDouble(bed_2.getText());
                double s_0 = Double.parseDouble(s0_2.getText());
                double s_1 = Double.parseDouble(s1_2.getText());
                double B1 = BED1_pc_2();

                return (double) (BED23_pc_2() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));

            }

            public double r_3_2(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r3_2(a) * BED2_r3_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r3_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r3_2(c) * BED2_r3_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
//DEFINING THE r(t) FUNCTION - MAKE MORE EFFICIENT

            public double r_2(double t) {
                double Tiro = (double) 0.19;
                double m;
                double r_1 = r_1_2(0, 200);
                double r_2 = r_2_2(0, 200);
                double r_3 = r_3_2(0, 200);

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
            //////////// BED2 for the graph ////////////////////////////////////////

            public double BED2_FINAL_2(double a) {
                double B = Double.parseDouble(bed_2.getText());
                double s_0 = Double.parseDouble(s0_2.getText());
                double s_1 = Double.parseDouble(s1_2.getText());
                double t = (double) Double.parseDouble(NumOfYears_2.getText());

                if (a < 100) {
                    return (double) (100 * (1 - a * 0.01) * (1 + (Math.pow(1 - a * 0.01, -r_2(t) / (r_2(t) + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (a - B / (1 + s_1 * r_2(t)))))));
                } else {
                    return 0;
                }
            }
            ////////////////////////BED2 FOR TEXT LABEL//////////////////////////////////////////////

            public double BED2__2(double a) {
                double B = Double.parseDouble(bed_2.getText());
                double s_0 = Double.parseDouble(s0_2.getText());
                double s_1 = Double.parseDouble(s1_2.getText());
                double t = (double) Double.parseDouble(NumOfYears_2.getText());

                double B1 = BED1_2(0);

                return (double) (100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -r_2(t) / (r_2(t) + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * r_2(t)))))));

            }
            //////// Function to find the Dret/n(r) //////////////////////////

            public double dosefcn_2(double n) {
                double D = Double.parseDouble(DHIGH_2.getText());
                if (RBE_CHECKBOX_2.isSelected()) {
                    double d = D * RBE_2();
                    return (double) (BED2__2(500) * BED_Rper_2(500) * 0.01 - (n * d + n * d * d / 2));

                } else {
                    double d = D * RBE_2();
                    return (double) (BED2__2(500) * BED_Rper_2(500) * 0.01 - (n * d + n * d * d / 2));
                }

            }

            public double dose_2(double a, double b) {
                double EPSILON = (double) 0.0001;

                DecimalFormat f = new DecimalFormat("00.00");

                if (dosefcn_2(a) * dosefcn_2(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (dosefcn_2(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (dosefcn_2(c) * dosefcn_2(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }

                return c;

            }

            public double roundedBEDret_2(double d, double n, double RBE) {

                return (double) (BED2__2(500) * BED_Rper_2(500) * 0.01 - (n * RBE * d + n * d * d * RBE * RBE / 2));

            }

            public double roundedFracDose_2(double a, double b) {
                double EPSILON = (double) 0.0001;
                double n = Math.round(dose_2(0, 50));

                double RBE = RBE_2();

                if (roundedBEDret_2(a, n, RBE) * roundedBEDret_2(b, n, RBE) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (roundedBEDret_2(c, n, RBE) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (roundedBEDret_2(c, n, RBE) * roundedBEDret_2(a, n, RBE) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }

                return c;

            }

            public double d_low_2_4_RE_CHECK_2(double d_hi) {

                return 1 / (2 * beta_low) * (-alpha_low + Math.pow(alpha_low * alpha_low + 4 * Ahi_2() * beta_low * d_hi + 4 * Bhi_2() * beta_low * d_hi * d_hi, 0.5));

            }

            public void setDhigh2() {
                DecimalFormat f = new DecimalFormat("##.####");
                double d = roundedFracDose_2(0, 20);
                DHIGH_2.setText(f.format(d));
            }

            @Override
            public void handle(ActionEvent event) {
                long startTime = System.nanoTime();

                series9_2.getData().clear();
                series10_2.getData().clear();
                series11_2.getData().clear();
                series12_2.getData().clear();
                series13_2.getData().clear();
                series14_2.getData().clear();
                series15_2.getData().clear();

                warn_bed_2.setVisible(false);
                p_high_2.setVisible(false);
                p_low_2.setVisible(false);
                out_2.setVisible(true);
                BED1_text_2.setVisible(true);
                BEDinit_text_2.setVisible(true);
                BEDR_text_2.setVisible(true);
                BEDR2_TEXT_2.setVisible(true);
                BED2_text_2.setVisible(true);
                BEDret_text_2.setVisible(true);
                Dret_text_2.setVisible(true);
                ProDose_2.setVisible(true);
                RETFRAC_WARN_2.setVisible(false);

                try {
                    double RiskVal = Double.parseDouble(RiskOfMyel_2.getText());
                    if (RiskVal > 0 && RiskVal < 100) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.1;
                        RiskOfMyel_2.setText("0.1");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    RiskOfMyel_2.setText("0.1");
                }

                try {
                    double RiskVal = Double.parseDouble(s0_2.getText());
                    if (RiskVal > 0 && RiskVal < 1) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.15;
                        s0_2.setText("0.15");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    s0_2.setText("0.15");
                }

                try {
                    double RiskVal = Double.parseDouble(s1_2.getText());
                    if (RiskVal > 0 && RiskVal < 1) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.15;
                        s1_2.setText("0.15");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    s1_2.setText("0.15");
                }

                try {
                    double RiskVal = Double.parseDouble(bed_2.getText());
                    if (RiskVal > 0 && RiskVal < 45) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 35;
                        bed_2.setText("35");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    bed_2.setText("35");
                }

                try {
                    double RiskVal = Double.parseDouble(NumOfYears_2.getText());
                    if (RiskVal > 0 && RiskVal < 5) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 1;
                        NumOfYears_2.setText("2");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    NumOfYears_2.setText("2");
                }

                try {
                    double InitalVal = Double.parseDouble(initalDose_2.getText());
                    if (InitalVal > 0) {
                        InitalVal = InitalVal;
                    } else {
                        InitalVal = 40;
                        initalDose_2.setText("40");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    initalDose_2.setText("40");
                }

                try {
                    int NumVal = Integer.parseInt(NumFrac_2.getText());
                    if (NumVal > 0) {
                        NumVal = NumVal;
                    } else {
                        NumVal = 20;
                        NumFrac_2.setText("20");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    NumFrac_2.setText("20");
                }

                try {
                    double RetVal = Double.parseDouble(DHIGH_2.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 2;
                        DHIGH_2.setText("2");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    DHIGH_2.setText("2");

                }
                try {
                    double RetVal = Double.parseDouble(letx_2.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 5;
                        letx_2.setText("5");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    letx_2.setText("5");

                }

                try {
                    double RetVal = Double.parseDouble(letu_2.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 30.5;
                        letu_2.setText("30.5");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    letu_2.setText("30.5");

                }
                DecimalFormat df2 = new DecimalFormat("##.##");
                double INIT = Double.parseDouble(initalDose_2.getText());
                double FRAC = Double.parseDouble(NumFrac_2.getText());
                double k = INIT / FRAC;
                initfrac_text_2.setText(df2.format(k));

//CODE FOR THE LABELS BEDS 
                double D = BED_Rper_2(0);
                double S = shiftch_2(-1, 20);
                double n = dose_2(0, 50);

                if (BED1_pc_human_2() > 100) {
                    warn_bed_2.setVisible(true);
                    warn_bed_2.setText("WARNING: INITIAL DOSE OVER TOLERANCE");
                    p_high_2.setVisible(false);
                    p_low_2.setVisible(false);
                    BED1_text_2.setText("NA");
                    BEDinit_text_2.setText("NA");
                    BEDR_text_2.setText("NA");
                    BEDR2_TEXT_2.setText("NA");
                    BED2_text_2.setText("NA");
                    BEDret_text_2.setText("NA");
                    Dret_text_2.setText("NA");
                    ProDose_2.setText("NA");
                    nominal_tol_2.setText("NA");
                    out_2.setText("NA");
                    run_2.setVisible(true);
                    ret_frac_out_2.setText("NA");
                    RETFRAC_WARN_2.setVisible(false);
                } else if (p_eqn_2(D, S) > 0.999) {
                    p_high_2.setVisible(true);
                    p_high_2.setText("WARNING: RISK GREATER THAN 99.9%");
                    BED1_text_2.setText("NA");
                    BEDinit_text_2.setText("NA");
                    BEDR_text_2.setText("NA");
                    BEDR2_TEXT_2.setText("NA");
                    BED2_text_2.setText("NA");
                    BEDret_text_2.setText("NA");
                    Dret_text_2.setText("NA");
                    ProDose_2.setText("NA");
                    out_2.setText("NA");
                    ret_frac_out_2.setText("NA");
                    nominal_tol_2.setText("NA");
                    warn_bed_2.setVisible(false);
                    p_low_2.setVisible(false);
                    run_2.setVisible(true);
                    RETFRAC_WARN_2.setVisible(false);
                } else if (p_eqn_2(D, S) < 1e-5) {
                    p_low_2.setVisible(true);
                    p_low_2.setText("WARNING: RISK LESS THAN 0.001%");
                    BED1_text_2.setText("NA");
                    BEDinit_text_2.setText("NA");
                    BEDR_text_2.setText("NA");
                    BEDR2_TEXT_2.setText("NA");
                    BED2_text_2.setText("NA");
                    BEDret_text_2.setText("NA");
                    Dret_text_2.setText("NA");
                    out_2.setText("NA");
                    ProDose_2.setText("NA");
                    nominal_tol_2.setText("NA");
                    ret_frac_out_2.setText("NA");
                    warn_bed_2.setVisible(false);
                    p_high_2.setVisible(false);
                    run_2.setVisible(true);
                    RETFRAC_WARN_2.setVisible(false);
                } else if (Math.round(n * 100) / 100 < 1) {
                    p_low_2.setVisible(false);
                    RETFRAC_WARN_2.setVisible(true);
                    BED1_text_2.setText("NA");
                    BEDinit_text_2.setText("NA");
                    BEDR_text_2.setText("NA");
                    BEDR2_TEXT_2.setText("NA");
                    BED2_text_2.setText("NA");
                    BEDret_text_2.setText("NA");
                    nominal_tol_2.setText("NA");
                    Dret_text_2.setText(df2.format(n));
                    out_2.setText("NA");
                    ProDose_2.setText("NA");
                    ret_frac_out_2.setText("NA");
                    warn_bed_2.setVisible(false);
                    p_high_2.setVisible(false);
                    run_2.setVisible(true);

                } else {

                    initfrac_text_2.setText(df2.format(k));
                    double d_hi = Double.parseDouble(DHIGH_2.getText());

                    double B_2 = BED_Rper_2(500);
                    double B_1 = BED2__2(500);
//CODE FOR THE LABELS BEDS
                    BED1_text_2.setText(df2.format(BED1_2(500)));
                    BEDinit_text_2.setText(df2.format((INIT * (1 + k / 2))));
                    BEDR_text_2.setText(df2.format((B_2)));
                    BEDR2_TEXT_2.setText(df2.format(B_2));
                    BED2_text_2.setText(df2.format(B_1));
                    BEDret_text_2.setText(df2.format((B_1 * (B_2)) / 100));
                    Dret_text_2.setText(df2.format(n));
                    out_2.setText(df2.format(RBE_2()));
                    ProDose_2.setText(df2.format(d_hi));
                    nominal_tol_2.setText(df2.format(B_2));
                    ret_frac_out_2.setText(df2.format(n));

                    warn_bed_2.setVisible(false);
                    p_high_2.setVisible(false);
                    p_low_2.setVisible(false);
                    out_2.setVisible(true);
                    BED1_text_2.setVisible(true);
                    BEDinit_text_2.setVisible(true);
                    BEDR_text_2.setVisible(true);
                    BEDR2_TEXT_2.setVisible(true);
                    BED2_text_2.setVisible(true);
                    BEDret_text_2.setVisible(true);
                    Dret_text_2.setVisible(true);
                    ProDose_2.setVisible(true);
                    run_2.setVisible(true);
                    RETFRAC_WARN_2.setVisible(false);
                }

                if (!dose_select_2.isSelected()) {

                    n = Math.round(n * 1000.0) / 1000.0;

                    double n0 = Double.parseDouble(df2.format(n - Math.floor(n)));

                    double n1 = Math.round(n * 1000.0) / 1000.0;
                    double n2 = Math.round((n1 - Math.floor(n)) * 1000.0) / 1000.0;
                    if ((n - Math.floor(n)) < 0.5 && n0 != 0) {
                        String d = df2.format(n);
                        String f = df2.format(Math.round(n));
                        DecimalFormat df3 = new DecimalFormat("#.####");
                        double r_dret = roundedFracDose_2(0, 20);
                        String r = df3.format(r_dret);
                        double d_low = d_low_2_4_RE_CHECK_2(r_dret);

                        double r2 = Math.round(d_low / r_dret * 100.0) / 100.0;
                        double r3 = Math.round(RBE_2() * 100.0) / 100.0;

                        DHIGH_2.setText(r);

                        String s = "Retreatment fraction is not an integer " + "(" + d + ")" + "\n" + "Action taken: increased the retreatment dose to " + r + "\nto get " + f + " retreatment fractions.\nThe adjusted dose has been transferred to the input box.\n \n𝐏𝐥𝐞𝐚𝐬𝐞 𝐫𝐞-𝐜𝐚𝐥𝐜𝐮𝐥𝐚𝐭𝐞.";

                        if (r2 != r3 && !RBE_CHECKBOX_2.isSelected()) {
                            r = "𝐧𝐨𝐭 𝐚𝐯𝐚𝐢𝐥𝐚𝐛𝐥𝐞*";
                            s = "Retreatment fraction is not an integer " + "(" + d + ")" + "\n" + "Action taken: increased the retreatment dose to " + r + "\nto get " + f + " retreatment fractions.\nThe adjusted dose has been transferred to the input box.\n \n𝐏𝐥𝐞𝐚𝐬𝐞 𝐫𝐞-𝐜𝐚𝐥𝐜𝐮𝐥𝐚𝐭𝐞.\n \n*Dose not given as it would change estimated \nRBE for retreatment";
                            System.out.println(r2);
                            System.out.println(r3);

                        }
                        DoseSuggest.display("Dose adjustment", s);
                    } else if ((n - Math.floor(n)) > 0.5 && n0 != 0) {
                        String d = df2.format(n);
                        String f = df2.format(Math.round(n));
                        DecimalFormat df3 = new DecimalFormat("#.####");
                        double r_dret = roundedFracDose_2(0, 20);
                        String r = df3.format(r_dret);
                        double d_low = d_low_2_4_RE_CHECK_2(r_dret);
                        DHIGH_2.setText(r);

                        double r2 = Math.round(d_low / r_dret * 100.0) / 100.0;
                        double r3 = Math.round(RBE_2() * 100.0) / 100.0;
                        String s = "Retreatment fraction is not an integer " + "(" + d + ")" + "\n" + "Action taken: decreased the retreatment dose to " + r + "\nto get " + f + " retreatment fractions.\nThe adjusted dose has been transferred to input box.";

                        if (r2 != r3 && !RBE_CHECKBOX_2.isSelected()) {
                            r = "𝐧𝐨𝐭 𝐚𝐯𝐚𝐢𝐥𝐚𝐛𝐥𝐞*";
                            s = "Retreatment fraction is not an integer " + "(" + d + ")" + "\n" + "Action taken: decreased the retreatment dose to " + r + "\nto get " + f + " retreatment fractions.\nThe adjusted dose has been transferred to input box.\n \n*Dose not given as it would change estimated\n RBE for retreatment";

                        }

                        DoseSuggest.display("Dose adjustment", s);
                    } else {
                    }
                }

                double BED2Array_2[] = new double[101];
                for (int j = 0; j < 101; j++) {

                    double value1 = BED2_FINAL_2(j);
                    BED2Array_2[j] = value1;
                }

                for (int i = 0; i < 101; i++) {
                    series9_2.getData().add(new XYChart.Data(i, BED2Array_2[i]));
                }
                series10_2.getData().add(new XYChart.Data(BED1_pc_2(), BED21_pc_2()));
                series11_2.getData().add(new XYChart.Data(BED1_pc_2(), BED22_pc_2()));

                series12_2.getData().add(new XYChart.Data(BED1_pc_2(), BED23_pc_2()));

                series13_2.getData().add(new XYChart.Data(BED1_pc_human_2(), BED2_FINAL_2(BED1_pc_human_2())));
                series14_2.getData().add(new XYChart.Data(0, BED2_FINAL_2(BED1_pc_human_2())));
                series14_2.getData().add(new XYChart.Data(BED1_pc_human_2(), BED2_FINAL_2(BED1_pc_human_2())));

                series15_2.getData().add(new XYChart.Data(BED1_pc_human_2(), 0));
                series15_2.getData().add(new XYChart.Data(BED1_pc_human_2(), BED2_FINAL_2(BED1_pc_human_2())));

                chart2_2.getData().addAll(series9_2, series10_2, series11_2, series12_2, series13_2, series14_2, series15_2);

                long endTime = System.nanoTime();
                long totalTime = endTime - startTime;
                System.out.println("Total time for calculation " + totalTime / 1e9 + " seconds");
            }
        });

        /////////////////TAB 3 CAL///////////////////////////////////////////////////////////
        Calculate_3.setOnAction(new EventHandler<ActionEvent>() {

            public double alpha_u_3_IN() {
                return (10.57 / 3.92) * (1 - Math.exp(-3.92 * alpha_low));
            }

            public double Ahi_3_IN() {
                double letx = Double.parseDouble(letx_3.getText());
                double letu = Double.parseDouble(letu_3.getText());
                double letc = Double.parseDouble(letc_3.getText());

                return alpha_low + (alpha_u_3_IN() - alpha_low) * (letx - letc) / (letu - letc);
            }

            public double beta_u_3_IN() {
                return 0.06 * (1 - Math.exp(-50 * beta_low));
            }

            public double Bhi_3_IN() {
                double letx = Double.parseDouble(letx_3.getText());
                double letu = Double.parseDouble(letu_3.getText());
                double letc = Double.parseDouble(letc_3.getText());

                return beta_low + (beta_u_3_IN() - beta_low) * (letx - letc) / (letu - letc);

            }

            public double d_low_2_3_IN() {
                double d_hi = Double.parseDouble(initalDose_3.getText()) / Double.parseDouble(NumFrac_3.getText());

                return 1 / (2 * beta_low) * (-alpha_low + Math.pow(alpha_low * alpha_low + 4 * Ahi_3_IN() * beta_low * d_hi + 4 * Bhi_3_IN() * beta_low * d_hi * d_hi, 0.5));

            }

            public double RBE_3_IN() {
                double d_hi = Double.parseDouble(initalDose_3.getText()) / Double.parseDouble(NumFrac_3.getText());
                DecimalFormat df2 = new DecimalFormat("#.##");
                double m;
                if (RBE_CHECKBOX_3.isSelected()) {
                    return 1.1;
                } else {
                    m = (d_low_2_3_IN() / d_hi);
                }
                return Math.round(m * 100d) / 100d;

            }

            public double probit0_3(double Dinit) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((Dinit) / D50_0) - 1))))));
            }

            public double Dret_0_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit0_3(a) * probit0_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit0_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit0_3(c) * probit0_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit1_3(double Dret1) {
                double gamma50_1 = (double) 9.5675;
                double D50_1 = (double) 64.3842;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((Dret1) / D50_1) - 1))))));  // Need the shift factor for conservative
            }

            public double Dret_1_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit1_3(a) * probit1_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit1_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit1_3(c) * probit1_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit2_3(double Dret2) {
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((Dret2) / D50_2) - 1))))));
            }

            public double Dret_2_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit2_3(a) * probit2_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit2_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit2_3(c) * probit2_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double probit3_3(double Dret3) {
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((Dret3) / D50_3) - 1))))));
            }

            public double Dret_3_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (probit3_3(a) * probit3_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit3_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit3_3(c) * probit3_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
            //CALCULATING BEDS

            //////////////////Shifting for conservative factors for Human data/////////////////////////
            public double shifth0_3(double s) {
                double gamma50_0 = (double) 11.3764;
                double C = (double) Double.parseDouble(Percentage_3.getText());
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + 54.8 * (1 - (C) * 0.01)) / D50_0) - 1))))));
            }

            public double shiftch_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (shifth0_3(a) * shifth0_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shifth0_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shifth0_3(c) * shifth0_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftm0_3(double s, double d) {
                double gamma50_0 = (double) 11.3764;
                double C = (double) Double.parseDouble(Percentage_3.getText());
                double D50_0 = (double) 76.5571;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + d * (1 - (C) * 0.01)) / D50_0) - 1))))));
            }

            public double shiftc_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_0_3(30, 70);

                if (shiftm0_3(a, d) * shiftm0_3(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftm0_3(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftm0_3(c, d) * shiftm0_3(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_1_3(double s, double d) {
                double gamma50_1 = (double) 9.5675;
                double C = (double) Double.parseDouble(Percentage_3.getText());
                double D50_1 = (double) 64.3842;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((s + d * (1 - (C) * 0.01)) / D50_1) - 1))))));
            }

            public double shift1_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_1_3(30, 70);

                if (shiftD_1_3(a, d) * shiftD_1_3(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_1_3(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_1_3(c, d) * shiftD_1_3(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_2_3(double s, double d) {
                double C = (double) Double.parseDouble(Percentage_3.getText());
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((s + d * (1 - (C) * 0.01)) / D50_2) - 1))))));
            }

            public double shift2_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_2_3(30, 70);

                if (shiftD_2_3(a, d) * shiftD_2_3(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_2_3(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_2_3(c, d) * shiftD_2_3(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double shiftD_3_3(double s, double d) {
                double C = (double) Double.parseDouble(Percentage_3.getText());
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;

                return (double) (0.01 - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((s + d * (1 - (C) * 0.01)) / D50_3) - 1))))));
            }

            public double shift3_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double d = Dret_3_3(30, 70);

                if (shiftD_3_3(a, d) * shiftD_3_3(b, d) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (shiftD_3_3(c, d) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (shiftD_3_3(c, d) * shiftD_3_3(a, d) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            ///////////////////////////////////////New Dret_0 ....Dret_3 with shift added to them//////////////
            public double probit0shift_3(double Dinit, double s) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_3.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + Dinit) / D50_0) - 1))))));

            }

            public double Dret_0shift_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shiftc_3((double) -0.1, 15);

                if (probit0shift_3(a, s) * probit0shift_3(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit0shift_3(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit0shift_3(c, s) * probit0shift_3(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit1shift_3(double Dret1, double s) {
                double gamma50_1 = (double) 9.5675;
                double D50_1 = (double) 64.3842;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_3.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_1 * (((s + Dret1) / D50_1) - 1))))));

            }

            public double Dret_1shift_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift1_3((double) -0.1, 15);

                if (probit1shift_3(a, s) * probit1shift_3(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit1shift_3(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit1shift_3(c, s) * probit1shift_3(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit2shift_3(double Dret1, double s) {
                double gamma50_2 = (double) 10.7338;
                double D50_2 = (double) 72.2328;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_3.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_2 * (((s + Dret1) / D50_2) - 1))))));

            }

            public double Dret_2shift_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift2_3((double) -0.1, 15);

                if (probit2shift_3(a, s) * probit2shift_3(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit2shift_3(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit2shift_3(c, s) * probit2shift_3(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double probit3shift_3(double Dret1, double s) {
                double gamma50_3 = (double) 11.1428;
                double D50_3 = (double) 74.9850;
                double P = 0.01 * Double.parseDouble(RiskOfMyel_3.getText());

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_3 * (((s + Dret1) / D50_3) - 1))))));

            }

            public double Dret_3shift_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shift3_3((double) -0.5, 15);

                if (probit3shift_3(a, s) * probit3shift_3(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (probit3shift_3(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (probit3shift_3(c, s) * probit3shift_3(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            public double HU_totaleq_3(double d, double s) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                double P = (double) (0.01 * Double.parseDouble(RiskOfMyel_3.getText()));

                return (double) (P - 0.5 * (1 + erf((double) (0.70710678118 * (gamma50_0 * (((s + d) / D50_0) - 1))))));
            }

            public double Dtol_Hu_3(double a, double b) {
                double EPSILON = (double) 0.001;
                double s = shiftch_3((double) -0.1, 20);

                if (HU_totaleq_3(a, s) * HU_totaleq_3(b, s) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (HU_totaleq_3(c, s) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (HU_totaleq_3(c, s) * HU_totaleq_3(a, s) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;
            }

            ///////////////////////////////Percentage BED2 from orginal paper//////////////////////////////////////////////  
            public double BED1_pc_human_3() {
                double INIT = Double.parseDouble(initalDose_3.getText()) / Double.parseDouble(NumFrac_3.getText());
                double FRAC = Double.parseDouble(NumFrac_3.getText());

                double k = INIT * RBE_3_IN();

                return (k * FRAC * (1 + k / 2) / (Dtol_Hu_3(0, 120) * 2)) * 100;

            }

            public double BED1_pc_3() {
                return (44 / Dret_0shift_3(0, 120)) * 100;

            }

            public double BED21_pc_3() {
                return (Dret_1shift_3(30, 80) / Dret_0shift_3(0, 80)) * 100;
            }

            public double BED22_pc_3() {
                return (Dret_2shift_3(30, 80) / Dret_0shift_3(0, 80)) * 100;
            }

            public double BED23_pc_3() {
                return (Dret_3shift_3(30, 80) / Dret_0shift_3(30, 80)) * 100;
            }

            ///////////////// P_CALC FROM MATLAB ///////////////////////////////////////////////////////////////////
            public double p_eqn_3(double d, double shiftch) {
                double gamma50_0 = (double) 11.3764;
                double D50_0 = (double) 76.5571;
                return Double.parseDouble(RiskOfMyel_3.getText()) / 100;

            }

            ///////////////////////////////////////////////////////////////////////////////////  
            //BED OF PERCENTAGE R - NOMINAL VALUE
            public double BED_Rper_3(double a) {

                DecimalFormat f = new DecimalFormat("##.00");
                double k = Dtol_Hu_3(0, 120) * 2;
                return Double.parseDouble(f.format(k));
            }

            public double BED1_3(double a) {
                double INIT = Double.parseDouble(initalDose_3.getText()) / Double.parseDouble(NumFrac_3.getText());
                double FRAC = Double.parseDouble(NumFrac_3.getText());
                double k = RBE_3_IN() * INIT;

                return ((k * FRAC * (1 + (k) / 2)) / (BED_Rper_3(a))) * 100;

            }
            /////////////////////GETTING THE VALUES FOR r(1),r(2) and r(3)//////////////////////////////////////

            public double BED2_r1_3(double a) {
                double B = Double.parseDouble(bed_3.getText());
                double s_0 = Double.parseDouble(s0_3.getText());
                double s_1 = Double.parseDouble(s1_3.getText());
                double B1 = BED1_pc_3();

                return (double) (BED21_pc_3() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));
            }

            public double r_1_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r1_3(a) * BED2_r1_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r1_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r1_3(c) * BED2_r1_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double BED2_r2_3(double a) {
                double B = Double.parseDouble(bed_3.getText());
                double s_0 = Double.parseDouble(s0_3.getText());
                double s_1 = Double.parseDouble(s1_3.getText());
                double B1 = BED1_pc_3();

                return (double) (BED22_pc_3() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));
            }

            public double r_2_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r2_3(a) * BED2_r2_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r2_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r2_3(c) * BED2_r2_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }

            public double BED2_r3_3(double a) {
                double B = Double.parseDouble(bed_3.getText());
                double s_0 = Double.parseDouble(s0_3.getText());
                double s_1 = Double.parseDouble(s1_3.getText());
                double B1 = BED1_pc_3();

                return (double) (BED23_pc_3() - 100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -a / (a + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * a))))));
            }

            public double r_3_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (BED2_r3_3(a) * BED2_r3_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (BED2_r3_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (BED2_r3_3(c) * BED2_r3_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }
                return c;

            }
//DEFINING THE r(t) FUNCTION - MAKE MORE EFFICIENT

            public double r_3(double t) {
                double Tiro = (double) 0.19;
                double m;
                double r_1 = r_1_3(0, 200);
                double r_2 = r_2_3(0, 200);
                double r_3 = r_3_3(0, 200);

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
            //////////// BED2 for the graph ////////////////////////////////////////

            public double BED2_FINAL_3(double a) {
                double B = Double.parseDouble(bed_3.getText());
                double s_0 = Double.parseDouble(s0_3.getText());
                double s_1 = Double.parseDouble(s1_3.getText());
                double t = (double) Double.parseDouble(NumOfYears_3.getText());

                if (a < 100) {
                    return (double) (100 * (1 - a * 0.01) * (1 + (Math.pow(1 - a * 0.01, -r_3(t) / (r_3(t) + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (a - B / (1 + s_1 * r_3(t)))))));
                } else {
                    return 0;
                }
            }
            ////////////////////////BED2 FOR TEXT LABEL//////////////////////////////////////////////

            public double BED2__3(double a) {
                double B = Double.parseDouble(bed_3.getText());
                double s_0 = Double.parseDouble(s0_3.getText());
                double s_1 = Double.parseDouble(s1_3.getText());
                double t = (double) Double.parseDouble(NumOfYears_3.getText());
                double B1 = BED1_3(0);

                return (double) (100 * (1 - B1 * 0.01) * (1 + (Math.pow(1 - B1 * 0.01, -r_3(t) / (r_3(t) + 1)) - 1) * 0.5 * (1 + Math.tanh(s_0 * (B1 - B / (1 + s_1 * r_3(t)))))));

            }
            //////// Function to find the Dret/n(r) ////////////////////////////

            public double dosefcn_3(double d) {
                double n = Double.parseDouble(RetreatFrac_3.getText());

                return (double) (BED2__3(500) * BED_Rper_3(500) * 0.01 - (n * d + n * d * d / 2));

            }

            public double dose_3(double a, double b) {
                double EPSILON = (double) 0.001;

                if (dosefcn_3(a) * dosefcn_3(b) >= 0) {
                    System.out.println("You have not assumed"
                            + " right a and b");
                }
                double c = a;
                while ((b - a) >= EPSILON) {
                    // Find middle point 
                    c = (a + b) / 2;
                    // Check if middle point is root 
                    if (dosefcn_3(c) == 0.0) {
                        break;
                    } // Decide the side to repeat the steps 
                    else if (dosefcn_3(c) * dosefcn_3(a) < 0) {
                        b = c;
                    } else {
                        a = c;
                    }
                }

                return c;

            }

            @Override
            public void handle(ActionEvent event) {
                long startTime = System.nanoTime();

                series9_3.getData().clear();
                series10_3.getData().clear();
                series11_3.getData().clear();
                series12_3.getData().clear();
                series13_3.getData().clear();
                series14_3.getData().clear();
                series15_3.getData().clear();

                warn_bed_3.setVisible(false);
                p_high_3.setVisible(false);
                p_low_3.setVisible(false);
                out_3.setVisible(true);
                BED1_text_3.setVisible(true);
                BEDinit_text_3.setVisible(true);
                BEDR_text_3.setVisible(true);
                BEDR2_TEXT_3.setVisible(true);
                BED2_text_3.setVisible(true);
                BEDret_text_3.setVisible(true);
                Dret_text_3.setVisible(true);

                DecimalFormat df2 = new DecimalFormat("#.##");
                double D = BED_Rper_3(0);
                double S = shiftch_3(-1, 20);

                ///////////////////WARNINGS//////////////////////////////////////////////     
                if (BED1_pc_human_3() > 100) {
                    warn_bed_3.setVisible(true);
                    warn_bed_3.setText("WARNING: INITIAL DOSE OVER TOLERANCE");
                    p_high_3.setVisible(false);
                    p_low_3.setVisible(false);
                    BED1_text_3.setText("NA");
                    BEDinit_text_3.setText("NA");
                    BEDR_text_3.setText("NA");
                    BEDR2_TEXT_3.setText("NA");
                    BED2_text_3.setText("NA");
                    BEDret_text_3.setText("NA");
                    Dret_text_3.setText("NA");
                    ret_frac_out_3.setText("NA");
                    out_3.setText("NA");
                    nominal_tol_3.setText("NA");
                    run_3.setVisible(true);
                } else if (p_eqn_3(D, S) > 0.999) {
                    p_high_3.setVisible(true);
                    p_high_3.setText("WARNING: RISK GREATER THAN 99.9%");
                    BED1_text_3.setText("NA");
                    BEDinit_text_3.setText("NA");
                    BEDR_text_3.setText("NA");
                    BEDR2_TEXT_3.setText("NA");
                    BED2_text_3.setText("NA");
                    BEDret_text_3.setText("NA");
                    Dret_text_3.setText("NA");
                    out_3.setText("NA");
                    ret_frac_out_3.setText("NA");
                    nominal_tol_3.setText("NA");
                    warn_bed_3.setVisible(false);
                    p_low_3.setVisible(false);
                    run_3.setVisible(true);
                } else if (p_eqn_3(D, S) < 1e-5) {
                    p_low_3.setVisible(true);
                    p_low_3.setText("WARNING: RISK LESS THAN 0.001%");
                    BED1_text_3.setText("NA");
                    BEDinit_text_3.setText("NA");
                    BEDR_text_3.setText("NA");
                    BEDR2_TEXT_3.setText("NA");
                    BED2_text_3.setText("NA");
                    BEDret_text_3.setText("NA");
                    Dret_text_3.setText("NA");
                    ret_frac_out_3.setText("NA");
                    out_3.setText("NA");
                    nominal_tol_3.setText("NA");
                    warn_bed_3.setVisible(false);
                    p_high_3.setVisible(false);
                    run_3.setVisible(true);
                } else {

                    double INIT = Double.parseDouble(initalDose_3.getText()) / Double.parseDouble(NumFrac_3.getText());
                    double FRAC = Double.parseDouble(NumFrac_3.getText());
                    double k = INIT;
                    double Q = INIT * RBE_3_IN();
                    double B_1 = BED_Rper_3(500);
                    double B_2 = BED2__3(500);
                    initfrac_text_3.setText(df2.format(k));

                    out_3.setText(df2.format(RBE_3_IN()));
                    ret_frac_out_3.setText(RetreatFrac_3.getText());

//CODE FOR THE LABELS BEDS
                    BED1_text_3.setText(df2.format(((Q * FRAC * (1 + (Q) / 2)) / B_1) * 100));
                    BEDinit_text_3.setText(df2.format(((Q * FRAC * (1 + (Q) / 2)))));
                    BEDR_text_3.setText(df2.format((B_1)));
                    BEDR2_TEXT_3.setText(df2.format(B_1));
                    BED2_text_3.setText(df2.format(B_2));
                    BEDret_text_3.setText(df2.format((B_2 * (B_1)) / 100));
                    Dret_text_3.setText(df2.format(dose_3(0, 20)));
                    nominal_tol_3.setText(df2.format(B_1));

                    warn_bed_3.setVisible(false);
                    p_high_3.setVisible(false);
                    p_low_3.setVisible(false);
                    out_3.setVisible(true);
                    BED1_text_3.setVisible(true);
                    BEDinit_text_3.setVisible(true);
                    BEDR_text_3.setVisible(true);
                    BEDR2_TEXT_3.setVisible(true);
                    BED2_text_3.setVisible(true);
                    BEDret_text_3.setVisible(true);
                    Dret_text_3.setVisible(true);
                    run_3.setVisible(true);

                }

// VERFICATION OF THE TEXTFIELD DATA
                try {
                    double RiskVal = Double.parseDouble(RiskOfMyel_3.getText());
                    if (RiskVal > 0 && RiskVal < 100) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0.1;
                        RiskOfMyel_3.setText("0.1");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    RiskOfMyel_3.setText("0.1");
                }

                try {
                    double RiskVal = Double.parseDouble(NumOfYears_3.getText());
                    if (RiskVal >= 0 && RiskVal <= 5) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 2;
                        NumOfYears_3.setText("1");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    NumOfYears_3.setText("2");
                }

                try {
                    double RiskVal = Double.parseDouble(Percentage_3.getText());
                    if (RiskVal >= 0 && RiskVal <= 20) {
                        RiskVal = RiskVal;
                    } else {
                        RiskVal = 0;
                        Percentage_3.setText("0");
                    }

                } catch (NumberFormatException RiskVal) {
                    System.out.println("Error:" + " is not valid");
                    Percentage_3.setText("0");
                }

                try {
                    double InitalVal = Double.parseDouble(initalDose_3.getText());
                    if (InitalVal > 0) {
                        InitalVal = InitalVal;
                    } else {
                        InitalVal = 1.3;
                        initalDose_3.setText("1.3");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    initalDose_3.setText("40");
                }

                try {
                    int NumVal = Integer.parseInt(NumFrac_3.getText());
                    if (NumVal > 0) {
                        NumVal = NumVal;
                    } else {
                        NumVal = 20;
                        NumFrac_3.setText("20");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    NumFrac_3.setText("20");
                }

                try {
                    double NumVal = Double.parseDouble(s0_3.getText());
                    if (NumVal < 0 || NumVal > 1) {
                        NumVal = 0.1;
                        s0_3.setText("0.1");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    s0_3.setText("0.1");
                }

                try {
                    double NumVal = Double.parseDouble(s1_3.getText());
                    if (NumVal < 0 || NumVal > 1) {
                        NumVal = 0.15;
                        s1_3.setText("0.15");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    s1_3.setText("0.15");
                }

                try {
                    double NumVal = Double.parseDouble(bed_3.getText());
                    if (NumVal < 0 || NumVal > 45) {
                        NumVal = 35;
                        bed_3.setText("35");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    bed_3.setText("35");
                }

                try {
                    int RetVal = Integer.parseInt(RetreatFrac_3.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 20;
                        RetreatFrac_3.setText("20");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    RetreatFrac_3.setText("20");

                }
                try {
                    double RetVal = Double.parseDouble(letx_3.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 5;
                        letx_3.setText("5");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    letx_3.setText("5");

                }

                try {
                    double RetVal = Double.parseDouble(letu_3.getText());
                    if (RetVal > 0) {
                        RetVal = RetVal;
                    } else {
                        RetVal = 30.5;
                        letu_3.setText("30.5");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error:" + " is not valid");
                    letu_3.setText("30.5");

                }

//PUT VALUES OF BED2 INTO AN ARRAY
                double BED2Array_3[] = new double[101];
                for (int j = 0; j < 101; j++) {

                    double value1 = BED2_FINAL_3(j);
                    BED2Array_3[j] = value1;
                }

                //NEED TO MAKE A NEW SERIES EACH TIME THE FUNCTION IS CALLED!!! MAKE A IF STATEMENT FOR THIS        
                for (int i = 0; i < 101; i++) {
                    series9_3.getData().add(new XYChart.Data(i, BED2Array_3[i]));
                }
                series10_3.getData().add(new XYChart.Data(BED1_pc_3(), BED21_pc_3()));
                series11_3.getData().add(new XYChart.Data(BED1_pc_3(), BED22_pc_3()));

                series12_3.getData().add(new XYChart.Data(BED1_pc_3(), BED23_pc_3()));

                series13_3.getData().add(new XYChart.Data(BED1_pc_human_3(), BED2_FINAL_3(BED1_pc_human_3())));
                series14_3.getData().add(new XYChart.Data(0, BED2_FINAL_3(BED1_pc_human_3())));
                series14_3.getData().add(new XYChart.Data(BED1_pc_human_3(), BED2_FINAL_3(BED1_pc_human_3())));

                series15_3.getData().add(new XYChart.Data(BED1_pc_human_3(), 0));
                series15_3.getData().add(new XYChart.Data(BED1_pc_human_3(), BED2_FINAL_3(BED1_pc_human_3())));

                chart2_3.getData().addAll(series9_3, series10_3, series11_3, series12_3, series13_3, series14_3, series15_3);

                long endTime = System.nanoTime();
                long totalTime = endTime - startTime;
                System.out.println("Total time for calculation " + totalTime / 1e9 + " seconds");
            }

        });

        reset.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                out.setText("");
                BED1_text.setText("");
                BEDinit_text.setText("");
                BEDR_text1.setText("");
                BEDR2_TEXT.setText("");
                BED2_text.setText("");
                BEDret_text.setText("");
                Dret_text.setText("");
                p_high.setText("");
                p_low.setText("");
                warn_bed.setText("");
                run_1.setVisible(false);
                ret_frac_out_1.setText("");
                initfrac_text.setText("");
                p_value_1.setText("p-value = 0.001");
                Num_Warn_1.setVisible(false);
                Per_Warn_1.setVisible(false);
                s0_warn.setVisible(false);
                s1_warn.setVisible(false);
                bed_warn.setVisible(false);

                s0_1.setText("0.15");
                s1_1.setText("0.1");
                bed_1.setText("35");
                NumOfYears_1.setText("");
                Percentage_1.setText("");
                RiskOfMyel.setText("0.1");
                initalDose.setText("40");
                RetreatFrac.setText("20");
                NumFrac.setText("20");
                series9.getData().clear();
                series10.getData().clear();
                series11.getData().clear();
                series12.getData().clear();
                series12.getData().clear();
                series13.getData().clear();

                series14.getData().clear();
                series15.getData().clear();

                Calculate.setDisable(true);
                Calculate.setOpacity(0.3);

            }
        });

        reset_2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                out_2.setText("");
                BED1_text_2.setText("");
                BEDinit_text_2.setText("");
                BEDR_text_2.setText("");
                BEDR2_TEXT_2.setText("");
                BED2_text_2.setText("");
                BEDret_text_2.setText("");
                Dret_text_2.setText("");
                p_high_2.setText("");
                p_low_2.setText("");
                warn_bed_2.setText("");
                ProDose_2.setText("");
                run_2.setVisible(false);
                letc_2.setText("0.22");
                nominal_tol_2.setText("");
                RETFRAC_WARN_2.setVisible(false);
                RBE_CHECKBOX_2.setDisable(false);
                RBE_CHECKBOX_2.setOpacity(1);
                ret_frac_out_2.setText("");
                letc_2.setDisable(false);
                letc_text_2.setOpacity(1);
                letc_2.setOpacity(1);
                letc_2.setText("0.22");
                initfrac_text_2.setText("");
                p_value_2.setText("p-value = 0.001");
                dose_select_2.setSelected(false);

                NumOfYears_2.setText("");
                Percentage_2.setText("");
                RiskOfMyel_2.setText("0.1");
                initalDose_2.setText("40");
                NumFrac_2.setText("20");
                DHIGH_2.setText("");
                letu_2.setText("30.5");
                letx_2.setText("1");
                RBE_CHECKBOX_2.setSelected(false);
                letx_2.setDisable(false);
                letx_text_2.setOpacity(1);
                letx_2.setOpacity(1);
                letu_2.setDisable(false);
                letu_2.setOpacity(1);
                letu_text_2.setOpacity(1);
                s0_2.setText("0.15");
                s1_2.setText("0.1");
                bed_2.setText("35");
                letu_warn_2.setVisible(false);
                Per_Warn_2.setVisible(false);
                Num_Warn_2.setVisible(false);
                letc_warn_2.setVisible(false);
                letx_warn_2.setVisible(false);

                series9_2.getData().clear();

                series10_2.getData().clear();
                series11_2.getData().clear();
                series12_2.getData().clear();
                series12_2.getData().clear();
                series13_2.getData().clear();

                series14_2.getData().clear();
                series15_2.getData().clear();

                d_hi_2.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                nom_text_2.setText("Estimated RBE for proton retreatment");
                eqn3_text_2.setText("Proton retreatment:");
                tab2.setText("Photon Initial - Proton Retreatment");
                Calculate_2.setDisable(true);
                Calculate_2.setOpacity(0.3);

            }
        });

        reset_3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                out_3.setText("");
                BED1_text_3.setText("");
                BEDinit_text_3.setText("");
                BEDR_text_3.setText("");
                BEDR2_TEXT_3.setText("");
                BED2_text_3.setText("");
                BEDret_text_3.setText("");
                Dret_text_3.setText("");
                p_high_3.setText("");
                p_low_3.setText("");
                warn_bed_3.setText("");

                run_3.setVisible(false);
                letc_3.setText("0.22");
                s0_3.setText("0.15");
                s1_3.setText("0.1");
                bed_3.setText("35");
                nominal_tol_3.setText("");
                RBE_CHECKBOX_3.setDisable(false);
                RBE_CHECKBOX_3.setOpacity(1);
                ret_frac_out_3.setText("");
                letc_3.setDisable(false);
                letc_text_3.setOpacity(1);
                letc_3.setOpacity(1);
                letc_3.setText("0.22");
                RetreatFrac_3.setText("20");
                initfrac_text_3.setText("");
                p_value_3.setText("p-value = 0.001");
                Num_Warn_3.setVisible(false);
                Per_Warn_3.setVisible(false);
                letu_warn_3.setVisible(false);
                letx_warn_3.setVisible(false);
                letc_warn_3.setVisible(false);

                NumOfYears_3.setText("");
                Percentage_3.setText("");
                RiskOfMyel_3.setText("0.1");
                initalDose_3.setText("40");
                NumFrac_3.setText("20");
                letu_3.setText("30.5");
                letx_3.setText("1");
                RBE_CHECKBOX_3.setSelected(false);
                letx_3.setDisable(false);
                letx_text_3.setOpacity(1);
                letx_3.setOpacity(1);
                letu_3.setDisable(false);
                letu_3.setOpacity(1);
                letu_text_3.setOpacity(1);
                series9_3.getData().clear();

                series10_3.getData().clear();
                series11_3.getData().clear();
                series12_3.getData().clear();
                series12_3.getData().clear();
                series13_3.getData().clear();

                series14_3.getData().clear();
                series15_3.getData().clear();
                Label_initfrac_3.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_3.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                RBE_text_3.setText("Estimated RBE for proton initial treatment");
                tab3.setText("Proton Initial - Photon Retreatment");
                Calculate_3.setDisable(true);
                Calculate_3.setOpacity(0.3);
            }
        });

        reset_4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                out_4.setText("");
                BED1_text_4.setText("");
                BEDinit_text_4.setText("");
                BEDR_text_4.setText("");
                BEDR2_TEXT_4.setText("");
                BED2_text_4.setText("");
                BEDret_text_4.setText("");
                Dret_text_4.setText("");
                p_high_4.setText("");
                p_low_4.setText("");
                warn_bed_4.setText("");
                ProDose_4.setText("");
                run_4.setVisible(false);
                letu_ret_4.setText("30.5");
                letx_ret_4.setText("1");
                letc_ret_4.setText("0.22");
                RBE_IN_TEXT_4.setText("");
                RETFRAC_WARN_4.setVisible(false);
                bed_4.setText("35");
                s0_4.setText("0.15");
                s1_4.setText("0.1");
                letc_4.setText("0.22");
                letc_4.setDisable(false);
                letc_4.setOpacity(1);
                letc_text_4.setOpacity(1);
                letu_ret_4.setText("30.5");
                letx_ret_4.setText("1");
                letc_ret_4.setText("0.22");
                letx_ret_4.setDisable(false);
                letx_ret_text_4.setOpacity(1);
                letx_ret_4.setOpacity(1);
                letu_ret_4.setDisable(false);
                letu_ret_4.setOpacity(1);
                letu_ret_text_4.setOpacity(1);
                letc_ret_4.setDisable(false);
                letc_ret_4.setOpacity(1);
                letc_ret_text_4.setOpacity(1);
                out_4.setText("");
                RBE_CHECKBOX_4.setDisable(false);
                RBE_CHECKBOX_4.setOpacity(1);
                RBE_RET_CHECKBOX_4.setDisable(false);
                RBE_RET_CHECKBOX_4.setOpacity(1);
                ret_frac_out_4.setText("");
                initfrac_text_4.setText("");
                p_value_4.setText("p-value = 0.001");
                Num_Warn_4.setVisible(false);
                Per_Warn_4.setVisible(false);
                letx_warn_4.setVisible(false);
                letc_warn_4.setVisible(false);
                letu_warn_4.setVisible(false);
                letx_ret_warn_4.setVisible(false);
                letc_ret_warn_4.setVisible(false);
                letu_ret_warn_4.setVisible(false);
                dose_select_4.setSelected(false);

                NumOfYears_4.setText("");
                Percentage_4.setText("");
                RiskOfMyel_4.setText("0.1");
                initalDose_4.setText("40");
                NumFrac_4.setText("20");
                DHIGH_4.setText("");
                letu_4.setText("30.5");
                letx_4.setText("1");
                RBE_CHECKBOX_4.setSelected(false);
                RBE_RET_CHECKBOX_4.setSelected(false);
                letx_4.setDisable(false);
                letx_text_4.setOpacity(1);
                letx_4.setOpacity(1);
                letu_4.setDisable(false);
                letu_4.setOpacity(1);
                letu_text_4.setOpacity(1);
                series9_4.getData().clear();

                series10_4.getData().clear();
                series11_4.getData().clear();
                series12_4.getData().clear();
                series12_4.getData().clear();
                series13_4.getData().clear();

                series14_4.getData().clear();
                series15_4.getData().clear();

                nom_text_4.setText("Estimated RBE for initial proton treatment");
                Label_initfrac_4.setText("Proton initial dose per fraction (Gy) \nd\u1D62\u2099\u1D62\u209C = D\u1D62\u2099\u1D62\u209C/n\u1D62\u2099\u1D62\u209c ");
                Label_InitDose_4.setText("Proton initial total dose D\u1D62\u2099\u1D62\u209C (Gy)");
                nom_text_21.setText("Estimated RBE for proton retreatment");
                d_hi_4.setText("Proton retreatment \ndose per fraction d\u1D63\u2091\u209C (Gy)");
                eqn3_text_4.setText("Proton retreatment:");
                tab4.setText("Proton Initial - Proton Retreatment");
                Calculate_4.setDisable(true);
                Calculate_4.setOpacity(0.3);

            }
        });
    }

    //CODE FOE THE RODENT DATA BUTTONS FOR EACH GRAPH - TAB1
    @FXML
    public void handleRdntBtn1Action(final ActionEvent event) {
        chart1.isVisible();
        if (chart1.isVisible() == false) {
            chart1.setVisible(true);
            chart2.setOpacity(0.4);
            chart2.getXAxis().setOpacity(0);
            chart2.getYAxis().setOpacity(0);
        } else {
            chart1.setVisible(false);
            chart2.setOpacity(1);
            chart2.getXAxis().setOpacity(1);
            chart2.getYAxis().setOpacity(1);
        }
    }

    //RODENT BUTTON TAB4
    @FXML
    public void handleRdntBtn4Action(final ActionEvent event) {

        chart1_4.isVisible();
        if (chart1_4.isVisible() == false) {
            chart1_4.setVisible(true);
            chart2_4.setOpacity(0.4);
            chart2_4.getXAxis().setOpacity(0);
            chart2_4.getYAxis().setOpacity(0);
        } else {
            chart1_4.setVisible(false);
            chart2_4.setOpacity(1);
            chart2_4.getXAxis().setOpacity(1);
            chart2_4.getYAxis().setOpacity(1);
        }
    }

    //RODENT BUTTON TAB4
    @FXML
    public void handleRdntBtn2Action(final ActionEvent event) {

        chart1_2.isVisible();
        if (chart1_2.isVisible() == false) {
            chart1_2.setVisible(true);
            chart2_2.setOpacity(0.4);
            chart2_2.getXAxis().setOpacity(0);
            chart2_2.getYAxis().setOpacity(0);
        } else {
            chart1_2.setVisible(false);
            chart2_2.setOpacity(1);
            chart2_2.getXAxis().setOpacity(1);
            chart2_2.getYAxis().setOpacity(1);
        }
    }
    //RODENT BUTTON TAB3

    @FXML
    public void handleRdntBtn3Action(final ActionEvent event) {

        chart1_3.isVisible();
        if (chart1_3.isVisible() == false) {
            chart1_3.setVisible(true);
            chart2_3.setOpacity(0.4);
            chart2_3.getXAxis().setOpacity(0);
            chart2_3.getYAxis().setOpacity(0);
        } else {
            chart1_3.setVisible(false);
            chart2_3.setOpacity(1);
            chart2_3.getXAxis().setOpacity(1);
            chart2_3.getYAxis().setOpacity(1);
        }
    }

//static varibles to be used for proton RBE Calculations
    public static double alpha_low = 0.06;
    public static double beta_low = 0.03;

    /////////////APPROXIMATED ERROR FCN ////////////////////////////////////////////////////////////////////
    public static double erf(double z) {
        double t = (double) (1.0 / (1.0 + 0.5 * Math.abs(z)));

        // use Horner's method
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

}
