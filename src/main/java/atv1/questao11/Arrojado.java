package atv1.questao11;

import java.util.Random;

public class Arrojado implements Investimento{

    private Double valor;
    Random random = new Random();

    public Arrojado(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double calculaRendimento() {
        double porcentagem = random.nextDouble();

        if((porcentagem >= 0.0) && (porcentagem <= 0.2)) //20%
            return this.valor * 0.05;
        else if((porcentagem > 0.2) && ( porcentagem<= 0.5)) // 30%
            return this.valor * 0.03;
        return this.valor * 0.005;
    }
}
