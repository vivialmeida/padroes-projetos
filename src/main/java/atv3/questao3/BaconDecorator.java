package atv3.questao3;

public class BaconDecorator extends CondimentoDecorator{

  public BaconDecorator(Pizza pizzaDecorator) {
    super(pizzaDecorator);
  }

  @Override
  protected String getDescricao() {
    return new StringBuilder(pizzaDecorator.getDescricao()).append(" Bacon ").toString();
  }

  @Override
  protected Double custo() {
    return pizzaDecorator.custo() + Double.valueOf(0.80);

  }
}
