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
void getSuit()
{
return suit;
}

void getRank()
{
return rank;
}
}

class CardTester{
public static void main(String [] args)
{Scanner in = new Scanner (System.in);
Card c[];
System.out.println("Enter two different ranks\n");
int r1, r2;
r1=in.nextInt();
r2=in.nextInt();
for(int i=0;i<5;i++)
{
char s= (in.next()).charAt(0);
int r=r2;
if(i<3)
r=r1;
else
c[i]=new Card (r,s); 
}
for(int i=0;i<5;i++)
{
System.out.println("Card "+(i+1)+" is "+c[i].rank()+" and "+c[i].suit());
}

}
}
