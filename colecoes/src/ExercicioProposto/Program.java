package ExercicioProposto;

/*Faça um programa que receba a temperatura media dos 6 primeiros meses do ano
e armazene-as numa lista.
Após isto, calcule a média semestral das temperaturas e mostre todas
as temperaturas acima desta média, e em que mês elas
ocorreram (mostrar o mês por extenso: 1 - Janeiro...)

*/


import java.util.*;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Temperaturas temp = new Temperaturas();
        List<Integer> graus = new ArrayList<>();

        while (graus.size() < 6) {

            System.out.print("Temperatura: ");
            graus.add(scan.nextInt());
        }

        int somar = 0;
        for (int i = 0; i < graus.size(); i++) {

            somar += graus.get(i);
            temp.grausCelcius = somar;
        }

        System.out.println("media: " + temp.calcularMediaSemestral());
        for (int i = 0; i < graus.size(); i++) {

            if (graus.get(i) > temp.calcularMediaSemestral()) {

                System.out.println("Mês: " + temp.mes.get(i) + ", Temperatura: " + graus.get(i));
            }
        }



    }
}