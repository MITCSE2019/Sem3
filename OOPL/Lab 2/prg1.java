//Reverse elements in 1D array

import java.util.Scanner;

class prg1{
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
for(int i=0;i<(size/2);i++)
{
int t=a[i];
a[i]=a[size-1-i];
a[size-1-i]=t;
}

System.out.println("\nNew array");
for(int i=0;i<size;i++)
System.out.print(a[i]+" ");
}

}
