package TesteDeSoftware.DeD.DeDFinal.src.Main;

public class DistribuirPontosIniciais {
    public static int calculaModificadorAtributo(int valor) {
        if (valor >= 30) return 10;
        if (valor >= 28) return 9;
        if (valor >= 26) return 8;
        if (valor >= 24) return 7;
        if (valor >= 22) return 6;
        if (valor >= 20) return 5;
        if (valor >= 18) return 4;
        if (valor >= 16) return 3;
        if (valor >= 14) return 2;
        if (valor >= 12) return 1;
        if (valor >= 10) return 0;
        if (valor >= 8) return -1;
        if (valor >= 6) return -2;
        if (valor >= 4) return -3;
        if (valor >= 2) return -4;
        return -5;
    }
}
