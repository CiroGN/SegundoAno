import java.util.List;

public class DistribuirEscolha27  extends Atributo{
    // APLICANDO O BÔNUS
    public void adicionaPontosAtributo(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma){

        // CRIANDO UMA LISTA COM TODOS OS ATRIBUTOS
        listaAtributos.add(forca);
        listaAtributos.add(destreza);
        listaAtributos.add(constituicao);
        listaAtributos.add(inteligencia);
        listaAtributos.add(sabedoria);
        listaAtributos.add(carisma);

        tratamentoLimitesIniciais(listaAtributos);

        // ADICIONANDO OS VALORES CARREGADOS PELAS CHAVES NOS ATRIBUTOS
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;

        // SOMANDO OS VALORES DAS PRÓPRIAS CHAVES INSERIDAS NO MÉTODO CONSTRUTOR
        int totalBonusUsado = map.get(forca) + map.get(destreza) + map.get(constituicao) + map.get(inteligencia) + map.get(sabedoria) + map.get(carisma);
        tratamentoLimiteBonus(totalBonusUsado);
    }

    // TRATAMENTO PARA LIMITES ENTRE 8 E 15
    public void tratamentoLimitesIniciais(List <Integer> listaValoresAtributos){
        // COLOCANDO LIMITES NOS BÔNUS DE ATRIBUTOS
        for (int valor : listaValoresAtributos){
            if (valor < 8 || valor > 15){
                throw new IllegalArgumentException("Algum valor não está entre 8 e 15");
            }
        }
    }

    // TRATAMENTO PARA LIMITE DE 27 EM BÔNUS
    public void tratamentoLimiteBonus(int totalBonusUsado){
        if (valorExtraMaximoAtributo < totalBonusUsado || totalBonusUsado < 0){
            throw new IllegalArgumentException("Você passou o limite ou ficou menor que 0 o bônus de atributos");
        }
    }
}

