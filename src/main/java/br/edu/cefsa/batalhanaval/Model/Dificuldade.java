/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model;

import br.edu.cefsa.batalhanaval.Model.Embarcacoes.PortaAvioes;
import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Embarcacao;
import java.util.ArrayList;

/**
 *
 * @author math
 */
public enum Dificuldade {
    FACIL(10, new int[]{1,1,2,2,2}),
    MEDIO(15, new int[]{1,2,3,2,3}),
    DIFICIL(30, new int[]{2,3,4,4,5});

    private final int tamanhoTabuleiro;
    private final int[] quantidadeNavios;

    private Dificuldade(int tamanhoTabuleiro, int[] quantidadeNavios) {
        this.tamanhoTabuleiro = tamanhoTabuleiro;
        this.quantidadeNavios = quantidadeNavios;
    }
    
    public int getTamanho(){
        return tamanhoTabuleiro;
    }
        
}
