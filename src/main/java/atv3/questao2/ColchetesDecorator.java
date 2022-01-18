package atv3.questao2;

public class ColchetesDecorator extends NumeroUmDecorator{

    public ColchetesDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public void imprime(String valor) {
        String decoratedNumeroUm = colocaColchetes(valor);
        this.getNumero().imprime(decoratedNumeroUm);
    }

    private String colocaColchetes(String texto){
        StringBuilder sb = new StringBuilder(texto);
        return sb.insert(0,"[").append("]").toString();
    }
}
