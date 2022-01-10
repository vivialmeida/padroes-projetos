package atv1.questao11;

public class Teste {
    public static void main(String[] args) {
        RealizadorDeInvestimentos ri = new RealizadorDeInvestimentos();

        Conta conta1 = new Conta("Viviane", 30000.00);
        conta1.mostraSaldo();
        Arrojado arrojado = new Arrojado(5000.00);
        ri.realiza(arrojado, conta1);
        conta1.mostraSaldo();

        Conta conta2 = new Conta("George", 5000.00);
        conta2.mostraSaldo();
        Conservador conservador = new Conservador(1000.00);
        ri.realiza(conservador, conta2);
        conta2.mostraSaldo();
    }
}
