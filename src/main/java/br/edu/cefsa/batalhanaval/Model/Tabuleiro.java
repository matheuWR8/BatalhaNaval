package br.edu.cefsa.batalhanaval.Model;

import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Cruzador;
import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Destroier;
import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Embarcacao;
import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Fragata;
import br.edu.cefsa.batalhanaval.Model.Embarcacoes.PortaAvioes;
import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Submarino;
import java.util.ArrayList;

/**
 * Tabuleiro do jogo
 */
public class Tabuleiro {

    private int tamanho;
    private Celula[][] grade;
    
    /**
     * 
     * @param tamanho tamanho do lado do tabuleiro (quadrado) 
     */
    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        this.grade = new Celula[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) { // popula o tabuleiro de células
            for (int j = 0; j < tamanho; j++) {
                grade[i][j] = new Celula();
            }
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    /**
     * Retorna a célula na coordenada (x,y) do tabuleiro.
     * 
     * @param x coordenada x da célula
     * @param y coordenada y da célula
     * @return célula (x,y) do tabuleiro
     */
    public Celula getCelula(int x, int y) {
        return grade[x][y];
    }

    /**
     * Posiciona uma embarcação na posição e direção definidas, se for possível;
     * (x,y) é a posição da extremidade superior (vert.) ou esquerda (horiz.),
     * demais células são ocupadas conforme o tamanho do navio.
     * 
     * @param navio embarcação a ser posicionada
     * @param x coordenada x da primeira posição
     * @param y coordenada y da primeira posição
     * @param ehHorizontal true para posicionar na horizontal; false para vertical
     * @return true se foi possível posicionar o navio
     */
    public boolean posicionarNavio(Embarcacao navio, int x, int y, boolean ehHorizontal) {
        Celula[] posicoes = new Celula[navio.getTamanho()]; // array de posições validadas

        if (validarPosicionamento(navio.getTamanho(), x, y, ehHorizontal, posicoes)) {
            for (Celula celula : posicoes) { // posicionar o navio em cada célula
                celula.setNavio(navio);
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * Valida se o posicionamento escolhido para o navio é válido,
     * isto é, se todas as partes estão dentro da matriz e as posições estão livres
     * 
     * @param navio embarcação a ser posicionada
     * @param x coordenada x da primeira posição
     * @param y coordenada y da primeira posição
     * @param ehHorizontal true para posicionar na horizontal; false para vertical
     * @param posicoes array para armazenar as posições validadas
     * @return true se todas as posições são válidas
     */
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

    /**
     * Verifica se uma posição (x,y) está dentro do tabuleiro
     * @param x coordenada x da posição
     * @param y coordenada y da posição
     * @return true se a posição estiver dentro do tabuleiro
     */
    public boolean validarPosicao(int x, int y) {
        boolean celulaExiste = (x >= 0 && x < tamanho) && (y >= 0 && y < tamanho);
        return celulaExiste;
    }
    
    /**
     * Gera uma matriz de caracteres correspondentes ao estado de cada posição
     * 
     * @return matriz de char representando o tabuleiro
     */
    public char[][] getTabuleiroFull(){
        char[][] tabuleiroChar = new char[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++) {
                tabuleiroChar[i][j] = getCharFromCelula(grade[i][j]);
            }
        }
        return tabuleiroChar;
    }
    
    /**
     * Traduz o estado de uma célula para um caractere correspondente:
     * '~' - água não atingida
     * 'o' - água atingida
     * 'P|C|F|D|S' - parte inteira de navio do tipo respectivo
     * '@' - parte atingida da embarcação
     * '#' - navio afundado
     * 
     * @param celula célula cujo estado será traduzido
     * @return caractere correspondente ao estado da célula
     */
    private char getCharFromCelula(Celula celula){
        if (celula.contemNavio()) {
            if (celula.foiAtingida()){
                if (celula.getNavio().afundou()){
                    return '#';
                }
                return '@';
            }
            return celula.getNavio().getTipo();
        }
        if (celula.foiAtingida()){
            return 'o';
        }
        return '~';
    }

}
