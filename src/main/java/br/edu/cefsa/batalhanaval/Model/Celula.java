/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model;

/**
 *
 * @author math
 */
public class Celula {

    private boolean contemNavio;
    private boolean foiAtingida;
    private Embarcacao navio;

    public Celula() {
        this.contemNavio = false;
        this.foiAtingida = false;
        this.navio = null;
    }

    public void setNavio(Embarcacao navio) {
        this.navio = navio;
        contemNavio = true;
    }

    public boolean atingir() {
        foiAtingida = true;
        if (contemNavio) {
            navio.destruirParte();
            return true;
        }
        
        return false;
    }
    
    public boolean estaOcupada() {
        return !contemNavio;
    }
    

}
