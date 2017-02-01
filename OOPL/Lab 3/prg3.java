import java.util.Scanner;

class Mixer
{
int n;
int arr[];

void accept()
{
Scanner in = new Scanner(System.in);
System.out.println("Enter n");
n=in.nextInt();
arr= new int[n];
System.out.println("Elements of array");
for(int i=0;i<n;i++)
arr[i]=in.nextInt();
}

Mixer mix(Mixer A)
{
int m=A.arr.length;
int q=0,w=0,i=0;
int a[]=new int[m+n];
//q arr n
//w A.arr m
for(;q<n && w<m;)
{
if(arr[q]<=A.arr[w])
a[i++]=arr[q++];
else
a[i++]=A.arr[w++];
}

if(q<n)
while(q<n)
a[i++]=arr[q++];


else
while(w<m)
a[i++]=A.arr[w++];




A.arr=a;
A.n=m+n;
return A;
}


void display()
{
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");
System.out.println();

}
}

class prg3
{
public static void main(String[] args)
{
 Mixer a=new Mixer();
Mixer b=new Mixer();
a.accept();
b.accept();
a.display();
b.display();
b=b.mix(a);
b.display();
}

}
