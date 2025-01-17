/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TesteDeSoftware.DeD.DeD_AgeueCiro.AtividadesTesteDeSoftware.src.main.java.com.mycompany.atividadestestedesoftware;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        // Inicializando os atributos do personagem
        int forca = 8;
        int destreza = 8;
        int constituicao = 8;
        int sabedoria = 15;
        int inteligencia = 15;
        int carisma = 15;

        // Criando um personagem da raça Humano
        Personagem personagemHumano = new Personagem(Humano.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);

        // Mostrando informações do personagem
        personagemHumano.mostraInfo();

        // Criando um personagem da raça Elfo
        Personagem personagemElfo = new Personagem(Elfo.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);

        // Mostrando informações do personagem
        personagemElfo.mostraInfo();
        
        // Criando um personagem da raça Elfo
        Personagem personagemAnaoDaMontanha = new Personagem(AnaoDaMontanha.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);

        // Mostrando informações do personagem
        personagemAnaoDaMontanha.mostraInfo();

        // Criando um personagem da raça Draconato
        Personagem personagemDraconato = new Personagem(Draconato.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemDraconato.mostraInfo();

        // Criando um personagem da raça MeioOrc
        Personagem personagemMeioOrc = new Personagem(MeioOrc.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemMeioOrc.mostraInfo();

        // Criando um personagem da raça Halfling
        Personagem personagemHalfling = new Personagem(Halfling.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemHalfling.mostraInfo();

        // Criando um personagem da raça AltoElfo
        Personagem personagemAltoElfo = new Personagem(AltoElfo.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemAltoElfo.mostraInfo();

        // Criando um personagem da raça GnomoDaFloresta
        Personagem personagemGnomoDaFloresta = new Personagem(GnomoDaFloresta.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemGnomoDaFloresta.mostraInfo();

        // Criando um personagem da raça GnomoDasRochas
        Personagem personagemGnomoDasRochas = new Personagem(GnomoDasRochas.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemGnomoDasRochas.mostraInfo();

        // Criando um personagem da raça Anao
        Personagem personagemAnao = new Personagem(Anao.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemAnao.mostraInfo();

        // Criando um personagem da raça HalflingRobusto
        Personagem personagemHalflingRobusto = new Personagem(HalflingRobusto.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemHalflingRobusto.mostraInfo();

        // Criando um personagem da raça Gnomo
        Personagem personagemGnomo = new Personagem(Gnomo.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemGnomo.mostraInfo();

        // Criando um personagem da raça Tiefling
        Personagem personagemTiefling = new Personagem(Tiefling.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemTiefling.mostraInfo();

        // Criando um personagem da raça AnaoDaColina
        Personagem personagemAnaoDaColina = new Personagem(AnaoDaColina.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemAnaoDaColina.mostraInfo();

        // Criando um personagem da raça ElfoDaFloresta
        Personagem personagemElfoDaFloresta = new Personagem(ElfoDaFloresta.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemElfoDaFloresta.mostraInfo();

        // Criando um personagem da raça Drow
        Personagem personagemDrow = new Personagem(Drow.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemDrow.mostraInfo();

        // Criando um personagem da raça HalflingPesLeves
        Personagem personagemHalflingPesLeves = new Personagem(HalflingPesLeves.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemHalflingPesLeves.mostraInfo();

        // Criando um personagem da raça MeioElfo
        Personagem personagemMeioElfo = new Personagem(MeioElfo.class, forca, destreza, constituicao, sabedoria, inteligencia, carisma);
        // Mostrando informações do personagem
        personagemMeioElfo.mostraInfo();
    }
}
