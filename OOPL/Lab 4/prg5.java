class Counter
{
static int count=0;
static void Count()
{
System.out.println("Number of objects "+count);
}
Counter()
{count++;}
}

class prg5
{
public static void main(String [] args)
{
Counter c1=new Counter();
c1.Count();
Counter c2=new Counter();
c2.Count();
}
}
