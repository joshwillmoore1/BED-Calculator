package firstscene;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.Image;

public class AlertBox {

    public static void display(String title, String message) {
        Stage window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);

        window.initStyle(StageStyle.DECORATED);

        window.setResizable(false);

        window.setOnCloseRequest(event -> {

            window.showAndWait();
        });

        window.setHeight(300);
        window.setWidth(600);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Close");
        CheckBox check1 = new CheckBox("I understand and will change with caution");
        closeButton.setDisable(true);

        EventHandler<ActionEvent> check = new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {
                if (check1.isSelected()) {
                    closeButton.setDisable(false);
                } else {
                    closeButton.setDisable(true);
                }
            }
        };
        check1.setOnAction(check);

        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, check1, closeButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.getIcons().add(
                new Image(
                        AlertBox.class.getResourceAsStream("cap6.png")));

        String css = AlertBox.class.getResource("alertStyle.css").toExternalForm();

        scene.getStylesheets().add(css);

        window.setScene(scene);
        window.showAndWait();
    }

}
