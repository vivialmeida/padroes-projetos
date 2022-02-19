package atv8.questao2;

public class BingoSystemApp {
    public static void main(String[] args) {
        BingoSystem bingoSystem = BingoSystem.getInstance();

        BingoCard card1 = new BingoCard(1, bingoSystem, 6, 50);
        BingoCard card2 = new BingoCard(2, bingoSystem, 6, 50);
        BingoCard card3 = new BingoCard(3, bingoSystem, 6, 50);
        BingoCard card4 = new BingoCard(4, bingoSystem, 6, 50);
        BingoCard card5 = new BingoCard(5, bingoSystem, 6, 50);

        bingoSystem.subscribe(card1);
        bingoSystem.subscribe(card2);
        bingoSystem.subscribe(card3);
        bingoSystem.subscribe(card4);
        bingoSystem.subscribe(card5);

        bingoSystem.startBingo(50);
    }
}
