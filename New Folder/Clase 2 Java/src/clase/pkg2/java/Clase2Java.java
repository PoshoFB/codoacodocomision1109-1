package clase.pkg2.java;

import java.util.Scanner;

public class Clase2Java {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese su nombre de usuario: ");
       String nombre = scanner.nextLine();
       System.out.println("Ingrese su  contraseña: ");
       String pass = scanner.nextLine();
       
       if(!"Fede".equals(nombre)){
           System.out.println("El usuario es incorrecto");
       } else{
           System.out.println("Bienvenido " + nombre);
           
       }
        
       

    }
    
}
