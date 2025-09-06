/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model.Embarcacoes;

import br.edu.cefsa.batalhanaval.Model.Tabuleiro;
import br.edu.cefsa.batalhanaval.Model.Tiros.Tiro;
import br.edu.cefsa.batalhanaval.Model.Tiros.TiroSimples;

/**
 *
 * @author math
 */
public abstract class Embarcacao {
    
    protected String tipo;
    protected Tiro tipoDeTiro;
    protected int tamanho;
    protected int partesRestantes;
    protected boolean foiAfundada;
    
    public Embarcacao(String tipo, int tamanho) {
        this.tipo = tipo;
        this.tipoDeTiro = new TiroSimples();
        this.tamanho = tamanho;
        this.partesRestantes = tamanho;
        this.foiAfundada = false;
    }
    
    public String getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPartesRestantes() {
        return partesRestantes;
    }
    
    public boolean foiAfundada() {
        return foiAfundada();
    }
    
    public void setTipoDeTiro(Tiro tiro) {
        this.tipoDeTiro = tiro;
    }
    
    public void destruirParte(){
        if (partesRestantes > 0) {
            partesRestantes--;
            if (partesRestantes == 0) {
                foiAfundada = true;
            }
        }
    }
    
    // TODO: os métodos de tiro devem notificar quantos barcos foram atingidos 

    public void darTiro(Tabuleiro tabuleiro, int x, int y) {
        tipoDeTiro.disparar(tabuleiro, x, y);
    }
}
