package SegundoAno.TesteDeSoftware.DeD.JavaDeD.src;

import java.util.Map;
import java.util.HashMap;

public class Raca {
    private String nome;
    private Map<String, Integer> modificadores;

    public Raca(String nome) {
        this.nome = nome;
        this.modificadores = new HashMap<>();
        definirModificadores(); // Aplicar os modificadores baseados na raça
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Integer> getModificadores() {
        return modificadores;
    }

    // Definir os modificadores raciais de acordo com o livro de D&D
    private void definirModificadores() {
        switch (nome.toLowerCase()) {
            case "anao da montanha":
                modificadores.put("forca", 2);
                modificadores.put("constituicao", 2);
                break;
            case "humano":
                modificadores.put("forca", 1);
                modificadores.put("destreza", 1);
                modificadores.put("constituicao", 1);
                modificadores.put("inteligencia", 1);
                modificadores.put("sabedoria", 1);
                modificadores.put("carisma", 1);
                break;
            case "draconato":
                modificadores.put("forca", 2);
                modificadores.put("carisma", 1);
                break;
            case "meio-orc":
                modificadores.put("forca", 2);
                modificadores.put("constituicao", 1);
                break;
            case "elfo":
                modificadores.put("destreza", 2);
                break;
            case "halfling":
                modificadores.put("destreza", 2);
                break;
            case "alto elfo":
                modificadores.put("destreza", 2);
                modificadores.put("inteligencia", 1);
                break;
            case "gnomo da floresta":
                modificadores.put("destreza", 1);
                break;
            case "gnomo das rochas":
                modificadores.put("constituicao", 1);
                break;
            case "anao":
                modificadores.put("constituicao", 2);
                break;
            case "halfling-robusto":
                modificadores.put("constituicao", 1);
                break; 
            case "gnomo":
                modificadores.put("inteligencia", 2);
                break;
            case "tiefling":
                modificadores.put("inteligencia", 1);
                modificadores.put("carisma", 1);
                break;
            case "anao da colina":
                modificadores.put("sabedoria", 1);
                break;
            case "elfo da floresta":
                modificadores.put("sabedoria", 1);
                break;
            case "drow":
                modificadores.put("carisma", 1);
                break;
            case "halfling pes-leves":
                modificadores.put("carisma", 1);
                break;    
            case "meio-elfo":
                modificadores.put("carisma", 2);
                break;    
            default:
                System.out.println("Raça não reconhecida, sem modificadores aplicados.");
                break;
        }
    }
}
