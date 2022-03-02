/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loginpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class JdbcClass {
    String JdbcMethod(String Name,String Password1,String Query)
    {
        System.out.println("Hello ");
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "Yash Mittal";
        String password = "Y@shMitt@l30";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");                     // To load the driver
            System.out.println("Driver Successfully loaded.");

            Connection con = DriverManager.getConnection(url,user,password);      // To establishing the connection with database


            System.out.println("Connection successfully established.");
            
//           Create a statement...

            String q;
//            q = "create table Login1(name varchar(20),Password int(20))";
//            @FirstName = 'Kris';

            q = "INSERT INTO Login(name, Passowd) VALUES(?,?)";
  
            PreparedStatement stm1 = con.prepareStatement(q);
            stm1.setString(1,Name);
            stm1.setString(2,Password1);
            stm1.executeUpdate();
            System.out.println("table is created.");


            //  After Done all work close the connection
            con.close();

        } catch (ClassNotFoundException e) {                                     // To handle    ClassNotFoundException
            System.out.println("Drivers Not loaded.");
        }
        catch (SQLException e) {                                                 // To handle    SQLException
            System.out.println("Connection not established."+e);

        }
        return "Yes";
    }
    
    String JdbcMethodLogin(String Name,String Password1,String Query)
    {
        System.out.println("Hello ");
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "Yash Mittal";
        String password = "Y@shMitt@l30";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");                     // To load the driver
            System.out.println("Driver Successfully loaded.");

            Connection con = DriverManager.getConnection(url,user,password);      // To establishing the connection with database


            System.out.println("Connection successfully established.");
            
//           Create a statement...

//            String q;
//            q = "create table Login1(name varchar(20),Password int(20))";
//            @FirstName = 'Kris';

//            q = "INSERT INTO Login(name, Passowd) VALUES(?,?)";
  
            PreparedStatement stm1 = con.prepareStatement(Query);
//            stm1.setString(1,Name);
//            stm1.setString(2,Password1);
            ResultSet rs = stm1.executeQuery();
            
            while (rs.next()) {
 
                String name = rs.getString("name");
//                String name = rs.getString("name");
                String email = rs.getString("Passowd");
                System.out.println("\t\t" + name
                                   + "\t\t" + email);
            }
            System.out.println("table is created.");


            //  After Done all work close the connection
            con.close();

        } catch (ClassNotFoundException e) {                                     // To handle    ClassNotFoundException
            System.out.println("Drivers Not loaded.");
        }
        catch (SQLException e) {                                                 // To handle    SQLException
            System.out.println("Connection not established."+e);

        }
        return "Yes";
    }
    
    
}
