#include<stdio.h>

void push(char *a,char ele,int n,int *top)
{
if(*top==(n-1))
    printf("Cannot Enter element\nStack Overflow");
else
    a[++(*top)]=ele;
}

void pop(char *a,int * top)
{
if(*top==-1)
    printf("Stack Underflow");
else
    printf("%c",a[(*top)--]);
}

void display(char *a, int n)
{
    int i;
for(i=0;i<n;i++)
    printf("%c",a[i]);

}
void main()
{
char a[20];
int n,t=-1;
printf("Enter number of elements");
scanf("%d",&n);
int *top=&t;
int choice=1;
char ele;
while(choice)
{
    printf("\n1. Push\n2. Pop\n3. Display\n0. Exit\n");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1: if(*top!=(n-1))
                {printf("Enter element\n");
                scanf(" %c",&ele);}
                push(a,ele,n,top);
                break;
        case 2: pop(a,top);
                break;
        case 3: display(a,n);
                break;
        case 0:;

    }
}


}


