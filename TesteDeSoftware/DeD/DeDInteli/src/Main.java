//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InterfaceAtributosPersonagem humano = new Humano();
        Classe humanoGuerreiro = new Classe("Guerreiro");
        Personagem personagemHumano = new Personagem(humanoGuerreiro, "Bruenor", "Humano");
        personagemHumano.mostraInfo();
        humano.atribuiPontos(15, 15, 15, 8, 8, 8);
        humano.mostraAtributosEvalores();
        humano.aplicaBonusRacial();
        humano.mostraAtributosEvalores();
        humano.modificadoresDeAtributo();
        humano.mostraAtributosEvalores();
    }
}