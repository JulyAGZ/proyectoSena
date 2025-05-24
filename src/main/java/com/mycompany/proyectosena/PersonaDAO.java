/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosena;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author itm
 */
public class PersonaDAO {
    
    public void agregarPersona(Persona persona){
        String sql = "INSERT INTO persona(nombre,EDAD,correo) VALUES(?,?,?)";
        try(Connection conn = Conexion.getConnection();PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,persona.getNombre());
            stmt.setInt(2,persona.getEdad());
            stmt.setString(3,persona.getCorreo());
            
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    
    
    }
    
    public List<Persona> listarPersonas(){
        List<Persona> lista = new ArrayList<>();
        String sql = "SELECT * FROM persona";
        
        try(Connection conn = Conexion.getConnection();Statement stmt = conn.createStatement();ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                Persona p = new Persona(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("EDAD"),
                        rs.getString("correo")
                );
                
                lista.add(p);
            }
        
        }catch(Exception e){
        
        }finally{
        
        }
        
        return lista;
    }
    
    public void actualizarPersona(Persona persona){
        String sql = "UPDATE persona SET nombre = ?,edad = ?,correo = ? WHERE id = ?";
        try(Connection conn = Conexion.getConnection();PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,persona.getNombre());
            stmt.setInt(2,persona.getEdad());
            stmt.setString(3,persona.getCorreo());
            stmt.setInt(4, persona.getId());
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
        public void eliminarPersona(int id){
        String sql = "DELETE FROM persona WHERE id = ?";
        try(Connection conn = Conexion.getConnection();PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
