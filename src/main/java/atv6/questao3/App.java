package atv6.questao3;

public class App {
    public static void main(String[] args) {
        System.out.println("Caso 1: processo deferido");
        Processo p1 = new Processo();
        p1.validar();
        p1.designar();
        p1.deferir();
        p1.transcorrerPrazoLegal();
        System.out.println(p1);

        //Caso 2: processo indeferido
        System.out.println("Caso 2: processo indeferido");
        Processo p2 = new Processo();//gestacao
        p2.validar();//criado
        p2.designar();//emAvaliacao
        p2.indeferir();//indeferido
        p2.designar();//emRecurso
        p2.designar();//emAvaliacao
        p2.deferir();//deferido
        p2.transcorrerPrazoLegal();//fechado
        System.out.println(p2);

        //Caso 3: processo cancelado
        System.out.println("Caso 3: processo cancelado");
        Processo p3 = new Processo();
        p3.validar();
        p3.cancelar();
        System.out.println(p3);
    }
}
