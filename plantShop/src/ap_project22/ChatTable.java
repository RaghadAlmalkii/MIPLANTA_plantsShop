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

 
@Entity
@Table(name="CHAT")
public class ChatTable  implements java.io.Serializable {

     @Id
     @Column(name="message_id")
     private int message_id;
     
     @Column(name="Massages")
     private String Massages;
     
     @Column(name="sender_id")
     private int sender_id;
     
     @Column(name="reciever_id")
     private int reciever_id;
// 
//      @Column(name="newInquirie")
//     private boolean newInquirie;
//
//    public void setNewInquirie(boolean newInquirie) {
//        this.newInquirie = newInquirie;
//    }
//
//    public boolean getNewInquirie() {
//        return newInquirie;
//    }
     
    public ChatTable() {
    }

    public int getMessage_id() {
        return message_id;
    }

    public String getMassages() {
        return Massages;
    }

    public int getSender_id() {
        return sender_id;
    }

    public int getReciever_id() {
        return reciever_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public void setMassages(String Massages) {
        this.Massages = Massages;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public void setReciever_id(int reciever_id) {
        this.reciever_id = reciever_id;
    }
     
     

}