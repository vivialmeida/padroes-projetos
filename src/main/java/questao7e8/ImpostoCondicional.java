package questao7e8;

import questao8.DescontoCincoPorcento;
import questao8.DescontoOitoPorcento;
import questao8.DescontoSetePorcento;

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
