package atv6.questao3;

public class EmAvaliacao implements EstadoDoProcesso{

    private void avisarInteressado(){ System.out.println("Aviso enviado para interessado"); }

    @Override
    public void validar(Processo processo) { throw new RuntimeException("Processo Em_Avaliacao nao pode ser validado"); }

    @Override
    public void designar(Processo processo) { throw new RuntimeException("Processo Em_Avaliacao nao pode ser designado"); }

    @Override
    public void cancelar(Processo processo) { throw new RuntimeException("Processo Em_Avaliacao nao pode ser cancelado"); }

    @Override
    public void deferir(Processo processo) {
        this.avisarInteressado();
        processo.estado = new Deferido(); }

    @Override
    public void indeferir(Processo processo) {
        this.avisarInteressado();
        processo.estado = new Indeferido();
    }

    @Override
    public void transcorrerPrazoLegal(Processo processo) { throw new RuntimeException("Processo Em_Avaliacao nao pode ser fechado"); }
}
