package br.edu.cefsa.batalhanaval.Model.Tiros;

import br.edu.cefsa.batalhanaval.Model.Tabuleiro;

/**
 * Estratégia de tiro simples, que afeta apenas a célula alvo
 */
public class TiroSimples implements Tiro{
    
    @Override
    public void disparar(Tabuleiro tabuleiro, int x, int y) {
        if (tabuleiro.validarPosicao(x, y)) { // não pode cair fora do tabuleiro
            tabuleiro.getCelula(x,y).atingir();
        }
    }
    
}
