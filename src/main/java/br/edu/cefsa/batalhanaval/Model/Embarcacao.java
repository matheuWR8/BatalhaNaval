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
}
