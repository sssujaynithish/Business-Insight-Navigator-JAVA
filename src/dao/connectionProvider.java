/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sssujaynithish
 */
public class connectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false","root","123456");
            return con;
        }
        catch(Exception e){
            System.out.println(e); 
            return null;
        }
        
    }
    
}
