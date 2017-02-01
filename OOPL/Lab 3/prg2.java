import java.util.Scanner;
class Time
{
int hours;
int minutes;
int seconds;

void input()
{
Scanner in=new Scanner(System.in);
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

void compare(Time t)
{
int a=t.hours*60*60+t.minutes*60+t.seconds;
int b=hours*60*60+minutes*60+seconds;
if(a>b)
System.out.println("New time is greater");
else
System.out.println("New time is smaller");
}
}
class prg2{

public static void main(String [] args)
{
System.out.println("Time A");
Time Demo=new Time();
Demo.input();
Demo.display();
System.out.println("Time B");
Time a=new Time();
a.input();
a=Demo.add(a);
a.display();
a=Demo.sub(a);
a.display();
Demo.compare(a);
}
}
