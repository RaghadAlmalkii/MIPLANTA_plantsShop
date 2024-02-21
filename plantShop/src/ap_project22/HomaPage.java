/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;



import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.GridPane.setColumnSpan;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.Serializable;
import java.util.List;
import org.hibernate.*;

public class HomaPage extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        ///////////////////////////////////////////////////////////////DB
      Student plant1 = new Student();
plant1.setProductID(1);
plant1.setName("Tradescantia albiflora Nanouk");
plant1.setDiscription("Fantasy Venice");
plant1.setPrice(65);
plant1.setPic("https://cdn.shopify.com/s/files/1/1706/1307/products/Tradescantia-albiflora-Nanouk-Fantasy-Venice-Close-Up_400x.jpg?v=1678359561");

Student plant2 = new Student();
plant2.setProductID(2);
plant2.setName("Peperomia prostrata");
plant2.setDiscription("String of Coins");
plant2.setPrice(85);
plant2.setPic("https://hortology.co.uk/cdn/shop/products/Peperomia-Pepperspot-15x15-Foliage_5000x.jpg?v=1651846479");

Student plant3 = new Student();
plant3.setProductID(3);
plant3.setName("Peperomia argyreia");
plant3.setDiscription("Watermelon Peperomia");
plant3.setPrice(70);
plant3.setPic("https://hortology.co.uk/cdn/shop/files/Peperomia-argyreia-Watermelon-Peperomia-SWATCH_5000x.jpg?v=1693297678");

Student plant4 = new Student();
plant4.setProductID(4);
plant4.setName("Anthurium - Flamingo Flower");
plant4.setDiscription("Royal red");
plant4.setPrice(95);
plant4.setPic("https://hortology.co.uk/cdn/shop/products/Anthurium-Royal-Champion-Close-Up_5000x.jpg?v=1705590528");

Student plant5 = new Student();
plant5.setProductID(5);
plant5.setName("Coffea arabica");
plant5.setDiscription("Coffee Plant");
plant5.setPrice(85);
plant5.setPic("https://cdn.shopify.com/s/files/1/1706/1307/products/CoffeeArabica_400x.jpg?v=1695371276");

Student plant6 = new Student();
plant6.setProductID(6);
plant6.setName("Kalanchoe luciae");
plant6.setDiscription("Paddle Plant");
plant6.setPrice(75);
plant6.setPic("https://hortology.co.uk/cdn/shop/files/Kalanchoe-luciae-Fantastic-Paddle-Plant-SWATCH-2_5000x.jpg?v=1700230167");

Student plant7 = new Student();
plant7.setProductID(7);
plant7.setName("Anthurium - Flamingo Flower");
plant7.setDiscription("Joli Peach");
plant7.setPrice(95);
plant7.setPic("https://hortology.co.uk/cdn/shop/files/Anthurium-andraeanum-Joli-Peach-1_5000x.jpg?v=1684139201");

Student plant8 = new Student();
plant8.setProductID(8);
plant8.setName("Peperomia");
plant8.setDiscription("Caperata Rosso");
plant8.setPrice(85);
plant8.setPic("https://hortology.co.uk/cdn/shop/products/Peperomia-caperata-Rosso-Mini-Bucket-Plant-Pot-Grey-Washed-Close-Up_1e7a53cc-ba1a-40f0-8e1c-930322473680_5000x.jpg?v=1676635100");

Session session = HibernateUtil.getSessionFactory().openSession();
Transaction tx = session.beginTransaction();

int sId1 = (Integer) session.save(plant1);
int sId2 = (Integer) session.save(plant2);
int sId3 = (Integer) session.save(plant3);
int sId4 = (Integer) session.save(plant4);
int sId5 = (Integer) session.save(plant5);
int sId6 = (Integer) session.save(plant6);
int sId7 = (Integer) session.save(plant7);
int sId8 = (Integer) session.save(plant8);

tx.commit();
session.close();

System.out.println("Inserted Plant: " + plant1.getName());
System.out.println("Inserted Plant: " + plant2.getName());
System.out.println("Inserted Plant: " + plant3.getName());
System.out.println("Inserted Plant: " + plant4.getName());
System.out.println("Inserted Plant: " + plant5.getName());
System.out.println("Inserted Plant: " + plant6.getName());
System.out.println("Inserted Plant: " + plant7.getName());
System.out.println("Inserted Plant: " + plant8.getName());
        
        
        //////////////////////////////////////////////////////////////DB
        
        BorderPane root = new BorderPane();
        root.setMaxSize(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        root.setMinSize(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
        root.setPrefSize(600, 511);
        root.setStyle("-fx-background-color: #EBEFE3; -fx-padding: 15;");

        //////////////////////////////////////////////////////////////////////// TOP
        //FOR THE TITLE AND THE BUTTONS
        BorderPane topPane = new BorderPane(); 
        topPane.setPrefSize(390, 74);
        BorderPane.setAlignment(topPane, javafx.geometry.Pos.CENTER);
        
         // Create a BackgroundImage with the image file path
        Image backgroundImage = new Image("https://img.freepik.com/premium-vector/green-yellow-white-colourful-wedding-invitation-background-multipurpose-card-free-vector_1340-22069.jpg?size=626&ext=jpg&ga=GA1.2.216110102.1705592290&semt=ais");
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

        // Create a Background with the BackgroundImage and set it to the BorderPane's background
        Background borderPaneBackground = new Background(background);
        topPane.setBackground(borderPaneBackground);

        //THE TITLE
        Text text = new Text("MI PLANTA");
        text.setFill(Color.web("#3a5836"));
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        BorderPane.setAlignment(text, javafx.geometry.Pos.CENTER);
        text.setFont(new Font("Bell MT", 22));
       
         
        ///////////////////////////////////////////////////////////////////////
        Text text0 = new Text();
        text0.setFill(Color.web("#FF0000", 0.8));
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setFont(new Font("Bell MT", 22));
        text0.setTranslateX(230);
        text0.setTranslateY(5);
       
        ///////////////////////////////////////////////////////////////////////
        StackPane top = new StackPane();
        topPane.setTop(text);
        top.getChildren().addAll(topPane,text0);
        
       

        //THE BUTTONS
        HBox buttonBox = new HBox();
        buttonBox.setPrefSize(200, 100);
        buttonBox.setSpacing(20.0);
        buttonBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        buttonBox.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        
        //BUTTON ALL
        Button allButton = new Button("All");
        allButton.setStyle("-fx-background-color: #ADBB92;");
        allButton.setTextFill(Color.web("#ecede4"));
        allButton.setFont(new Font("Andalus", 12));
        
        //BUTTON INDOOR
        Button indoorButton = new Button("Indoor");
        indoorButton.setStyle("-fx-background-color: #ADBB92;");
        indoorButton.setTextFill(Color.web("#ecede4"));
        indoorButton.setFont(new Font("Andalus", 12));
        
        //BUTTON OUTDOOR
        Button outdoorButton = new Button("Outdoor");
        outdoorButton.setStyle("-fx-background-color: #ADBB92;");
        outdoorButton.setTextFill(Color.web("#ecede4"));
        outdoorButton.setFont(new Font("Andalus", 12));

        //BUTTON ARTIFICIAL
        Button floweringButton = new Button("Flowering");
        floweringButton.setStyle("-fx-background-color: #ADBB92;");
        floweringButton.setTextFill(Color.web("#ecede4"));
        floweringButton.setFont(new Font("Andalus", 12));

        buttonBox.getChildren().addAll(allButton, indoorButton, outdoorButton, floweringButton);
        buttonBox.setPadding(new Insets(10.0, 0, 0, 0));

        topPane.setCenter(buttonBox);
        
        root.setTop(top);
        
        
        
        //////////////////////////////////////////////////////////////////////// CENTER 
        
       // Center ScrollPane
       GridPane gridPane = new GridPane();
gridPane.setHgap(50);
gridPane.setVgap(5);
//gridPane.prefHeight(600);
//gridPane.prefWidth(700);

//gridPane.setGridLinesVisible(true);


gridPane.setPadding(new Insets(0, 10, 0, 10));
gridPane.setStyle("-fx-background-color: #EBEFE3;");


        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        col1.setMinWidth(10);
        col1.setPrefWidth(100);

        ColumnConstraints col2 = new ColumnConstraints();
        col2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        col2.setMinWidth(10);
        col2.setPrefWidth(100);

        RowConstraints row1 = new RowConstraints();
        row1.setMinHeight(10);
        row1.setPrefHeight(30);
        row1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints row2 = new RowConstraints();
        row2.setMinHeight(10);
        row2.setPrefHeight(30);
        row2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints row3 = new RowConstraints();
        row3.setMinHeight(10);
        row3.setPrefHeight(30);
        row3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints row4 = new RowConstraints();
        row4.setMinHeight(10);
        row4.setPrefHeight(30);
        row4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPane.getColumnConstraints().addAll(col1, col2);
        gridPane.getRowConstraints().addAll(row1, row2, row3, row4);
  
        //STACKS GRID 1 
        
        //////////////////////////////////////////////////////////////////////// 1
        StackPane stackPane1 = new StackPane();
        stackPane1.setPrefSize(200, 150);
       // stackPane1.setStyle("-fx-background-color: #D1DABC;");
        stackPane1.setPrefWidth(155.0);
        stackPane1.setPrefHeight(126.0);
        stackPane1.setStyle("-fx-background-color: #D1DABC;");

        ImageView imageView = new ImageView();
        imageView.setFitWidth(144.0);
        imageView.setFitHeight(114.0);
        
        // Set the translation properties for the ImageView
        imageView.setTranslateX(1); // Custom X coordinate
        imageView.setTranslateY(-1); // Custom Y coordinate

        Image image = new Image("https://cdn.shopify.com/s/files/1/1706/1307/products/Tradescantia-albiflora-Nanouk-Fantasy-Venice-Close-Up_400x.jpg?v=1678359561");
        imageView.setImage(image);
        
        //rectangle
        Rectangle rectangle = new Rectangle(300, 50);
        rectangle.setFill(Color.rgb(255, 255, 255, 0.5)); 

        //text
        Text text1 = new Text("                   Tradescantia albiflora Nanouk");
        text1.setFont(Font.font("Arial", 16));
        text1.setFill(Color.BLACK);
        //text
        Text text2 = new Text(" Fantasy Venice      65SR");
        text2.setFont(Font.font("Arial", 10));
        text2.setFill(Color.BLACK);
        //button +
        Button button = new Button("+");
        button.setStyle("-fx-font-weight: bold; -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
        
         ImageView imageView8 = new ImageView();
        Image star = new Image("https://cdn-icons-png.freepik.com/256/12405/12405744.png?ga=GA1.1.216110102.1705592290&semt=ais");
        imageView8.setImage(star);
         imageView8.setFitWidth(35.0);
        imageView8.setFitHeight(35.0);
        
        rectangle.setTranslateY(40); 
        text1.setTranslateY(30); 
        text1.setTranslateX(-90); 
        button.setTranslateY(40); 
        button.setTranslateX(95);
        text2.setTranslateY(50); 
        text2.setTranslateX(-55);
     imageView8.setTranslateY(40); 
        imageView8.setTranslateX(130);
       
        stackPane1.getChildren().addAll(imageView,rectangle,text1,text2,button,imageView8);
        /////////////////////////////////////////////////////////////////////////////////
    

        StackPane stackPane2 = new StackPane();
        stackPane2.setLayoutX(20);
        stackPane2.setLayoutY(10);
        stackPane2.setPrefSize(200, 150);
        stackPane2.setStyle("-fx-background-color: #D1DABC;");
        GridPane.setColumnIndex(stackPane2, 1);
        
         ImageView imageView1 = new ImageView();
        imageView1.setFitWidth(144.0);
        imageView1.setFitHeight(114.0);
        
//        Set the translation properties for the ImageView
//        imageView1.setTranslateX(1); // Custom X coordinate
//        imageView1.setTranslateY(-1); // Custom Y coordinate

        Image image1 = new Image("https://hortology.co.uk/cdn/shop/products/Peperomia-Pepperspot-15x15-Foliage_5000x.jpg?v=1651846479");
        imageView1.setImage(image1);
        
        //rectangle
        Rectangle rectangle1 = new Rectangle(300, 50);
        rectangle1.setFill(Color.rgb(255, 255, 255, 0.5)); 

        //text
        Text text3 = new Text("           Peperomia prostrata ");
        text3.setFont(Font.font("Arial", 16));
        text3.setFill(Color.BLACK);
        //text
        Text text4 = new Text("String of Coins      85SR");
        text4.setFont(Font.font("Arial", 10));
        text4.setFill(Color.BLACK);
        //button +
        Button button1 = new Button("+");
         button1.setStyle("-fx-font-weight: bold; -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
         
         ImageView imageView9 = new ImageView();
        Image star1 = new Image("https://cdn-icons-png.freepik.com/256/12405/12405744.png?ga=GA1.1.216110102.1705592290&semt=ais");
        imageView9.setImage(star1);
         imageView9.setFitWidth(35.0);
        imageView9.setFitHeight(35.0);
        
        rectangle1.setTranslateY(40); 
        text3.setTranslateY(30); 
        text3.setTranslateX(-90); 
        button1.setTranslateY(40); 
        button1.setTranslateX(95);
        text4.setTranslateY(50); 
        text4.setTranslateX(-55);
         imageView9.setTranslateY(40); 
        imageView9.setTranslateX(130);
        

        stackPane2.getChildren().addAll(imageView1,rectangle1,text3,text4,button1,imageView9);
        //////////////////////////////////////////////////////////////////////////////
        
        StackPane stackPane3 = new StackPane();
        stackPane3.setLayoutX(208);
        stackPane3.setLayoutY(10);
        stackPane3.setPrefSize(200, 150);
        stackPane3.setStyle("-fx-background-color: #D1DABC;");
        GridPane.setRowIndex(stackPane3, 1);
        
         ImageView imageView2 = new ImageView();
        imageView2.setFitWidth(144.0);
        imageView2.setFitHeight(114.0);
        
//        Set the translation properties for the ImageView
//        imageView1.setTranslateX(1); // Custom X coordinate
//        imageView1.setTranslateY(-1); // Custom Y coordinate

        Image image2 = new Image("https://hortology.co.uk/cdn/shop/files/Peperomia-argyreia-Watermelon-Peperomia-SWATCH_5000x.jpg?v=1693297678");
        imageView2.setImage(image2);
        
         //rectangle
        Rectangle rectangle2 = new Rectangle(300, 50);
        rectangle2.setFill(Color.rgb(255, 255, 255, 0.5)); 

        //text
        Text text5 = new Text("    Peperomia argyreia"); //4white spaces
        text5.setFont(Font.font("Arial", 16));
        text5.setFill(Color.BLACK);
        //text
        Text text6 = new Text("Watermelon Peperomia      70SR");
        text6.setFont(Font.font("Arial", 10));
        text6.setFill(Color.BLACK);
        //button +
        Button button2 = new Button("+");
         button2.setStyle("-fx-font-weight: bold; -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
         
           ImageView imageView10 = new ImageView();
        Image star2 = new Image("https://cdn-icons-png.freepik.com/256/12405/12405744.png?ga=GA1.1.216110102.1705592290&semt=ais");
        imageView10.setImage(star2);
         imageView10.setFitWidth(35.0);
        imageView10.setFitHeight(35.0);
        
        rectangle2.setTranslateY(40); 
        text5.setTranslateY(30); 
        text5.setTranslateX(-90); 
        button2.setTranslateY(40); 
        button2.setTranslateX(95);
        text6.setTranslateY(50); 
        text6.setTranslateX(-55);
         imageView10.setTranslateY(40); 
        imageView10.setTranslateX(130);
        

        stackPane3.getChildren().addAll(imageView2,rectangle2,text5,text6,button2,imageView10);

        /////////////////////////////////////////////////////////////////////////////////////

        StackPane stackPane4 = new StackPane();
        stackPane4.setLayoutX(20);
        stackPane4.setLayoutY(150);
        stackPane4.setPrefSize(200, 150);
        stackPane4.setStyle("-fx-background-color: #D1DABC;");
        GridPane.setColumnIndex(stackPane4, 1);
        GridPane.setRowIndex(stackPane4, 1);
        
         ImageView imageView3 = new ImageView();
        imageView3.setFitWidth(144.0);
        imageView3.setFitHeight(114.0);
        
//        Set the translation properties for the ImageView
//        imageView1.setTranslateX(1); // Custom X coordinate
//        imageView1.setTranslateY(-1); // Custom Y coordinate

        Image image3 = new Image("https://hortology.co.uk/cdn/shop/products/Anthurium-Royal-Champion-Close-Up_5000x.jpg?v=1705590528");
        imageView3.setImage(image3);
        
          //rectangle
        Rectangle rectangle3 = new Rectangle(300, 50);
        rectangle3.setFill(Color.rgb(255, 255, 255, 0.5)); 

        //text
        Text text7 = new Text("                  Anthurium - Flamingo Flower");
        text7.setFont(Font.font("Arial", 16));
        text7.setFill(Color.BLACK);
        //text
        Text text8 = new Text("Royal Red      95SR");
        text8.setFont(Font.font("Arial", 10));
        text8.setFill(Color.BLACK);
        //button +
        Button button3 = new Button("+");
         button3.setStyle("-fx-font-weight: bold; -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
         
            ImageView imageView11 = new ImageView();
        Image star3 = new Image("https://cdn-icons-png.freepik.com/256/12405/12405744.png?ga=GA1.1.216110102.1705592290&semt=ais");
        imageView11.setImage(star3);
         imageView11.setFitWidth(35.0);
        imageView11.setFitHeight(35.0);
        
        rectangle3.setTranslateY(40); 
        text7.setTranslateY(30); 
        text7.setTranslateX(-90); 
        button3.setTranslateY(40); 
        button3.setTranslateX(95);
        text8.setTranslateY(50); 
        text8.setTranslateX(-55);
        imageView11.setTranslateY(40); 
        imageView11.setTranslateX(130);
        

        stackPane4.getChildren().addAll(imageView3,rectangle3,text7,text8,button3,imageView11);

        ////////////////////////////////////////////////////////////////////////

        StackPane stackPane5 = new StackPane();
        stackPane5.setLayoutX(208);
        stackPane5.setLayoutY(150);
        stackPane5.setPrefSize(200, 150);
        stackPane5.setStyle("-fx-background-color: #D1DABC;");
        GridPane.setRowIndex(stackPane5, 2);
        
         ImageView imageView4 = new ImageView();
        imageView4.setFitWidth(144.0);
        imageView4.setFitHeight(114.0);
        

        Image image4 = new Image("https://cdn.shopify.com/s/files/1/1706/1307/products/CoffeeArabica_400x.jpg?v=1695371276");
        imageView4.setImage(image4);
        
          //rectangle
        Rectangle rectangle4 = new Rectangle(300, 50);
        rectangle4.setFill(Color.rgb(255, 255, 255, 0.5)); 

        //text
        Text text9 = new Text("Coffea arabica");
        text9.setFont(Font.font("Arial", 16));
        text9.setFill(Color.BLACK);
        //text
        Text text10 = new Text("Coffee Plant      85SR");
        text10.setFont(Font.font("Arial", 10));
        text10.setFill(Color.BLACK);
        //button +
        Button button4 = new Button("+");
         button4.setStyle("-fx-font-weight: bold; -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
             ImageView imageView12 = new ImageView();
        Image star4 = new Image("https://cdn-icons-png.freepik.com/256/12405/12405744.png?ga=GA1.1.216110102.1705592290&semt=ais");
        imageView12.setImage(star4);
         imageView12.setFitWidth(35.0);
        imageView12.setFitHeight(35.0);
        
        rectangle4.setTranslateY(40); 
        text9.setTranslateY(30); 
        text9.setTranslateX(-90); 
        button4.setTranslateY(40); 
        button4.setTranslateX(95);
        text10.setTranslateY(50); 
        text10.setTranslateX(-55);
        imageView12.setTranslateY(40); 
        imageView12.setTranslateX(130);
        

        stackPane5.getChildren().addAll(imageView4,rectangle4,text9,text10,button4,imageView12);

       
        ///////////////////////////////////////////////////////////////////////

        StackPane stackPane6 = new StackPane();
        stackPane6.setLayoutX(20);
        stackPane6.setLayoutY(291);
        stackPane6.setPrefSize(200, 150);
        stackPane6.setStyle("-fx-background-color: #D1DABC;");
        GridPane.setColumnIndex(stackPane6, 1);
        GridPane.setRowIndex(stackPane6, 2);
        
         ImageView imageView5 = new ImageView();
        imageView5.setFitWidth(144.0);
        imageView5.setFitHeight(114.0);
        
//        Set the translation properties for the ImageView
//        imageView1.setTranslateX(1); // Custom X coordinate
//        imageView1.setTranslateY(-1); // Custom Y coordinate

        Image image5 = new Image("https://hortology.co.uk/cdn/shop/files/Kalanchoe-luciae-Fantastic-Paddle-Plant-SWATCH-2_5000x.jpg?v=1700230167");
        imageView5.setImage(image5);
        
        
          //rectangle
        Rectangle rectangle5 = new Rectangle(300, 50);
        rectangle5.setFill(Color.rgb(255, 255, 255, 0.5)); 

        //text
        Text text11 = new Text("    Kalanchoe luciae ");
        text11.setFont(Font.font("Arial", 16));
        text11.setFill(Color.BLACK);
        //text
        Text text12 = new Text("Paddle Plant      75SR");
        text12.setFont(Font.font("Arial", 10));
        text12.setFill(Color.BLACK);
        //button +
        Button button5 = new Button("+");
         button5.setStyle("-fx-font-weight: bold; -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
         
          ImageView imageView13 = new ImageView();
        Image star5 = new Image("https://cdn-icons-png.freepik.com/256/12405/12405744.png?ga=GA1.1.216110102.1705592290&semt=ais");
        imageView13.setImage(star5);
         imageView13.setFitWidth(35.0);
        imageView13.setFitHeight(35.0);
        
        rectangle5.setTranslateY(40); 
        text11.setTranslateY(30); 
        text11.setTranslateX(-90); 
        button5.setTranslateY(40); 
        button5.setTranslateX(95);
        text12.setTranslateY(50); 
        text12.setTranslateX(-55);
         imageView13.setTranslateY(40); 
        imageView13.setTranslateX(130);
        

        stackPane6.getChildren().addAll(imageView5,rectangle5,text11,text12,button5,imageView13);

        //////////////////////////////////////////////////////////////////////////

        StackPane stackPane7 = new StackPane();
        stackPane7.setLayoutX(20);
        stackPane7.setLayoutY(291);
        stackPane7.setPrefSize(200, 150);
        stackPane7.setStyle("-fx-background-color: #D1DABC;");
        GridPane.setRowIndex(stackPane7, 3);
        
         ImageView imageView6 = new ImageView();
        imageView6.setFitWidth(144.0);
        imageView6.setFitHeight(114.0);
        
//        Set the translation properties for the ImageView
//        imageView1.setTranslateX(1); // Custom X coordinate
//        imageView1.setTranslateY(-1); // Custom Y coordinate

        Image image6 = new Image("https://hortology.co.uk/cdn/shop/files/Anthurium-andraeanum-Joli-Peach-1_5000x.jpg?v=1684139201");
        imageView6.setImage(image6);
        
        
          //rectangle
        Rectangle rectangle6 = new Rectangle(300, 35);
        rectangle6.setFill(Color.rgb(255, 255, 255, 0.5)); 

        //text
        Text text13 = new Text("                   Anthurium - Flamingo Flower");
        text13.setFont(Font.font("Arial", 16));
        text13.setFill(Color.BLACK);
        //text
        Text text14 = new Text("Joli Peach      95SR");
        text14.setFont(Font.font("Arial", 10));
        text14.setFill(Color.BLACK);
        //button +
        Button button6 = new Button("+");
         button6.setStyle("-fx-font-weight: bold; -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
         
          ImageView imageView14 = new ImageView();
        Image star6 = new Image("https://cdn-icons-png.freepik.com/256/12405/12405744.png?ga=GA1.1.216110102.1705592290&semt=ais");
        imageView14.setImage(star6);
         imageView14.setFitWidth(35.0);
        imageView14.setFitHeight(35.0);
        
        rectangle6.setTranslateY(40); 
        text13.setTranslateY(30); 
        text13.setTranslateX(-90); 
        button6.setTranslateY(40); 
        button6.setTranslateX(95);
        text14.setTranslateY(45); 
        text14.setTranslateX(-55);
         imageView14.setTranslateY(40); 
        imageView14.setTranslateX(130);
        

        stackPane7.getChildren().addAll(imageView6,rectangle6,text13,text14,button6,imageView14);

        ////////////////////////////////////////////////////////////////////////

        StackPane stackPane8 = new StackPane();
        stackPane8.setLayoutX(20);
        stackPane8.setLayoutY(431);
        stackPane8.setPrefSize(200, 150);
        stackPane8.setStyle("-fx-background-color: #D1DABC;");
        GridPane.setColumnIndex(stackPane8, 1);
        GridPane.setRowIndex(stackPane8, 3);
        
         ImageView imageView7 = new ImageView();
        imageView7.setFitWidth(144.0);
        imageView7.setFitHeight(114.0);
        
//        Set the translation properties for the ImageView
//        imageView1.setTranslateX(1); // Custom X coordinate
//        imageView1.setTranslateY(-1); // Custom Y coordinate

        Image image7 = new Image("https://hortology.co.uk/cdn/shop/products/Peperomia-caperata-Rosso-Mini-Bucket-Plant-Pot-Grey-Washed-Close-Up_1e7a53cc-ba1a-40f0-8e1c-930322473680_5000x.jpg?v=1676635100");
        imageView7.setImage(image7);
        
          //rectangle
        Rectangle rectangle7 = new Rectangle(300, 35);
        rectangle7.setFill(Color.rgb(255, 255, 255, 0.5)); 

        //text
        Text text15 = new Text("Peperomia");
        text15.setFont(Font.font("Arial", 16));
        text15.setFill(Color.BLACK);
        //text
        Text text16 = new Text("caperata Rosso      85SR");
        text16.setFont(Font.font("Arial", 10));
        text16.setFill(Color.BLACK);
        //button +
        Button button7 = new Button("+");
        button7.setStyle("-fx-font-weight: bold; -fx-background-color: #F0F0F0 ; -fx-border-color: #D9D9D9;");
        
         ImageView imageView15 = new ImageView();
        Image star7 = new Image("https://cdn-icons-png.freepik.com/256/12405/12405744.png?ga=GA1.1.216110102.1705592290&semt=ais");
        imageView15.setImage(star7);
         imageView15.setFitWidth(35.0);
        imageView15.setFitHeight(35.0);
        
        rectangle7.setTranslateY(40); 
        text15.setTranslateY(30); 
        text15.setTranslateX(-90); 
        button7.setTranslateY(40); 
        button7.setTranslateX(95);
        text16.setTranslateY(45); 
        text16.setTranslateX(-55);
         imageView15.setTranslateY(40); 
        imageView15.setTranslateX(130);
        
        Button b1 = new Button("   ");
        b1.setTranslateY(40); 
        b1.setTranslateX(130);

        stackPane8.getChildren().addAll(imageView7,rectangle7,text15,text16,button7, imageView15);
        

        gridPane.getChildren().addAll(stackPane1, stackPane2, stackPane3, stackPane4, stackPane5, stackPane6, stackPane7, stackPane8);
//        gridPane.setColumnSpan(stackPane1, 2);
//        gridPane.setColumnSpan(stackPane2, 2);
//        
        //////////////////////////////////////////////////////////GRID 2
        
         GridPane gridPane1 = new GridPane();
gridPane1.setHgap(50);
gridPane1.setVgap(5);
gridPane1.setPadding(new Insets(0, 10, 0, 10));
gridPane1.setStyle("-fx-background-color: #EBEFE3;");
//.setPadding(new Insets(20,50, 0, 10));


        ColumnConstraints col11 = new ColumnConstraints();
        col1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        col1.setMinWidth(100);
        col1.setPrefWidth(100);

        ColumnConstraints col22 = new ColumnConstraints();
        col2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        col2.setMinWidth(100);
        col2.setPrefWidth(100);

        RowConstraints row11 = new RowConstraints();
        row1.setMinHeight(100);
        row1.setPrefHeight(100);
        row1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints row22 = new RowConstraints();
        row2.setMinHeight(100);
        row2.setPrefHeight(100);
        row2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints row33 = new RowConstraints();
        row3.setMinHeight(100);
        row3.setPrefHeight(100);
        row3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        RowConstraints row44 = new RowConstraints();
        row4.setMinHeight(100);
        row4.setPrefHeight(100);
        row4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        gridPane1.getColumnConstraints().addAll(col1, col2);
        gridPane1.getRowConstraints().addAll(row1, row2, row3, row4);
        
//        Set the translation properties for the ImageView
//        imageView1.setTranslateX(1); // Custom X coordinate
//        imageView1.setTranslateY(-1); // Custom Y coordinate

     //  gridPane1.getChildren().addAll(stackPane1, stackPane2, stackPane3);

       
        ///////////////////////////////////////////////////////////////////////////////////////BOTTOM
//        ScrollPane scrollPane = new ScrollPane(gridPane);
//        scrollPane.setPrefSize(200, 200);
//        scrollPane.setStyle("-fx-background-color: #EBEFE3;");
//       scrollPane.setFitToWidth(false);
//        scrollPane.setFitToHeight(false);
//        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        //scrollPane.setContent(gridPane);
        
        root.setCenter(gridPane);
        
        
        /////////////////////////////////////////////////////////////////////////////////////BOTTOM
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
        
         line.getChildren().addAll(lb5,lb7,lb8);
         root.setBottom(line);
         line.setAlignment(Pos.CENTER);
        /////////////////////////////////////////////////////////////////////CONTROLS
        
        //ALL
       allButton.setOnAction(e -> {
       gridPane.getChildren().clear();
       
       GridPane.setColumnIndex(stackPane1, 0);
       GridPane.setRowIndex(stackPane1, 0);
       
       GridPane.setColumnIndex(stackPane2, 1);
       GridPane.setRowIndex(stackPane2, 0);
       
       GridPane.setColumnIndex(stackPane3, 0);
       GridPane.setRowIndex(stackPane3, 1);
       
       GridPane.setColumnIndex(stackPane4, 1);
       GridPane.setRowIndex(stackPane4, 1);
       
        GridPane.setColumnIndex(stackPane5, 0);
       GridPane.setRowIndex(stackPane5, 2);
       
        GridPane.setColumnIndex(stackPane6, 1);
       GridPane.setRowIndex(stackPane6, 2);
       
       GridPane.setColumnIndex(stackPane7, 0);
       GridPane.setRowIndex(stackPane7, 3);
       
        GridPane.setColumnIndex(stackPane8, 1);
       GridPane.setRowIndex(stackPane8, 3);
        
       gridPane.getChildren().addAll(stackPane1, stackPane2, stackPane3, stackPane4, stackPane5, stackPane6, stackPane7, stackPane8);
       root.setCenter(gridPane);});
       
       //INDOOR
       indoorButton.setOnAction(e -> {
       gridPane1.getChildren().clear();
       
       GridPane.setColumnIndex(stackPane5, 1);
       GridPane.setRowIndex(stackPane5, 0);
       
        GridPane.setColumnIndex(stackPane8, 0);
       GridPane.setRowIndex(stackPane8, 1);
       
       gridPane1.getChildren().addAll(stackPane1, stackPane5, stackPane8);
       root.setCenter(gridPane1); });
       
       //OUTDOOR
       outdoorButton.setOnAction(e -> {
           gridPane1.getChildren().clear();
        GridPane.setColumnIndex(stackPane2, 0);
       GridPane.setRowIndex(stackPane2, 0);
       
       GridPane.setColumnIndex(stackPane3, 1);
       GridPane.setRowIndex(stackPane3, 0);
       
        GridPane.setColumnIndex(stackPane6, 0);
       GridPane.setRowIndex(stackPane6, 1);
       
       gridPane1.getChildren().addAll(stackPane2, stackPane3, stackPane6);
       root.setCenter(gridPane1);});
       
       //ARTIFICIAL 
       floweringButton.setOnAction(e -> {
           gridPane1.getChildren().clear();
        GridPane.setColumnIndex(stackPane4, 0);
       GridPane.setRowIndex(stackPane4, 0);
       
       GridPane.setColumnIndex(stackPane7, 1);
       GridPane.setRowIndex(stackPane7, 0);
       
       
       gridPane1.getChildren().addAll(stackPane4, stackPane7);
       root.setCenter(gridPane1);
      
       });
       
         EventHandler<ActionEvent> buttonHandler = e -> {
            // Show the message label and set the text
            text0.setText("Item is added");
            text0.setVisible(true);

            // Schedule a task to hide the message label after 3 seconds
            new Thread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                // Hide the message label
                text0.setVisible(false);
            }).start();
        };

        // Assign the event handler to each button
        button.setOnAction(buttonHandler);
        button1.setOnAction(buttonHandler);
        button2.setOnAction(buttonHandler);
        button3.setOnAction(buttonHandler);
        button4.setOnAction(buttonHandler);
        button5.setOnAction(buttonHandler);
        button6.setOnAction(buttonHandler);
        button7.setOnAction(buttonHandler);
        //////////////////////////////////////////////////////////////////////////// 
       Controller control = new Controller();
     lb7.setOnMouseClicked(e -> {
        
            try {
                control.switchToProfile(e);
            } catch (IOException ex) {
                Logger.getLogger(HomaPage.class.getName()).log(Level.SEVERE, null, ex);
            }
           
       
       });
     
     Basket basket = new Basket();
     lb8.setOnMouseClicked(e -> {
          
            basket.start(primaryStage);
           
       
       });
        ////////////////////////////////////////////////////////////////////////BOTTOM
//          b1.setOnAction(e->{
//         imageView15.setImage(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Star_icon_stylized.svg/2153px-Star_icon_stylized.svg.png"));
//         Client c1 =new Client();
//         c1.setId(444);
//         c1.setFavorites(plant8.getProductId());
//         
//
//         Session session = HibernateUtil.getSessionFactory().openSession();
//         Transaction tx = session.beginTransaction();
//         int sId = (Integer) session.save(c1);
//
//         tx.commit();
//         session.close();
//      
//      });
        
        Scene scene = new Scene(root, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
