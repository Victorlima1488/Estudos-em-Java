package org.example;
import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        // Dada os modelos dps carros e seus respectivos consumos na estrada, faça:
        // modelo = gol - consumo = 14,4km/l
        // modelo = uno - consumo = 15,6 km/l
        // modelo = mobi - consumo = 16,1 km/l
        // modelo = hb20 - cinsumo = 14,5 km/l
        // modelo = kwid - consumo = 15,6 km/l

//        Map carrosPopulares2020 = new HashMap(); //amtes dp java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); // Generics(jdk 5)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobile")

        System.out.println("Crie um dicionário e relacione os modelos e seus respectivos consumos.");
        Map<String, Double> carrosPupulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPupulares.toString());

        System.out.println("substitua o consumo do gol por 15,2 km/l: ");

        carrosPupulares.put("gol", 15.2);

        System.out.println(carrosPupulares.toString());

        System.out.println("confira se o modelo tucson está no dicionário: " + carrosPupulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPupulares.get("uno"));

        System.out.println("Exiba o consumo o terceiro modelo adicionado"); // Nâo tem método interno para isso.

        System.out.println("Exiba os modelos");
        Set<String> modelos = carrosPupulares.keySet();

        System.out.println(modelos.toString());

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPupulares.values();

        System.out.println(consumos);

        System.out.println("Exiba o consumo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPupulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPupulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String,Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();
        }

        System.out.println("Modelos mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
    }
}
