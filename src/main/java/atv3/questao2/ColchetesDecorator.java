package atv3.questao2;

public class ColchetesDecorator extends NumeroUmDecorator{

    public ColchetesDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public String imprime() {
        return colocaChaves(this.getNumero().imprime());
    }

    private String colocaChaves(String texto){
        StringBuilder sb = new StringBuilder(texto);
        return sb.insert(0,"[").append("]").toString();
    }
}
