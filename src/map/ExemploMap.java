package map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

    /* Dado os modelos dos carros e seus consumos na estrada, faça:
       modelo = gol - consumo = 14,4 km/l
       modelo = uno - consumo = 15,5 km/l
       modelo = mobi - consumo = 16,1 km/l
       modelo = hb20 - consumo = 14,5 km/l
       modelo = kwid - consumo = 15,6 km/l
       */

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<String, Double>(){{
           //nao existe o metodo add para o map, nesse caso utiliza-se o put
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);
        System.out.println("substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("verifique se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("tucson"));
        System.out.println("exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("exiba o modelo mais economico e seu consumo: ");

        Double consumoEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente = "";

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(consumoEficiente)){
                modeloEficiente = entry.getKey();
            }
        }

        System.out.println("modelo: " + modeloEficiente + "\nconsumo: " + consumoEficiente);
    }
}