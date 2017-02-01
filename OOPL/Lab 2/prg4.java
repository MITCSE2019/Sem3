//Linear Search

import java.util.Scanner;

class prg4{


public static void Linear (int n,int b[])
{
System.out.println("Enter no to search");
Scanner in= new Scanner(System.in);
int no = in.nextInt();
for(int i=0;i<n;i++)
if(b[i]==no)
System.out.println("Number is at position "+(i+1));

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
Linear(size,a);

}

}
