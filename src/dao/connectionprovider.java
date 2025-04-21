/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author venne
 */
public class connectionprovider {
    private static final String db_name="pbl";
    private static final String db_url="jdbc:mysql://localhost:3306/";
    private static final String db_username="root";
    private static final String db_password="Aai@1234#";
    
    
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(db_url+"?useSSL=false",db_username,db_password);
            if(!databaseexists(con,db_name)){
                createDatabase(con,db_name);
            }
            con=DriverManager.getConnection(db_url+db_name+"?useSSL=false",db_username,db_password);
            return con;
        }catch(Exception ex){
           ex.printStackTrace();
           return null;
        }
    }
    private static boolean databaseexists(Connection con,String dbname)throws Exception{
        Statement stmt=con.createStatement();
        return stmt.executeQuery("SHOW DATABASES LIKE '"+dbname+"'").next();
        
    }
    private static void createDatabase(Connection con,String dbname)throws Exception{
         Statement stmt=con.createStatement();
         stmt.executeUpdate("CREATE DATABASE "+dbname);
         System.out.println("Database'"+dbname+"'created Successfully.");
    }
}
