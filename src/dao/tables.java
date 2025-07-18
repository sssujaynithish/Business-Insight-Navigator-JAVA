/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sssujaynithish
 */
public class tables {
    public static void main(String args[]){
        Connection con = null;
        Statement st = null;
        try{
            con = connectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobileNumber varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50))");
            st.executeUpdate("insert into appuser(userRole,name,mobileNumber,email,password,address,status) values('SuperAdmin','Super Admin','123456','superadmin@gmail.com','admin','India','Active')");
            st.executeUpdate("create table products(s_no int AUTO_INCREMENT primary key,name varchar(200),buyPrice varchar(50), no_of_items varchar(50),mrp varchar(50),expireyDate varchar(50),profit varchar(200))");
            JOptionPane.showMessageDialog(null,"Table created successfull");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){
                
            }
        }
        
    }
    
}
