/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model.Tiros;

import br.edu.cefsa.batalhanaval.Model.Tabuleiro;

/**
 *
 * @author math
 */
public class TiroSimples implements Tiro{
    
    @Override
    public void disparar(Tabuleiro tabuleiro, int x, int y) {
        if (tabuleiro.validarPosicao(x, y)) {
            tabuleiro.getCelula(x,y).atingir();
        }
    }
}
