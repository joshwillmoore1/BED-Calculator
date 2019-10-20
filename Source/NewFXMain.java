/*
 * Any computational issues related to the use of the GUI can 
 * be reported on the appropriate GitHub page under "issues". 
 *  Note Thomas E. Woolley and Joshua W. Moore are mathematicians
 *  and are unable to supply any help on any particular medical application.
 * These should be directed to the local clinical specialist of the user.
 */
package firstscene;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author moore
 */
public class NewFXMain extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Information");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
