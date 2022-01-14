package atv3.questao3;

public class TomateDecorator extends CondimentoDecorator{

  public TomateDecorator(Pizza pizzaDecorator) {
    super(pizzaDecorator);
  }

  @Override
  protected String getDescricao() {
    return  new StringBuilder (pizzaDecorator.getDescricao()).append( "Tomate ").toString();
  }

  @Override
  protected Double custo() {
    return pizzaDecorator.custo() +  Double.valueOf(0.10);

  }
}
