/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.main.java.com.mycompany.atividadestestedesoftware;

/**
 *
 * @author usuario
 */

import java.util.Map;

public class Elfo implements DistribuirPontosStrategy {

    private Map<String, Integer> conjuntoAtributos;

    public Elfo(DistribuirEscolha27 classeDistribuirEscolha27) {
        this.conjuntoAtributos = classeDistribuirEscolha27.getConjuntoAtributos();
        setAtributo();
    }

    @Override
    public int getAtributo(String nomeAtributo) {
        if (conjuntoAtributos.containsKey(nomeAtributo)) {
            return conjuntoAtributos.get(nomeAtributo);
        } else {
            throw new IllegalArgumentException("Atributo " + nomeAtributo + " não encontrado.");
        }
    }

    @Override
    public void setAtributo() {
        conjuntoAtributos.put("Forca", conjuntoAtributos.get("Forca") + 2);
        conjuntoAtributos.put("Constituicao", conjuntoAtributos.get("Constituicao") + 1);
    }
    
    @Override
    public void setAtributo(String atributo, int valor) {
        // Não vou usar aqui
    }
    
    @Override
    public Map<String, Integer> getConjuntoAtributos() {
        return this.conjuntoAtributos;
    }
}
