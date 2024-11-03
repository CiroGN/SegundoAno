package POOTreino.Encapsulamento.Encapsulamento2.ExChamada;

public class Chamada {
    String nomeEstudante;
    String codigo;
    int faltas;
    public String getNomeEstudante() {
        return nomeEstudante;
    }
    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        if (faltas > 3 || faltas < 0) {
            throw new IllegalArgumentException("Número de faltas não pode ultrapassar 3 ou ser negativo");
        }
        this.faltas = faltas;
    }
    Chamada(String nomeEstudante, String codigo, int faltas){
        setNomeEstudante(nomeEstudante);
        setCodigo(codigo);
        setFaltas(faltas);
    }
}
