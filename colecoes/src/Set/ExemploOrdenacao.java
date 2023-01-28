package Set;

/*
Dadas as segutintes informações sobre minhas series favoritas,
crie um conjunto e ordene este conjunto exibindo:
        (nome - genero - tempo de episodio);

SERIE 1 = Nome: Got, genero: Fantasia, tempoEpisodio: 60
SERIE 2 = Nome: Dark, genero: Drama, tempoEpisodio: 60
SERIE 3 = Nome: That '70s show, genero: Comédia, tempoEpisodio: 25
*/

import java.util.*;

public class ExemploOrdenacao {

    public static void main(String[] args) {
        System.out.println("---\tOrdem Aleatoria\t---");
        Set<Serie> minhasSeries = new HashSet<>(){{
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        }


        System.out.println("---\tOrdem Inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        System.out.println("---\tOrdem Natural(tempoEpisodio)\t---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        System.out.println("---\tOrdem Nome/Genero/tempoEpisodio\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparaNomeGeneroTempoEpisodio());
        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        System.out.println("---\tOrdem Genero\t---");


        System.out.println("---\tOrdem Tempo de Episodio\t---");


    }
}

class Serie implements Comparable<Serie>{
    private String nome;

    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());

    }
}

class ComparaNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
    }
}
