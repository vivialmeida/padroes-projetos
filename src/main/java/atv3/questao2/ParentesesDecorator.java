package atv3.questao2;

public class ParentesesDecorator extends NumeroUmDecorator{

    public ParentesesDecorator(Numero numero) {
        super(numero);
    }

    @Override
    public String imprime() {
        return colocaParenteses(this.getNumero().imprime());
    }

    private String colocaParenteses(String texto){
        StringBuilder sb = new StringBuilder(texto);
        return sb.insert(0,"(").append(")").toString();
    }
}
