/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.mostros;

/**
 *
 * @author Edutec
 */
public abstract class Monstros extends br.com.satc.personagens.Personagem implements IMonstro{
    
    private int drop, skillpassiva, skillativa;;
    
    public Monstros(int drop, int skillpassiva, int skillativa, int nivel,String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        this.setNivel(nivel);
        this.setDrop(drop);
        this.setSkillativa(skillativa);
        this.setSkillpassiva(skillpassiva);
    }

    /**
     * @return the drop
     */
    public int getDrop() {
        return drop;
    }

    /**
     * @param drop the drop to set
     */
    public void setDrop(int drop) {
        this.drop = drop;
    }

    /**
     * @return the skillpassiva
     */
    public int getSkillpassiva() {
        return skillpassiva;
    }

    /**
     * @param skillpassiva the skillpassiva to set
     */
    public void setSkillpassiva(int skillpassiva) {
        this.skillpassiva = skillpassiva;
    }

    /**
     * @return the skillativa
     */
    public int getSkillativa() {
        return skillativa;
    }

    /**
     * @param skillativa the skillativa to set
     */
    public void setSkillativa(int skillativa) {
        this.skillativa = skillativa;
    }
    
    
}
    