package edu.Pablo.exercicios.loops;

//Faça um programa que peça uma nota, entre zero e dez.
//Mostre uma mensagem caso o valor seja inválido
//e continue pedindo
//até o usuario informe um valor valido

import java.util.Scanner;

public class Ex2_Notas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota invalida!");
            nota = scan.nextInt();
        }

    }
}
