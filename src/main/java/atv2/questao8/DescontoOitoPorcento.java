package atv2.questao8;

import atv2.questao7.Orcamento;

public class DescontoOitoPorcento implements DescontoPorcentagem {

  DescontoPorcentagem proximoDesconto;

  public DescontoOitoPorcento(DescontoPorcentagem proximoDesconto) {
    this.proximoDesconto = proximoDesconto;
  }


  public Double calcula(Orcamento orcamento) {
    if (orcamento.getValor() > 3000.00) {
      return (orcamento.getValor() * 0.08) + 30.00;
    } else {
      throw new RuntimeException("Valor inválido!");
    }
  }

  public void setProximoDesconto(DescontoPorcentagem proximoDesconto) {
    this.proximoDesconto = proximoDesconto;
  }

}

