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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author 123es
 */
public class ProfileController extends Controller implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent parent;
    int space;
    
     @FXML
    private VBox Favorites = new VBox();
     
     public VBox getFavorites() {
        return Favorites;
    }
     @Override
    public void initialize(URL location, ResourceBundle resources) {

}
    
public void showFavorites (ActionEvent e){
    
//Session session1 = HibernateUtil.getSessionFactory().openSession();
//      List<Client> sList = null;
//      String queryStr = "from Client where client_id = 444";
//      Query query = session1.createQuery(queryStr);
//      sList = query.list();
//      session1.close();
//
//      for(Client s: sList){
//
//      Favorites.getChildren().add(new ImageView(new Image(s.getFavorites())));
//      Favorites.setMargin(new ImageView(new Image(s.getFavorites())),new Insets(0, 0, 10, 0));
//
//
//}
//}
}}