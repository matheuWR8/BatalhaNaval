/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author math
 */
public class Tabuleiro {

    private int tamanho;
    private Celula[][] grade;

    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        this.grade = new Celula[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                grade[i][j] = new Celula();
            }
        }
    }

    public Celula getCelula(int x, int y) {
        return grade[x][y];
    }
    
    public void posicionarNavio(Embarcacao navio, int x, int y, boolean horizontal){
        LinkedList<Celula> posicoes = new LinkedList<Celula>();
        if (horizontal) {
            for (int i = 0; i < navio.getTamanho(); i++){
                if (grade[x+i][y].estaOcupada()) {
                    posicoes.add(grade[x+i][y]);
                } else {
                    return;
                }
            }
        } else {
            for (int i = 0; i < navio.getTamanho(); i++){
                if (grade[x][y+i].estaOcupada()) {
                    posicoes.add(grade[x+i][y]);
                } else {
                    return;
                }
            }
        }
        // ...
    }

}
