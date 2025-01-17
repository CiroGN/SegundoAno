/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.main.java.com.mycompany.atividadestestedesoftware;

import java.util.HashMap;

/**
 *
 * @author usuario
 */

public class Personagem {

    DistribuirPontosStrategy raca; // Estratégia de distribuição de pontos baseada na raça
    ModificadorAtributo modificadorAtributo;

    // Construtor recebe o tipo de raça como classe e os valores dos atributos
    public Personagem(Class<? extends DistribuirPontosStrategy> classeRaca, int forca, int destreza, int constituicao, int sabedoria, int inteligencia, int carisma) {
        // Inicializa os atributos básicos
        Atributo atributos = new Atributo();

        // Cria a instância de DistribuirEscolha27
        DistribuirEscolha27 distribuirEscolha27 = new DistribuirEscolha27(atributos);
        distribuirEscolha27.setAtributo("Forca", forca);
        distribuirEscolha27.setAtributo("Destreza", destreza);
        distribuirEscolha27.setAtributo("Constituicao", constituicao);
        distribuirEscolha27.setAtributo("Sabedoria", sabedoria);
        distribuirEscolha27.setAtributo("Inteligencia", inteligencia);
        distribuirEscolha27.setAtributo("Carisma", carisma);
        

        // Instancia a raça dinamicamente
        try {
            this.raca = classeRaca.getDeclaredConstructor(DistribuirEscolha27.class).newInstance(distribuirEscolha27);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao instanciar a raça: " + e.getMessage());
        }

        // Cria o modificador de atributos
        this.modificadorAtributo = new ModificadorAtributo(this.raca);
    }
    
    public DistribuirPontosStrategy getRaca() {
        return this.raca;
    }

    public ModificadorAtributo getModificadorAtributo() {
        return modificadorAtributo;
    }


    public void mostraInfo() {
        System.out.println("\nRACA: " + raca.getClass().getSimpleName());
        System.out.println("PONTOS DE VIDA: " + modificadorAtributo.getPontosVida() + "\n");
        System.out.println("ATRIBUTOS:\n");
        System.out.println("FORÇA: " + raca.getAtributo("Forca"));
        System.out.println("DESTREZA: " + raca.getAtributo("Destreza"));
        System.out.println("CONSTITUIÇÃO: " + raca.getAtributo("Constituicao"));
        System.out.println("SABEDORIA: " + raca.getAtributo("Sabedoria"));
        System.out.println("INTELIGÊNCIA: " + raca.getAtributo("Inteligencia"));
        System.out.println("CARISMA: " + raca.getAtributo("Carisma"));
        System.out.println("\nMODIFICADORES DE ATRIBUTOS\n");
        System.out.println("MODIFICADOR_FORÇA: " + modificadorAtributo.getModificador("Forca"));
        System.out.println("MODIFICADOR_DESTREZA: " + modificadorAtributo.getModificador("Destreza"));
        System.out.println("MODIFICADOR_CONSTITUIÇÃO: " + modificadorAtributo.getModificador("Constituicao"));
        System.out.println("MODIFICADOR_SABEDORIA: " + modificadorAtributo.getModificador("Sabedoria"));
        System.out.println("MODIFICADOR_INTELIGÊNCIA: " + modificadorAtributo.getModificador("Inteligencia"));
        System.out.println("MODIFICADOR_CARISMA: " + modificadorAtributo.getModificador("Carisma"));
    }
}
