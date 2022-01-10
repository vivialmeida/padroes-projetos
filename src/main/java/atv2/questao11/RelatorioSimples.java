package atv2.questao11;

public class RelatorioSimples extends Relatorio {


  @Override
  void imprimeCabecalho(Banco banco) {
    System.out.println("RELATÓRIO SIMPLES");
    System.out.println(banco.getNome());
  }

  @Override
  void imprimeRodape(Banco banco) {
    System.out.println(banco.getTelefone());
  }

  @Override
  void listaContas(Conta conta) {
    System.out.println(conta.getNomeTitular());
    System.out.println(conta.getSaldo());
    System.out.println("FIM RELATÓRIO SIMPLES\n");
  }
}
