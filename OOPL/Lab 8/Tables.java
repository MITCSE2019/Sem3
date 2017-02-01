class Five extends Thread{
	Five(){
		super("Table of Five");
		System.out.println(this);
		start();
	}

	public void run(){
		try{
			for(int i=1;i<11;i++)
			{
				System.out.println(5+"*"+i+"="+(5*i));
				sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted");
		}
		}
	}


class Seven extends Thread{
	Seven(){
		super("Table of Seven");
		System.out.println(this);
		start();
	}

	public void run(){
		try{
			for(int i=1;i<11;i++)
			{
				System.out.println(7+"*"+i+"="+(7*i));
				sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted");
		}
		}
	}

class Tables{
	public static void main(String[] args) {
	try{
	Five five=new Five();
	five.join();
	new Seven();}
	catch(InterruptedException e){
		System.out.println("Interrupted");
	}
}
}