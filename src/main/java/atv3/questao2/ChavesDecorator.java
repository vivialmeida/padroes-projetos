package atv3.questao2;

public class ChavesDecorator extends NumeroUmDecorator{

    public ChavesDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public void imprime(String valor) {
        String decoratedNumeroUm = colocaChaves(valor);
        this.getNumero().imprime(decoratedNumeroUm);
    }

    private String colocaChaves(String valor){
        StringBuilder sb = new StringBuilder(valor);
        return sb.insert(0,"{").append("}").toString();
    }
}
