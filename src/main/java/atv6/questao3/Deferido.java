package atv6.questao3;

public class Deferido extends Avaliado implements EstadoDoProcesso{
    @Override
    public void validar(Processo processo) { throw new RuntimeException("Processo Deferido não pode ser validado"); }

    @Override
    public void designar(Processo processo) { throw new RuntimeException("Processo Deferido não pode ser designado"); }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Processo Deferido não pode ser cancelado");
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo Deferido não pode ser deferido");
    }

    @Override
    public void indeferir(Processo processo) { throw new RuntimeException("Processo Deferido não pode ser indeferido"); }
}
