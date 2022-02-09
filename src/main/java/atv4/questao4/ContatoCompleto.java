package atv4.questao4;

public class ContatoCompleto extends ContatoBuilder {

  private Contato contato = new Contato();


  @Override
  public void buildEmail(String email) {
    contato.setEmail(email);
  }

  @Override
  public void buildEndereco(String endereco) {
    contato.setEndereco(endereco);
  }

  @Override
  public void buildTelefone(String telefone) {
    contato.setTelefone(telefone);
  }

}

