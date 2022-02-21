package atv9.questao4;

public class AplicacaoProdutoQuimico implements RoboAction{
    private Robo robo;

    public AplicacaoProdutoQuimico(Robo robo) {
        this.robo = robo;
    }

    @Override
    public void execute() {
        this.robo.aplicarProdutoQuimico();
    }
}
