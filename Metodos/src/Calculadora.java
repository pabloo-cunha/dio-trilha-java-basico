import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        double num3;
        double num4;
        double resultado = 0;

        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.print("Digite a Opção: ");
        int operacao = scan.nextInt();

        if (operacao == 1){
            System.out.print("primeiro numero: ");
            num1 = scan.nextInt();
            System.out.print("segundo numero: ");
            num2 = scan.nextInt();

            resultado = soma(num1,num2);
        }
        if (operacao == 2){
            System.out.print("primeiro numero: ");
            num1 = scan.nextInt();
            System.out.print("segundo numero: ");
            num2 = scan.nextInt();

            resultado = subtracao(num1,num2);
        }

        if (operacao == 3){
            System.out.print("primeiro numero: ");
            num1 = scan.nextInt();
            System.out.print("segundo numero: ");
            num2 = scan.nextInt();

            resultado = multiplicacao(num1,num2);
        }
        if (operacao == 4){
            System.out.print("primeiro numero: ");
            num3 = scan.nextDouble();
            System.out.print("segundo numero: ");
            num4 = scan.nextDouble();

            resultado = divisao(num3,num4);
        }
        else
            System.out.println("Opção invalida!");

        System.out.printf("Resultado: %.2f", resultado);

    }

    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicacao(int num1, int num2){
        return num1 * num2;
    }

    public static double divisao(double num3, double num4){
        return num3 / num4;
    }
}
