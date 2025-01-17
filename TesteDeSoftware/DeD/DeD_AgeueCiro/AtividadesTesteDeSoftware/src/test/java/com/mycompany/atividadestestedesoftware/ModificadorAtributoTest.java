/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.test.java.com.mycompany.atividadestestedesoftware;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

class ModificadorAtributoTest {

    private ModificadorAtributo modificadorAtributo;
    private DistribuirEscolha27 distribuir;

    @BeforeEach
    void setUp() {
        // Inicializa os atributos com valores padrão
        Atributo atributo = new Atributo();
        distribuir = new DistribuirEscolha27(atributo);
        modificadorAtributo = new ModificadorAtributo(distribuir);
    }

    @Test
    void testCalculaModificacao_CorrectModifiers() {
        // Testa se os modificadores são calculados corretamente
        distribuir.setAtributo("Forca", 14); // Modificador esperado: +2
        distribuir.setAtributo("Constituicao", 12); // Modificador esperado: +1

        modificadorAtributo = new ModificadorAtributo(distribuir);

        assertEquals(2, modificadorAtributo.getModificador("Forca"));
        assertEquals(1, modificadorAtributo.getModificador("Constituicao"));
    }

    @Test
    void testCalculaModificacao_PontosVidaAtualizados() {
        // Testa se os pontos de vida são corretamente atualizados com o modificador de Constituição
        distribuir.setAtributo("Constituicao", 14); // Modificador esperado: +2
        modificadorAtributo = new ModificadorAtributo(distribuir);

        assertEquals(12, modificadorAtributo.getPontosVida()); // 10 base + 2 de Constituição
    }

    @Test
    void testGetAtributo_ValidAtributo() {
        // Testa se o valor de um atributo específico pode ser obtido
        assertEquals(8, modificadorAtributo.getAtributo("Forca")); // Valor padrão
    }

    @Test
    void testGetAtributo_InvalidAtributo() {
        // Testa se um atributo inválido gera uma exceção
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            modificadorAtributo.getAtributo("Agilidade");
        });
        assertEquals("Atributo Agilidade não encontrado.", exception.getMessage());
    }

    @Test
    void testGetModificador_InvalidModificador() {
        // Testa se um modificador inválido gera uma exceção
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            modificadorAtributo.getModificador("Agilidade");
        });
        assertEquals("Modificador_Agilidade não encontrado.", exception.getMessage());
    }

    @Test
    void testConfereEntre1e30_InvalidValueBelow1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            modificadorAtributo.confereEntre1e30(0); // Fora do intervalo permitido
        });
        assertEquals("Modificador inexistente", exception.getMessage());
    }

    @Test
    void testConfereEntre1e30_InvalidValueAbove30() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            modificadorAtributo.confereEntre1e30(31); // Fora do intervalo permitido
        });
        assertEquals("Modificador inexistente", exception.getMessage());
    }
}

