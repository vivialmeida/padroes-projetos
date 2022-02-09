package atv6.questao2;

public class ContaPositiva implements EstadoDaConta {
    @Override
    public void saca(Conta conta, Double valor) {
        conta.saldo -= valor;
        if (conta.saldo < 0){
            conta.estado = new ContaNegativa();
        }
    }

    @Override
    public void deposita(Conta conta, Double valor) {
        conta.saldo += valor * Double.valueOf(0.98);
        if (conta.saldo > 0){
            conta.estado = new ContaPositiva();
        }
    }

    @Override
    public String toString() {
        return "Conta Positiva";
    }
}
