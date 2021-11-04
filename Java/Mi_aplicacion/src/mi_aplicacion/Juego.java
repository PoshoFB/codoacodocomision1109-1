package mi_aplicacion;

public class Juego {
    public int puntos,vidas; /*declaracion de las propiedades*/
    public String personajes,enemigos,armas;
    Juego(int puntos,int vidas, String armas, String personajes, String enemigos){
        this.puntos=puntos;
        this.vidas=vidas;
        this.armas=armas;
        this.personajes=personajes;
        this.enemigos=enemigos;
    }
    public String mostrar_vidas(){
        return "Soy " + this.personajes +" Tengo "+ this.vidas + " Vidas");
    }
    
}
