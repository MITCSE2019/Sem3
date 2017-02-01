#include <stdio.h>

int max=10;

void push(int queue[],int front[], int rear[],int element,int n)
{
    if(n==1)
	{int max1=rear[1];
	    if(rear[0]==max1-1 && front[0]==0|| (rear[0]+1)%max1==front[0])
		{printf("Queue is Full\n");
		 return;}
	if(front[0]==-1)
		front[0]=0;
	rear[0]=(rear[0]+1)%max1;
	queue[rear[0]]=element;}
	else if(n==2)
    {
        int max2=max-rear[0]-1;
        if(rear[1]==max2-1 && front[1]==max-1|| (rear[1]-1)%max2==front[1])
        {
            printf("Queue is Full\n");
            return;
        }
        if(front[1]==max)
            front[1]-=1;
        rear[1]=(rear[1]-1)%max2;
        queue[rear[1]]=element;
    }
}

void dqueue(int queue[],int front[], int rear[],int n)
{
	if(n==1)
	{ int max1=rear[1];
	    if(front[0]==-1 && rear[0]==-1)
		printf("Queue is empty\n");

	else
	printf("\nElement deleted %d\n",queue[front[0]++]);


	if(front[0]-1==rear[0])
		{front[0] =-1;
		 rear[0] =-1;}
	else if(front[0]==max1)
	 front[0]=0;}
	 else if(n==2)
     {
         int max2=max-rear[0]-1;
         if(front[1]==max && rear[1]==max)
          printf("Queue is empty");
          else
        printf("\nElement deleted %d\n",queue[front[1]--]);
        if(front[1]+1==rear[0])
        {
            front[1]=max;
            rear[1]=max;
        }
        else if(front[1]==max2)
            front[1]=max-1;

     }
}

void display(int queue[],int front[],int rear[],int n)
{
	if(n==1)
	{   int max1=rear[1];
	    if(front[0]==-1 && rear[0]==-1)
		{printf("Queue is empty\n");
			return;}

	int i=0;
	for(i=front[0];i!=rear[0];i=(i+1)%max1)
		printf("%d ",queue[i]);
	printf("%d",queue[i] );}
	else if(n==2)
    {   int max2=max-rear[0]-1;
        if(front[1]==max && rear[1]==max)
        {
            printf("Queue is empty\n");
            return;
        }
        int i=0;
        for(i=front[1];i!=rear[1];i=(i-1)%max2)
            printf("%d ",queue[i]);
        printf("%d",queue[i]);
    }
}

void main()
{
	int front[2]={-1,max},rear[2]={-1,max};
	int queue[max];
	int i=0,element,n;
	while(i!=4)
		{printf("1.Push\n2.Delete\n3.Display\n4.Exit\n");
		 scanf("%d",&i);
		  printf("Enter queue number\n");
         scanf("%d",&n);
		 switch(i)
		 {
		 	case 1: printf("Enter element\n");
		 			scanf("%d",&element);
		 			push(queue,front,rear,element,n);
		 			break;
		 	case 2: dqueue(queue,front,rear,n);
		 			break;
		 	case 3: display(queue,front,rear,n);
		 			break;
		 	default:;
		 }


		}

}
