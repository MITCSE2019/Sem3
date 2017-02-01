#include<stdio.h>

int findSum(int a[10],int n)
{  int sum=0,i;
  for(i=0;i<n;i++)
    sum+=a[i];
 return sum;
}

void main()
{
    int a[20];
int n;
printf("Enter the no of elements\n");
scanf("%d",&n);
int i;
for(i=0;i<n;i++)
{
    printf("Enter element %d\n",i+1);
    scanf("%d",&a[i]);
}

   printf("\nSum of elements is %d",findSum(a,n));

}
