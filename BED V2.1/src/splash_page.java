/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstscene;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Preloader;
import javafx.application.Preloader.ProgressNotification;
import javafx.application.Preloader.StateChangeNotification;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author joshuamoore
 */
public class splash_page extends Preloader {
    
    ProgressBar bar;
    Stage stage;
    
    
 
    @Override
    public void start(Stage stage) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("splash_screen.fxml"));
         Scene scene = new Scene(root);
        
        
        stage.setScene(scene);  
        stage.show();
    }
    
    @Override
    public void handleStateChangeNotification(StateChangeNotification scn) {
       
            stage.hide();
            
            
        
    }
    
    @Override
    public void handleProgressNotification(ProgressNotification pn) {
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(splash_page.class.getName()).log(Level.SEVERE, null, ex);
        }
        bar.setProgress(pn.getProgress());
    }    
    
}
