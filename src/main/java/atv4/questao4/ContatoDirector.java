package atv4.questao4;

public class ContatoDirector {
  protected ContatoBuilder contatoBuilder;

  public ContatoDirector(ContatoBuilder contatoBuilder) {
    this.contatoBuilder = contatoBuilder;
  }

  public void construiContato() {
    contatoBuilder.buildEmail("");
    contatoBuilder.buildNome("");
    contatoBuilder.buildTelefone("");
    contatoBuilder.buildEndereco("");
  }

public Contato getContato(){

    return  contatoBuilder.getContato();
}

}
