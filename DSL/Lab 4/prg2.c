#include<stdio.h>

void push(char *a,char ele,int n,int *top)
{
if(*top==(n-1))
    printf("Cannot Enter element\nStack Overflow");
else
    a[++(*top)]=ele;
}

char pop(char *a,int * top)
{
if(*top==-1)
    printf("Stack Underflow");
return a[(*top)--];
}

void display(char *a, int n)
{
    int i;
for(i=0;i<n;i++)
    printf("%c",a[i]);

}
void main()
{
char a[20],stac[20];
int n=0,t=-1;
int *top=&t;
printf("Enter string\n");
scanf("%s",a);
while(a[n]!='\0')
    n++;
int i;
for(i=0;i<n;i++)
    push(stac,a[i],n,top);
int flag=0;
for(i=0;i<n;i++)
if(pop(a,top)!=a[i])
    flag++;


if(!flag)
    printf("String is a palindrome");
else
    printf("Not a palindrome");
}





