/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model;

import java.util.ArrayList;

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
    
    public boolean posicionarNavio(Embarcacao navio, int x, int y, boolean ehHorizontal){
        ArrayList<Celula> posicoes = new ArrayList<>();

        if (validarPosicoes(navio.getTamanho(), x, y, ehHorizontal, posicoes)){
            for (Celula celula : posicoes) {
                celula.setNavio(navio);
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean validarPosicoes(int tamanhoNavio, int x, int y, boolean ehHorizontal, 
                                    ArrayList<Celula> posicoes) {
        if (ehHorizontal) {
            if (x + tamanhoNavio > tamanho) {
                return false;
            }

            for (int i = 0; i < tamanhoNavio; i++){
                if (grade[x+i][y].contemNavio()) {
                    return false;
                }
                posicoes.add(grade[x+i][y]);
            }
        } else {
            if (y + tamanhoNavio > tamanho) {
                return false;
            }

            for (int i = 0; i < tamanhoNavio; i++){
                if (grade[x][y+i].contemNavio()) {
                    return false;
                }
                posicoes.add(grade[x+i][y]);
            }
        }

        return true;
    }

}
