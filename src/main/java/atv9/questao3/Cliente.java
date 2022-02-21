package atv9.questao3;

public class Cliente {
  SomadorEsperado somadorEsperado;


  public Cliente(SomadorEsperado somadorEsperado) {
    this.somadorEsperado = somadorEsperado;
  }

  public void executar(){

    int[] vetor =  new int []{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int soma = somadorEsperado.somaVetor(vetor);
    System.out.println("Resultado: " + soma);
  }



}


