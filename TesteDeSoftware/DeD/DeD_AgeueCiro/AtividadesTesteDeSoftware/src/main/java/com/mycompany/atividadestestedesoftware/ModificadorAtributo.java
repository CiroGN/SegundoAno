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

public class ModificadorAtributo {

    private int pontosVida;
    private Map<String, Integer> conjuntoAtributosRaca;
    private Map<String, Integer> conjuntoModificadoresPersonagem;

    // Usando HashMap para permitir modificações
    private Map<Integer, Integer> conjuntoValoresModificador = new HashMap<>() {{
        put(1, -5);
        put(2, -4);
        put(3, -4);
        put(4, -3);
        put(5, -3);
        put(6, -2);
        put(7, -2);
        put(8, -1);
        put(9, -1);
        put(10, 0);
        put(11, 0);
        put(12, 1);
        put(13, 1);
        put(14, 2);
        put(15, 2);
        put(16, 3);
        put(17, 3);
        put(18, 4);
        put(19, 4);
        put(20, 5);
        put(21, 5);
        put(22, 6);
        put(23, 6);
        put(24, 7);
        put(25, 7);
        put(26, 8);
        put(27, 8);
        put(28, 9);
        put(29, 9);
        put(30, 10);
    }};

    public ModificadorAtributo(DistribuirPontosStrategy classeRacaQualquer) {
        this.pontosVida = 10;
        this.conjuntoAtributosRaca = classeRacaQualquer.getConjuntoAtributos();

        // Usando HashMap para permitir a modificação dos valores
        this.conjuntoModificadoresPersonagem = new HashMap<>();
        conjuntoModificadoresPersonagem.put("Modificador_Forca", 0);
        conjuntoModificadoresPersonagem.put("Modificador_Destreza", 0);
        conjuntoModificadoresPersonagem.put("Modificador_Constituicao", 0);
        conjuntoModificadoresPersonagem.put("Modificador_Sabedoria", 0);
        conjuntoModificadoresPersonagem.put("Modificador_Inteligencia", 0);
        conjuntoModificadoresPersonagem.put("Modificador_Carisma", 0);

        calculaModificacao();
    }

    public int confereEntre1e30(int valor){
        if (valor >= 1 && valor <= 30){
            return conjuntoValoresModificador.get(valor);
        } else{
            throw new IllegalArgumentException("Modificador inexistente");
        }
    }
    
    // Calcula modificações e armazena no dicionário de modificadores
    public void calculaModificacao() {
        // Verificação se o atributo existe no mapa antes de acessar
        for (String atributo : conjuntoAtributosRaca.keySet()) {
            Integer valorAtributo = conjuntoAtributosRaca.get(atributo);
            if (valorAtributo != null && conjuntoValoresModificador.containsKey(valorAtributo)) {
                String modificador = "Modificador_" + atributo;
                conjuntoModificadoresPersonagem.put(modificador, confereEntre1e30(valorAtributo));
            } else {
                // Caso o valor do atributo seja inválido ou não esteja presente
                throw new IllegalArgumentException("Valor inválido para o atributo " + atributo);
            }
        }

        // Modifica pontos de vida com base na Constituição
        pontosVida += conjuntoModificadoresPersonagem.get("Modificador_Constituicao");
    }

    // Getter para obter os pontos de vida
    public int getPontosVida() {
        return pontosVida;
    }

    // Getter para obter o valor de um modificador específico
    public int getModificador(String nomeAtributo) {
        String modificador = "Modificador_" + nomeAtributo;
        if (conjuntoModificadoresPersonagem.containsKey(modificador)) {
            return conjuntoModificadoresPersonagem.get(modificador);
        } else {
            throw new IllegalArgumentException(modificador + " não encontrado.");
        }
    }

    // Getter para obter o valor de um atributo específico
    public int getAtributo(String nomeAtributo) {
        if (conjuntoAtributosRaca.containsKey(nomeAtributo)) {
            return conjuntoAtributosRaca.get(nomeAtributo);
        } else {
            throw new IllegalArgumentException("Atributo " + nomeAtributo + " não encontrado.");
        }
    }
}
