#include<string.h>
#include <stdio.h>

#define max 10

addright(int * rear,char element[],int *front,char queue[][max])
{
	if(*front=-1)
		*front=0;
	if(*rear==max-1)
		{printf("Cannot Add\n");
		 return;}
		strcpy(queue[++(*rear)],element);
}

addleft(int *front,char element[],int *rear,char queue[][max])
{
	if(*front<1)
	{
		printf("Cannot Add\n");
	}
	else
		strcpy(queue[--(*front)],element);
}

delleft(int *front,char queue[][max])
{
	if(*front==max-1)
		printf("Cannot delete\n");
	else
		printf("Element deleted is %s\n",queue[(*front)++]);
}

display(int rear,int front,char queue[][max])
{
	int i=front;
	for(;i<=rear;i++)
		printf("%s\t",queue[i]);
}
main()
{
	int front=-1,rear=-1;
	char queue[max][max],element[max];
			int i=0;
			while(i!=5)
			{
				printf("\n1. Insert Right\n2. Insert Left\n3. Delete Left\n4. Display\n5. Exit\n");
				scanf("%d",&i);
				switch (i) {
					case 1:
						printf("Enter element\n");
						scanf("%s",&element);
						addright(&rear,element,&front,queue);
						break;
					case 2:
						printf("Enter element\n");
						scanf("%s",&element);
						addleft(&front,element,&rear,queue);
						break;
					case 3:
						delleft(&front,queue);
						break;
					case 4:
						display(rear,front,queue);
					default:;

				}
			}
}
