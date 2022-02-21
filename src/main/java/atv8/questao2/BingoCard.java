package atv8.questao2;

import java.util.Random;

public class BingoCard implements BingoCardObserver{
    private int cardId;
    private int[] numbers;
    private BingoSystem subject;
    private int numberOfSlots;
    private int maxNumber;

    public BingoCard(int cardId, BingoSystem subject, int numberOfSlots, int maxNumber) {
        this.cardId = cardId;
        this.subject = subject;
        this.numberOfSlots = numberOfSlots;
        this.maxNumber = maxNumber;

        this.numbers = new int[this.numberOfSlots];
        this.createCard(numberOfSlots);
    }

    private void createCard(int numberOfSlots){
        Random random = new Random();
        for (int i = 0; i < numberOfSlots; i++) {
            Integer number = random.nextInt(this.maxNumber);
            this.numbers[i] = number;
        }
    }

    @Override
    public void update(int numberDrawn) {
        for (int i = 0; i < this.numberOfSlots; i++) {
            if (numberDrawn == this.numbers[i]) {
                this.numbers[i] = -1;
            }
        }
    }

    @Override
    public boolean didIWin(){
        for (int i = 0; i < this.numberOfSlots; i++){
            if (this.numbers[i] == -1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getCardId() {
        return this.cardId;
    }

    @Override
    public String toString() {
        return "BingoCard{" +
                "cardId=" + cardId +
                '}';
    }
}
