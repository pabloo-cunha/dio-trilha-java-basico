package edu.Pablo.exercicios.loops;

import java.util.Scanner;

/*Faça um programa que lia 5 numeros
* e informe o maior numero
* e a media desses numeros.*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Insira um numero: ");
            numero = scan.nextInt();
            count ++;
            soma += numero;

            if (numero > maior) maior = numero;
        } while (count < 5);

        System.out.println("Maior numero é: " + maior);
        System.out.println("Media é: " + (soma / count));
    }
}
