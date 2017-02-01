import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class Counter{
	int i,c,w,l,d;

	Counter (String f)  throws IOException,FileNotFoundException
	{FileInputStream fin = new FileInputStream(f);
		
		while(i!=-1)
		{
			i=fin.read();
			if(i==' ')
				w++;
			if(i=='\n')
				l++;
			if(i>='a'&&i<='z' || i>='A'&&i<='Z')
				c++;
			if(i>='0'&&i<='9' && fin.read()!=' ')
				d++;
		}
	System.out.println("Chars\t"+c+"\nNum\t"+d+"\nWord\t"+w+"\nLine\t"+l);
}
}
class prg2{
	public static void main(String[] args) throws IOException{
		new Counter(args[0]);
	}
}