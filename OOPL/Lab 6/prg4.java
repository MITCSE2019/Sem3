import java.util.Scanner;

abstract class Figure{
	int dim1,dim2;
	abstract void area();
	Figure(int dim1,int dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	Figure(int dim1){
		this.dim1=dim1;
	}
}

class Rectangle extends Figure{

	Rectangle(int dim1,int dim2){
		super(dim1,dim2);
	}

	void area(){
		System.out.println("The area of the Rectangle is "+(dim1*dim2));
	}
}

class Square extends Figure{

	Square(int dim1){
		super(dim1);
	}

	void area(){
		System.out.println("The area of the Square is "+(dim1*dim1));
	}
}

class Triangle extends Figure{

	Triangle(int dim1,int dim2){
		super(dim1,dim2);
	}

	void area(){
		System.out.println("The area of triangle is "+(0.5*dim1*dim2));
	}
}

class prg4{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		int dim1,dim2;
		Figure f;
		System.out.println("Enter length and breadth for Rectangle");
		dim1=in.nextInt();
		dim2=in.nextInt();
		f=new Rectangle(dim1,dim2);
		f.area();

		System.out.println("Enter side for Square");
		dim1=in.nextInt();
		f=new Square(dim1);
		f.area();

		System.out.println("Enter base and height for Triangle");
		dim1=in.nextInt();
		dim2=in.nextInt();
		f=new Triangle(dim1,dim2);
		f.area();

	}



}