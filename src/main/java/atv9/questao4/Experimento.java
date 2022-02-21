package atv9.questao4;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    public List<RoboAction> acoes;

    public Experimento() {
        this.acoes = new ArrayList<>();
    }

    public void adicionaAcao(RoboAction acao){
        this.acoes.add(acao);
    }

    public void executaAcoes(){
        for (RoboAction acao : this.acoes) {
            acao.execute();
        }
    }
}
