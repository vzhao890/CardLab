import java.util.ArrayList;

public class Deck
{
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt= new ArrayList<Card>();;
    public Deck(String[] ranks,String[] suits,int[] values)
    {
        unDealt = new ArrayList<Card>();
        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j < ranks.length; j++){
                Card temp = new Card(ranks[j],suits[i],values[j]);
                unDealt.add(temp);
            }
        }
    }
    public boolean isEmpty()
    {
        if(unDealt.size() == 0){
            return true;
        }
        return false;
    }
    public int size()
    {
        return unDealt.size();
    }
    public Card deal()
    {
        if(!unDealt.isEmpty()){
            int x = (int)(Math.random() * unDealt.size());
            Card temp = unDealt.get(x);
            unDealt.remove(x);
            Dealt.add(temp);
            return temp;
        }
        return null;

    }
    public void shuffle()
    {
        unDealt.addAll(Dealt);
        Dealt.clear();
        for(int k = unDealt.size()-1; k > 0; k--){
            int r = (int)(Math.random()*k);
            Card temp = unDealt.get(r);
            unDealt.set(r, unDealt.get(k));
            unDealt.set(k, temp);
        }
    }


}
