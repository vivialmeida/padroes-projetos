package atv3.questao2;

public class NumeroUmDecoratorComColchetes extends NumeroUmDecorator{

    public NumeroUmDecoratorComColchetes(Numero numero) {
        super(numero);
    }

    @Override
    public String getValor() {
        return this.getNumero().getValor();
    }

    @Override
    public void imprime(String mensagem) {
        String decoratedNumeroUm = colocaColchetes(mensagem);
        this.getNumero().imprime(decoratedNumeroUm);
    }

    private String colocaColchetes(String mensagem){
        StringBuilder sb = new StringBuilder(mensagem);
        sb.insert(0,"[");
        sb.append("]");
        return sb.toString();
    }
}
