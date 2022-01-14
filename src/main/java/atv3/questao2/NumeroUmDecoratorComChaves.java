package atv3.questao2;

public class NumeroUmDecoratorComChaves extends NumeroUmDecorator{

    public NumeroUmDecoratorComChaves(Numero numero) {
        super(numero);
    }

    @Override
    public String getValor() {
        return this.getNumero().getValor();
    }

    @Override
    public void imprime(String mensagem) {
        String decoratedNumeroUm = colocaChaves(mensagem);
        this.getNumero().imprime(decoratedNumeroUm);
    }

    private String colocaChaves(String mensagem){
        StringBuilder sb = new StringBuilder(mensagem);
        sb.insert(0,"{");
        sb.append("}");
        return sb.toString();
    }
}
