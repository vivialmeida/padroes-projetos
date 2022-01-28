package atv5.questao3.product;

public class SanduicheJP implements Sanduiche{
    @Override
    public void adicionaPao() {
        System.out.println("Pão francês");
    }

    @Override
    public void adicionaQueijo() {
        System.out.println("Queijo mussarela");
    }

    @Override
    public void adicionaPresunto() {
        System.out.println("Presunto de frango");
    }

    @Override
    public void adicionaSalada() {
        System.out.println("Salada com verdura");
    }
}
