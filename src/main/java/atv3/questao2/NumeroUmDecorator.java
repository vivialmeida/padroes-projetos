package atv3.questao2;

public abstract class NumeroUmDecorator implements Numero {
    private Numero numero;

    public NumeroUmDecorator(Numero numero) {
        this.numero = numero;
    }

    public abstract void imprime(String mensagem);

    public Numero getNumero() {
        return numero;
    }
}