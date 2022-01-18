package atv3.questao2;

public class TesteNumeroUmDecorator {
    public static void main(String[] args) {

        String valor = "1";
        Numero numeroUm = new ParentesesDecorator(new ColchetesDecorator(new ChavesDecorator(new NumeroUm())));
        numeroUm.imprime(valor);
    }
}
