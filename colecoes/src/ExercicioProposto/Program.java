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

        Temperaturas graus = new Temperaturas();
        List<Integer> temperaturas = new ArrayList<>();


        while (temperaturas.size() < 6){
            temperaturas.add(scan.nextInt());
        }

        System.out.println();


    }
}
