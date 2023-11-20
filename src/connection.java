/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author LENOVO
 */
public class connection {

    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException {
        String db = "jdbc:mysql://localhost:3306/quiz";
        String user = "root";
        String pass = "";
        
        if (koneksi == null) {
            koneksi = DriverManager.getConnection(db, user, pass);
        }
        
       
        return koneksi;
    }

}