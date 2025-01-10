public class Rectangulo extends Figura {
    private int base;
    private int altura;

    public Rectangulo(String color, int base, int altura){
        super(color);
        this.base=base;
        this.altura=altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public double superficie(){
        return base*altura;
    }
    public double perimetro(){
        return 2*(base+altura);
    }
}
