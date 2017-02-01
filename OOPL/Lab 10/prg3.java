import java.io.*;

class StringSearch{
	int lineCount;
	String line;
	StringSearch(String f,String s)  throws IOException,FileNotFoundException{
		BufferedReader bf = new BufferedReader(new FileReader(f));
		while((line=bf.readLine())!=null)
		{
			lineCount++;
			int indexfound=line.indexOf(s);
			if(indexfound>-1)
			{
				System.out.println(line);
				System.out.println("Word found at pos "+indexfound+","+lineCount);
			}
		}
	}
}

class prg3{
	public static void main(String[] args) throws IOException{
		new StringSearch(args[0],args[1]);
	}
}