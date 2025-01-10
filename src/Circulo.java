public class Circulo extends Figura {
    private int radio;

    public Circulo(String color, int radio) {
        super(color); 
        this.radio = radio;
    }
    public Circulo() {
        super(); 
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double superficie() {
        return Math.PI * radio * radio; 
    }
    public double perimetro(){
        return Math.PI * radio * 2;
    }
}
