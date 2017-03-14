/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.mostros;

import br.com.satc.personagens.Personagem;

/**
 *
 * @author Edutec
 */
public class Goblin extends Monstros{

    public Goblin(int drop, int skillpassiva, int skillativa, int nivel, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, skillpassiva, skillativa, nivel, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }


    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drop(Monstros monstro, Personagem personagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
