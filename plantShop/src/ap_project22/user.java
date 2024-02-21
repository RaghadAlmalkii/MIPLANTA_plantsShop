package ap_project22;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;

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
@Table(name="User")
public class user  implements java.io.Serializable {

     @Id
     @Column(name="user_id")
     private int user_id;

     public static int UserId;
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
     


   
  public void currentUser(int id){
             user u = new user();
             u.setUser_id(id);
             Session session3 = HibernateUtil.getSessionFactory().openSession();
             session3.beginTransaction();
             int sId = (Integer) session3.save(u);
             session3.getTransaction().commit();
             session3.close();
           UserId= u.getUser_id();
  }


}


