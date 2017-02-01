import java.util.Scanner;

class Person {
	private String name;
	private String dob;
	Person(String name,String dob)
	{
		this.name=name;
		this.dob=dob;
	}
	public String getName()
	{return name;}
	public String getDob()
	{return dob;}
}

class Collge_Graduate extends Person{
private float gpa;
private String yog;
Collge_Graduate(float gpa,String yog,String name,String dob)
{	super(name,dob);
	this.gpa=gpa;
	this.yog=yog;
	
}
public float getGpa()
{return gpa;}
public String getYog()
{return yog;}

}

class prg1{
	public static void main(String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter details\n");
		String name=in.nextLine();
		String dob=in.next();
		float gpa=in.nextFloat();
		String yog=in.next();
		Collge_Graduate s1= new Collge_Graduate(gpa,yog,name,dob);
		System.out.println("Name\t\t\t"+s1.getName()+"\nDate of Birth\t\t"+s1.getDob()+"\nGpa \t\t\t"+s1.getGpa()+"\nYear of Graduation\t"+s1.getYog());
	}
}