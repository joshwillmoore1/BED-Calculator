/*
 * Any computational issues related to the use of the GUI can 
 * be reported on the appropriate GitHub page under "issues". 
 *  Note Thomas E. Woolley and Joshua W. Moore are mathematicians
 *  and are unable to supply any help on any particular medical application.
 * These should be directed to the local clinical specialist of the user.
 */
package firstscene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author moore
 */
public class Popup_windowController implements Initializable {

    @FXML
    public Label label1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        label1.setText("D\u1D62\u2099\u1D62\u209C = Total dose used in initial treatment\n"
                + "\n"
                + "D\u1D63\u2091\u209C = Total dose used in re-treatment\n"
                + "\n"
                + "BED\u1D62\u2099\u1D62\u209C = The BED of the initial treatment\n"
                + "\n"
                + "BED\u1D63\u2091\u209C = The BED of the re-treatment\n"
                + "\n"
                + "BED\u1D63 = The BED that should result in risk of R%\n"
                + "\n"
                + "BED\u2081 = The ratio of BED\u1D62\u2099\u1D62\u209C to BED\u1D63 expressed a percentage\n"
                + "\n"
                + "BED\u2082 = The ratio of BED\u1D63\u2091\u209C to BED\u1D63 expressed as a percentage\n"
                + "\n"
                + "B\u035EE\u035ED = Transition point between delayed and normal recovery\n"
                + "\n"
                + "s\u2080 = Transition steepness \n"
                + "\n"
                + "s\u2081 = Modulator scale for low BED\u2081 recovery\n"
                + "\n"
                + "LET = Linear energy transfer \n"
                + "\n"
                + "RBE = Relative biological effectiveness \n"
        );

    }

}
