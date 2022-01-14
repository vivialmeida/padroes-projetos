package atv3.questao2;

public class NumeroUm implements Numero {
    private String valor;

    public NumeroUm() {
        this.valor = "1";
    }

    public String getValor() {
        return valor;
    }

    public void imprime(String mensagem){
        System.out.println(mensagem);
    }
}
