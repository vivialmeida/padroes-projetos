package atv2.questao8;

import atv2.questao7.Orcamento;

public interface DescontoPorcentagem {


  Double calcula(Orcamento orcamento);

  void setProximoDesconto(DescontoPorcentagem proximoDesconto);

}
