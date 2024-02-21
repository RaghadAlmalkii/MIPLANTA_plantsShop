/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.Serializable;
import java.util.List;
import javafx.application.Platform;
import org.hibernate.*;

/**
 *
 * @author 123es
 */

public class Controller  {
    
     
    @FXML
    private BorderPane pane = new BorderPane();
    
  
    @FXML
    private VBox profileVbox;
    @FXML
    private BorderPane pane1;
    @FXML
    private VBox profileVbox1;

    
    
    private Stage stage;
    private Scene scene;
    private Parent parent;
    

     
    
    
    @FXML
    public void switchToChat(ActionEvent event) throws IOException{
        
        Parent root = FXMLLoader.load(new URL("file:/C:/Users/123es/OneDrive/المستندات/NetBeansProjects/AP_Projecr01/src/ap_projecr01/Chat.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root,700,600);
        stage.setScene(scene);
        stage.show();
        
          
    }
    
    
   
    @FXML
     public void switchToHomePage(ActionEvent event) throws IOException{
          HomaPage homepage = new HomaPage();
          stage = (Stage)((Node)event.getSource()).getScene().getWindow();
          homepage.start(stage);

        
    }
    
    public void switchToProfileA(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(new URL("file:/C:/Users/123es/OneDrive/المستندات/NetBeansProjects/AP_Projecr01/src/ap_projecr01/ProfilePersonly.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root,700,600);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToProfile(MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(new URL("file:/C:/Users/123es/OneDrive/المستندات/NetBeansProjects/AP_Projecr01/src/ap_projecr01/ProfilePersonly.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root,700,600);
        stage.setScene(scene);
        stage.show();
        
    }
    
    @FXML
    public void switchToLogIn(ActionEvent event) throws IOException{
         LogIn Log = new LogIn();
          stage = (Stage)((Node)event.getSource()).getScene().getWindow();
          Log.start(stage);

    }

      public void switchTospecialist(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(new URL("file:/C:/Users/123es/OneDrive/المستندات/NetBeansProjects/AP_Projecr01/src/ap_projecr01/Specialist.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root,700,600);
        stage.setScene(scene);
        stage.show();
    }
      
 
    

         


         
          
     
                   
      
    }
    

