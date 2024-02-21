/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class Open extends Application {

    @Override
    public void start(Stage stage) {
    
        StackPane st11=new StackPane();
        ImageView firstimg=new ImageView("https://littleshopofplants.co.uk/wp-content/uploads/2023/02/cacti_collection_Order.jpg");
        firstimg.setFitWidth(700);
        firstimg.setFitHeight(600);
        
        Text textbegin=new Text(100,100,"Let's Bring Spring To \n      Your Home!");
        textbegin.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 30));
        textbegin.setFill(Color.WHITE);
        textbegin.setTranslateY(-140);
        textbegin.setStroke(Color.BLACK);
        
        
         Text textbeginWelcome=new Text(100,100,"Welcome");
        textbeginWelcome.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 40));
        textbeginWelcome.setFill(Color.WHITE);
        textbeginWelcome.setTranslateY(-200);
        textbeginWelcome.setStroke(Color.BLACK);
        
        HBox buu=new HBox(20);
        Button sin=new Button("Sign in");
        Button log=new Button("Log in");
        sin.setTranslateY(250);
        sin.setTranslateX(250);
        
        log.setTranslateY(250);
        log.setTranslateX(300);
        sin.setStyle(" -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
        log.setStyle(" -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
        log.setFont(Font.font("Bell MT", FontWeight.NORMAL, 18));
        sin.setFont(Font.font("Bell MT", FontWeight.NORMAL, 18));
        
        buu.getChildren().addAll(sin,log);
      
        st11.getChildren().addAll(firstimg,textbegin,textbeginWelcome,buu);
        
        
        Scene scene = new Scene( st11, 700, 600);
        stage.setScene(scene);
        stage.show();
        
        SignUp sign = new SignUp();
        sin.setOnAction(e->{
            sign.start(stage);
            
        });
        
        LogIn login = new LogIn();
        log.setOnAction(e->{
            login.start(stage);
        });
        
    }
    
    
 

    public static void main(String[] args) {
        launch();
    }

}