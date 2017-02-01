import java.lang.Exception;
import java.util.Scanner;

class SeatsFilledException extends Exception{
		private int reg;
		SeatsFilledException(int reg){
			this.reg=reg;
		}
		public String toString(){
			return "Invalid Registration Number "+reg;
		}
}

class Student{
	int year;
	int reg;
	Student(int year,int seat) throws SeatsFilledException{
		this.year=year;
		reg=year%100*100+seat;
		System.out.println("Registration Number is "+reg);
		if(reg%100>25)
			throw new SeatsFilledException(reg);
	}
}

class prg3{
	public static void main(String[] args) {

		for(int i=24;;i++)
		{
			System.out.println("Enter Year");
			Scanner in = new Scanner(System.in);
			int year=in.nextInt();
			try
			{Student s = new Student(year,i);}
			catch(SeatsFilledException e){
				e.printStackTrace();
			break;
			}
		}
	}
}