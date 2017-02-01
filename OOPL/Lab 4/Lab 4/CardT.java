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

class CardT{
public static void main(String [] args)
{Scanner in = new Scanner (System.in);
Card c []= new Card[5];

for(int i=0;i<5;i++)
{
int r=in.nextInt();
char s= (in.next()).charAt(0);
c[i]=new Card (r,s); 
}
int flag=1,flag2=0;
for(int i=1;i<5;i++)
	if(c[i].getRank()!=c[0].getRank())
		flag++;
int dif=0;
for(int i=1;i<5;i++)
if(c[0].getRank()!=c[i].getRank())
{
	dif=c[i].getRank();
	break;
}

for(int i=1;i<5;i++)
if(dif==c[i].getRank())
	flag2++;

int decide=0;

if(flag==3 && flag2==2 )
	decide=1;
if(flag==2 && flag2==3)
	decide=1;

if(decide==1)
	System.out.println("Full House");
else
	System.out.println("Not a Full House");
for(int i=0;i<5;i++)
{
System.out.println("Card "+(i+1)+" is "+c[i].getRank()+" and "+c[i].getSuit());
}

}
}