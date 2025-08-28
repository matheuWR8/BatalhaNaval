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
    
    private String tipo;
    private int tamanho;
    private int partesRestantes;
    
    public int getTamanho() {
        return tamanho;
    }
    
    public void destruirParte(){
        partesRestantes--;
    }
}
