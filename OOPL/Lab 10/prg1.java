import java.io.File;

class Listing{
	void display(File path)
	{
		if(path.isFile())
			System.out.println(path.getName()+" is File");
		else
		{
			System.out.println(path.getName()+" is Directory");
			File files[]= path.listFiles();
				for(File d:files)
					display(d);
		}
	}
	Listing(File path){
		display(path);
	}
}

class prg1{
	public static void main(String args[]) {
		new Listing(new File(args[0]));
	}
}