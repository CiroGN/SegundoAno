package TesteDeSoftware.ExercicioJava.ExercicioOO.Pacotes.Ex20.contabilidade;

import TesteDeSoftware.ExercicioJava.ExercicioOO.Pacotes.Ex20.financeiro.RelatorioFinanceiro;

public class Contador {
    public void gerarRelatorioContabil() {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        relatorio.gerarRelatorio();  // Chama o método do pacote financeiro
    }
}
