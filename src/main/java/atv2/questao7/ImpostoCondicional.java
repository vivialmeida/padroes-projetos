package atv2.questao7;

import atv2.questao8.DescontoCincoPorcento;
import atv2.questao8.DescontoOitoPorcento;
import atv2.questao8.DescontoSetePorcento;

public class ImpostoCondicional implements Imposto {


  DescontoOitoPorcento descontoOitoPorcento = new DescontoOitoPorcento(null);
  DescontoSetePorcento descontoSetePorcento = new DescontoSetePorcento(descontoOitoPorcento);
  DescontoCincoPorcento descontoCincoPorcento = new DescontoCincoPorcento(descontoSetePorcento);
  public ImpostoCondicional() {
    DescontoOitoPorcento descontoOitoPorcento = new DescontoOitoPorcento(null);
    DescontoSetePorcento descontoSetePorcento = new DescontoSetePorcento(descontoOitoPorcento);
    DescontoCincoPorcento descontoCincoPorcento = new DescontoCincoPorcento(descontoSetePorcento);


  }

  @Override
  public Double calcula(Orcamento orcamento) {
    return descontoCincoPorcento.calcula(orcamento);
  }
}
