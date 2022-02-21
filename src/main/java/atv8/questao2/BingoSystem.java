package atv8.questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoSystem {
    private static BingoSystem uniqueInstance;
    private List<BingoCardObserver> bingoCards;
    private int numberDrawn;
    private boolean gameEnded = false;

    private BingoSystem() {
        this.bingoCards = new ArrayList<>();
    }

    public static BingoSystem getInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new BingoSystem();
        }
        return uniqueInstance;
    }

    public void subscribe(BingoCardObserver card){
        this.bingoCards.add(card);
    }

    public void startBingo(int maxNumber){
        Random random = new Random();

        for(int i = 0 ; i < maxNumber; i++) {
            if(!this.gameEnded) {
                this.numberDrawn = random.nextInt(maxNumber);
                System.out.println("Número sorteado: "+ this.numberDrawn+"\n");

                for (BingoCardObserver bingoCard: bingoCards) {
                    bingoCard.update(this.numberDrawn);

                    if (bingoCard.didIWin()){
                        this.bingo("Bingo! A cartela vencedora é a de número: " + bingoCard.getCardId());
                    }
                }
            }
        }
    }

    private void bingo(String message){
        System.out.println(message);
        this.gameEnded = true;
    }
}
