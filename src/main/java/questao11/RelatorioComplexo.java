package questao11;

import java.time.LocalDate;

public class RelatorioComplexo extends Relatorio {

  @Override
  void imprimeCabecalho(Banco banco) {
    System.out.println("RELATÓRIO COMPLEXO");
    System.out.println(banco.getNome());
    System.out.println(banco.getEndereco());
    System.out.println(banco.getTelefone());
  }

  @Override
  void imprimeRodape(Banco banco) {
    System.out.println(banco.getEmail());
    System.out.println(LocalDate.now());
  }

  @Override
  void listaContas(Conta conta) {
    System.out.println(conta.getNomeTitular());
    System.out.println(conta.getAgencia());
    System.out.println(conta.getNumeroConta());
    System.out.println(conta.getSaldo());
    System.out.println("FIM RELATÓRIO COMPLEXO\n");
  }
}
