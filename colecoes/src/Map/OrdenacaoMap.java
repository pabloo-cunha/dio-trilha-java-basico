package Map;

import java.util.*;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionario e ordene este dicionario:
exibindo(Nome Autor - Nome Livro)

Autor = Hawking, Stephen - livro = nome: Uma breve história do tempo. páginas: 256
Autor = Duhigg, Charles - livro = nome: O poder do hábito. páginas: 408
Autor = Harari, Yuval Noah - livro = nome:21 Lições para o século 21. páginas: 432
*/
public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));

        }};
        Set<Map.Entry<String, Livro>> entries = meusLivros.entrySet();
        for (Map.Entry<String, Livro> livro : entries) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }
        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        Set<Map.Entry<String, Livro>> entries1 = meusLivros1.entrySet();
        for (Map.Entry<String, Livro> livro1 : entries1) {
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());

            System.out.println("--\tOrdem alfabética autores\t--");
        }
            Map<String, Livro> meusLivros2 = new TreeMap<>() {{
                put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
                put("Duhigg, Charles", new Livro("O poder do hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
            }};
            Set<Map.Entry<String, Livro>> entries2 = meusLivros2.entrySet();
            for (Map.Entry<String, Livro> livro2: entries2) {
                System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());

            }
        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
            Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
            meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem número de paginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());

    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}


