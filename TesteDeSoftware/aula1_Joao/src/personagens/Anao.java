package src.personagens;
public class Anao implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        personagem.setForca(personagem.getForca() + 2);
        personagem.setConstituicao(personagem.getConstituicao() + 2);
    }
}
