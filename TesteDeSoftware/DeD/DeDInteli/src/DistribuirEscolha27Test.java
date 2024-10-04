import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DistribuirEscolha27Test extends DistribuirEscolha27 {

    private DistribuirEscolha27 DistribuirEscolha27;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        DistribuirEscolha27 = new DistribuirEscolha27();
    }


    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        DistribuirEscolha27 = null;
    }


    @org.junit.jupiter.api.Test
    void testAdicionaPontosAtributo() {
        assertDoesNotThrow(() -> DistribuirEscolha27.adicionaPontosAtributo(15, 15, 15, 8, 8, 8),
                "Foram gastos mais de 27 pontos ou o valor não está entre 8 e 15 pontos");
    }

    @org.junit.jupiter.api.Test
    void testTratamentoLimitesIniciais() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                        DistribuirEscolha27.tratamentoLimitesIniciais(listaAtributos),
                "Se forem gastos mais de 0 a 27 pontos, retorna erro por causa da excecao");
    }

    @org.junit.jupiter.api.Test
    void testTratamentoLimiteBonus() {
        assertDoesNotThrow(() -> DistribuirEscolha27.tratamentoLimiteBonus(28),
                "Não foram gastos de 0 a 27 pontos");

    }
}