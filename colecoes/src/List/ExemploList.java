package List;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {


        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 7.0");
        notas.set(notas.indexOf(5d), 6.0);

        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

//        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
////        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));



        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }


        Double somatoria = 0d;
        for (Double nota:notas) somatoria+=nota;
        System.out.println("Exiba a soma dos valores: " + somatoria);
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a media das notas: " + (soma/notas.size()));
        System.out.println("remova a nota 0.0");
        notas.remove(notas.indexOf(0d));

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println("Remova as notas menores que 7.0 e exiba a lista");

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            if (iterator1.next() < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());




//        ArrayList<Double> notas = new ArrayList<>();

//        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas.add(10d);
//        System.out.println("notas"); #Não posso adicionar ou remover!! Error

//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//            notas.add(1d);
//            notas.remove(5d);
//        System.out.println(notas); #Não posso adicionar ou remover!! Error
    }
}
