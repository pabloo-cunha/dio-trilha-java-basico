package Sobrecarga;

public class Main {
    public static void main(String[] args) {

        //quadrilateros

        System.out.println("Exercicio Quadrilateros");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,2);
        System.out.println("Area do Retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,3,9);
        System.out.println("Area do Trapezio: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(3f,2f);
        System.out.println("Area do Losango: " + areaLosango);

    }


}
