public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {

    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //--------------------------------
    public Double RetornarArea(){
        return base * altura;
    }
    public Double RetornarPerimetro(){
        return (base + altura)*2;
    }

    //----------------------------------
    @Override
    public String toString() {
        return "Retangulo [base= " + base + ", altura= " + altura +" area= "
                + RetornarArea()+ " perimetro= "+RetornarPerimetro()+"]";
    }

}
