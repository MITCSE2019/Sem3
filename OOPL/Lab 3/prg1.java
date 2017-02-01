import java.util.Scanner;
class Complex
{
double real;
double imag;

void input()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter values");
real=in.nextDouble();
imag=in.nextDouble();
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
System.out.println("Complex no A");
Complex No=new Complex();
No.input();
No.display();
System.out.println("Complex no B");
Complex a=new Complex();
a.input();
a=No.add(a);
a.display();
a=No.sub(a);
a.display();
}
}
