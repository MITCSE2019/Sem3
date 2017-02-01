import myPackages.p1.Max;
import java.util.Scanner;

class prg3{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a=0,b=0,c=0;
		float d=0,e=0,f=0;

		int i=0;
		while(i!=5)
		{	System.out.println("1.Max of Integers\n2.Max of Floats\n3.Max of Array\n4.Max of Matrix\n5.Exit");
			i=in.nextInt();
			switch(i)
			{	case 1:	System.out.println("Enter 3 numbers");
						a=in.nextInt();
						b=in.nextInt();
						c=in.nextInt();
						System.out.println("The maximum number is "+Max.max(a,b,c));
						break;
				case 2: System.out.println("Enter 3 numbers");
						d=in.nextFloat();
						e=in.nextFloat();
						f=in.nextFloat();
						System.out.println("The maximum number is "+Max.max(d,e,f));
						break;
				case 3: System.out.println("Enter number of elements");
						int n=in.nextInt();
						int g[]=new int [n];
						System.out.println("Enter elements");
						for(int j=0;j<g.length;j++)
							g[j]=in.nextInt();
						System.out.println("The maximum number in the array "+Max.max(g));
						break;
				case 4: System.out.println("Enter row and column");
						int row=in.nextInt();
						int col=in.nextInt();
						int h[][]=new int[row][col];
						System.out.println("Enter elements");
						for(int j=0;j<row;j++)
							for(int k=0;k<col;k++)
								h[j][k]=in.nextInt();
						System.out.println("The maximum number in the matrix "+Max.max(h));
				case 5:;
			}
		}
	}
}

