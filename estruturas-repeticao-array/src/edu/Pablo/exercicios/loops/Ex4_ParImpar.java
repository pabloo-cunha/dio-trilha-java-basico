package edu.Pablo.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que peça N numeros inteiros,
calcule e mostre a quantidade de numeros pares
e a quantidade de numeros impares.
* */
public class Ex4_ParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int QuantNumeros;
        int numero;
        int QuantPares = 0;
        int QuantImpares = 0;
        int count = 0;

        System.out.println("Quantos numeros você quer verifica? ");
        QuantNumeros = scan.nextInt();

        do {
            System.out.println("Insira um numero: ");
            numero = scan.nextInt();
            count ++;

            if (numero % 2 == 0) QuantPares++;
            else QuantImpares ++;

        } while (count < QuantNumeros);

        System.out.println("Numeros digitados pares: " + QuantPares);
        System.out.println("Numeros digitados impares : " + QuantImpares);

    }
}
