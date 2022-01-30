package atv3.questao2;

public class TesteNumeroUmDecorator {
    public static void main(String[] args) {

        Numero numeroUm = new ParentesesDecorator(new ColchetesDecorator(new ChavesDecorator(new NumeroUm())));
        System.out.println(numeroUm.imprime());
    }
}
