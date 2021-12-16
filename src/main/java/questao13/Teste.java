package questao13;

public class Teste {
  public static void main(String[] args) {
    Requisicao r1 = new Requisicao(Formato.JSON);
    Requisicao r2 = new Requisicao(Formato.XML);
    Requisicao r3 = new Requisicao(Formato.CSV);
    Conta c1 = new Conta(1000.00, "george");

    GerenciadorDeRequisicoes gerenciador = new GerenciadorDeRequisicoes();
    System.out.println(gerenciador.executa(r1, c1));
    System.out.println(gerenciador.executa(r2, c1));
    System.out.println(gerenciador.executa(r3, c1));
  }
}
