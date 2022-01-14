package atv3.questao3;

public class OreganoDecorator extends CondimentoDecorator{

  public OreganoDecorator(Pizza pizzaDecorator) {
    super(pizzaDecorator);
  }

  @Override
  protected String getDescricao() {
    return new StringBuilder(pizzaDecorator.getDescricao()).append(" Oregano ").toString();
  }

  @Override
  protected Double custo() {
    return pizzaDecorator.custo() + Double.valueOf(0.50);
  }
}
