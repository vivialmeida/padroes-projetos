package atv9.questao4;

public class ElevacaoTemperaturaAmbiente implements RoboAction{
    private Robo robo;

    public ElevacaoTemperaturaAmbiente(Robo robo) {
        this.robo = robo;
    }

    @Override
    public void execute() {
        this.robo.elevarTemperaturaAmbiente();
    }
}
