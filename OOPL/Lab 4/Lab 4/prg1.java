import java.util.Scanner;
class Complex
{
double real;
double imag;

Complex()
{
System.out.println("Default Const");
real=10;
imag=10;
}

Complex(double real, double imag)
{
System.out.println("Parameterized Const");
this.real=real;
this.imag=imag;
}

Complex(Complex c)
{

System.out.println("Copy Const");
real=c.real;
imag=c.imag;
}


void display()
{System.out.println("Complex No = "+real+"+i"+imag);}

Complex add(Complex a)
{
a.real+=real;
a.imag+=imag;
return a;
}

Complex sub(Complex a)
{
a.real-=real;
a.imag-=imag;
return a;
}


}

class prg1{

public static void main(String [] args)
{
Complex No1=new Complex();
No1.display();
Scanner in=new Scanner(System.in);
System.out.println("Enter values");
double real=in.nextDouble();
double imag=in.nextDouble();
Complex No2=new Complex(real,imag);
No2.display();
Complex No3=new Complex(No2);
No3.display();
}
}
