/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;

import ap_project22.HomaPage;
import ap_project22.LogIn;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import java.lang.Object;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author 123es
 */
public class SpecialistController extends Controller implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent parent;
     @Override   
    public void initialize(URL location, ResourceBundle resources) {
        
 
          
//insertNewInquirie();
    }    
    
    @FXML
    private GridPane gridPaneForInquirie = new GridPane();
   
//
//    public void insertNewInquirie() {
//
//        InnerShadow shadow = new InnerShadow();
//        shadow.setColor(Color.RED);
//        
//        Lighting light = new Lighting();
//        StackPane s = new StackPane();
//   
//        Button b1 = new Button();
//        b1.setStyle("-fx-background-color: #abd46d;-fx-border-color:darkgreen;");
//        b1.setEffect(shadow);
//        b1.setMinWidth(150);
//        b1.setMinHeight(100);
//        
//        VBox v1 = new VBox();
//        HBox h2 = new HBox(10);
//        Circle c = new Circle();
//        Label l1 = new Label("new inquirie");
//        HBox h3 =  new HBox();
//        Label l2 = new Label();
//        l1.setTextFill(Color.DARKRED);
//        l1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 13));
//         
//        v1.setPadding(new Insets(5,15,15,15));
//        
//        v1.setAlignment(Pos.CENTER);
//        h2.setAlignment(Pos.CENTER);
//        h3.setAlignment(Pos.CENTER);
//        
//        c.setFill(Color.RED);
//        c.setRadius(12);
//        c.setEffect(light);
//        
//        h2.getChildren().addAll(c,l1);
//        h3.getChildren().add(l2);
//        v1.getChildren().addAll(h2,h3);
//        s.getChildren().addAll(b1,v1);
//        gridPaneForInquirie.getChildren().add(s);
//        
//        b1.setOnAction(e->{
//            
//          
//        Controller control = new Controller();
//            try {
//                control.switchToChat(e);
//            } catch (IOException ex) {
//                Logger.getLogger(SpecialistController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//          Session  session = HibernateUtil.getSessionFactory().openSession();
//            session.beginTransaction();
// ChatTable s2 = null;
// int sid=1;
// s2 = (ChatTable)session.get(ChatTable.class, sid);
// s2.setNewInquirie(false);
// session.getTransaction().commit();
// session.close();
//
//    });
//        
//    } 
    
  

   


   
    
     
}
