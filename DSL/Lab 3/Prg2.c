#include<stdio.h>

int fib(int n)
{
if(n==0||n==1)
return n;
return (fib(n-1)+fib(n-2));
}

void main()
{printf("Number ");
int i,n;
scanf("%d",&n);
for(i=0;i<n;i++)
    printf("%d ",fib(i));
}
