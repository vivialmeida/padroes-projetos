package questao7e8;

public class Icms implements Imposto {
  @Override
  public Double calcula(Orcamento orcamento) {
    return orcamento.getValor() * 0.25;
  }
}
