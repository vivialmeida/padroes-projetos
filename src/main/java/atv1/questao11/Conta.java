package atv1.questao11;

public class Conta {
    private String nomeCliente;
    private Double saldo;
    public Conta(String nomeCliente, Double saldo){
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
    }
    public void deposita(Double valor){
        this.saldo+=valor;
    }

    public void mostraSaldo(){
        System.out.println("O saldo de " + nomeCliente + " é igual a: " + saldo);
    }
}
