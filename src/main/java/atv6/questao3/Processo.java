package atv6.questao3;

public class Processo {
    EstadoDoProcesso estado;

    public Processo() {
        estado = new EmGestacao();
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
    public void indeferir() {estado.indeferir(this);}
    public void transcorrerPrazoLegal(){
        estado.transcorrerPrazoLegal(this);
    }

    @Override
    public String toString() { return "Processo{" + "estado=" + estado + '}'; }
}