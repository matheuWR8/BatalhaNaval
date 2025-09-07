package br.edu.cefsa.batalhanaval.Model;

import br.edu.cefsa.batalhanaval.Model.Embarcacoes.PortaAvioes;
import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Embarcacao;
import java.util.ArrayList;

/**
 * Níveis de dificuldade do jogo
 */
public enum Dificuldade {
    FACIL(10, new int[]{1,1,2,2,2}),
    MEDIO(15, new int[]{1,2,3,2,3}),
    DIFICIL(30, new int[]{2,3,4,4,5});

    private final int tamanhoTabuleiro;
    private final int[] quantidadeNavios;
    
    /**
     * Construtor de dificuldade
     * @param tamanhoTabuleiro tamanho do lado do tabuleiro
     * @param quantidadeNavios quantidade de cada tipo de navio
     */
    private Dificuldade(int tamanhoTabuleiro, int[] quantidadeNavios) {
        this.tamanhoTabuleiro = tamanhoTabuleiro;
        this.quantidadeNavios = quantidadeNavios;
    }
    
    public int getTamanho(){
        return tamanhoTabuleiro;
    }
        
}
