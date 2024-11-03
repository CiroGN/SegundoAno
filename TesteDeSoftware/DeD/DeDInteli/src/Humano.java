public class Humano implements InterfaceAtributosPersonagem{
    protected DistribuirPontosIniciais distribuirPontosIniciais;
    protected DistribuirEscolha27 distribuirEscolha27;
    protected Atributo atributo;
    protected int forcaExtra = 1;
    protected int destrezaExtra = 1;
    protected int constituicaoExtra = 1;
    protected int inteligenciaExtra = 1;
    protected int sabedoriaExtra = 1;
    protected int carismaExtra = 1;
    protected int pontosVidaFinal;

    public Humano(){
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
        System.out.println();
        System.out.println("+1 de todos os atributos!");
        distribuirEscolha27.forca += forcaExtra;
        distribuirEscolha27.destreza += destrezaExtra;
        distribuirEscolha27.constituicao += constituicaoExtra;
        distribuirEscolha27.inteligencia += inteligenciaExtra;
        distribuirEscolha27.sabedoria += sabedoriaExtra;
        distribuirEscolha27.carisma += carismaExtra;
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
        System.out.println("Vida: " + calculaPontosVidaFinal());
    }

    // MODIFICA ATRIBUTOS
    @Override
    public void modificadoresDeAtributo(){
        System.out.println();
        System.out.println("Estes são os modificadores de atributos");
        System.out.println("Força: " + distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.forca));
        System.out.println("Destreza: " + distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.destreza));
        System.out.println("Constituição: " + distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.constituicao));
        System.out.println("Inteligência: " + distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.inteligencia));
        System.out.println("Sabedoria: " + distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.sabedoria));
        System.out.println("Carisma: " + distribuirPontosIniciais.calculaModificadorAtributo(distribuirEscolha27.carisma));
        System.out.println(" ");
    }

    @Override
    public int calculaPontosVidaFinal(){
        pontosVidaFinal = 10 + distribuirEscolha27.constituicao / 2;
        return pontosVidaFinal;
    }
}
