package atv3.questao2;

public class NumeroUmDecoratorComParenteses extends NumeroUmDecorator{

    public NumeroUmDecoratorComParenteses(Numero numero) {
        super(numero);
    }

    @Override
    public String getValor() {
        return this.getNumero().getValor();
    }

    @Override
    public void imprime(String mensagem) {
        String decoratedNumeroUm = colocaParenteses(mensagem);
        this.getNumero().imprime(decoratedNumeroUm);
    }

    private String colocaParenteses(String mensagem){
        StringBuilder sb = new StringBuilder(mensagem);
        sb.insert(0,"(");
        sb.append(")");
        return sb.toString();
    }
}
