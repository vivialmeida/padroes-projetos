package atv4.questao4;

public abstract class ContatoBuilder {

  protected Contato contato = new Contato();

  public void buildNome(String nome) {
    this.contato.setNome(nome);
  }

  public abstract void buildEmail(String email);

  public abstract void buildEndereco(String endereco);

  public abstract void buildTelefone(String telefone);

  public  Contato getContato(){
    return this.contato;
  }

}
