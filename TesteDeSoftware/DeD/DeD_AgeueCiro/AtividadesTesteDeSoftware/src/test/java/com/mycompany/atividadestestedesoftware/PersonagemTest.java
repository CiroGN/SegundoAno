/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.test.java.com.mycompany.atividadestestedesoftware;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void testPersonagemCriacaoComAtributosValidos() {
        // Cria um personagem com valores válidos
        Personagem personagem = new Personagem(
                Humano.class,
                15, // Força
                14, // Destreza
                13, // Constituição
                12, // Sabedoria
                10, // Inteligência
                8   // Carisma
        );

        // Verifica os valores dos atributos
        assertEquals(16, personagem.getRaca().getAtributo("Forca"));
        assertEquals(15, personagem.getRaca().getAtributo("Destreza"));
        assertEquals(14, personagem.getRaca().getAtributo("Constituicao"));
        assertEquals(13, personagem.getRaca().getAtributo("Sabedoria"));
        assertEquals(11, personagem.getRaca().getAtributo("Inteligencia"));
        assertEquals(9, personagem.getRaca().getAtributo("Carisma"));

        // Verifica os modificadores calculados
        assertEquals(3, personagem.getModificadorAtributo().getModificador("Forca"));
        assertEquals(2, personagem.getModificadorAtributo().getModificador("Destreza"));
        assertEquals(2, personagem.getModificadorAtributo().getModificador("Constituicao"));
        assertEquals(1, personagem.getModificadorAtributo().getModificador("Sabedoria"));
        assertEquals(0, personagem.getModificadorAtributo().getModificador("Inteligencia"));
        assertEquals(-1, personagem.getModificadorAtributo().getModificador("Carisma"));

        // Verifica os pontos de vida (base 10 + modificador de Constituição)
        assertEquals(12, personagem.getModificadorAtributo().getPontosVida());
    }


    @Test
    void testPersonagemCriacaoComAtributosInvalidos() {
        // Testa a criação de um personagem com valores inválidos para os atributos
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Personagem(
                    Humano.class,
                    16, // Força (fora do intervalo permitido)
                    14, // Destreza
                    13, // Constituição
                    12, // Sabedoria
                    10, // Inteligência
                    8   // Carisma
            );
        });
        assertEquals("O valor 16 de Forca é inválido (tem que estar entre 8 e 15)", exception.getMessage());
    }

    @Test
    void testPersonagemCriacaoComErroNaInstanciaDaRaca() {
        // Testa se a criação falha quando uma classe de raça inválida é passada
        Exception exception = assertThrows(RuntimeException.class, () -> {
            new Personagem(
                    null, // Classe da raça inválida
                    15, // Força
                    14, // Destreza
                    13, // Constituição
                    12, // Sabedoria
                    10, // Inteligência
                    8   // Carisma
            );
        });
        assertTrue(exception.getMessage().contains("Erro ao instanciar a raça"));
    }

    @Test
    void testMostraInfo() {
        // Cria um personagem válido
        Personagem personagem = new Personagem(
                Humano.class,
                15, // Força
                14, // Destreza
                13, // Constituição
                12, // Sabedoria
                10, // Inteligência
                8   // Carisma
        );

        // Testa a saída de mostraInfo (baseado no System.out para simplificação)
        personagem.mostraInfo();
        // Esse teste pode ser visualizado manualmente no console ou validado com uma biblioteca de captura de saída
    }
}
