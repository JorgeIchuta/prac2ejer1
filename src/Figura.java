public abstract class Figura {
    private String color;
    public Figura(String color){
        this.color=color;
    }
    public Figura(){
        this.color="";
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double superficie();
    public abstract double perimetro();
}
