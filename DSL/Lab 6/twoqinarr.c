#include <stdio.h>

#define max 3

int q[max];
int f0=-1,r0=-1;
int f1=max,r1=max;

insert(int n,int e)
{
	if(n==1)
	{

			if(f0+1==f1)
			{	if(r0==-1)
				{
					printf("Queue is full\n");
					return;
				}
				else
					f0=-1;
			}
				else q[++f0]=e;



}

	if(n==2)
	{if(f1-1==f0)
	{
		printf("Queue is full\n");
		return;
	}
	else q[--f1]=e;}
}

delete(int n)
{
	if(n==1)
	{

			if(r0==f0)
			{
				printf("Queue is empty\n");
				r0=f0=-1;
				return;
			}

			if(r0+1==f1)
			{
				r0=-1;
				if(f0==-1)
					return;
			}
			printf("Element deleted is %d", q[++r0] );


	}

	if(n==2)
	{
		if(r1==f1)
		{
			printf("Queue is empty\n");
			r1=f1=max;
			return;
		}

		printf("Element deleted is %d", q[--r1] );
	}
}

display()
{
	int i;
	for(i=0;i<max;i++)
		printf("%d ",q[i]);
}

main()
{

	int i=0;

	while(i!=4)
	{

		int n=0,e=0;

		printf("\n1. Insert\n2. Delete\n3. Display\n4.Exit\n");
		scanf("%d",&i);
		if(i==1 || i==2)
		{printf("Enter Queue No\n");
		scanf("%d",&n);}
		switch(i)
		{
			case 1: printf("Enter Element\n");
					scanf("%d",&e);
					insert(n,e);
					break;
			case 2: delete(n);
					break;
			case 3: display();
			case 4:;
		}

	}

}
