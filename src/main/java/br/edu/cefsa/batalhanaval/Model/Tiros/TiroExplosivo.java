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
public class TiroExplosivo implements Tiro {

    @Override
    public void disparar(Tabuleiro tabuleiro, int x, int y) {
        if (!tabuleiro.validarPosicao(x, y)) {
            return;
        }

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (tabuleiro.validarPosicao(x + i, y + j)) {
                    tabuleiro.getCelula(x, y).atingir();
                }
            }
        }
    }
}
