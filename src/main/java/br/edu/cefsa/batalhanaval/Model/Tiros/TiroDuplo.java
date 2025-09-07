/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model.Tiros;

import br.edu.cefsa.batalhanaval.Model.Tabuleiro;

/**
 * Estratégia de tiro duplo, que atinge duas células adjacentes
 */
public class TiroDuplo implements Tiro {
    
    // TODO: Fazer algum modo para escolher a orientação do disparo; talvez criar
    // estratégias separadas para horizontal e vertical
    
    @Override
    public void disparar(Tabuleiro tabuleiro, int x, int y){
        if (tabuleiro.validarPosicao(x, y) && tabuleiro.validarPosicao(x + 1, y)) {
            tabuleiro.getCelula(x,y).atingir();
            tabuleiro.getCelula(x + 1, y).atingir();
        }
    }
    
}
