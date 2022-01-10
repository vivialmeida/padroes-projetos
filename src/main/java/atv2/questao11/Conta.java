package atv2.questao11;

public class Conta {
  private String nomeTitular;
  private Double saldo;
  private String agencia;
  private String numeroConta;

  public Conta(String nomeTitular, Double saldo) {
    this.nomeTitular = nomeTitular;
    this.saldo = saldo;
  }

  public Conta(String nomeTitular, Double saldo, String agencia, String numeroConta) {
    this.nomeTitular = nomeTitular;
    this.saldo = saldo;
    this.agencia = agencia;
    this.numeroConta = numeroConta;
  }

  public String getNomeTitular() {
    return nomeTitular;
  }

  public Double getSaldo() {
    return saldo;
  }

  public String getAgencia() {
    return agencia;
  }

  public String getNumeroConta() {
    return numeroConta;
  }
}
