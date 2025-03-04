/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author gugul
 */
public class Tables {
    public static void main(String[] args) {
        try{
            Connection con = Connector.getCon();
            Statement st = con.createStatement();
//            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200), dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(200),address varchar(200))");
            st.executeUpdate("insert into appuser (userRole, name, dob, mobileNumber, email, username, password, address) values('Admin','Admin','24-04-2004','9000090000','admin@admin.com','admin','admin','India')");
            JOptionPane.showMessageDialog(null, "Table created Successfully");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
} 
