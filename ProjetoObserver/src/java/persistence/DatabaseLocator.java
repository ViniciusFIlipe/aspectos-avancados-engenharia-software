/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ice
 */
public class DatabaseLocator {

    private static DatabaseLocator instance = new DatabaseLocator();

    public static DatabaseLocator getInstance() {
        return instance;
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) 
        DriverManager.getConnection("jdbc:mysql://localhost:3306/ufjf", "root", "admin");
        //DriverManager.getConnection("jdbc:mysql://172.18.10.31/06655746655", "06655746655", "Lacerda01#");
        
        return conn;
    }

    private DatabaseLocator() {
    }

}
