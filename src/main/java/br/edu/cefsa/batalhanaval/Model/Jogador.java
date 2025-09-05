package br.edu.cefsa.batalhanaval.Model;

import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Embarcacao;

public class Jogador {
    private String nome;
    private Tabuleiro tabuleiro;
    private Embarcacao[] embarcacoes;
    
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
