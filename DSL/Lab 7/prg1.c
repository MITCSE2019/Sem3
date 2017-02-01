#include <stdio.h>

#define max 20

addright(int * rear,int element,int *front,int queue[])
{
	if(*front=-1)
		*front=0;
	if(*rear==max-1)
		{printf("Cannot Add\n");
		 return;}
		queue[++(*rear)]=element;
}

addleft(int *front,int element,int *rear,int queue[])
{
	if(*front<1)
	{
		printf("Cannot Add\n");
	}
	else
		queue[--(*front)]=element;
}

delright(int *rear,int queue[])
{
	if(*rear==-1)
		printf("Cannot delete\n");
	else
		printf("Element deleted is %d\n",queue[(*rear)--]);
}

delleft(int *front,int queue[])
{
	if(*front==max-1)
		printf("Cannot delete\n");
	else
		printf("Element deleted is %d\n",queue[(*front)++]);
}

display(int rear,int front,int queue[])
{
	int i=front;
	for(;i<=rear;i++)
		printf("%d\t",queue[i]);
}
main()
{
	int front=-1,rear=-1;
	int queue[max]={0},element;
			int i=0;
			while(i!=6)
			{
				printf("\n1. Insert Right\n2. Insert Left\n3. Delete Right\n4. Delete Left\n5. Display\n6. Exit\n");
				scanf("%d",&i);
				switch (i) {
					case 1:
						printf("Enter element\n");
						scanf("%d",&element);
						addright(&rear,element,&front,queue);
						break;
					case 2:
						printf("Enter element\n");
						scanf("%d",&element);
						addleft(&front,element,&rear,queue);
						break;
					case 3:
						delright(&rear,queue);
						break;
					case 4:
						delleft(&front,queue);
						break;
					case 5:
						display(rear,front,queue);
					default:;

				}
			}
}
