package br.edu.cefsa.batalhanaval.Model;

import br.edu.cefsa.batalhanaval.Model.Embarcacoes.Embarcacao;

/**
 *  Célula de um tabuleiro
 */
public class Celula {

    private boolean contemNavio;
    private boolean foiAtingida;
    private Embarcacao navio;

    public Celula() {
        this.contemNavio = false;
        this.foiAtingida = false;
        this.navio = null;
    }

    /**
     * Define a embarcação que ocupa esta célula
     * @param navio embarcação a ser posta na célula
     */
    public void setNavio(Embarcacao navio) {
        this.navio = navio;
        contemNavio = true;
    }

    /**
     * Atinge uma célula e, se possui embarcação, subtrai parte a parte atingida dele
     * @return true se atingiu uma embarcação
     */
    public boolean atingir() {
        
        if (contemNavio && !foiAtingida) { // se conter parte de navio não atingida
            navio.destruirParte(); // subtrai a parte do navio
            foiAtingida = true;
            return true;
        }
        
        foiAtingida = true;
        return false;
    }
    
    /**
     * Verifica se a célula contém um navio
     * 
     * @return true se contém embarcação
     */
    public boolean contemNavio() {
        return contemNavio;
    }
    
    /**
     * Verifica se a célula já foi atingida
     * 
     * @return true se foi atingida
     */
    public boolean foiAtingida() {
        return foiAtingida;
    }

}
