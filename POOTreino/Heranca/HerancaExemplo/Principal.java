public class Principal {
    public static void main(String[] args) {
        Pai pai = new Pai();
        pai.setNome("");

        Filho filho = new Filho();
        filho.setNome("");
        filho.setIdade(0);

        Neto neto = new Neto();
        neto.setNome("");
        neto.setIdade(0);
        neto.corCabelo = "";
    }
}
