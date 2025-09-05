/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.batalhanaval.Model;

import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Embarcacao;
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

    public int getTamanho() {
        return tamanho;
    }

    public Celula getCelula(int x, int y) {
        return grade[x][y];
    }

    public boolean posicionarNavio(Embarcacao navio, int x, int y, boolean ehHorizontal) {
        Celula[] posicoes = new Celula[navio.getTamanho()];

        if (validarPosicionamento(navio.getTamanho(), x, y, ehHorizontal, posicoes)) {
            for (Celula celula : posicoes) {
                celula.setNavio(navio);
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean validarPosicionamento(int tamanhoNavio, int x, int y, boolean ehHorizontal,
                                    Celula[] posicoes) {
        if (!validarPosicao(x, y)) {
            return false;
        }

        if (ehHorizontal) {
            if (x + tamanhoNavio > tamanho) {
                return false;
            }

            for (int i = 0; i < tamanhoNavio; i++) {
                if (grade[x + i][y].contemNavio()) {
                    return false;
                }
                posicoes[i] = grade[x + i][y];
            }
        } else {
            if (y + tamanhoNavio > tamanho) {
                return false;
            }

            for (int i = 0; i < tamanhoNavio; i++) {
                if (grade[x][y + i].contemNavio()) {
                    return false;
                }
                posicoes[i] = grade[x][y + i];
            }
        }

        return true;
    }

    public boolean validarPosicao(int x, int y) {
        boolean celulaExiste = (x >= 0 && x < tamanho) && (y >= 0 && y < tamanho);
        return celulaExiste;
    }

}
