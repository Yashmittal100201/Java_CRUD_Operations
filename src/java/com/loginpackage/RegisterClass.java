/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.loginpackage;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class RegisterClass extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            
//            
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet RegisterClass</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet RegisterClass at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
    
    private String message;

    public void init() {
        message = "Hello World";
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        //res.setContentType("text/html");
        //PrintWriter out = res.getWriter();
//        out.println("<HTML>" + message + "</HTML>");
        //out.println("<html><body>");  
        //out.println("<h1>" + message + "</h1>");
        
        String s1 = req.getParameter("userName");
        String s2 = req.getParameter("Password");
//        int n1 = Integer.parseInt(s1);
//        int n2 = Integer.parseInt(s2);
//        int sum = n1 + n2;
        
        
        
        //out.printf("Sum of the %d & %d is: ",n1,n2);
       // out.println(sum);
       JdbcClass obj = new JdbcClass();
        
        //    Query  variable
        String q = "INSERT INTO Login(name, Passowd) VALUES(?,?)"; 
        String str = obj.JdbcMethod(s1,s2,q);
        
        
        RequestDispatcher dis;
        dis = req.getRequestDispatcher("index.html");
        dis.forward(req,res);
        
        //out.println("<h1> Welcome to servlet</h1>");  
        //out.println("</body></html>"); 
    }

    public void destroy() {
    }


}
