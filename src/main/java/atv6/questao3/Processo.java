package atv6.questao3;

public class Processo {
    EstadoDoProcesso estado;

    public Processo() {
        estado = new Gestacao();
    }

    public void validar(){
        estado.validar(this);
    }
    public void designar(){
        estado.designar(this);
    }
    public void cancelar(){
        estado.cancelar(this);
    }
    public void deferir(){
        estado.deferir(this);
    }
    public void prazoLegal(){
        estado.prazoLegal(this);
    }
}
