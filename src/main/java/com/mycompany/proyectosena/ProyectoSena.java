/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectosena;

import java.util.Scanner;
import java.util.List;

/**
 *
 * @author EasyTicket
 */
public class ProyectoSena {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        PersonaDAO dao = new PersonaDAO();
        
        //Agregamos una persona
        Persona p1 = new Persona("Carlos Perez",25,"carlos@nn.nn");
        //dao.agregarPersona(p1);
        
        dao.eliminarPersona(5);
        
        //Consultar Personas        
        List<Persona> personas = dao.listarPersonas();
        for (Persona p : personas){
            System.out.println(p.getId()+"-"+p.getNombre()+"-"+p.getEdad()+"-"+p.getCorreo());
        }
        
        //Actualizar Persona  
        //if(!personas.isEmpty()){
        //    Persona ultimo = personas.get(2);
        //    ultimo.setNombre("Jose Perez");
        //    ultimo.setEdad(40);
        //    ultimo.setId(3);
            
        //    dao.actualizarPersona(ultimo);
        //}
        
        /**
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        
        int suma = a+b;
        
        try{
            int division = a/b;
            System.out.println("La operacion es: " + division);
        }catch(ArithmeticException e){
            System.out.println("Las operaciones entre 0 no se pueden realizar");
        }
        
        
        if(a == b){ System.out.println("Lon numeros a y b son iguales");
            
        }else{
            System.out.println("Lon numeros a y b no son iguales");
        }
        
        
        
        for (int i =1;i<=10;i++){
            System.out.println("Numero: " + i);
        }
        
        System.out.print("Ingrese un nuevo numero: ");
        int numero = sc.nextInt();
        
        if(numero%2 == 0){
            System.out.print("El numero es par: ");
        }else{System.out.print("El numero es impar: ");
        }
        
        System.out.print("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();
        double area = calcularArea(radio);
        System.out.print("Area del circulo es: " + area);
    }
    
    public static double calcularArea(double radio){
        return Math.PI*radio*radio;}
    */
        
        
        
        
    }
    
}
