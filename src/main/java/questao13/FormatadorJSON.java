package questao13;

import com.google.gson.Gson;

public class FormatadorJSON implements Formatador {
    private Formatador proximo;

    @Override
    public String formata(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato().equals(Formato.JSON)) {
            Gson gson = new Gson();
            return gson.toJson(conta);
        } else {
            return proximo.formata(requisicao, conta);
        }
    }

    @Override
    public void setProximo(Formatador proximo) {
        this.proximo = proximo;
    }
}