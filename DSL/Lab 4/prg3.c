#include<stdio.h>
#include<math.h>

void push(int *a,int ele,int *top)
{
    a[++(*top)]=ele;
}

int pop(int *a,int * top)
{
if(*top==-1)
    printf("Stack Underflow");
else
    printf("%d",a[(*top)--]);
}

void display(int *a, int n)
{
    int i;
for(i=0;i<n;i++)
    printf("%c",a[i]);

}
void main()
{
    int stac[20],dec,n=0,t=-1;
int *top=&t;
printf("Enter number\n");
scanf("%d",&dec);
n=log10(dec)+1;

int i;
while(dec>0)
    {   push(stac,dec%2,top);
        dec/=2;
    }
while(*top!=-1)
    pop(stac,top);
}
