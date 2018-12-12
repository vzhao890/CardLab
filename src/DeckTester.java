//Vincent Zhao 12-11-18
public class DeckTester
{
    public static void main(String[] args)
    {
        String[] ranks = {"A", "B", "C", "D"};
        String[] suits = {"Monkey", "Donkey", "Ape", "Peacock"};
        int[] values = {4, 3, 2, 1};

        Deck deck1 = new Deck(ranks, suits, values);
        System.out.println("Size: " + deck1.size());
        deck1.shuffle();
        System.out.println("Shuffle completed.");
        while(!deck1.isEmpty()){
            System.out.println(deck1.deal());
        }
    }
}
