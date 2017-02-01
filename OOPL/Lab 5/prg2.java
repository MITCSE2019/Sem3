import java.util.Scanner;

class prg2{

	public static void main(String []args)
	{
		String no;
		Scanner in= new Scanner(System.in);
		no=in.next();
		int add=no.length()/3,len=no.length();
		if(len%3==0)
			add--;
		char cno[]=new char [len+add];
		int flag=0,index=len+add-1;
		while(len>0)
		{flag++;
			if(flag>3)
			 if(flag%4==0)
			 	{cno[index]=',';
			 	index--;
			 	continue;
			 	}
			cno[index]=no.charAt(len-1);	
			index--;
			len--;
		}	
		System.out.print("Input String : "+no+"\nOutput String : ");
		for(int i=0;i<no.length()+add;i++)
			System.out.print(cno[i]);
			
		
	}

}