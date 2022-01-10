package atv2.questao7;

public class Iss implements Imposto {
  @Override
  public Double calcula(Orcamento orcamento) {
    return orcamento.getValor() * 0.06;
  }
}
