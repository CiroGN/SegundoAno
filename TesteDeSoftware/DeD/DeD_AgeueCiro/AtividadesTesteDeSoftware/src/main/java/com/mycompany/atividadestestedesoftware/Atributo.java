/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.main.java.com.mycompany.atividadestestedesoftware;

/**
 *
 * @author usuario
 */

import java.util.HashMap;
import java.util.Map;

public class Atributo {

    private Map<String, Integer> conjuntoAtributos;
    private Map<Integer, Integer> conjuntoCustoAtributos;

    public Atributo() {
        conjuntoAtributos = new HashMap<>();
        conjuntoAtributos.put("Forca", 8);
        conjuntoAtributos.put("Destreza", 8);
        conjuntoAtributos.put("Constituicao", 8);
        conjuntoAtributos.put("Sabedoria", 8);
        conjuntoAtributos.put("Inteligencia", 8);
        conjuntoAtributos.put("Carisma", 8);

        conjuntoCustoAtributos = new HashMap<>();
        conjuntoCustoAtributos.put(8, 0);
        conjuntoCustoAtributos.put(9, 1);
        conjuntoCustoAtributos.put(10, 2);
        conjuntoCustoAtributos.put(11, 3);
        conjuntoCustoAtributos.put(12, 4);
        conjuntoCustoAtributos.put(13, 5);
        conjuntoCustoAtributos.put(14, 7);
        conjuntoCustoAtributos.put(15, 9);
    }
    
    // Getters do conjunto de atributos
    public Map<String, Integer> getConjuntoAtributos() {
        return conjuntoAtributos;
    }

    public Map<Integer, Integer> getConjuntoCustoAtributos() {
        return conjuntoCustoAtributos;
    }

    void setConjuntoAtributos(HashMap<String, Integer> hashMap) {
        conjuntoAtributos = hashMap;
    }
}
