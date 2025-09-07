package br.edu.cefsa.batalhanaval.Model.Tiros;

import br.edu.cefsa.batalhanaval.Model.Tabuleiro;

/**
 * Estratégia de tiro explosivo, que afeta um quadrado 3x3 ao redor do alvo
 */
public class TiroExplosivo implements Tiro { 
    
    @Override
    public void disparar(Tabuleiro tabuleiro, int x, int y) {
        // não é permitida uma posição inválida como alvo
        if (!tabuleiro.validarPosicao(x, y)) { 
            return;
        }

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                // as bordas podem sair do tabuleiro, mas são ignoradas
                if (tabuleiro.validarPosicao(x + i, y + j)) {
                    tabuleiro.getCelula(x, y).atingir();
                }
            }
        }
    }
    
}
