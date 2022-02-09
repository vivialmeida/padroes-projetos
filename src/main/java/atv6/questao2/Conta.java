package atv6.questao2;

public class Conta {
    protected Double saldo;
    protected EstadoDaConta estado;

    public Conta() {
        saldo = Double.valueOf(0);
        estado = new ContaPositiva();
    }

    public void saca(Double valor){
        estado.saca(this, valor);
    }

    public void deposita(Double valor){
        estado.deposita(this, valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", estado=" + estado +
                '}';
    }
}
