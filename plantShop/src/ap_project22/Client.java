/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 123es
 */

 
@Entity
@Table(name="CLIENT")
public class Client  implements java.io.Serializable {

     @Id
     @Column(name="Client_id")
     private int id;
     @Column(name="User_Name")
     private String User_Name;
      @Column(name="F_Name")
     private String F_Name;
       @Column(name="L_Name")
     private String L_Name;
     @Column(name="client_password")
     private String client_password;
     @Column(name="Email")
     private String Email;

     
    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getUser_Name() {
        return User_Name;
    }
    
    public void setF_Name(String F_Name) {
        this.F_Name = F_Name;
    }

    public void setL_Name(String L_Name) {
        this.L_Name = L_Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getF_Name() {
        return F_Name;
    }

    public String getL_Name() {
        return L_Name;
    }

    public String getEmail() {
        return Email;
    }
    



    public void setClient_password(String client_password) {
        this.client_password = client_password;
    }

    public String getClient_password() {
        return client_password;
    }
    
     
    public Client() {
    }


   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


   
  


}


