/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model;

/**
 *
 * @author math
 */
public abstract class Navio {
    
    private String tipo;
    private int tamanho;
    private int partesRestantes;
    
    public void destruirParte(){
        partesRestantes--;
    }
}
