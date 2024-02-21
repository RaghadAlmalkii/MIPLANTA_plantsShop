

package ap_project22;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author 123es
 */
public class AP_Projecr01 extends Application {
    
   @Override
    public void start(Stage stage) throws Exception {
      
//       Parent root = FXMLLoader.load(new URL("file:/C:/Users/123es/OneDrive/المستندات/NetBeansProjects/AP_Projecr01/src/ap_projecr01/Chat.fxml"));
//        Scene scene = new Scene(root,700,600);
//        stage.setScene(scene);
//        stage.show();
    
       Open openPage = new Open();
            openPage.start(stage);
            stage.show();

    }

    public static void main(String[] args) {
        
        launch(args);
    }
    
}
