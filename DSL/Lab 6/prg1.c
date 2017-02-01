#include <stdio.h>
#include <string.h>
#define max 10

void insert(char queue[max][10],int * front, int *rear,char element[10])
{

	if(*rear==max-1 && *front==0|| (*rear+1)%max==*front)
		{printf("Queue is Full\n");
		 return;}
	if(*front==-1)
		*front=0;
	*rear=(*rear+1)%max;
	strcpy(queue[*rear],element);
}

void dqueue(char queue[max][10],int * front, int * rear)
{
	if(*front==-1 && *rear==-1)
		printf("Queue is empty\n");

	else
	printf("\nElement deleted %s\n",queue[(*front)++]);


	if(*front-1==*rear)
		{*front =-1;
		 *rear =-1;}
	else if(*front==max)
	*front=0;
}

void display(char queue[max][10],int front,int rear)
{
	if(front==-1 && rear==-1)
		{printf("Queue is empty\n");
			return;}

	int i=0;
	for(i=front;i!=rear;i=(i+1)%max)
		puts(queue[i]);
	puts(queue[i]);
}

void main()
{
	int front=-1,rear =-1;
	char queue[max][10];
	int i=0;char d;
	char element[10];
	while(i!=4)
		{printf("1.Insert\n2.Delete\n3.Display\n4.Exit\n");
		 scanf("%d",&i);
		 switch(i)
		 {
		 	case 1: printf("Enter element\n");
                    scanf("%c",&d);
		 			gets(element);
		 			insert(queue,&front,&rear,element);
		 			break;
		 	case 2: dqueue(queue,&front,&rear);
		 			break;
		 	case 3: display(queue,front,rear);
		 			break;
		 	default:;
		 }

		}

}
