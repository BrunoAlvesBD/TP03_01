public class Principal {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(5.0,10.0);
        ret1.setBase(9.0);
        ret1.setAltura(10.0);
        System.out.println("Retangulo 1: "+ret1);

        System.out.println();

        Retangulo ret2 = new Retangulo(15.0,20.0);
        System.out.println("Retangulo 2: "+ret2);
    }
}
