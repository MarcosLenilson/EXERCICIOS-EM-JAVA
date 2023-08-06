package Lista_Exercicios_W3resource;

public class Wexercicio_11 {

    private static final double radius = 7.5; //@ Declaração de constante 

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius; // @ comprimento do circulo
        double area = Math.PI * radius * radius; // @ Area do circulo

        System.out.println("Perimetro é = " + perimeter);
        System.out.println("Area é = " + area);
    }
}
