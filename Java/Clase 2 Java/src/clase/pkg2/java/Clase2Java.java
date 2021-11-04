package clase.pkg2.java;

import java.util.Scanner;

public class Clase2Java {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese su nombre de usuario: ");
       String nombre = scanner.nextLine();
       System.out.println("Ingrese su  contraseña: ");
       String pass = scanner.nextLine();
       Ingreso ing = new Ingreso();
       ing.setUsuario(nombre);
       ing.setPass(pass);
        System.out.println();
       if(!"Fede".equals(nombre)){
           System.out.println("El usuario es incorrecto");
       } else{
           System.out.println("Bienvenido " + nombre);   
       }
        
    }
    
}
