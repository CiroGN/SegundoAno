package src.personagens;
public class Humano implements Raca {
    @Override
    public void aplicarBonusRacial(Personagem personagem) {
        personagem.setForca(personagem.getForca() + 1);
        personagem.setDestreza(personagem.getDestreza() + 1);
        personagem.setConstituicao(personagem.getConstituicao() + 1);
        personagem.setInteligencia(personagem.getInteligencia() + 1);
        personagem.setSabedoria(personagem.getSabedoria() + 1);
        personagem.setCarisma(personagem.getCarisma() + 1);
    }
}