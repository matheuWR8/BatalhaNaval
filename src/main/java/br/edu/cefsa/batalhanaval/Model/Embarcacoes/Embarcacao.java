package br.edu.cefsa.batalhanaval.Model.Embarcacoes;

import br.edu.cefsa.batalhanaval.Model.Tabuleiro;
import br.edu.cefsa.batalhanaval.Model.Tiros.Tiro;
import br.edu.cefsa.batalhanaval.Model.Tiros.TiroSimples;

/**
 * Embarcação abstrata
 */
public abstract class Embarcacao {
    
    protected String tipo;
    protected Tiro tipoDeTiro;
    protected int tamanho;
    protected int partesRestantes;
    
    public Embarcacao(String tipo, int tamanho) {
        this.tipo = tipo;
        this.tipoDeTiro = new TiroSimples();
        this.tamanho = tamanho;
        this.partesRestantes = tamanho;
    }
    
    public String getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    /**
     * 
     * @return número de partes restantes da embarcação 
     */
    public int getPartesRestantes() {
        return partesRestantes;
    }
    
    /**
     * Verifica se a embarcação foi afundada.
     * 
     * @return true se houver 0 partes restantes
     */
    public boolean foiAfundada() {
        return partesRestantes == 0;
    }
    
    /**
     * Define o tipo de tiro da embarcação.
     * 
     * @param tiro objeto de estratégia de tiro
     */
    public void setTipoDeTiro(Tiro tiro) {
        this.tipoDeTiro = tiro;
    }
    
    /**
     * Elimina uma parte do navio, se ele já não estiver destruído.
     */
    public void destruirParte(){
        if (partesRestantes > 0) {
            partesRestantes--;
        }
    }
    
    // TODO: os métodos de tiro devem notificar quantos barcos foram atingidos
    // ou outro indicativo de sucesso ou falha

    /**
     * Efetua disparo na coordenada (x,y), conforme a estratégia de tiro definida
     * 
     * @param tabuleiro tabuleiro que receberá o tiro
     * @param x coordenada x da célula alvo do tiro
     * @param y coordenada y da célula alvo do tiro
     */
    public void darTiro(Tabuleiro tabuleiro, int x, int y) {
        tipoDeTiro.disparar(tabuleiro, x, y);
    }
    
}
