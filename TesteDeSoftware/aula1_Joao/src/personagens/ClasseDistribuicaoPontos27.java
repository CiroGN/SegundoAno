package src.personagens;

public class ClasseDistribuicaoPontos27 implements DistribuicaoPontos {
    @Override
    public void distribuirPontos(Personagem personagem) {
        personagem.setForca(15);
        personagem.setDestreza(10);
        personagem.setConstituicao(14);
        personagem.setInteligencia(8);
        personagem.setSabedoria(12);
        personagem.setCarisma(10);
    }
}