package TesteDeSoftware.DeD.DeDFinal.src.Main;

public class Main {
    public static void main(String[] args) {
        InterfaceAtributosPersonagem elfo = new Elfo();
        Classe elfoGuerreiro = new Classe("Guerreiro");
        Personagem personagemElfo = new Personagem(elfoGuerreiro, "Bruenor", "Elfo");
        personagemElfo.mostraRaca();
        elfo.atribuiPontos(15, 15, 15, 8, 8, 8);
        elfo.mostraAtributosEvalores();
        elfo.aplicaBonusRacial();
        elfo.mostraAtributosEvalores();
        elfo.modificadoresDeAtributo();
        elfo.mostraAtributosEvalores();

        System.out.println("===================================================\n\n");
    }
    
}
