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

public class DistribuirEscolha27 implements DistribuirPontosStrategy{

    private Map<String, Integer> conjuntoAtributos;
    private Map<Integer, Integer> conjuntoCustoAtributos;
    private int pontosDisponiveis;

    public DistribuirEscolha27(Atributo classeAtributos) {
        this.conjuntoAtributos = classeAtributos.getConjuntoAtributos();
        this.conjuntoCustoAtributos = classeAtributos.getConjuntoCustoAtributos();
        this.pontosDisponiveis = 27;
    }

    // Confere se o valor está entre 8 e 15
    private int confereEntre8e15(String nomeAtributo, int valor) {
        if (valor >= 8 && valor <= 15) {
            return valor;
        } else {
            throw new IllegalArgumentException("O valor " + valor + " de " + nomeAtributo + " é inválido (tem que estar entre 8 e 15)");
        }
    }

    // Confere se ainda está dentro do limite de 27 pontos para a distribuição
    private void conferePontosDisponiveis(int valor) {
        int verificaGasto = pontosDisponiveis - conjuntoCustoAtributos.get(valor);
        if (verificaGasto >= 0) {
            pontosDisponiveis -= conjuntoCustoAtributos.get(valor);
        } else {
            throw new IllegalArgumentException("Você ultrapassou o limite de 27 pontos disponíveis!!");
        }
    }

    // Getter para obter o valor de um atributo específico
    public int getAtributo(String nomeAtributo) {
        if (conjuntoAtributos.containsKey(nomeAtributo)) {
            return conjuntoAtributos.get(nomeAtributo);
        } else {
            throw new IllegalArgumentException("Atributo " + nomeAtributo + " não encontrado.");
        }
    }

    // Setter para modificar o valor de um atributo específico
    public void setAtributo(String nomeAtributo, int valor) {
        if (conjuntoAtributos.containsKey(nomeAtributo)) {
            conjuntoAtributos.put(nomeAtributo, confereEntre8e15(nomeAtributo, valor));
            conferePontosDisponiveis(valor);
        } else {
            System.out.println("Atributo " + nomeAtributo + " não encontrado.");
        }
    }
    
    @Override
    public void setAtributo() {
        // Não vou usar aqui
    }
    
    // Getters do conjunto de atributos
    public Map<String, Integer> getConjuntoAtributos() {
        return conjuntoAtributos;
    }

    public Map<Integer, Integer> getConjuntoCustoAtributos() {
        return conjuntoCustoAtributos;
    }
}
