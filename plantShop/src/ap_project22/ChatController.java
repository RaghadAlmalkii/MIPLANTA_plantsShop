/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 123es
 */
public class ChatController extends Controller implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent parent;
    static int space =0;
    
    @FXML
    private VBox masBoxRight = new VBox();
    @FXML
   private VBox masBox = new VBox();
    @FXML
    private TextField text = new TextField();
    
           ChatTable c1 = new ChatTable();
           
     @Override
     
    public void initialize(URL location, ResourceBundle resources) {

       PreviousMessages();
    }
    
     public void PreviousMessages(){
     
         Label defaultM = new Label("Hi\n" +
           "Please write your qustions,\n" +
           "and you will be answered within \n" +
           "12 hours.");
           defaultM.setStyle("-fx-background-color:lightgray;-fx-border-color:darkgray;");
           defaultM.setTranslateY(space);
           if (user.UserId !=777 ){
           masBoxRight.getChildren().add(defaultM );
           space =50;
           }

          Session session1 = HibernateUtil.getSessionFactory().openSession();
          session1.beginTransaction();
          List<ChatTable> sList = null;
          String queryStr = "from ChatTable";
          Query query = session1.createQuery(queryStr);
          sList = query.list();
           session1.getTransaction().commit();
          session1.close();
    
          for(ChatTable s: sList){
          Label l = new Label(s.getMassages());
         if(s.getSender_id()==  user.UserId){
          l.setStyle("-fx-background-color: lightgreen;-fx-border-color: darkgreen;");
          l.setText(separate(l));
          l.setTranslateY(space);
          masBox.getChildren().add(l);
                                           }
         else {
              l.setStyle("-fx-background-color: lightgray;-fx-border-color: darkgray;");
          l.setText(separate(l));
          l.setTranslateY(space);
          masBoxRight.getChildren().add(l);

          
         }
          
        space+=20;
        
          }

          }
     
     
     
      public String separate(Label massage){
              
              String Copymassage = "";
              if(massage.getText().length() >30){
              for(int i = 0, c =30; c < massage.getText().length();i+=30,c+=30){
                  while(massage.getText().charAt(c)!= ' '){
                      c+=1;
                  if(c >= massage.getText().length())
                      break;
                  }
              Copymassage = Copymassage+massage.getText().substring(i, c)+"\n";
              }
              
              return Copymassage;
              }
              else 
                  return massage.getText();
          }
      
//      SpecialistController control2 = new SpecialistController();
    
    @FXML
    public void send(KeyEvent k){

        
         if (k.getCode() == KeyCode.ENTER) 
         {
          c1.setMassages(text.getText());
          c1.setSender_id(user.UserId);
           
          if(user.UserId != 777){
          c1.setReciever_id(777);
          /*c1.setNewInquirie(true);*/}
          
         Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         int sId = (Integer) session.save(c1);
         tx.commit();
         session.close();
        

          Label massage = new Label(c1.getMassages());  
          massage.setText(separate(massage));
          massage.setStyle("-fx-background-color: lightgreen;-fx-border-color: darkgreen;");
          massage.setText(separate(massage));
          massage.setTranslateY(space);
          masBox.getChildren().add(massage);
          text.setText("");
          
          
//         control2.insertNewInquirie();
          
       space+=20;
       
        
          
         }}
    
     public void send2(ActionEvent k){

        
    
          c1.setMassages(text.getText());
          c1.setSender_id(user.UserId);
           
          if(user.UserId != 777){
          c1.setReciever_id(777);
         /* c1.setNewInquirie(true);*/}
          
         Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction tx = session.beginTransaction();
         int sId = (Integer) session.save(c1);
         tx.commit();
         session.close();
        

          Label massage = new Label(c1.getMassages());  
          massage.setText(separate(massage));
          massage.setStyle("-fx-background-color: lightgreen;-fx-border-color: darkgreen;");
          massage.setText(separate(massage));
          massage.setTranslateY(space);
          masBox.getChildren().add(massage);
          text.setText("");
          
          
//         control2.insertNewInquirie();
          
       space+=20;
       
        
          
         }
}

