public class App {
    public static void main(String[] args) throws Exception {
        Figura figu1 = new Circulo("amarillo", 5);
        System.out.println("Area del círculo: "+figu1.superficie());
        System.out.println("El perimetro del Circulo: "+figu1.perimetro());
        System.out.println("---------------------------------------------------------");
        Figura figu2 = new Rectangulo("verde", 6, 5);
        System.out.println("Area del rectangulo: "+figu2.superficie());
        System.out.println("El perimetro del rectangulo: "+figu2.perimetro());
        System.out.println("---------------------------------------------------------");
        Figura figu3 = new Trapecio("rojo", 4, 10, 4, 7,5);
        System.out.println("Area del Trapecio: "+figu3.superficie());
        System.out.println("El perimetro del Trapecio: "+figu3.perimetro());
        System.out.println("---------------------------------------------------------");
        Figura figu4 = new Triangulo("cafe", 4, 9, 8, 8, 5);
        System.out.println("Area del Triangulo: "+figu4.superficie());
        System.out.println("El perimetro del Triangulo: "+figu4.perimetro());
    }
}
