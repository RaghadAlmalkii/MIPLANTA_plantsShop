package ap_project22;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="Customers_service")
public class Customers_service  implements java.io.Serializable {

     @Id
     @Column(name="Customers_service _id")
     private int Customers_service_id;
     @Column(name="Customers_service _password")
     private String Customers_service_password;

    public int getCustomers_service_id() {
        return Customers_service_id;
    }

    public String getCustomers_service_password() {
        return Customers_service_password;
    }

    public void setCustomers_service_id(int Customers_service_id) {
        this.Customers_service_id = Customers_service_id;
    }

    public void setCustomers_service_password(String Customers_service_password) {
        this.Customers_service_password = Customers_service_password;
    }
    
   


}