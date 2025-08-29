/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.cefsa.batalhanaval;

import br.edu.cefsa.batalhanaval.Model.Destroier;
import br.edu.cefsa.batalhanaval.Model.Tabuleiro;

/**
 *
 * @author math
 */
public class BatalhaNaval {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Tabuleiro tabuleiro = new Tabuleiro(10);
        Destroier destroier = new Destroier();

        if (tabuleiro.posicionarNavio(destroier, 0, 0, false)){
            System.out.println("Destroier posto");
        }

        destroier.tiroSimples(tabuleiro, 12, 1);


        System.out.println("Hello World!");

    }
}
