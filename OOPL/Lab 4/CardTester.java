import java.util.Scanner;

class Card{
int rank;
char suit;
Card()
{
rank=1;
suit='D';
}
Card(int r,char s)
{
rank=r;
suit=s;
}
char getSuit()
{
return suit;
}

int getRank()
{
return rank;
}
}

class CardTester{
public static void main(String [] args)
{Scanner in = new Scanner (System.in);
Card c[]=new Card [5];
System.out.println("Enter two different ranks");
int r1,r2;
System.out.println("Enter suits");
for(int i=0;i<5;i++)
char s= (in.next()).charAt(0);
int r=in.nextInt();
int c=0;
c[i]=new Card (r,s); 
}
for(int i=0;i<5;i++)
{
System.out.println("Card "+(i+1)+" is "+c[i].getRank()+" and "+c[i].getSuit());
}

}
}
