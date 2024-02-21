package ap_project22;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SignUp extends Application {

    @Override
    public void start(Stage primaryStage) {
      Client client = new Client(); 
        primaryStage.setTitle("Sign Up Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setStyle("-fx-background-color: #ebefe3 ; -fx-border-color:#d1dabc;");

        
        Text sceneTitle = new Text("Please Sign Up To Be a Register User");
        sceneTitle.setFont(Font.font("Andalus", FontWeight.BOLD, 17));
        sceneTitle.setFill(Color.web("#adbb92"));
        sceneTitle.setTranslateY(-40);
        sceneTitle.setTranslateX(-5);
        grid.add(sceneTitle, 0, 0, 2, 1);
        
        
        Text mainTitle = new Text("MI PLANTA");
        mainTitle.setFont(Font.font("Bell MT", FontWeight.BOLD, 30));
        mainTitle.setFill(Color.web("#3A5836"));
        mainTitle.setTranslateY(-80);
        mainTitle.setTranslateX(-17);
        grid.add(mainTitle, 1, 0, 1, 1);
        
        Label firstName = new Label("First Name:");
        grid.add(firstName, 0, 0);

        TextField userFnTextField = new TextField();
        grid.add(userFnTextField, 1, 0);
             client.setF_Name(userFnTextField.getText());
        Label lastName = new Label("Last Name:");
        grid.add(lastName, 0, 1);
           
        TextField userLnTextField = new TextField();
        
        grid.add(userLnTextField, 1, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 2);
      
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 2);

        
        Label email = new Label("Email:");
        grid.add(email, 0, 3);
      
        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 3);

        Label password = new Label("Password:");
        grid.add(password, 0, 4);
      
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 4);
 

          client.setF_Name(userFnTextField.getText());
            
        client.setL_Name(userLnTextField.getText());
        
        
    
          client.setUser_Name(userTextField.getText());
        
          client.setEmail(emailTextField.getText());
          
          client.setClient_password(passwordField.getText());
          System.out.println(passwordField.getText());

        
       
        Button signUpButton = new Button("SIGN UP !");
        HBox hbSignUpButton = new HBox(10);
        hbSignUpButton.setAlignment(Pos.BOTTOM_RIGHT);
        hbSignUpButton.getChildren().add(signUpButton);
        grid.add(hbSignUpButton, 1, 6);
        signUpButton.setStyle("-fx-background-color: #d1dabc ; -fx-border-color: #adbb92;");
        signUpButton.setFont(Font.font("Bell MT", FontWeight.NORMAL, 18));
        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 8);

        LogIn login = new LogIn();
        signUpButton.setOnAction(e -> {
          Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         int sId = (Integer) session.save(client);
         tx.commit();
         
         session.close();
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign Up button pressed");
            login.start(primaryStage);
            //  home page here redirect is her 
        });

        Scene scene = new Scene(grid,  700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}