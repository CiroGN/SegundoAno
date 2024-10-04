package TesteDeSoftware.DeD.DeDFinal.src.Main;

public class Elfo implements InterfaceAtributosPersonagem{
    protected DistribuirPontosIniciais distribuirPontosIniciais;
    protected DistribuirEscolha27 distribuirEscolha27;
    protected Atributo atributo;
        protected int destrezaExtra = 2;
        protected int pontosVidaFinal;

    public Elfo(){
        distribuirPontosIniciais = new DistribuirPontosIniciais();
        distribuirEscolha27 = new DistribuirEscolha27();
        atributo = new Atributo();
    }
        
    // Designa os 27 pontos
    @Override
    public void atribuiPontos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma){
        atributo.forca = forca;
        atributo.destreza = destreza;
        atributo.constituicao = constituicao;
        atributo.inteligencia = inteligencia;
        atributo.sabedoria = sabedoria;
        atributo.carisma = carisma;
        distribuirEscolha27.adicionaPontosAtributo(forca, destreza, constituicao, inteligencia, sabedoria, carisma);
    }
        
    // APLICA BÔNUS RACIAL
    @Override
    public void aplicaBonusRacial(){
        System.out.println("\n=========================");
        System.out.println("+2 de destreza aplicada!");
        System.out.println("=========================");
        System.out.println();
        distribuirEscolha27.destreza += destrezaExtra;
    }
    @Override
    // MOSTRA ATRIBUTOS E OS RESPECTIVOS VALORES DELES
    public void mostraAtributosEvalores(){
        System.out.println("Força: " + distribuirEscolha27.forca);
        System.out.println("Destreza: " + distribuirEscolha27.destreza);
        System.out.println("Constituição: " + distribuirEscolha27.constituicao);
        System.out.println("Inteligência: " + distribuirEscolha27.inteligencia);
        System.out.println("Sabedoria: " + distribuirEscolha27.sabedoria);
        System.out.println("Carisma: " + distribuirEscolha27.carisma);
    }
    
    // MODIFICA ATRIBUTOS
    @Override
    public void modificadoresDeAtributo(){
        System.out.println("\n====================================");
        System.out.println("Atributos modificados com sucesso!!");
        System.out.println("====================================");
        distribuirEscolha27.forca += distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.forca);
        distribuirEscolha27.destreza += distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.destreza);
        distribuirEscolha27.constituicao += distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.constituicao);
        distribuirEscolha27.inteligencia += distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.inteligencia);
        distribuirEscolha27.sabedoria += distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.sabedoria);
        distribuirEscolha27.carisma += distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.carisma);
        pontosVidaFinal = 10 + distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.constituicao)-1;
        // PONTOS DE VIDA
        System.out.println("====================================");
        System.out.println("Vida: " + pontosVidaFinal);
        System.out.println("====================================");
    }
}