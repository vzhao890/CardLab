public class Card
{
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String a , String b, int c)
    {
        rank = a;
        suit = b;
        pointValue = c;
    }

    public String getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public int getpointValue()
    {
        return pointValue;
    }

    public boolean equals(Card otherCard)
    {
        if(this.getpointValue()==otherCard.getpointValue())
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        String str="";
        str=rank+" "+suit+" "+pointValue;
        return str;
    }
}
