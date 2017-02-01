import java.util.Scanner;
class Time
{
int hours;
int minutes;
int seconds;

Time()
{
System.out.println("Default Const");
hours=10;
minutes=10;
seconds=10;
}

Time(int hours,int minutes,int seconds)
{	
	System.out.println("Parameterized Const");
	this.hours=hours;
	this.minutes=minutes;
	this.seconds=seconds;
}

Time(Time t)
{	System.out.println("Copy Const");
	hours=t.hours;
	minutes=t.minutes;
	seconds=t.seconds;
}

void display()
{System.out.println("Time is "+hours+":"+minutes+":"+seconds);}

Time add(Time t)
{
int a=t.hours*60*60+t.minutes*60+t.seconds;
int b=hours*60*60+minutes*60+seconds;
int c=b+a;
t.hours=c/(60*60);
c%=60*60;
t.minutes=c/60;
c%=60;
t.seconds=c;
if(t.hours>23)
{t.hours=0;
System.out.println("Next Day");}
return t;
}

Time sub(Time t)
{
int a=t.hours*60*60+t.minutes*60+t.seconds;
int b=hours*60*60+minutes*60+seconds;
int c=b-a;
if(c<0)
c=-c;
t.hours=c/(60*60);
c%=60*60;
t.minutes=c/60;
c%=60;
t.seconds=c;
if(t.hours>23)
{t.hours=0;
System.out.println("Previous Day");}
return t;
}

}

class prg2{

public static void main(String [] args)
{
Time T1=new Time();
T1.display();
Scanner in=new Scanner(System.in);
int hours,seconds,minutes;
System.out.println("Enter values");
hours=in.nextInt();
if (hours<0 || hours>23)
{System.out.println("Invalid value");
hours=0;}
minutes=in.nextInt();
if (minutes<0 || minutes>59)
{System.out.println("Invalid value");
minutes=0;}
seconds=in.nextInt();
if (seconds<0 || seconds>59)
{System.out.println("Invalid value");
seconds=0;}
Time T2=new Time(hours,seconds,minutes);
T2.display();
Time T3=new Time(T2);
T3.display();
}
}
