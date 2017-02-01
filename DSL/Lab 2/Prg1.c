#include <stdio.h>

void add(int *a,int *b)
{
int sum= *a+*b;
printf("%d",sum);
}


void main()

{int a,b,*p=&a,*q=&b;
printf("Enter numbers\n");
scanf("%d%d",&a,&b);
add(&a,&b);
}
