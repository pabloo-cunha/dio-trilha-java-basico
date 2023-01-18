import java.util.Scanner;

public class Metodos {

    public static void operacoes(){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(somarNumeros(num1, num2));

    }

    public static int somarNumeros(int num1, int num2){

        System.out.println("Quais numeros deseja somar?");
        return num1 + num2;


    }
}