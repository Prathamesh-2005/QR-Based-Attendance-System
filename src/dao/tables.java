/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author venne
 */
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
public class tables {
    public static void main(String[] args){
        Connection con=null;
        Statement st=null;
        try{
           con=connectionprovider.getcon();
           st=con.createStatement();
           if(!tableexists(st,"userdetails")){
               st.executeUpdate("CREATE TABLE userdetails(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255) not null, gender VARCHAR(50) not null, email VARCHAR(255) not null, contact VARCHAR(20) not null, address VARCHAR(500), state VARCHAR(100), country VARCHAR(100), uniqueregid VARCHAR(100) not null, imagename VARCHAR(100));");
           }
           if(!tableexists(st,"userattendance")){
               st.executeUpdate("CREATE TABLE userattendance (userid INT NOT NULL, date DATE NOT NULL, checkin DATETIME, checkout DATETIME, workduration VARCHAR(100));");
           }
           JOptionPane.showMessageDialog(null, "Tables Checked/Created Successfully");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
         try{
             if(con!=null){
                 con.close();
             }
             if(st!=null){
                 st.close();
             }
         }catch(Exception ex){
             ex.printStackTrace();
         }
        }
    }
    private static boolean tableexists(Statement st,String tablename)throws Exception{
        ResultSet resultset=st.executeQuery("SHOW TABLES LIKE'"+tablename+"'");
        return resultset.next();
    }

    
}
