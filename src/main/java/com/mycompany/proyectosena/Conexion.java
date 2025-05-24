/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosena;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author TicketEase
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/crud_java";
    private static final String USER = "root";
    private static final String PASW = "Sena2024*";
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASW);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error enla conexion: " + e.getMessage());
            return null;
        }
    }
}
