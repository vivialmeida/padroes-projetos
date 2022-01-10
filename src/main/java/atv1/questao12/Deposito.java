package atv1.questao12;

public class Deposito {
    private String numeroEnvelope;
    private Movimentacao movimentacao;
    // Caso utilizasse herança, a classe Deposito seria obrigada a implementar um método somente
    // para lançar uma excessão. Isso porque herdou um comportamento da classe mãe que não faz
    // parte do seu domínio. Utilizando composição, esta classe só precisa acessar os atributos e
    // métodos de que irá precisar. Além disso, essa dependência ocorre em tempo de execução e entre
    // objetos, não classes.
}
