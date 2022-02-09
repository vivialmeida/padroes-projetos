package atv4.questao4;

public class ContatoInternet extends ContatoBuilder {

  @Override
  public void buildEmail(String email) {
    contato.setEmail(email);

  }

  @Override
  public void buildEndereco(String endereco) {
    contato.setEndereco(null);
  }

  @Override
  public void buildTelefone(String telefone) {
    contato.setTelefone(null);
  }

}
