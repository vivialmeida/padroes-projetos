package atv2.questao7;

public class Icms implements Imposto {
  @Override
  public Double calcula(Orcamento orcamento) {
    return orcamento.getValor() * 0.25;
  }
}
