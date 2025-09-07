package br.edu.cefsa.batalhanaval.Model;

/**
 * Classe de jogo contendo os jogadores e a dificuldade
 */
public class Jogo {
    private Dificuldade dificuldade;
    private Jogador jogador1;
    private Jogador jogador2;
    
    public Jogo(Dificuldade dificuldade){
        this.dificuldade = dificuldade;
    }
}
