package br.edu.cefsa.batalhanaval.Model.Tiros;

import br.edu.cefsa.batalhanaval.Model.Tabuleiro;

/**
 *  Estratégia de tiro
 */
public interface Tiro {
    /**
     * Dispara contra célula (x,y) do tabuleiro
     * 
     * @param tabuleiro tabuleiro a ser atingido
     * @param x coordenada x do alvo
     * @param y coordenada y do alvo
     */
    void disparar(Tabuleiro tabuleiro, int x, int y);
}
