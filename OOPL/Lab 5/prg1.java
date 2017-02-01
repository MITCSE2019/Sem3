import java.util.*;

class Student {
	int rno;
	String name;
	short sem;
	GregorianCalendar gc;
	float gpa;
	float cgpa;
	int reg;
	Student()
	{	}
	
	Student(int rno,String name,int year,int month,int date,short sem,float gpa,float cgpa)
	{
		this.rno=rno;
		this.name=name;
		this.sem=sem;
		gc = new GregorianCalendar(year,month,date);
		this.gpa=gpa;
		this.cgpa=cgpa;
		reg=gc.get(Calendar.YEAR)%100*100+rno;
	}

	// Student(Student s)
	// {
	// 	rno=a.rno;
	// 	name=a.name;
	// 	sem=a.sem;
	// 	doj=a.doj;
	// 	gpa=a.gpa;
	// 	a.cgpa=cgpa;
	// }

	static void display(Student s[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Roll No\t\t: "+s[i].rno);
			System.out.println("Name\t\t: "+s[i].name);
			System.out.println("Date (mm/dd/yy)\t: "+new Formatter().format("%tD",s[i].gc));
			System.out.println("Semester\t: "+s[i].sem);
			System.out.println("GPA\t\t: "+s[i].gpa);
			System.out.println("CGPA\t\t: "+s[i].cgpa);
			System.out.println("Reg No\t\t: "+s[i].reg+"\n\n");
		}
	}

	static void semSort(Student s[])
	{
		
		for (int i=0;i<4;i++)
			for(int j=0;j<4-i;j++)
			{
				if(s[j].sem>s[j+1].sem)
				{
					Student temp =s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		

	}

	static void cgpaSort(Student s[])
	{
		
		for (int i=0;i<4;i++)
			for(int j=0;j<4-i;j++)
			{
				if(s[j].cgpa>s[j+1].cgpa)
				{
					Student temp =s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		

	}

	static void nameSort(Student s[])
	{
		
		for (int i=0;i<4;i++)
			for(int j=0;j<4-i;j++)
			{
				if((s[j].name).compareTo(s[j+1].name) > 0)
				{
					Student temp =s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		

	}

	static void listName(Student s[],char c)
	{

		for (int i=0;i<5;i++)
			{
				if(s[i].name.charAt(0)==c)
					System.out.println(s[i].name);
			}
	}

	static void findSubString(Student s[], String d)
	{
		for(int i=0;i<5;i++)
		{
			if((s[i].name).indexOf(d)!=-1)
				System.out.println(s[i].name);
		}
	}

	static void convert(Student s[])
	{
		
		for(int i=0;i<5;i++)
		{	
			String temp=new String(s[i].name);
			String d=""+temp.charAt(0)+". ";
			int last= (s[i].name).lastIndexOf(' ');
			
			while(temp.indexOf(' ')!=temp.lastIndexOf(' '))
			{
				d+=temp.charAt(temp.indexOf(' ')+1)+". ";
				temp=temp.substring(temp.indexOf(' ')+1);
			}
			d+=(s[i].name).substring(last+1);
			s[i].name=d;
		}

		display(s);
	}
}


class prg1{

	public static void main(String args[])
	{
		Student s[]= new Student[5];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter details of Student "+(i+1));
			System.out.println("Enter Roll No ");
			int rno = in.nextInt();
			in.nextLine();
			System.out.println("Name ");
			String name = in.nextLine();
			System.out.println("Date, Month and Year");
			int date = in.nextInt();
			int month = in.nextInt()-1;
			int year = in.nextInt();
			System.out.println("Semester ");
			short sem = in.nextShort();
			System.out.println("GPA ");
			float gpa = in.nextFloat();
			System.out.println("CGPA ");
			float cgpa = in.nextFloat();
			s[i]=new Student(rno,name,year,month,date,sem,gpa,cgpa);
		}	
			int i=-1;
			while(i!=8)
			{
				System.out.println("1.Sort by Sem\n2.Sort by Cgpa\n3.Sort by Name\n4.List names with a Char\n5.List names with a substring\n6.FullName to Initials\n7.Display\n8.Exit");
				i=in.nextInt();
				switch(i)
				{
					case 1:	Student.semSort(s);
							Student.display(s);
							break;
					case 2: Student.cgpaSort(s);
							Student.display(s);
							break;
					case 3: Student.nameSort(s);
							Student.display(s);
							break;
					case 4: System.out.println("Enter character");
							char c=(in.next()).charAt(0);
							Student.listName(s,c);
							Student.display(s);
							break;
					case 5: System.out.println("Enter substring");
							String d=in.next();
							Student.findSubString(s,d);
							Student.display(s);
							break;
					case 6: Student.convert(s);
							Student.display(s);
							break;
					case 7: Student.display(s);
							break;
					case 8:;
				}
			}


		


		
	}

}





		// int c= s[0].sem;
		// int no=0,f=0;
		// for (int i=0;i<5;i++)
		// 	{if(s[i].sem == c)
		// 		no++;
		// 	for(;f<no-1;f++)
		// 	{	for(int j=0;j<no-i-1;j++)
		// 		{
		// 			if(s[j].sem>s[j+1].sem)
		// 			{
		// 				Student temp =s[j];
		// 				s[j]=s[j+1];
		// 				s[j+1]=temp;
		// 			}
		// 		}



		// 	}