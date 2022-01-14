package atv3.questao3;

public class CondimentoDecorator extends Pizza{

  protected  Pizza pizzaDecorator;

  public CondimentoDecorator(Pizza pizzaDecorator) {
    this.pizzaDecorator = pizzaDecorator;
  }

  @Override
  protected void setDescricao(String descricao) {
    pizzaDecorator.descricao = descricao;
  }

  @Override
  protected String getDescricao() {
   return  pizzaDecorator.descricao;
  }

  @Override
  protected Double custo() {
    return pizzaDecorator.custo();
  }
}
