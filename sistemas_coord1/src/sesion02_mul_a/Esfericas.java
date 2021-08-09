package sesion02_mul_a;


public class Esfericas {
    private float radio, anguloT, anguloP;

    public Esfericas(float radio, float anguloT, float anguloP) {
        this.radio = radio;
        this.anguloT = anguloT;
        this.anguloP = anguloP;
    }
    
    public Esfericas(){
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAnguloT() {
        return anguloT;
    }

    public void setAnguloT(float anguloT) {
        this.anguloT = anguloT;
    }

    public float getAnguloP() {
        return anguloP;
    }

    public void setAnguloP(float anguloP) {
        this.anguloP = anguloP;
    }
}
