package atv5.questao3.product;

public class SanduicheCG implements Sanduiche{
    @Override
    public void adicionaPao() {
        System.out.println("Pão integral");
    }

    @Override
    public void adicionaQueijo() {
        System.out.println("Queijo prato");
    }

    @Override
    public void adicionaPresunto() {
        System.out.println("Presunto de frango");
    }

    @Override
    public void adicionaSalada() {
        System.out.println("Salada sem verdura");
    }
}
