/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Usuario
 */
public class MySql {

    
    public Connection getConnection(String bd) throws ClassNotFoundException, SQLException{
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost/registro";
        Class.forName(myDriver);
        Connection conn =DriverManager.getConnection(myUrl, "root", "1912369");
        return conn;
    }
}
