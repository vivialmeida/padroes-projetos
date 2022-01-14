package atv3.questao1;

public class TesteEmissorDecorator {
    public static void main(String[] args) {
        String mensagem = "helloworld";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);

        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);

        Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCriptCompr.envia(mensagem);

        /* Essa abordagem permite que os objetos sejam modificados dinamicamente (em tempo de execução),
        sem a necessidade de criar outro objeto com as modificações. Isso ajuda a garantir o princípio OCP,
        já que permite que novas funcionalidades sejam criadas, sem afetar o código já escrito.
        Além disso, é possível criar todas as combinações possíveis de decorações, sem ter que usar classes
         específicas para cada uma dessas combinações.
        */
    }
}
