public class Raca extends Atributo{
    // VARIÁVEIS DA CLASSE RAÇA
    protected String tipoRaca;
    protected float deslocamento;

    // ADICIONA TAXA DE DESLOCAMENTO
    public void taxaDeslocamento(float deslocacao){
        deslocamento = deslocacao;
    }

    // MOSTRA INFORMAÇÕES
    public void mostraInformacoesRaca(){
        System.out.println("Tipo: " + tipoRaca);
    }
}
