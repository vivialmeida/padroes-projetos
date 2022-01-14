package atv3.questao1;

public abstract class EmissorDecorator implements Emissor{
    private Emissor emissor;

    public EmissorDecorator(Emissor emissor) {
        this.emissor = emissor;
    }

    public abstract void envia(String mensagem);

    public Emissor getEmissor() {
        return emissor;
    }
}
