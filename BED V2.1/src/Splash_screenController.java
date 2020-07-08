/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstscene;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joshuamoore
 */
public class Splash_screenController implements Initializable {

    @FXML
    public CheckBox agree_box;

    @FXML
    public ProgressBar prog_bar;

    @FXML
    public Label loadingLabel;

    @FXML
    public Rectangle rectangle;

    public Boolean reached_100 = false;

    public Boolean openedCal;

    class bg_thread implements Runnable {

        private volatile boolean exit = false;

        Random rand = new Random();
        Splash_screenController spc;
        int m = 0;

        @Override
        public void run() {

            prog_bar.setVisible(true);
            loadingLabel.setVisible(true);
            for (int i = 0; i <= 100; i++) {
                if (reached_100 == false) {
                    try {
                        prog_bar.setProgress(i / 100.0);
                        //loadingLabel.setText("Loading " +  Integer.toString(i) + "%");
                        double rand_num = rand.nextDouble();
                        Thread.sleep((long) ((long) 30 * rand_num));

                        if (i == 100) {
                            reached_100 = true;

                        }

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_screenController.class.getName()).log(Level.SEVERE, null, ex);

                    }

                }

            }
        }

        public void stop_run() {
            exit = true;
        }

    } 
    
    
    @FXML
    public void handleCheck(ActionEvent event){
    
        Thread th = new Thread(new bg_thread());
          try {
                    th.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Splash_screenController.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        
        
    if (reached_100 == true) {
                   
                 
                     System.out.println(Thread.currentThread().getName());
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                        stage.getIcons().add(icon);
                        stage.setTitle("BED Calculator");

                        String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                        stage.getScene().getStylesheets().add(css);

                        stage.setResizable(true);
                        stage.show();
                        System.out.println("thIS ONE");

                        //Now close the window
                        final Node source = (Node) event.getSource();
                        final Stage currentStage = (Stage) source.getScene().getWindow();
                        currentStage.close();

                    } catch (Exception e2) {
                        System.out.println("Cannot close splash");
                    }

                }
    
    
    };
    
    
    
    
    
    
    
    
    
    
    
    
            
    /**
     * Initializes the controller class.
     */

    public void initialize(URL url, ResourceBundle rb) {

        reached_100 = false;
        prog_bar.setProgress(0);
        prog_bar.setVisible(false);
        loadingLabel.setVisible(false);
        openedCal = false;

        Thread.currentThread().setName("Org_thread");

        System.out.println(Thread.currentThread().getName());
        Thread th = new Thread(new bg_thread());
        Thread orgThread = Thread.currentThread();

        //adding a listener to the agree box
        prog_bar.progressProperty().addListener((ov, onHidden, onShown) -> {
            prog_bar.setVisible(true);
            loadingLabel.setVisible(true);

            System.out.println(prog_bar.getProgress());
            //loadingLabel.setText("Loading " + Double.toString(prog_bar.getProgress()) + "%");

            if (prog_bar.getProgress() == 1) {
                
               
                  reached_100 = true;
                  
                  System.out.println("Fired");
                    
                    
                }
            
                });

        agree_box.setOnMouseEntered((e) -> {

            if (reached_100 == true && openedCal == false) {
                try {
                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

        agree_box.setOnMouseMoved((e) -> {

            if (reached_100 == true) {
                try {
                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

        agree_box.setOnMouseExited((e) -> {

            if (reached_100 == true && openedCal == false) {
                try {

                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

        agree_box.setOnKeyReleased((e) -> {

            if (reached_100 == true && openedCal == false) {
                try {
                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

        agree_box.setOnMouseReleased((e) -> {

            if (reached_100 == true && openedCal == false) {
                try {
                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

        agree_box.setOnMouseClicked((e) -> {

            prog_bar.setVisible(true);
            loadingLabel.setVisible(true);
         
            if (reached_100 == false) {
            th.start();
            }
            else{
                
                
                try {
                    th.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Splash_screenController.class.getName()).log(Level.SEVERE, null, ex);
                }
  
                
            }

              
                if (reached_100 == true) {
                   
                 
                            System.out.println(Thread.currentThread().getName());
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                        stage.getIcons().add(icon);
                        stage.setTitle("BED Calculator");

                        String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                        stage.getScene().getStylesheets().add(css);

                        stage.setResizable(true);
                        stage.show();
                        System.out.println("thIS ONE");

                        //Now close the window
                        final Node source = (Node) e.getSource();
                        final Stage currentStage = (Stage) source.getScene().getWindow();
                        currentStage.close();

                    } catch (Exception e2) {
                        System.out.println("Cannot close splash");
                    }

                }


        });

        rectangle.setOnMouseMoved((e) -> {

            if (reached_100 == true && openedCal == false) {
                try {
                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

        rectangle.setOnMouseClicked((e) -> {

            if (reached_100 == true && openedCal == false) {
                try {
                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

        rectangle.setOnMouseEntered((e) -> {

            if (reached_100 == true && openedCal == false) {
                try {
                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

        rectangle.setOnMouseExited((e) -> {

            if (reached_100 == true && openedCal == false) {
                try {
                    openedCal = true;
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root1));
                    Image icon = new Image(getClass().getResourceAsStream("cap6.png"));
                    stage.getIcons().add(icon);
                    stage.setTitle("BED Calculator");

                    String css = FirstScene.class.getResource("LineStyle.css").toExternalForm();
                    stage.getScene().getStylesheets().add(css);

                    stage.setResizable(true);
                    stage.show();

                    stage.show();
                    //Now close the window
                    final Node source = (Node) e.getSource();
                    final Stage currentStage = (Stage) source.getScene().getWindow();
                    currentStage.close();

                } catch (Exception e2) {
                    System.out.println("Cannot close splash");
                }

            }

        });

    }

}
