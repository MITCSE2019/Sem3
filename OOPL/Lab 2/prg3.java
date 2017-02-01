//Insertion and Deletion

import java.util.Scanner;

class prg3{


public static int [] Insert(int n,int a[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter position");
int pos=in.nextInt();
System.out.println("Enter number");
int no=in.nextInt();
int b[]=new int [a.length+1];

for(int i=0,j=0;i<n;i++)
{
b[j]=a[i];
if(j==(pos-1))
{b[j]=no;
j++;}
j++;
}
b[pos]=a[pos-1];
return b;
}

public static int [] Delete(int n,int a[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter position");
int pos=in.nextInt();
int b[]=new int [a.length-1];

for(int i=0,j=0;i<n;i++,j++)
{
b[j]=a[i];
if(j==(pos-2))
i++;
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
a=Insert(size,a);
size=a.length;
System.out.println("New array");
for(int i=0;i<size;i++)
System.out.print(a[i]+" ");
a=Delete(size,a);
size=a.length;
System.out.println("New array");
for(int i=0;i<size;i++)
System.out.print(a[i]+" ");
}

}
