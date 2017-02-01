import	java.util.Scanner;

interface Series{
	int getNext();
	void reset();
	void setStart();
}

class ByTwos implements Series{
	int series;
	public  void setStart()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first number in the series");
		series=in.nextInt();
	}

	public  int getNext()
	{
		return series=series+2;
	}

	public  void reset()
	{
		System.out.println("Series is being reset");
		setStart();
	}
}

class prg4{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Series series=new ByTwos();
		
		int i=0;
		while(i!=4)
		{
			System.out.println("\n1. Set Start\n2. Get Next\n3. Reset\n4. Exit");
			i=in.nextInt();
			switch (i) {
				case 1:
					series.setStart();
					break;
				case 2:
					System.out.println("Next number "+series.getNext());
					break;
				case 3:
					series.reset();
				default:;	
				
			}
		}	
	}
}


