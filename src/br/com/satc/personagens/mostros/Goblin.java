/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.mostros;

import br.com.satc.personagens.IPersonagem;
import br.com.satc.personagens.Personagem;
import java.util.Random;

/**
 *
 * @author Edutec
 */
public class Goblin extends Monstros {

    public Goblin(int exp, String descricao, int drop, int skillpassiva, int skillativa, int nivel, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(exp, descricao, drop, skillpassiva, skillativa, nivel, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);

        this.setNome("Goblin");
        this.setDescricao("Um goblin equipado com uma Adaga velha e enferrujada.");
        this.setExp(10);
        this.setNivel(1);
        this.setDrop(5);
        this.setForca(2);
        this.setAgilidade(3);
        this.setVitalidade(4);
        this.setInteligencia(1);
        this.setDestreza(6);
        this.setSorte(2);
    }

    @Override
    public void atacar(Personagem alvo, Personagem atacante) {
        System.out.println("Goblin atacou com a adaga com o ataque básico.");
        alvo.receberDano(20);
    }

    @Override
    public void drop(Monstros monstro, Personagem personagem) {
        //Dropa 5 de gold
        
    }

    

}
