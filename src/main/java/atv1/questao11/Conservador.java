package atv1.questao11;

public class Conservador implements Investimento {
    private Double valor;
    public Conservador(Double valor){
        this.valor = valor;
    }

    @Override
    public Double calculaRendimento(){
        return this.valor * 0.008;
    }
}
