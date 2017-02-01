import java.util.Scanner;

class Patient {
	Scanner in = new Scanner(System.in);
	String name;
	int age,hNo;
	
	void setName(){
		System.out.println("Enter name");
		name=in.nextLine();
	}

	void setHNo(){
		System.out.println("Enter Hospital Number");
		hNo=in.nextInt();
	}

	void setAge(){
		System.out.println("Enter Age");
		age=in.nextInt();
	}

	void display()
	{
		System.out.println("Name\t\t"+name+"\nHospital No\t"+hNo+"\nAge\t\t"+age);
	}
}

class Inpatient extends Patient{
	String deptName,roomType,adDate;

	void setDeptName(){
		System.out.println("Enter Department Name");
		in.nextLine();
		deptName=in.nextLine();
	}

	void setAdDate(){
		System.out.println("Enter Admission Date (dd-mm-yy)");
		adDate=in.next();
	}

	void setRoomType(){
		System.out.println("Enter Room Type");
		in.nextLine();
		roomType=in.nextLine();
	}

	void display(){
		super.display();
		System.out.println("Department Name\t"+deptName+"\nAdmission Date\t"+adDate+"\nRoom Type\t"+roomType);
	}
}

class Billing extends Inpatient{
	String disDate;

	void setDisDate(){
		System.out.println("Enter Discharge Date (dd-mm-yy)");
		disDate=in.next();
	}

	void display(){
		super.display();
		int totalAmount=0;
		int days=Integer.parseInt(disDate.substring(0,2))-Integer.parseInt(adDate.substring(0,2));
		int months=Integer.parseInt(disDate.substring(3,5))-Integer.parseInt(adDate.substring(3,5));
		int years=Integer.parseInt(disDate.substring(6,8))-Integer.parseInt(adDate.substring(6,8));

		days+=(months*30)+(years*12*30);

		if(roomType.equals("Special"))
			{	totalAmount= days*(1000+200);}
		else if(roomType.equals("Semi Special"))
			{	totalAmount= days*(500+100);}
		else if(roomType.equals("General"))
			{	totalAmount= days*(100+50);}

		System.out.println("Total Amount\t"+totalAmount);
		
	}

}


class prg2{
	public static void main(String args[]){
		Billing b=new Billing();
		b.setName();
		b.setAge();
		b.setHNo();
		b.setDeptName();
		b.setAdDate();
		b.setRoomType();
		b.setDisDate();
		b.display();
	}
}