//Symmetricity of a Matrix

import java.util.Scanner;

class prg5{


public static void Sym (int n,int a[][])
{boolean flag=true;
 for(int i=0;i<n;i++)
 for(int j=0;j<n;j++)
  if(a[i][j]!=a[j][i])
	flag=false;
if(flag)
System.out.println("Matrix is Symmetric");
else
System.out.println("Matrix is not Symmetric");
}



public static void main(String [] args)
{
Scanner in= new Scanner(System.in);
System.out.println("Enter row and column");
int n=in.nextInt();

int a[][]= new int [n][n];
System.out.println("Elements");
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
a[i][j]=in.nextInt();
System.out.println("Original array");
for(int i=0;i<n;i++)
{for(int j=0;j<n;j++)
 System.out.print(a[i][j]+" ");
System.out.println();}
Sym(n,a);

}

}
