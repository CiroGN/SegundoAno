/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.test.java.com.mycompany.atividadestestedesoftware;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DistribuirEscolha27Test {

    private DistribuirEscolha27 distribuir;
    private Atributo atributos;

    @BeforeEach
    void setUp() {
        // Criando uma nova instância de Atributo (com valores padrão)
        atributos = new Atributo();

        // Criando a instância de DistribuirEscolha27
        distribuir = new DistribuirEscolha27(atributos);
    }

    @Test
    void testSetAtributo_ValidValue() {
        // Testa a alteração de um atributo com valor válido
        distribuir.setAtributo("Forca", 12);
        assertEquals(12, distribuir.getAtributo("Forca"));
    }

    @Test
    void testSetAtributo_InvalidValueBelow8() {
        // Testa se o valor abaixo de 8 gera uma exceção
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            distribuir.setAtributo("Forca", 7);
        });
        assertEquals("O valor 7 de Forca é inválido (tem que estar entre 8 e 15)", exception.getMessage());
    }

    @Test
    void testSetAtributo_InvalidValueAbove15() {
        // Testa se o valor acima de 15 gera uma exceção
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            distribuir.setAtributo("Forca", 16);
        });
        assertEquals("O valor 16 de Forca é inválido (tem que estar entre 8 e 15)", exception.getMessage());
    }

    @Test
    void testSetAtributo_ExceedingAvailablePoints() {
        // Aloca pontos em dois atributos
        distribuir.setAtributo("Forca", 15); // -9 pontos
        distribuir.setAtributo("Destreza", 15); // -9 pontos
        distribuir.setAtributo("Constituicao", 15); // -9 pontos

        // Testa se tentar ultrapassar o limite de 27 pontos gera exceção
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            distribuir.setAtributo("Sabedoria", 9); // -1 - Excederá os pontos restantes
        });
        assertEquals("Você ultrapassou o limite de 27 pontos disponíveis!!", exception.getMessage());
    }

    @Test
    void testGetAtributo_ExistingAtributo() {
        // Verifica o valor padrão de um atributo existente
        assertEquals(8, distribuir.getAtributo("Forca"));
    }

    @Test
    void testGetAtributo_NonExistingAtributo() {
        // Verifica o comportamento ao tentar acessar um atributo inexistente
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            distribuir.getAtributo("Agilidade");
        });
        assertEquals("Atributo Agilidade não encontrado.", exception.getMessage());
    }
}
