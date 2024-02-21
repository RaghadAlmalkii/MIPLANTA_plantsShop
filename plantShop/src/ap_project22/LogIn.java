/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;


import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

public class LogIn extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sign Up Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setStyle("-fx-background-color: #ebefe3 ; -fx-border-color: #d1dabc;");

        
        Text sceneTitle = new Text("Welcome Back ");
        sceneTitle.setFont(Font.font("Andalus", FontWeight.BOLD, 20));
        sceneTitle.setFill(Color.web("#adbb92"));
        sceneTitle.setTranslateY(-10);
        sceneTitle.setTranslateX(60);
        grid.add(sceneTitle, 0, 0, 2, 1);
        
        
        Text mainTitle = new Text("MI PLANTA");
        mainTitle.setFont(Font.font("Bell MT", FontWeight.BOLD, 30));
        mainTitle.setFill(Color.web("#3A5836"));
        mainTitle.setTranslateY(-80);
        mainTitle.setTranslateX(-34);
        grid.add(mainTitle, 1, 0, 1, 1);
        
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

//        Label email = new Label("Email:");
//        grid.add(email, 0, 2);

//        TextField emailTextField = new TextField();
//        grid.add(emailTextField, 1, 2);

        Label password = new Label("Password:");
        grid.add(password, 0, 3);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 3);

        Button signUpButton = new Button("Log In");
        HBox hbSignUpButton = new HBox(10);
        hbSignUpButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbSignUpButton.getChildren().add(signUpButton);
        grid.add(hbSignUpButton, 1, 5);
        signUpButton.setStyle("-fx-background-color: #d1dabc ; -fx-border-color: #adbb92;");
        signUpButton.setFont(Font.font("Bell MT", FontWeight.NORMAL, 18));
        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 7);

       HomaPage Home = new HomaPage();
        signUpButton.setOnAction(e -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign Up button pressed");
            Home.start(primaryStage);
            primaryStage.show();
            
            //  home page here redirect is her 
        });
        
        
       Controller control2 = new Controller();
         
        signUpButton.setOnAction(e -> {
            
          Session session1 = HibernateUtil.getSessionFactory().openSession();
          session1.beginTransaction();
          List<Client> sList = null;
          String queryStr = "from Client";
          Query query = session1.createQuery(queryStr);
          sList = query.list();
           session1.getTransaction().commit();
          session1.close();
    
//          Session session2 = HibernateUtil.getSessionFactory().openSession();
//          session2.beginTransaction();
//          List<Customers_service> sList2 = null;
//          String queryStr2 = "from specialist";
//          Query query2 = session2.createQuery(queryStr2);
//          sList2 = query2.list();
//           session2.getTransaction().commit();
//          session2.close();
    
         user current = new user();
         boolean sign = false;
          if (!sign){
            for(Client s: sList){
     
            if(passwordField.getText().equals(s.getClient_password())){
                
             current.currentUser(s.getId());
            
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign Up button pressed");
            Home.start(primaryStage);
             sign = true;
             if(sign ==true)
                 break;
      
            }
           
            }
                
            }

//            for(Customers_service s: sList2){
//                 if(sign ==true)
//                 break;
//              System.out.println(passwordField.getText()+""+(s.getSpecialist_password()));
//             if (passwordField.getText().equals(s.getSpecialist_password())){
//             
//            
//            current.currentUser(s.getSpecialist_id());
//            actionTarget.setFill(Color.FIREBRICK);
//            actionTarget.setText("Sign Up button pressed");
//            try {
//                control2.switchTospecialist(e);
//                sign = true;
//             if(sign ==true)
//                 break;
//            } catch (IOException ex) {
//                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            }
//          }
          if(!sign){
            if(passwordField.getText().equals("777")){
                current.currentUser(777);
                 try {
                control2.switchTospecialist(e);
                sign = true;
            } catch (IOException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
          else
             actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("UserName or password not correct"); 
                
            }
                
        });
        
        
      

        Scene scene = new Scene(grid,  700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}