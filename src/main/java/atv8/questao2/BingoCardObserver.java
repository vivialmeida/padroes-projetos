package atv8.questao2;

public interface BingoCardObserver {

    int getCardId();
    void update(int numberDrawn);
    boolean didIWin();
}
