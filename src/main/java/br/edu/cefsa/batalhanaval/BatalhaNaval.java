/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.cefsa.batalhanaval;

import br.edu.cefsa.batalhanaval.Model.Embarcacoes.PortaAvioes;
import br.edu.cefsa.batalhanaval.Model.*;

/**
 *
 * @author math
 */
public class BatalhaNaval {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Tabuleiro tabuleiro = new Tabuleiro(10);
        PortaAvioes destroier = new PortaAvioes();

        if (tabuleiro.posicionarNavio(destroier, 0, 0, false)){
            System.out.println("Destroier posto");
        }

        destroier.darTiro(tabuleiro, 2, 1);


        System.out.println("Hello World!");

    }
}
