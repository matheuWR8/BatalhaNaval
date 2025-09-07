package br.edu.cefsa.batalhanaval.Model;

import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Embarcacao;

/**
 * Jogador com seu tabuleiro e embarcações
 */
public class Jogador {
    private String nome;
    private Tabuleiro tabuleiro;
    private Embarcacao[] embarcacoes;
    
    /**
     * Construtor do jogador
     * 
     * @param nome nome do jogador
     * @param tamanhoTabuleiro tamanho do tabuleiro
     * @param embarcacoes embarcações do jogador
     */
    public Jogador(String nome, int tamanhoTabuleiro, Embarcacao[] embarcacoes) {
        this.nome = nome;
        this.tabuleiro = new Tabuleiro(tamanhoTabuleiro);
        this.embarcacoes = embarcacoes;
    }

    public String getNome() {
        return nome;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public Embarcacao[] getEmbarcacoes() {
        return embarcacoes;
    }
}
