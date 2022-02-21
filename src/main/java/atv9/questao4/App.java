package atv9.questao4;

public class App {
    public static void main(String[] args) {
        Experimento experimento = new Experimento();

        Robo robo = new Robo();
        ElevacaoTemperaturaAmbiente acao1 = new ElevacaoTemperaturaAmbiente(robo);
        AplicacaoProdutoQuimico acao2 = new AplicacaoProdutoQuimico(robo);

        experimento.adicionaAcao(acao1);
        experimento.adicionaAcao(acao2);

        experimento.executaAcoes();
    }
}
