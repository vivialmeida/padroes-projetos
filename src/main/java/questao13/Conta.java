package questao13;

public class Conta {
    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    private String nomeTitular;

    public Conta(Double saldo, String nomeTitular) {
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }
}
