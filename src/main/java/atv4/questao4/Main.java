package atv4.questao4;

public class Main {

  public static void main(String[] args) {

    ContatoDirector director = new ContatoDirector(new ContatoCompleto());
    director.construiContato();
    Contato contato = director.getContato();
    System.out.println(contato.toString());

  }


}