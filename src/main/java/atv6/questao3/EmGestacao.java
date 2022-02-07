package atv6.questao3;

public class EmGestacao implements EstadoDoProcesso{
    @Override
    public void validar(Processo processo) { processo.estado = new Criado(); }

    @Override
    public void designar(Processo processo) { throw new RuntimeException("Processo Em_Gestacao nao pode ser designado"); }

    @Override
    public void cancelar(Processo processo) { throw new RuntimeException("Processo Em_Gestacao nao pode ser cancelado"); }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo Em_Gestacao nao pode ser deferido");
    }

    @Override
    public void indeferir(Processo processo) { throw new RuntimeException("Processo Em_Gestacao nao pode ser indeferido"); }

    @Override
    public void transcorrerPrazoLegal(Processo processo) { throw new RuntimeException("Processo Em_Gestacao nao pode ser fechado"); }
}
