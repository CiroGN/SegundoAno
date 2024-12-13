/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.main.java.com.mycompany.atividadestestedesoftware;

import java.util.Map;

/**
 *
 * @author usuario
 */

public interface DistribuirPontosStrategy {

    // Método para definir o valor de um atributo específico
    void setAtributo(String atributo, int valor);
    
    // Método para definir o valor de um atributo específico sem passar parâmetros diretamente
    void setAtributo();

    // Método para obter o valor de um atributo específico
    int getAtributo(String atributo);
    
    public Map<String, Integer> getConjuntoAtributos();
}
