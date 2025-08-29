/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model;

/**
 *
 * @author math
 */
public class PortaAvioes extends Embarcacao {
    
    public PortaAvioes() {
        super.tipo = "Porta-Aviões";
        super.tamanho = 6;
        super.partesRestantes = tamanho;
    }

    @Override
    public void tiroDuplo(Tabuleiro tabuleiro, int x, int y) {
        
    }

    @Override
    public void tiroExplosivo(Tabuleiro tabuleiro, int x, int y) {
        
    }


}
