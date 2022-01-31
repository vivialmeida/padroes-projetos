package atv6.questao2;

public class Cliente {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        System.out.println(c1);
        c1.deposita(800.0);
        System.out.println(c1);
        c1.saca(1600.0);
        System.out.println(c1);
        c1.saca(100.0);
        System.out.println(c1);
    }
}
