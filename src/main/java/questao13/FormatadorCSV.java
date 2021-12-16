package questao13;

public class FormatadorCSV implements Formatador {
  private Formatador proximo;

  @Override
  public String formata(Requisicao requisicao, Conta conta) {
    if (requisicao.getFormato().equals(Formato.CSV)) {
      return conta.getSaldo() + "%" + conta.getNomeTitular();
    } else {
      return proximo.formata(requisicao, conta);
    }
  }

  @Override
  public void setProximo(Formatador proximo) {
    this.proximo = proximo;
  }
}