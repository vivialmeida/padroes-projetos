package questao13;

public class GerenciadorDeRequisicoes {

    public String executa(Requisicao requisicao, Conta conta){
        Formatador json = new FormatadorJSON();
        Formatador xml = new FormatadorXML();
        Formatador csv = new FormatadorCSV();

        json.setProximo(xml);
        xml.setProximo(csv);

        return json.formata(requisicao, conta);
    }
}
