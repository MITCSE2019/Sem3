import java.util.Scanner;

class StackFull extends Exception{
	public String toString(){
		return "Stack Full";
	}
}

class StackEmpty extends Exception{
	public String toString(){
		return "Stack Empty";
	}
}

class Stack <S>{
	S [] s;
	int top=-1;
	int size;

	Stack (int size){
		this.size=size;
		s = (S [])new Object[size];
	}

	void popS() throws StackEmpty{
		
		if(top==-1)
			
			throw new StackEmpty();
			

		System.out.println(s[top].getClass().getName()+" "+(top+1)+" is deleted");
		System.out.println(s[top--]);
		
	}

	void pushS(S sp) throws StackFull{

		if(top==size-1)
			
			throw new StackFull();
			
		s[++top]=sp;
	}

	void display(){
		for(int i=0;i<=top;i++)
		System.out.println(s[i].getClass().getName()+" "+s[i]);
	}
}

class Student{
	String name;
	int regNo;

	public Student(String name,int regNo){
		this.name=name;
		this.regNo=regNo;
	}

	public String toString(){
		return "Name\t"+name+"\nReg No\t"+regNo;
	}
}

class Employee{
	String name;
	String desig;

	Employee(String name,String desig){
		this.name=name;
		this.desig=desig;
	}

	public String toString(){
		 return "Name\t"+name+"\nDesig\t"+desig;
	}
}

class Q1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	

		String name,desig;
		int regNo;

		int i=0;
		Stack <Student>s;
		Stack <Employee>e;

		System.out.println("Chose Object\n1. Student\t2. Employee");
		int choice=in.nextInt();
		System.out.println("Enter Size");
		int n=in.nextInt();
		
			s=new Stack <Student> (n);

			e= new Stack <Employee> (n);

		while(i!=4)
		{	
			

			System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
			i=in.nextInt();
			String d=in.nextLine();
			switch(i){
				case 1:	try{
						if(choice==1)
						{
							System.out.println("Enter details for Student");
							name=in.nextLine();
							regNo=in.nextInt();
							in.nextLine();
							s.pushS(new Student(name,regNo));
						}
						else if(choice ==2)
						{
							System.out.println("Enter details for Employee");
							name=in.nextLine();
							desig=in.nextLine();
							e.pushS(new Employee(name,desig));
						}}
						catch(StackFull sf)
						{System.out.println(sf);
						 }
						break;
				case 2: try{
						if(choice==1)
							s.popS();
						else if(choice==2)
							e.popS();}
						catch(StackEmpty se)
						{System.out.println(se);}
						break;
				case 3: if(choice==1)
							s.display();
						else if(choice ==2)
							e.display();
				default:;
			}
		}
	}
}