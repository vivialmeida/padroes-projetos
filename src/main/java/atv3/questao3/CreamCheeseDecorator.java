package atv3.questao3;

public class CreamCheeseDecorator extends CondimentoDecorator{

  public CreamCheeseDecorator(Pizza pizzaDecorator) {
    super(pizzaDecorator);
  }

  @Override
  protected String getDescricao() {
    return new StringBuilder(pizzaDecorator.getDescricao()).append(" CreamCheese ").toString();
  }

  @Override
  protected Double custo() {
    return pizzaDecorator.custo()+ Double.valueOf(1.20);

  }
}
