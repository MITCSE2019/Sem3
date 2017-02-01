//Add two 2D arrays

import java.util.Scanner;

class prg6{


public static int[][] Add (int r,int c,int a[][],int b[][])
{

int add[][]= new int [r][c];

for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
add[i][j]=a[i][j]+b[i][j];


return add;
}



public static void main(String [] args)
{
Scanner in= new Scanner(System.in);
System.out.println("Enter row and column");
int r=in.nextInt();
int c=in.nextInt();

int a[][]= new int [r][c];
System.out.println("Elements of Array A");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
a[i][j]=in.nextInt();
System.out.println("Array A");
for(int i=0;i<r;i++)
{for(int j=0;j<c;j++)
 System.out.print(a[i][j]+" ");
System.out.println();}



int b[][]= new int [r][c];
System.out.println("Elements of Array B");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
b[i][j]=in.nextInt();
System.out.println("Array B");
for(int i=0;i<r;i++)
{for(int j=0;j<c;j++)
 System.out.print(b[i][j]+" ");
System.out.println();}

System.out.println("Array C");
int add[][]=Add(r,c,a,b);
for(int i=0;i<r;i++)
{for(int j=0;j<c;j++)
 System.out.print(add[i][j]+" ");
System.out.println();}
}



}
