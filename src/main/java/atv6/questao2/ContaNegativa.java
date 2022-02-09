package atv6.questao2;

public class ContaNegativa implements EstadoDaConta{
    @Override
    public void saca(Conta conta, Double valor) {
        throw new RuntimeException("Sua conta está no vermelho. Não é possível sacar!");
    }

    @Override
    public void deposita(Conta conta, Double valor) {
        conta.saldo += valor * Double.valueOf(0.95);
    }

    @Override
    public String toString() {
        return "Conta Negativa";
    }
}
