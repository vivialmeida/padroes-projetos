package atv6.questao3;

public class Indeferido extends Avaliado implements EstadoDoProcesso{
    @Override
    public void validar(Processo processo) {
        throw new RuntimeException("Processo Indeferido não pode ser validado");
    }

    @Override
    public void designar(Processo processo) {
        throw new RuntimeException("Processo Indeferido não pode ser designado");
    }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Processo Indeferido não pode ser cancelado");
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo Indeferido não pode ser deferido");
    }

    @Override
    public void indeferir(Processo processo) {
        processo.estado = new EmRecurso();
    }

    @Override
    public void prazoLegal(Processo processo) {
        throw new RuntimeException("Processo Indeferido não pode ser prazo legal");
    }
}
