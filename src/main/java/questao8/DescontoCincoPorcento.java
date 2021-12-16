package questao8;

import questao7e8.Orcamento;

public class DescontoCincoPorcento implements DescontoPorcentagem {

  DescontoPorcentagem proximoDesconto;

  public DescontoCincoPorcento(DescontoPorcentagem proximoDesconto) {
    this.proximoDesconto = proximoDesconto;
  }

  public Double calcula(Orcamento orcamento) {
    if (orcamento.getValor() < 1000.00) {
      return orcamento.getValor() * 0.05;
    } else {
      return proximoDesconto.calcula(orcamento);
    }
  }

  public void setProximoDesconto(DescontoPorcentagem proximoDesconto) {
    this.proximoDesconto = proximoDesconto;
  }

}
