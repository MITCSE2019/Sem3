#include<stdio.h>

void toh(int n, char s, char t, char d)
{
	if(n==1)
	{	printf("\nMove disk %d from %c to %c",n,s,d);
		return;
	}
	toh(n-1,s,d,t);
	printf("\nMove disk %d from %c to %c",n,s,d);
	toh(n-1,t,s,d);

}

void main()
{
	int n;
	printf("Enter number of disks\n");
	scanf("%d",&n);
	toh(n,'A','B','C');

}
