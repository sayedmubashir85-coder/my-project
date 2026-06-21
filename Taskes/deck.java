

public class deck{
public static void main(String[]arge){
int [] deck = new int[52];
String [] suits ={"Heart","Spades","Clubs","dimonds"};
String[]ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
for(int i =0; i<deck.length;i++)
deck[i] =i;
for (int i = 0; i <deck.length; i++) {
    int index =(int)(Math.random()*deck.length);
    int temp = deck[i];
    deck[i]=deck[index];
    deck[index]=temp;
    
}
for (int i = 0; i < 5; i++) {
    String suit =suits[deck[i]/13];
String rank = ranks[deck[i]%13];
System.out.println("number of card"+deck[i]+": "+rank+"  of  "+suit);
    
}






}

}