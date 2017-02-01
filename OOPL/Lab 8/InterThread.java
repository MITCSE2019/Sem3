class Queue {
	int data;
	boolean flag=false;
	synchronized void put(int n) {
		if(flag)
			try{
			wait();}
			catch(InterruptedException e){
				System.out.println(e);
			}
		data=n;
		flag=true;
		System.out.println("Put "+n);
		try{Thread.sleep(700);}
		catch(InterruptedException e){System.out.println(e);}
		notify();
			
	}

	synchronized void get(){
		if(!flag)
			try{
			wait();}
			catch(InterruptedException e){
				System.out.println(e);
			}
		System.out.println("Got "+data);
		flag=false;
		notify();
	}
}

class Producer implements Runnable{
	Queue q;
	Producer(Queue q){
		this.q=q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i=0;
		while(true){
			q.put(i++);
		}
	}
}

class Consumer implements Runnable{
	Queue q;
	Consumer(Queue q) {
		this.q=q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while(true)
			q.get();
	}
}

class InterThread{
	public static void main(String[] args) {
		Queue q = new Queue();
		
			new Producer(q);

			new Consumer(q);
		
	}
}