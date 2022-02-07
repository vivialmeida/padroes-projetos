package atv6.questao3;

public abstract class Avaliado {
    public final void transcorrerPrazoLegal(Processo processo){
        processo.estado = new Fechado();
    }
}
