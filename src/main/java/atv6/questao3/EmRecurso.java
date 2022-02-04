package atv6.questao3;

public class EmRecurso implements EstadoDoProcesso{
    @Override
    public void validar(Processo processo) {

    }

    @Override
    public void designar(Processo processo) {
        processo.estado = new EmAvaliacao();
    }

    @Override
    public void cancelar(Processo processo) {

    }

    @Override
    public void deferir(Processo processo) {

    }

    @Override
    public void indeferir(Processo processo) {

    }

    @Override
    public void prazoLegal(Processo processo) {

    }
}
