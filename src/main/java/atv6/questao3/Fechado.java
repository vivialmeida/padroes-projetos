package atv6.questao3;

public class Fechado implements EstadoDoProcesso{
    @Override
    public void validar(Processo processo) { throw new RuntimeException("Processo Fechado não pode ser validado"); }

    @Override
    public void designar(Processo processo) { throw new RuntimeException("Processo Fechado não pode ser designado"); }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Processo Fechado não pode ser cancelado");
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo Fechado não pode ser deferido");
    }

    @Override
    public void indeferir(Processo processo) {
        throw new RuntimeException("Processo Fechado não pode ser indeferido");
    }

    @Override
    public void transcorrerPrazoLegal(Processo processo) { throw new RuntimeException("Processo Fechado não pode ser fechado"); }
}
