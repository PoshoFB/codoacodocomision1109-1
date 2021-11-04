
package clase.pkg2.java;

public class Ingreso {
    private String usuario,pass;
    private String miUsuario="Fede";
    private String miPass="1234";
    
    public String getUsuario(){
        return this.usuario;
        
    public void setUsuario(String us){
        this.usuario=us;
    }
    public String getPass(){
        return this.pass;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
    public boolean Validar(){
        if(miUsuario.equals(this.usuario)&& miPass.equals(this.pass))
    }
    
    }
}
