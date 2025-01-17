public class Triangulo extends Figura {
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;
    
    public Triangulo(String color, int base, int altura, int ladoA, int ladoB, int ladoC) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
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
    public int getLadoA() {
        return ladoA;
    }
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    public int getLadoB() {
        return ladoB;
    }
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    public int getLadoC() {
        return ladoC;
    }
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double superficie(){
        return base*altura/2;
    }
    public double perimetro(){
        return ladoA+ladoB+ladoC;
    }
}
