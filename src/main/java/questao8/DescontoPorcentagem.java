package questao8;

import questao7e8.Orcamento;

public interface DescontoPorcentagem {


  Double calcula(Orcamento orcamento);

  void setProximoDesconto(DescontoPorcentagem proximoDesconto);

}
