package TesteDeSoftware.DeD.DeDFinal.src.Main;

public class Raca extends Atributo{
    
    // VARIÁVEIS DA CLASSE RAÇA
    protected String tipoRaca;
    protected float deslocamento;
    protected List<String> listaIdiomas = new ArrayList<>();

    // IMPRIME LISTAS
    public void imprimeLista(String conteudo, List<String> lista){
        for(String itemLista : lista){
            System.out.println(conteudo + ": " + itemLista);
        }
    }

    // ADICIONA TAXA DE DESLOCAMENTO
    public void taxaDeslocamento(float deslocacao){
        deslocamento = deslocacao;
    }

    // ADICIONA CADA IDIOMA
    public void adicionaIdioma(String idioma) {
       listaIdiomas.add(idioma);
    }

    // MOSTRA INFORMAÇÕES
    public void mostraInformacoesRaca(){
        System.out.println("Tipo: " + tipoRaca);
        imprimeLista("Idioma", listaIdiomas);
    }

}
