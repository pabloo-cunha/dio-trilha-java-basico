package edu.Pablo.exercicios.array;

/*
* Crie um vetor de 6 numeros inteiros
* e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {0, 5, 7, 9, -10, 6};
        int count = 0;

        System.out.print("Vetor: ");
        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count ++;
        }

        System.out.print("\nVetor inverso: ");
        for (int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
