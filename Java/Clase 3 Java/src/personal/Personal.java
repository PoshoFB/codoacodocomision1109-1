
package personal;

public class Personal {
    public String nombre, apellido, email;
    public int edad;
    private double sueldo;
    
    public double getSueldo(){ //metodo de clase
        return sueldo; //agregando .this a sueldo funciona igual
    }
    public void setSueldo(double nuevoSueldo){ //metodo de clase
        this.sueldo=nuevoSueldo;
    }
    public Personal(String nombre,String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }  
}
