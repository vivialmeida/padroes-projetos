package atv6.questao3;

public class EmRecurso implements EstadoDoProcesso{
    @Override
    public void validar(Processo processo) { throw new RuntimeException("Processo Em_Recurso não pode ser validado"); }

    @Override
    public void designar(Processo processo) { processo.estado = new EmAvaliacao(); }

    @Override
    public void cancelar(Processo processo) { throw new RuntimeException("Processo Em_Recurso não pode ser validado"); }

    @Override
    public void deferir(Processo processo) { throw new RuntimeException("Processo Em_Recurso não pode ser validado"); }

    @Override
    public void indeferir(Processo processo) { throw new RuntimeException("Processo Em_Recurso não pode ser validado"); }

    @Override
    public void transcorrerPrazoLegal(Processo processo) { throw new RuntimeException("Processo Em_Recurso não pode ser validado"); }
}
