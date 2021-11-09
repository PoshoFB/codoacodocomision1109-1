
package tp_java;

import java.util.Scanner;

public class TP_Java {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       Scanner usuario = new Scanner(System.in);
       
       System.out.println("Ingrese su nombre: ");
       String nombre = usuario.nextLine();
       System.out.println("Ingrese su apellido: ");
       String apellido = usuario.nextLine();
       System.out.println("Ingrese su edad: ");
       String edad = usuario.nextLine();  
       System.out.println("Cual es su hobbie favorito?");
       String hobbie_favorito = usuario.nextLine();
       System.out.println("Cual es su editor de codigo preferido?");
       String codigo_preferido = usuario.nextLine();
       
       System.out.println("Que sistema operativo utiliza?");
       String sistema_operativo = usuario.nextLine();
       
       System.out.println("Bienvenido "+nombre +" " +apellido +"\n" 
               +"Usted tiene "+edad+" años"
               +", su hobby favorito es "+hobbie_favorito
               +", su editor de codigo preferido es "+codigo_preferido
               +" y el sistema operativo que utiliza es "+sistema_operativo);
    }
}
