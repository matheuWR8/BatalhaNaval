/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model;

/**
 *
 * @author math
 */
public abstract class Embarcacao {
    
    protected String tipo;
    protected int tamanho;
    protected int partesRestantes;
    
    public String getTipo() {
        return tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPartesRestantes() {
        return partesRestantes;
    }
    
    public void destruirParte(){
        partesRestantes--;
    }
    
    // TODO: os métodos de tiro devem notificar que atingiram um barco e quantos

    public void tiroSimples(Tabuleiro tabuleiro, int x, int y) {
        if (tabuleiro.validarPosicao(x, y)) {
            tabuleiro.getCelula(x,y).atingir();
        }
    }

    protected void tiroDuplo(Tabuleiro tabuleiro, int x, int y, boolean ehHorizontal) {
        tiroSimples(tabuleiro, x, y);
        if (ehHorizontal) {
            tiroSimples(tabuleiro, x+1, y);
        } else {
            tiroSimples(tabuleiro, x, y+1);
        }
    }

    protected void tiroExplosivo(Tabuleiro tabuleiro, int x, int y) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++){
                tiroSimples(tabuleiro, x+i, y+j);
            }
        }
    }
}
