public class Trapecio extends Figura {
    private int base1;
    private int base2;
    private int altura;
    private int ladoIZ;
    private int ladoDER;
   
    public Trapecio(String color, int base1, int base2, int altura, int ladoIZ, int ladoDER) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
        this.ladoIZ = ladoIZ;
        this.ladoDER = ladoDER;
    }
    public int getBase1() {
        return base1;
    }
    public void setBase1(int base1) {
        this.base1 = base1;
    }
    public int getBase2() {
        return base2;
    }
    public void setBase2(int base2) {
        this.base2 = base2;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getLadoIZ() {
        return ladoIZ;
    }
    public void setLadoIZ(int ladoIZ) {
        this.ladoIZ = ladoIZ;
    }
    public int getLadoDER() {
        return ladoDER;
    }
    public void setLadoDER(int ladoDER) {
        this.ladoDER = ladoDER;
    }

    @Override
    public double superficie(){
        return (base1+base2)*altura/2;
    }
    public double perimetro(){
        return base1+base2+ladoDER+ladoIZ;
    }
}
