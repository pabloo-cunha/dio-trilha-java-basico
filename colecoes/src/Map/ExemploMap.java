package Map;
/*Dado so modelos de carros e seus respectivos consumos na estrada, faça:

modelo = gol - consumo = 14.4km/l
modelo = uno - consumo = 15.6km/l
modelo = mobi - consumo = 16.1km/l
modelo = hb20 - consumo = 14.5km/l
modelo = kwid - consumo = 15.6km/l
*/

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
//        Map carrosPopulares2020 = new HashMap();
//        Map<Strin, Double> carrosPopulares = new HashMap<>();
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1
//        "kb20", 14.5, "kwid", 15.6);

        System.out.println("Crie um dicionario que relacione os modelos e seus repectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo gol po 15.2 km/l: ");
        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

//        System.out.println("Exiba o terceiro modelo adicionado");

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double carroMaisEficiente = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();


        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(carroMaisEficiente)){
                modeloMaisEficiente = entry.getKey();

            System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + carroMaisEficiente);}
        }

        System.out.println("Exiba o modelo menos economico e o seu consumo: ");
        Double carroMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(carroMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + carroMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.printf("Exiba a media de consumo deste dicionario: %.2f", (soma/carrosPopulares.size()));


        System.out.println("\n" + carrosPopulares);

        System.out.println("Remova os modelos com o consumo igual a 15.6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carroPopulares2 = new TreeMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};

        System.out.println(carroPopulares2.toString());

        System.out.println("Apague o dicionario de carros");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Confira se o dicionario está vazio: " + carrosPopulares.isEmpty());

    }
}
