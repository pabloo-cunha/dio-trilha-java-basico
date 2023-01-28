package Set;

import java.util.*;

public class ExercicioProposto {

    public static void main(String[] args) {
        Set<Cores> arcoIris = new LinkedHashSet<>(){{
            add(new Cores("vermelho"));
            add(new Cores("laranja"));
            add(new Cores("amarelo"));
            add(new Cores("verde"));
            add(new Cores("azul"));
            add(new Cores("azul-escuro"));
            add(new Cores("violeta"));

        }};
        System.out.println("--\tExiba todas as cores uma abaixo da outra\t--");
        for (Cores cores: arcoIris){
            System.out.println(cores.getCores());
        }
//
        System.out.println("--\tA quantidade de cores que o arco-íris tem\t--");
        System.out.println(arcoIris.size());

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> arcoIris2 = new LinkedHashSet<>(
                Arrays.asList("violeta", "azul-escuro", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(arcoIris2);
        List<String> coresArcoIrisList = new ArrayList<>(arcoIris2);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);




        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: arcoIris2) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = arcoIris2.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(arcoIris2);

        System.out.println(arcoIris2);

        System.out.println("Limpe o conjunto: ");
        arcoIris2.clear();

        System.out.println("Confira se o conjunto está vazio: " + arcoIris2.isEmpty());
    }

}

class Cores {

    private String cores;

    public Cores(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return "cores: '" + cores + '\'' +
                '}';
    }
}

class OrdemInversa implements Comparator<Cores>{

    @Override
    public int compare(Cores c1, Cores c2) {
        return 0;
    }
}
