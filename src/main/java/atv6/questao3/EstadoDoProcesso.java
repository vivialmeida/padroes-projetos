package atv6.questao3;

public interface EstadoDoProcesso {
    void validar(Processo processo);
    void designar(Processo processo);
    void cancelar(Processo processo);
    void deferir(Processo processo);
    void indeferir(Processo processo);
    void prazoLegal(Processo processo);
}
