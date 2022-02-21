package atv9.questao3;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {

  private SomadorExistente somadorExistente = new SomadorExistente();

  @Override
  public int somaVetor(int[] vetor) {

    List list = new ArrayList();
    var tamanho = vetor.length;

    for (int i=0; i<tamanho; i++){

      list.add(vetor[i]);
    }


    return  somadorExistente.somaLista(list);

  }
}
