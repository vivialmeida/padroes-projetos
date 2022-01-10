package atv1.questao12;

import java.util.Calendar;

public class Movimentacao {
    private double valor;
    private Conta conta;
    private Calendar data;
    public double getEncargos() {
        return valor * 0.01;
    }
    // getters e setters
}
