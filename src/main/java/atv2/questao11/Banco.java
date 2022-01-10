package atv2.questao11;

public class Banco {
  private String nome;
  private String telefone;
  private String endereco;
  private String email;

  public Banco(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
  }

  public Banco(String nome, String telefone, String endereco, String email) {
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public String getEmail() {
    return email;
  }
}
