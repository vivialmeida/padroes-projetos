package atv3.questao3;

public class Mussarela extends Pizza {

  public Mussarela() {

  }

  @Override
  protected void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  protected String getDescricao() {
    return "Mussarela";
  }

  @Override
  protected Double custo() {
    return Double.valueOf(11.90);
  }
}
