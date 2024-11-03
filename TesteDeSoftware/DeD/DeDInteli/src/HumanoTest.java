import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class HumanoTest extends Humano {

    @BeforeEach
    void setUp() {
        atribuiPontos(14, 12, 10, 8, 13, 10);
    }

    @Test
    public void testModificadorForca() {
        int esperadoModificador = 2;  // Para força 14, o modificador esperado é +2
        assertEquals(esperadoModificador, distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.forca));
}
    @Test
    public void testModificadorDestreza() {
        int esperadoModificador = 1;  // Para destreza 12, o modificador esperado é +1
        assertEquals(esperadoModificador, distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.destreza));
    }

    @Test
    public void testModificadorConstituicao() {
        int esperadoModificador = 0;  // Para constituição 10, o modificador esperado é 0
        assertEquals(esperadoModificador, distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.constituicao));
    }

    @Test
    public void testModificadorInteligencia() {
        int esperadoModificador = -1;  // Para inteligência 8, o modificador esperado é -1
        assertEquals(esperadoModificador, distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.inteligencia));
    }

    @Test
    public void testModificadorSabedoria() {
        int esperadoModificador = 1;  // Para sabedoria 13, o modificador esperado é +1
        assertEquals(esperadoModificador, distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.sabedoria));
    }

    @Test
    public void testModificadorCarisma() {
        int esperadoModificador = 0;  // Para carisma 10, o modificador esperado é 0
        assertEquals(esperadoModificador, distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.carisma));
    }

}