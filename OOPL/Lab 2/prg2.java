//Bubble Sort for 1D Array

import java.util.Scanner;

class prg2{


public static int [] BSort(int n,int b[])
{
System.out.println("\nEnter no\n1. Ascending\n2. Descending");
Scanner in= new Scanner(System.in);
System.out.println("Enter choice");
int choice= in.nextInt();
for(int i=0;i<n-1;i++)
 for(int j=0;j<n-1-i;j++)
	{if(choice==1)
	 if(b[j]>b[j+1])
	  {int t=b[j];
	   b[j]=b[j+1];
	   b[j+1]=t;}
	if(choice==2)
	 if(b[j]<b[j+1])
	  {int t=b[j];
	   b[j]=b[j+1];
	   b[j+1]=t;}
	}
return b;
}



public static void main(String [] args)
{
Scanner in= new Scanner(System.in);
System.out.println("Enter size");
int size=in.nextInt();
int a[]= new int [size];
System.out.println("Elements");
for(int i=0;i<size;i++)
a[i]=in.nextInt();
System.out.println("Original array");
for(int i=0;i<size;i++)
System.out.print(a[i]+" ");
a=BSort(size,a);

System.out.println("New array");
for(int i=0;i<size;i++)
System.out.print(a[i]+" ");
}

}
