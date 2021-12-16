package questao7e8;

public class Teste {
  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(5000.00);
    CalculadorDeImposto calc = new CalculadorDeImposto();

    Iss iss = new Iss();
    Icms icms = new Icms();

    calc.mostraCalculo(orcamento, iss);
    calc.mostraCalculo(orcamento, icms);

    ImpostoCondicional impostoCondicional = new ImpostoCondicional();

    System.out.println(impostoCondicional.calcula(orcamento));
  }
}
