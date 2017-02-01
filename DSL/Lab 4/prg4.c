#include<stdio.h>
#define MAX 10

int * top;
int a[MAX],n;
int flag=0;

void ADD(int i,int x)
{       i--;
        if(top[i]!=MAX)
        {if(top[i]==top[i+1])
            flag=1;
        else
            flag=0;}
        else
            flag=1;
        if(flag)
            {
                printf("Stack Overflow in %d\n",i+1);
                return;
            }

        a[top[i]++]=x;




}

void DELETE(i)
{       i--;

       {if(top[i]-1==top[i-1] )
            printf("Stack Underflow in %d\n",i+1);
        else
            --top[i];}




}

void main()
{
    int i,x,choice,flag=0;
    printf("Enter number of stacks\n");
    scanf("%d",&n);
    top= calloc(n,sizeof(int));

    for(i=0;i<n;i++)
        top[i]=MAX/n*i;
while(flag==0)
{
    printf("1.Add(i,x)\n2.Delete(i)\n3.Exit\n");
    scanf("%d",&choice);
    switch(choice)
    {
        case 1: printf("Enter values\n");
                scanf("%d",&i);
                scanf("%d",&x);
                ADD(i,x);
                break;
        case 2: printf("Enter values\n");
                scanf("%d",&i);
                DELETE(i);
                break;
        case 3:flag=1;
    }
}


for(i=0;i<MAX;i++)
    printf("%d ",a[i]);

}

