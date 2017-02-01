import java.util.Scanner;

class NewThread implements Runnable{
	String name;
	int no;
	Thread thread;
	int row[];
	NewThread(int no,int row[])
	{
		this.no=no+1;
		this.name="Thread"+no;
		this.row=row;
		thread=new Thread(this,name);
		thread.start();
	}
	int sum;
	@Override
	public void run(){
			for(int i=0;i<row.length-1;i++)
				for(int j=0;j<row.length-i-1;j++)
				{
					int t=row[j];
					row[j]=row[j+1];
					row[j+1]=row[j];
				}
	}

	int getSum(){
		return sum;
	}

}

class ThreadSum{
	public static void main(String[] args) {
		int row,column;
		System.out.println("Enter row and column");
		Scanner in = new Scanner(System.in);
		row=in.nextInt();
		column=in.nextInt();
		int matrix[][]=new int [row][column];
		System.out.println("Enter values of the matrix");
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
				matrix[i][j]=in.nextInt();
		NewThread thread[]=new NewThread[matrix.length];

		for(int i=0;i<matrix.length;i++)
		{
			thread[i]=new NewThread(i,matrix[i]);
		}

		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
			System.out.println(thread[i].row[j]);
		
		int sum=0;
		for (int i=0;i<matrix.length;i++ ) {
			sum+=thread[i].getSum();
		}
		System.out.println("Sum of Matrix is "+sum);
	}
}