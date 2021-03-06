/*
 * Any computational issues related to the use of the GUI can 
 * be reported on the appropriate GitHub page under "issues". 
 *  Note Thomas E. Woolley and Joshua W. Moore are mathematicians
 *  and are unable to supply any help on any particular medical application.
 * These should be directed to the local clinical specialist of the user.
 */
package firstscene;

import javafx.application.Platform;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.Image;

public class DoseSuggest extends FXMLDocumentController {

    public static void display(String title, String message) {
        Stage window = new Stage();

        //Block events to other windows
        window.setTitle(title);

        window.initStyle(StageStyle.UNDECORATED);

        window.setResizable(false);

        window.setHeight(300);
        window.setWidth(500);

        window.focusedProperty().addListener((ov, onHidden, onShown) -> {
            if (!window.isFocused()) {
                Platform.runLater(() -> window.close());
            }
        });

        Label label0 = new Label();
        label0.setText("Dose adjustment");

        Label label2 = new Label();
        label2.setText(" ");

        Label label1 = new Label();
        label1.setText(message);

        FXMLDocumentController obj = new FXMLDocumentController();

        VBox layout = new VBox(10);

        layout.setStyle("-fx-background-color:WHITE; \n" + "-fx-border-color:BLACK;");

        layout.getChildren().addAll(label0, label2, label1);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.getIcons().add(
                new Image(
                        DoseSuggest.class.getResourceAsStream("cap6.png")));

        String css = DoseSuggest.class.getResource("alertStyle.css").toExternalForm();

        scene.getStylesheets().add(css);

        window.setScene(scene);
        window.show();
    }

}
