package edu.Pablo.exercicios.loops;

import java.util.Scanner;

/*
* Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario.
* Ex.: 5! = 120
* */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um fatorial para calcular: ");
        int fatorial = scan.nextInt();

        int resultado = 1;

        for (int i = fatorial; i > 1;i--) {
            resultado *= i;
        }

        System.out.println(fatorial + "! = " + resultado);


    }
}
