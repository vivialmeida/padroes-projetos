package atv1.questao11;

public class RealizadorDeInvestimentos {

    public void realiza (Investimento investimento, Conta conta){
        Double valor = investimento.calculaRendimento() * 0.75;
        conta.deposita(valor);
    }
}
