/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.test.java.com.mycompany.atividadestestedesoftware;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class AtributoTest {

    @Test
    void testInicializacaoAtributos() {
        Atributo atributo = new Atributo();

        // Verifique se os valores padrões estão sendo atribuídos corretamente
        assertEquals(8, atributo.getConjuntoAtributos().get("Forca"));
        assertEquals(8, atributo.getConjuntoAtributos().get("Destreza"));
        assertEquals(8, atributo.getConjuntoAtributos().get("Constituicao"));
        assertEquals(8, atributo.getConjuntoAtributos().get("Sabedoria"));
        assertEquals(8, atributo.getConjuntoAtributos().get("Inteligencia"));
        assertEquals(8, atributo.getConjuntoAtributos().get("Carisma"));
    }

    @Test
    void testInicializacaoCustoAtributos() {
        Atributo atributo = new Atributo();

        // Verifique se os valores de custo estão corretos para os valores dos atributos
        assertEquals(0, atributo.getConjuntoCustoAtributos().get(8));
        assertEquals(1, atributo.getConjuntoCustoAtributos().get(9));
        assertEquals(2, atributo.getConjuntoCustoAtributos().get(10));
        assertEquals(3, atributo.getConjuntoCustoAtributos().get(11));
        assertEquals(4, atributo.getConjuntoCustoAtributos().get(12));
        assertEquals(5, atributo.getConjuntoCustoAtributos().get(13));
        assertEquals(7, atributo.getConjuntoCustoAtributos().get(14));
        assertEquals(9, atributo.getConjuntoCustoAtributos().get(15));
    }

    @Test
    void testAlteracaoAtributos() {
        Atributo atributo = new Atributo();

        // Crie um novo HashMap de atributos
        HashMap<String, Integer> novosAtributos = new HashMap<>();
        novosAtributos.put("Forca", 10);
        novosAtributos.put("Destreza", 12);
        novosAtributos.put("Constituicao", 14);
        novosAtributos.put("Sabedoria", 16);
        novosAtributos.put("Inteligencia", 9);
        novosAtributos.put("Carisma", 11);

        // Alterar os atributos usando o método set
        atributo.setConjuntoAtributos(novosAtributos);

        // Verifique se os valores foram alterados corretamente
        assertEquals(10, atributo.getConjuntoAtributos().get("Forca"));
        assertEquals(12, atributo.getConjuntoAtributos().get("Destreza"));
        assertEquals(14, atributo.getConjuntoAtributos().get("Constituicao"));
        assertEquals(16, atributo.getConjuntoAtributos().get("Sabedoria"));
        assertEquals(9, atributo.getConjuntoAtributos().get("Inteligencia"));
        assertEquals(11, atributo.getConjuntoAtributos().get("Carisma"));
    }

    @Test
    void testCustoAtributos() {
        Atributo atributo = new Atributo();

        // Verifique os custos para alguns valores de atributos
        assertEquals(0, atributo.getConjuntoCustoAtributos().get(8));
        assertEquals(1, atributo.getConjuntoCustoAtributos().get(9));
        assertEquals(2, atributo.getConjuntoCustoAtributos().get(10));
        assertEquals(4, atributo.getConjuntoCustoAtributos().get(12));
        assertEquals(7, atributo.getConjuntoCustoAtributos().get(14));
    }
}
