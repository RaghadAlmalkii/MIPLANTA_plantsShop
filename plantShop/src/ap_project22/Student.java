/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project22;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

 
@Entity
@Table(name="product")
public class Student  implements java.io.Serializable {

     @Id
     @Column(name="product_id")
     private int productID;
     @Column(name="name")
     private String Name;
     @Column(name="discription")
     private String Discription;
      @Column(name="price")
     private int Price;
      @Column(name="pic")
     private String Pic;

    public Student() {
    }


    public Student(String Name, String Discription, int Price) {
       
       this.Name = Name;
       this.Discription = Discription;
       this.Price = Price;
    }
   
    public int getProductID() {
        return this.productID;
    }
    
    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String Discription) {
        this.Discription = Discription;
    }
    
    
     public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    
      public String getPic() {
        return Pic;
    }

    public void setPic(String Pic) {
        this.Pic = Pic;
    }
    
    
   



}

