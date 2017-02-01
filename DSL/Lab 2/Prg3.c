#include<stdio.h>

void forw(int *p,int n)
{int i;
for(i=0;i<n;i++)
    printf("%d ",*(p++));
    }

void backw(int *p,int n)
{int i;
p+=n-1;
for(i=0;i<n;i++)
    printf("%d ",*(p--));}

void main()
{
int a[20],n;
printf("Enter no\n");
scanf("%d",&n);
printf("Enter elements\n");
int i;
for(i=0;i<n;i++)
    scanf("%d",&a[i]);
printf("Array in forward\n");
forw(a,n);
printf("\nArray in backward\n");
backw(a,n);
}
