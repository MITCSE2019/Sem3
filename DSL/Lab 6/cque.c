#include <stdio.h>

#define max 10

void push(int queue[],int * front, int *rear,int element)
{

	if(*rear==max-1 && *front==0|| (*rear+1)%max==*front)
		{printf("Queue is Full\n");
		 return;}
	if(*front==-1)
		*front=0;
	*rear=(*rear+1)%max;
	queue[*rear]=element;
}

void dqueue(int queue[],int * front, int * rear)
{
	if(*front==-1 && *rear==-1)
		printf("Queue is empty\n");

	else
	printf("\nElement deleted %d\n",queue[(*front)++]);


	if(*front-1==*rear)
		{*front =-1;
		 *rear =-1;}
	else if(*front==max)
	*front=0;
}

void display(int queue[],int front,int rear)
{
	if(front==-1 && rear==-1)
		{printf("Queue is empty\n");
			return;}

	int i=0;
	for(i=front;i!=rear;i=(i+1)%max)
		printf("%d ",queue[i]);
	printf("%d",queue[i] );
}

void main()
{
	int front=-1,rear =-1;
	int queue[max];
	int i=0,element;
	while(i!=4)
		{printf("1.Push\n2.Delete\n3.Display\n4.Exit\n");
		 scanf("%d",&i);
		 switch(i)
		 {
		 	case 1: printf("Enter element\n");
		 			scanf("%d",&element);
		 			push(queue,&front,&rear,element);
		 			break;
		 	case 2: dqueue(queue,&front,&rear);
		 			break;
		 	case 3: display(queue,front,rear);
		 			break;
		 	default:;
		 }

		}

}
