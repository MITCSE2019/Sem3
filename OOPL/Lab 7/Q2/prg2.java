import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.*;

class Employee{
	String name;
	int age;
	double grossSalary;
	float takeHomeSalary;
	char grade;



	void input(String name, Integer a,Double g,Float t, Character grade) throws IOException{
			this.name=name;
			if(a<1)
			{
				age=1;
				throw new IOException ("Invalid Age");
			}
			else
			this.age=a;
			if(g<1000.0 || g>10000.0)
			{
				grossSalary=2000.0;
				throw new IOException ("Invalid Salary");
			}
			else
			this.grossSalary=g;
			if(t<1000.0 || t>10000.0)
			{
				takeHomeSalary=(float)2000.0;
				throw new IOException ("Invalid Salary");
			}
			else
			this.takeHomeSalary=t;
			this.grade=grade;			
	}

	void display(){
		System.out.println("Name\t\t\t: "+name+"\nAge\t\t\t: "+age+"\nGross Salary\t\t: "+grossSalary+"\nTake Home Salary\t: "+takeHomeSalary+"\nGrade\t\t\t: "+grade);
	}
}

class prg2{
	public static void main(String[] args) throws IOException{
				String name;
				Integer age;
				Double grossSalary;
				Float takeHomeSalary;
				Character grade;
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				Employee employee = new Employee();
				int i=0;
				while(i!=3)
				{
					System.out.println("\n1. Input\n2. Display\n3. Exit");
					i=Integer.parseInt(input.readLine());
					switch (i) {
						case 1:
							System.out.println("Enter Name");
							name = input.readLine();
							System.out.println("Enter Age");
							age = Integer.parseInt(input.readLine());
							System.out.println("Enter Gross Salary");
							grossSalary = Double.parseDouble(input.readLine());
							System.out.println("Enter Take Home Salary");
							takeHomeSalary = Float.parseFloat(input.readLine());
							System.out.println("Enter Grade");
							grade = input.readLine().charAt(0);
							try{
							employee.input(name,age,grossSalary,takeHomeSalary,grade);}
							catch(IOException e){
								System.out.println(e);
							}
							break;
						case 2:
							employee.display();
						default:;	
						
					}
				}	
	}
}

