//2 stacks in one array


#include<stdio.h>
#define MAX 10

int top[2]={-1,MAX};
int a[MAX];
int flag=0;

void ADD(int i,int x)
{
    if(i==0)
    {   if(top[0]+1==top[1])
            flag=1;
        else
            flag=0;
        if(flag)
            {
                printf("Stack Overflow\n");
                return;
            }

        a[++top[0]]=x;
    }
    if(i==1)
    {   if(top[1]-1==top[0])
            flag=1;
        else
            flag=0;
        if(flag)
            {
                printf("Stack Overflow\n");
                return;
            }

        a[--top[1]]=x;

    }
}

void DELETE(i)
{
    if(i==0)
    {
        if(top[0]==-1)
            printf("Stack Underflow\n");
        else
            --top[0];

    }
    if(i==1)
    {
         if(top[1]==MAX)
            printf("Stack Underflow\n");
            else
                --top[1];
    }
}

void main()
{
    int i,x,n,flag=0;
while(flag==0)
{
    printf("1.Add(i,x)\n2.Delete(i)\n3.Exit\n");
    scanf("%d",&n);
    switch(n)
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
