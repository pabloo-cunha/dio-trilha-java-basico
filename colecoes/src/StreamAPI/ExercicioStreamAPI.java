package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5", "0");

//        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.forEach(System.out::println);

//        System.out.println("Pegue os 5 ultimos primeiros e coloque dentro de um Set: ");
//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros.");
//        List<Integer> numeroAleatorio1 = numerosAleatorios.stream()
//                .map(Integer::parseInt).toList();
//        numeroAleatorio1.forEach(System.out::println);
//        List<Integer> integers = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .toList();
//        integers
//                .forEach(System.out::println);

//        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
//
//        List<Integer> paresMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2).toList();
//        System.out.println(paresMaioresQue2);

        System.out.println("Mostre a media dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("Remova os numeros impares: ");
        List<Integer> numerosAleatoriosInteger = new java.util.ArrayList<>(numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList());
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);
    }


}


