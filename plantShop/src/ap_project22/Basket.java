/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;

/**
 *
 * @author 123es
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import static javafx.scene.effect.BlendMode.GREEN;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class Basket extends Application {

    @Override
    public void start(Stage stage) {
       
    
        
        BorderPane pane = new BorderPane();

        VBox layer1=new VBox(100);
        layer1.setStyle("-fx-background-color: #c7ddb5; -fx-border-color: BLACK; -fx-border-width: 2px;");
        Text t1=new Text(100,100,"MI PLANTA");
        t1.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 30));
        t1.setFill(Color.web("#3a5836"));//#658354
        layer1.getChildren().addAll(t1);
        layer1.setAlignment(Pos.TOP_CENTER);
        pane.setTop(layer1);
        
        
       VBox layer2=new VBox(10);
       Rectangle rectangle = new Rectangle(); 
       rectangle.setWidth(600);
       rectangle.setHeight(500);
       rectangle.setFill(Color.web("#e0f4cf"));//Setting the color
       
       ImageView B=new ImageView("https://img.freepik.com/free-vector/green-botanical-leaves-background-design_53876-62639.jpg?w=740&t=st=1704736200~exp=1704736800~hmac=71d249ee091fbc11ffcb1178f3da7b4fc1ecf375083051ef18485649b4fab53f");
       B.setFitWidth(700);
       B.setFitHeight(600);
       
       Label messageLabel = new Label("Nothing is here");
      
       
       
       
       
       
       
      /////////////////////////////////نستخدم لاضافة الصور والسعر و الوصف للمنتج 
       VBox layer5=new VBox(20);   
       FlowPane box1=new  FlowPane(Orientation.HORIZONTAL);
       box1.setHgap(55);
       box1.setVgap(120);
       ImageView F1=new ImageView("https://cdn.shopify.com/s/files/1/1706/1307/products/CoffeeArabica_400x.jpg?v=1695371276");
       F1.setFitWidth(130);
       F1.setFitHeight(130);
       
       Text t2=new Text(100,100,"      Flower       ");
        t2.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 25));
        t2.setFill(Color.web("#3b5329"));
        
        Text t3=new Text(100,100,"55 SAR");
        t3.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 15));
        t3.setFill(Color.web("#798a6d"));
        
        
        
        
        
        
        box1.getChildren().addAll(F1,t2,t3);
        box1.setAlignment(Pos.TOP_CENTER);
        
        FlowPane box2=new  FlowPane(Orientation.HORIZONTAL);
        box2.setHgap(55);
        box2.setVgap(120);
       ImageView F2=new ImageView("https://hortology.co.uk/cdn/shop/files/Maranta-leuconeura-var.-erythroneura-Herringbone-Plant-12x35cm_e4c5d1bb-a62c-46b7-81eb-764fdcf23720_5000x.jpg?v=1696580284");
       F2.setFitWidth(130);
       F2.setFitHeight(130);
       
       Text t4=new Text("Herringbone plant");
        t4.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 20));
        t4.setFill(Color.web("#3b5329"));
        
        Text t5=new Text(100,100,"60SAR");
        t5.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 15));
        t5.setFill(Color.web("#798a6d"));
        
       box2.getChildren().addAll(F2,t4,t5);
      
      box2.setAlignment(Pos.TOP_CENTER);
        
        FlowPane box3=new  FlowPane(Orientation.HORIZONTAL);
        box3.setHgap(55);
        box3.setVgap(120);
       ImageView F3=new ImageView("https://hortology.co.uk/cdn/shop/products/Pilea-peperomioides-Chinese-Money-Plant-25cm_c52e27b9-a7bd-46f1-88b1-d28e50dc948c_5000x.jpg?v=1693298039");
       F3.setFitWidth(130);
       F3.setFitHeight(130);
       
       Text t6=new Text("              Pilea   ");
        t6.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 25));
        t6.setFill(Color.web("#3b5329"));
        
        Text t7=new Text("50SAR");
        t7.setFont(Font.font("Amasis MT Pro Medium", FontWeight.BOLD, FontPosture.REGULAR, 15));
        t7.setFill(Color.web("#798a6d"));
        
        box3.getChildren().addAll(F3,t6,t7);
        box3.setAlignment(Pos.TOP_CENTER);
       
         
         layer5.getChildren().addAll(box1,box2,box3);
         layer5.setAlignment(Pos.CENTER);
        ////////////////////////////////مربعات المنتجات الخضراء
       VBox layer3=new VBox(20);
       Rectangle re1 = new Rectangle(); 
       re1.setWidth(460);
       re1.setHeight(130);
       re1.setArcWidth(25);
       re1.setArcHeight(25);
       re1.setFill(Color.web("#D1DABC"));//95bb72
       
       Rectangle re2 = new Rectangle(); 
       re2.setWidth(460);
       re2.setHeight(130);
       re2.setArcWidth(25);
       re2.setArcHeight(25);
       re2.setFill(Color.web("#D1DABC"));
       
       Rectangle re3 = new Rectangle(); 
       re3.setWidth(460);
       re3.setHeight(130);
       re3.setArcWidth(25);
       re3.setArcHeight(25);
       re3.setFill(Color.web("#D1DABC"));
      
//       Rectangle re4 = new Rectangle(); 
//       re4.setWidth(460);
//       re4.setHeight(130);
//       re4.setArcWidth(25);
//       re4.setArcHeight(25);
//       re4.setFill(Color.web("#95bb72"));
//       
//       Rectangle re5 = new Rectangle(); 
//       re5.setWidth(460);
//       re5.setHeight(130);
//       re5.setArcWidth(25);
//       re5.setArcHeight(25);
//       re5.setFill(Color.web("#95bb72"));
//    Rectangle re6 = new Rectangle(); 
//       re6.setWidth(460);
//       re6.setHeight(130);
//       re6.setArcWidth(25);
//       re6.setArcHeight(25);
//       re6.setFill(Color.web("#95bb72"));
       
      layer3.getChildren().addAll(re1,re2,re3);
       layer3.setAlignment(Pos.CENTER);
  
      layer2.getChildren().addAll(rectangle,B);
      layer2.setAlignment(Pos.CENTER);
      
    /////////////////ازرار الحذف من السلة
     // StackPane stackpaneforbuttun=new StackPane();
       VBox layer4=new VBox(170);
       FlowPane but=new  FlowPane(Orientation.HORIZONTAL);
       but.setHgap(100);
       but.setVgap(200);
       Rectangle button = new Rectangle();
       button.setWidth(20);
       button.setHeight(20);
      button.setFill(Color.WHITE);
      button.setStroke(Color.GREEN); // Set the border color
      button.setStrokeWidth(2); // Set the border width
     // Label LAB1 = new Label("X",button);
//      ImageView imgforbutton=new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/No_red.svg/220px-No_red.svg.png");
//       imgforbutton.setFitWidth(20);
//       imgforbutton.setFitHeight(20);
       Text tt=new Text("                                                                                                                         ");
       Text tbutton=new Text("X");
       tbutton.setFont(Font.font("Amasis MT Pro Medium",FontWeight.BOLD, 15));
       tbutton.setFill(Color.BLACK);
      // stackpaneforbuttun.getChildren().addAll(button,tbutton);
       but.getChildren().addAll(tt, button);
       but.setAlignment(Pos.CENTER);
       
      //StackPane stackpaneforbuttun1=new StackPane();
       FlowPane but1=new  FlowPane(Orientation.HORIZONTAL);
       but1.setHgap(100);
       but1.setVgap(200);
       Rectangle button1 = new Rectangle();
       button1.setWidth(20);
       button1.setHeight(20);
       button1.setFill(Color.WHITE);
       button1.setStroke(Color.GREEN); // Set the border color
       button1.setStrokeWidth(2);
//       ImageView imgforbutton1=new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/No_red.svg/220px-No_red.svg.png");
//       imgforbutton1.setFitWidth(20);
//       imgforbutton1.setFitHeight(20);
       Text tt1=new Text("                                                                                                                         ");
      Text tbutton1=new Text("X");
       tbutton1.setFont(Font.font("Amasis MT Pro Medium",FontWeight.BOLD, 15));
       tbutton1.setFill(Color.BLACK);
     // stackpaneforbuttun1.getChildren().addAll(button1,tbutton1);
       but1.getChildren().addAll(tt1,button1); 
       but1.setAlignment(Pos.CENTER);
        
       
     //  StackPane stackpaneforbuttun2=new StackPane();
       FlowPane but2=new  FlowPane(Orientation.HORIZONTAL);
       but2.setHgap(100);
       but2.setVgap(200);
       Rectangle button2 = new Rectangle();
       button2.setWidth(20);
       button2.setHeight(20);
       button2.setFill(Color.WHITE);
       button2.setStroke(Color.GREEN); // Set the border color
       button2.setStrokeWidth(2);
       ImageView imgforbutton2=new ImageView("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/No_red.svg/220px-No_red.svg.png");
       imgforbutton2.setFitWidth(20);
       imgforbutton2.setFitHeight(20);
       Text tt2=new Text("                                                                                                                         ");
       Text tbutton2=new Text("X");
       tbutton2.setFont(Font.font("Amasis MT Pro Medium",FontWeight.BOLD, 15));
       tbutton2.setFill(Color.BLACK);
      // stackpaneforbuttun2.getChildren().addAll(button2,tbutton2);
       but2.getChildren().addAll(tt2,button2); 
       but2.setAlignment(Pos.CENTER);
       
       layer4.getChildren().addAll(but,but1,but2);
       layer4.setAlignment(Pos.CENTER);
       ///////////////////////////////////////////////////////////////////ScrollBar BAR
       
    
      
     HBox line=new HBox();
        line.setAlignment(Pos.CENTER);
      line.setStyle("-fx-background-color: ADBB92; -fx-border-color: #ecede4;");
        //////////////////////////////////////
        
        Rectangle clickableArea = new Rectangle(100,100,0,1);
        StackPane s = new StackPane();
        s.getChildren().addAll(clickableArea);
        Label lb5 = new Label("      HOME", s);
        lb5.setStyle("-fx-font-size: 20px; -fx-text-fill: #ecede4; -fx-font-family: Andalus; ");
        lb5.setContentDisplay(ContentDisplay.BOTTOM);
       
//         allButton.setStyle("-fx-background-color: #ADBB92;");
//        allButton.setTextFill(Color.web("#ecede4"));
//        lb5.setFont(new Font("Andalus", 12));
        
        Rectangle clickableArea3 = new Rectangle(100, 100, 175, 1);
        StackPane s3 = new StackPane();
        s3.getChildren().addAll(clickableArea3);
        Label lb7 = new Label("      PROFILE", s3);
        lb7.setStyle("-fx-font-size: 20px; -fx-text-fill: #ecede4; -fx-font-family: Andalus; ");
        lb7.setContentDisplay(ContentDisplay.BOTTOM);
        
        Rectangle clickableArea4 = new Rectangle(100, 200, 175, 1);
        StackPane s4 = new StackPane();
        s4.getChildren().addAll(clickableArea4);
        Label lb8 = new Label(" BAG", s4);
        lb8.setStyle("-fx-font-size: 20px; -fx-text-fill: #ecede4; -fx-font-family: Andalus; ");
        lb8.setContentDisplay(ContentDisplay.BOTTOM);
        
        
       Label lb9 = new Label("GO ORDER", s4);
        lb9.setStyle("-fx-font-size: 20px; -fx-text-fill: darkred; -fx-font-family: Andalus; ");
        lb9.setContentDisplay(ContentDisplay.BOTTOM);
         line.getChildren().addAll(lb5,lb7,lb8,lb9);
        // Set an event handler for mouse clicks on the rectangle
       
        
      
         
         
         
         
     
       
       
          but.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                javafx.scene.Node clickedNode = event.getPickResult().getIntersectedNode();
                if (clickedNode instanceof Rectangle) {
                    layer3.getChildren().removeAll(re1);
                    layer5.getChildren().removeAll(box1);
                    layer4.getChildren().removeAll(but);
                    
                }
            
        }});

          but1.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                javafx.scene.Node clickedNode = event.getPickResult().getIntersectedNode();
                if (clickedNode instanceof Rectangle) {
                    layer3.getChildren().removeAll(re2);
                    layer5.getChildren().removeAll(box2);
                    layer4.getChildren().removeAll(but1);
                }
            
        }});
          
             but2.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                javafx.scene.Node clickedNode = event.getPickResult().getIntersectedNode();
                if (clickedNode instanceof Rectangle) {
                    layer3.getChildren().removeAll(re3);
                    layer5.getChildren().removeAll(box3);
                    layer4.getChildren().removeAll(but2);
                }
            
        }});
             
      
//         if(!layer3.getChildren().contains(re3)&&!layer3.getChildren().contains(re1)&&!layer3.getChildren().contains(re2))
//         {
//          messageLabel.setVisible(true);
//         
//         }else
//         {
//         
//          messageLabel.setVisible(false);
//         
//         }
        ScrollPane scroller = new ScrollPane(pane);


        
       

        line.setAlignment(Pos.CENTER);
        pane.setBottom(line);
      StackPane stackpane=new StackPane();
      stackpane.getChildren().addAll(B,rectangle,messageLabel,layer3,layer5,layer4);
      
          if(stackpane.getChildren().contains(layer4)&&stackpane.getChildren().contains(layer3)&&stackpane.getChildren().contains(layer5))
         {
          messageLabel.setVisible(false);
         
         }else
         {
         
          messageLabel.setVisible(true);
         
         }
       pane.setCenter(stackpane);
    
       
       
       
       
       ////////////////////////////////////////////////////
        Scene scene = new Scene(scroller, 700, 600);
        stage.setScene(scene);
        
        
        
        
         HomaPage home = new HomaPage();
        lb5.setOnMouseClicked(e -> {
            // Open another stage when the rectangle is clicked
            home.start(stage);
  
        });
        
            Controller control = new Controller();
            
            
        lb7.setOnMouseClicked(e -> {
            try {
                control.switchToProfile(e);
            } catch (IOException ex) {
                Logger.getLogger(Basket.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        });
        
        OrderPage o = new OrderPage();
        lb9.setOnMouseClicked(e -> {
           o.start(stage);
       
        });
        
         
         
        stage.show();
        
    }
      

    
 
 
  
    

  

}