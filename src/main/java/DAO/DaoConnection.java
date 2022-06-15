/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GuilhermeFCM
 */
public class DaoConnection {

    private final String url = "jdbc:postegresql://localhost:Class-Activities";
    private final String user = "root";
    private final String password = "root";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postegresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DaoConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
