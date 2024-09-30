package SegundoAno.POOTreino.EstruturasCondicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        boolean maioridade = true;
        boolean carteiraDeMotorista = true;
        boolean carteiraDeMotoristaVencida = true;

        System.out.println("USANDO OPERADORES LÓGICOS E RELACIONAIS");
        if(maioridade & carteiraDeMotorista ^ carteiraDeMotoristaVencida) {
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir!");
        }

        System.out.println("SEM USAR OPERADORES LÓGICOS E RELACIONAIS");
        if(maioridade){
            if(carteiraDeMotorista) {
                if(carteiraDeMotoristaVencida) {
                    System.out.println("Carteira de motorista vencida. Não pode dirigir!");
                } else {
                    System.out.println("Pode dirigir!");
                }
            } else {
                System.out.println("Não possui carteira de motorista. Não pode dirigir!");
            }
        } else {
            System.out.println("Não pode dirigir!");
        }
    }
}
