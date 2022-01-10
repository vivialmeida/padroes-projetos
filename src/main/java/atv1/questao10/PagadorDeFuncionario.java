package atv1.questao10;

public class PagadorDeFuncionario {
    public void paga(Remuneravel remuneravel){
        remuneravel.deposita(remuneravel.calculaSalario() + remuneravel.calculaBonificacao());
    }
}
