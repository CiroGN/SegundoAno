package TesteDeSoftware.DeD.DeDFinal.src.Main;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Atributo {

    // VARIÁVEIS DE ATRIBUTOS
    protected int valorExtraMaximoAtributo = 27;
    protected int forca = 8;
    protected int destreza = 8;
    protected int constituicao = 8;
    protected int inteligencia = 8;
    protected int sabedoria = 8;
    protected int carisma = 8;
    // PONTOS DE VIDA PADRÃO QUE SERÃO SOMADOS COM O MODIFICADOR DE CONSTITUIÇÃO
    protected int pontosVidaInicial = 10;
    List <Integer> listaAtributos = new ArrayList<>();

    // CHAVE E VALOR = VALOR E CUSTO DO D&D
    Map<Integer, Integer> map = Map.of(
        8,0,
        9,1,
        10,2,
        11,3,
        12,4,
        13,5,
        14,7,
        15,9
    );
}

