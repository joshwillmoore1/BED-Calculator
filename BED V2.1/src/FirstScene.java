/*
 * Any computational issues related to the use of the GUI can 
 * be reported on the appropriate GitHub page under "issues". 
 *  Note Thomas E. Woolley and Joshua W. Moore are mathematicians
 *  and are unable to supply any help on any particular medical application.
 * These should be directed to the local clinical specialist of the user.
 */
package firstscene;

import com.sun.javafx.application.LauncherImpl;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author moore
 */
public class FirstScene extends Application {

    public static Boolean isSplashLoaded = false;
    
    
    @Override
    public void start(Stage stage) throws Exception {
       
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("splash_screen.fxml"));
        
        Scene scene = new Scene(root);

        String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();

        scene.getStylesheets().add(css);

        stage.setTitle("BED Calculator");

        stage.getIcons().add(new Image(getClass().getResourceAsStream("cap6.png")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}
