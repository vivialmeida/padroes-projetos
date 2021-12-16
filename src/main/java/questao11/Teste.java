package questao11;

public class Teste {
  public static void main(String[] args) {
    Banco b1 = new Banco("nubank", "99999999999");
    Conta c1 = new Conta("george", 1000.00);

    Relatorio r1 = new RelatorioSimples();
    r1.imprimeRelatorio(b1, c1);

    Banco b2 = new Banco("inter", "88888888888", "rua 00, bairro 00, numero 00", "viviane@email.com");
    Conta c2 = new Conta("viviane", 2000.00, "00000", "00000000");

    Relatorio r2 = new RelatorioComplexo();
    r2.imprimeRelatorio(b2, c2);
  }
}
