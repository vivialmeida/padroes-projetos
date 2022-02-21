package atv9.questao3;

public class Main {


  public static void main(String[] args) {
    SomadorEsperado somadorEsperado = new SomadorAdapter();

    Cliente cliente = new Cliente(somadorEsperado);
    cliente.executar();


  }
}
