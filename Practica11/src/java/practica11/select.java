/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package practica11;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Conexion.MySql;
import java.sql.ResultSet;
/**
 *
 * @author Usuario
 */
@WebServlet(name = "Select", urlPatterns = {"/Select"})
public class select extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet select</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet select at " + request.getContextPath() + "</h1>");
            try
                {
                  // create a mysql database connection
                  MySql db=new MySql();
                try (Connection conn=db.getConnection("registro")) {
                      Statement st = conn.createStatement();
                    
                    String qry = "SELECT * FROM users"; 

                    
                    System.out.println(qry); 

                     

                    // note that i'm leaving "date_created" out of this insert statement 

                    ResultSet rs= st.executeQuery(qry);
                    while(rs.next()){
                        int id=rs.getInt("id");
                        String firstName=rs.getString("first_name");
                        String lastName=rs.getString("last_name");
                        
                         out.println("<h1>" + "<a href="+"\"delete\""+">"+ id + "</a>" + " - " + firstName + " - " +  lastName + "</h1>");
                      System.out.format("%s, %s, %s\n", id, firstName, lastName);
                    }
                }
                }
                catch (ClassNotFoundException | SQLException e)
                {
                  System.err.println("Got an exception!");
                  System.err.println(e.getMessage());
                }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}