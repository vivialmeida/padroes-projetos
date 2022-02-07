package atv6.questao3;

public class Criado implements EstadoDoProcesso {
    @Override
    public void validar(Processo processo) { throw new RuntimeException("Processo Criado nao pode ser validado"); }

    @Override
    public void designar(Processo processo) {
        processo.estado = new EmAvaliacao();
    }

    @Override
    public void cancelar(Processo processo) {
        processo.estado = new Fechado();
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo Criado nao pode ser deferido");
    }

    @Override
    public void indeferir(Processo processo) {
        throw new RuntimeException("Processo Criado nao pode ser indeferido");
    }

    @Override
    public void transcorrerPrazoLegal(Processo processo) { throw new RuntimeException("Processo Criado nao pode ser fechado"); }
}
