package questao11;

public abstract class Relatorio {

    private Banco banco;
    private Conta conta;

    public final void imprimeRelatorio(Banco banco, Conta conta) {
        imprimeCabecalho(banco);
        imprimeRodape(banco);
        listaContas(conta);
    }

    abstract void imprimeCabecalho(Banco banco);
    abstract void imprimeRodape(Banco banco);
    abstract void listaContas(Conta conta);
}
