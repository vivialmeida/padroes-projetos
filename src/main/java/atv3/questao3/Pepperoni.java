package atv3.questao3;

public class Pepperoni extends Pizza{


  public Pepperoni() {
  }

  @Override
  protected String getDescricao() {
    return "Pepperoni";
  }

  @Override
  protected void setDescricao(String descricao) {
    this.descricao = descricao;
  }


  @Override
  protected Double custo() {
    return Double.valueOf(14.90);
  }
}
