package atv1.questao11;

import java.util.Random;

public class Moderado implements Investimento {
    private Double valor;
    Random random = new Random();

    public Moderado(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double calculaRendimento() {
        boolean porcentagem = random.nextDouble() <= 0.50;
        return porcentagem ? this.valor * 0.007 : this.valor * 0.025;
    }
}
