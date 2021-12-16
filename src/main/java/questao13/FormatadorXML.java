package questao13;

import com.thoughtworks.xstream.XStream;

public class FormatadorXML implements Formatador {
    private Formatador proximo;

    @Override
    public String formata(Requisicao requisicao, Conta conta) {
        if (requisicao.getFormato().equals(Formato.XML)) {
            XStream xstream= new XStream();
            return xstream.toXML(conta);
        } else {
            return proximo.formata(requisicao, conta);
        }
    }

    @Override
    public void setProximo(Formatador proximo) {
        this.proximo = proximo;
    }
}