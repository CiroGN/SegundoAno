package TesteDeSoftware.DeD.DeDFinal.src.Test;

import TesteDeSoftware.DeD.TesteDeSoftwareDeD.AtividadesTesteDeSoftware.src.main.DistribuirEscolha27;

public class DistribuirEscolha27Test {
    

    private DistribuirEscolha27 distribuirEscolha27;

    @BeforeEach
    public void setUp() {
        distribuirEscolha27 = new DistribuirEscolha27();
    }

    @AfterEach
    public void tearDown() {
        distribuirEscolha27 = null;
    }

    /**
     * Testa se os valores dos atributos estão dentro do limite (entre 8 e 15).
     * E se o total de pontos gastos nos atributos respeita o custo esperado (tabela de custo).
     */
    @Test
    public void testAtributosDentroDosLimites() {
        assertDoesNotThrow(() -> distribuirEscolha27.adicionaPontosAtributo(15, 15, 15, 8, 8, 8),
                "Os valores dos atributos estão dentro dos limites, não deveria lançar exceção.");
    }

    /**
     * Testa se o limite máximo de 27 pontos é respeitado.
     */
    @Test
    public void testLimiteMaximo27PontosRespeitado() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                distribuirEscolha27.adicionaPontosAtributo(15, 15, 15, 15, 15, 15),
                "Deveria lançar exceção ao ultrapassar o limite de 27 pontos.");
        assertEquals("Você extrapolou o limite de bônus de atributos", exception.getMessage());
    }
    
    @Test
    public void testCustosAtributosRespeitados2() {
        assertDoesNotThrow(() -> distribuirEscolha27.tratamentoLimiteBonus(27),
                "O limite de 27 é respeitado!.");
    }
}
