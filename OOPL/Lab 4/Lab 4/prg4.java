import java.util.Scanner;

class Account
{
String name;
String Ano;
String type;
double balance;
static double rate=7.5;
Account()
{
name="John Doe";
Ano="A000";
type="Master";
balance=1000.0;
}

Account(String n, String a, String t, double b)
{
name=n;
Ano=a;
type=t;
balance=b;
}

Account(Account a)
{
name=a.name;
Ano=a.Ano;
type=a.type;
balance=a.balance;
}

void deposit(double d)
{
balance+=d;
}

void withdraw(double d)
{
if(balance>1000.0)
{balance-=d;
System.out.println("Money Withdrawn "+d);}
else
System.out.println("Minimum Balance Unavailable");
}

void display()
{
System.out.println("\nName\t\t"+name+"\nAccount Number\t"+Ano+"\nType\t\t"+type+"\nBalance\t\t"+balance);
}

static void disIns()
{
System.out.print("Interest is "+rate);

}
}


class prg4{
public static void main(String [] args)
{
Account a1=new Account();
Scanner in = new Scanner (System.in);
a1.display();
a1.deposit(500);
a1.withdraw(100);
a1.display();
System.out.println("\nEnter Details");
String name=in.nextLine(),Ano=in.next(),type=in.next();
double balance=in.nextDouble();
Account a2=new Account (name,Ano,type,balance);
a2.display();
Account a3=new Account (a2);
a3.display();
Account.disIns();
}


}
