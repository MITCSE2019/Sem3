import com.course.buildings.*;
import java.util.Scanner;

class prg5{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		System.out.println("Enter building details");
		Building b=new Building();
		int temp=in.nextInt();
		b.setSquareFootage(temp);
		temp=in.nextInt();
		b.setStories(temp);
		System.out.println("\nBuilding details\nSquare Footage\t"+b.getSquareFootage()+"\nBathroom No\t"+b.getStories());

		House h= new House();
		System.out.println("\n\nEnter House Details");
		temp=in.nextInt();
		h.setSquareFootage(temp);
		temp=in.nextInt();
		h.setStories(temp);
		temp=in.nextInt();
		h.setBedroomNo(temp);
		temp=in.nextInt();
		h.setBathNo(temp);
		System.out.println("\nHouse details\nSquare Footage\t"+h.getSquareFootage()+"\nBathroom No\t"+h.getStories());
		System.out.println("BedroomNo\t"+h.getBedroomNo()+"\nBath Number\t"+h.getBathNo());

		School s= new School();
		System.out.println("\n\nEnter School Details");
		temp=in.nextInt();
		s.setSquareFootage(temp);
		temp=in.nextInt();
		s.setStories(temp);
		temp=in.nextInt();
		s.setClassroom(temp);
		temp=in.nextInt();
		s.setGradeLevel(temp);
		System.out.println("\nSchool details\nSquare Footage\t"+s.getSquareFootage()+"\nBathroom No\t"+s.getStories());
		System.out.println("Classroom No\t"+s.getClassroom()+"\nGrade Level\t"+s.getGradeLevel());



	}
	
}