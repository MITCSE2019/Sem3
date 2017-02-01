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
Card c[]= new Card[5];
int a[]= new int[5];
int n1=0,n2=0;

System.out.println("Enter ranks and suits to make a full house");
qwer:
for(int i=0;i<5;i++)
{
int unique=1,r;
int flag[]={0,0};
char s;	

r=in.nextInt();
s= (in.next()).charAt(0);
a[i]=r;

{//Bubble Sort
	for(int p=0;p<i;p++)
		for(int q=0;q<i-p;q++)
			if(a[q]>a[q+1])
			{
				int t=a[q];
				a[q]=a[q+1];
				a[q+1]=t;
			}
}

{//No of Unique numbers
	 for(int k = 0; k < i ; k++)
	{
		if(a[k]==a[k+1])
		continue;
		else
		unique++;
	}
}

if(unique>2)
	{	System.out.println("Enter appropriate rank");
		i--;
		continue;}


n1=a[0];
if(unique==2)
{for(int k=0;k<i+1;k++)
	{
		if(a[k]==n1)
			continue;
		else
			n2=a[k];
	}
}


if(i>2)
{	
	for(int k=0;k<i+1;k++)
	{
		if(n1==a[k])
			flag[0]++;
		else 
			flag[1]++;
	}
}	
	if(flag[0]>3 || flag[1]>3)
		{System.out.println("Extra rank not required");
		i--;
		continue qwer;}



c[i]=new Card (r,s); 
}


for(int i=0;i<5;i++)
System.out.println("Card "+(i+1)+" is "+c[i].getRank()+" "+c[i].getSuit());


}
}


 
                                                    