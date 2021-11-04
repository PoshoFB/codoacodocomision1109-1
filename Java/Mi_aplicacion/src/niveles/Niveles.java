package niveles;
public class Niveles {
    private String dificultad;

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    public String experiencia;
    public String checkPoint;
    public Niveles(String dificultad,String experiencia,String checkPoint){
        this.experiencia=experiencia;
        this.checkPoint=checkPoint;
    }
    public String reiniciar(){
        return "Estamos en el nivel: " + this.checkPoint;
    }
    
    
}
