import java.util.Scanner;

class Node <T extends Number>{
	T data;
	Node <T> next;
	Node (T data){
		this.data=data;
	}

	void display(){
		System.out.println(data);
	}
}

class List <T extends Number> {
	Node <T> first;
	List (){
		first=null;
	}

	void insertFront(T data){
		Node <T> temp= new Node <T>(data);
		temp.next=first;
		first=temp;
	}

	void delFront() throws ListEmpty{
		if(first==null)
			throw new ListEmpty();
		Node <T> temp=first;
		System.out.println("Element deleted is "+temp.data);
		first=temp.next;
	}

	void display(){
		Node <T> temp = first;
		while(temp!=null)
		{
			temp.display();
			temp=temp.next;
		}
	}
}
class ListEmpty extends Exception{
	public String toString(){
		return "List Empty";
	}
}

class Q2{
	public static void main(String[] args) {
		List <Integer> l1 = new List <Integer>();
		l1.insertFront(10);
		l1.insertFront(20);
		l1.display();

		try{
			l1.delFront();
			l1.delFront();
			l1.delFront();
		}
		catch(ListEmpty e)
		{
			System.out.println(e);
		}
	}
}