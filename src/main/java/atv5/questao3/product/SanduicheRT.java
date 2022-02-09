package atv5.questao3.product;

public class SanduicheRT implements Sanduiche{
    @Override
    public void adicionaPao() {
        System.out.println("Pão bola");
    }

    @Override
    public void adicionaQueijo() {
        System.out.println("Queijo cheddar");
    }

    @Override
    public void adicionaPresunto() {
        System.out.println("Presunto de peru");
    }

    @Override
    public void adicionaSalada() {
        System.out.println("Salada sem verdura");
    }
}
