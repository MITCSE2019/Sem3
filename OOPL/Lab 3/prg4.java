import java.util.Scanner;

class Stack
{Scanner in=new Scanner (System.in);
int a[],tos;
void iniat()
{
tos=-1;
System.out.println("Enter n");
int n=in.nextInt();
a=new int [n];
}

void push()
{
if(tos==a.length-1)
System.out.println("Stack Overflow");
else
{
System.out.println("Element "+(tos+2));
a[++tos]=in.nextInt();
}
}

void pop()
{
if(tos==-1)
System.out.println("Stack Underflow");
else
System.out.println("Element "+(tos+1)+" is "+a[tos--]);

}

void display()
{
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");

}
}

class prg4{
public static void main(String [] agrs)
{
Scanner in=new Scanner (System.in);
Stack s= new Stack();
s.iniat();
int choice=1;
while(choice==1||choice==2)
{
System.out.print("Enter choice\n1. Push\n2. Pop\n3. Display and Exit\n");
choice = in.nextInt();
switch(choice)
{
	case 1: s.push();
		break;
	case 2: s.pop();
		break;
}
}
System.out.print("Array elements\n");
s.display();
}
}
