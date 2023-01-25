/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
        (nome - idade - cor)

Gato 1 - nome: Jon, idade: 18, cor: preto
Gato 2 - nome: Simba, idade: 6, cor: tigrado
Gato 2 - nome: Jon, idade: 12, cor: amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};


        System.out.println("--\tOrdem de Inserçao\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatoria\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);


//        System.out.println("--\tOrdem Natural\t--");


//        System.out.println("--\tOrdem Idade\t--");

    }

}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {

        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public int compareTo(Gato o) {
        return 0;
    }
}