package atv3.questao2;

public class TesteNumeroUmDecorator {
    public static void main(String[] args) {

        String mensagem = "1";
        Numero numeroUm = new NumeroUmDecoratorComParenteses(new NumeroUmDecoratorComColchetes(new NumeroUmDecoratorComChaves(new NumeroUm())));
        numeroUm.imprime(mensagem);
    }
}
