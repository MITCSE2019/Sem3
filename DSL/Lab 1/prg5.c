#include<stdio.h>

void findSum(int a[20][20],int b[20][20],int n,int m)
{  int sum[20][20],i,j;
  for(i=0;i<n;i++)
    for(j=0;j<m;j++)
    sum[i][j]=a[i][j]+b[i][j];
 printf("Array Sum\n");
 for(i=0;i<n;i++)
    {for(j=0;j<m;j++)
    printf("%d ",sum[i][j]);
    printf("\n");
    }
}

void main()
{
int a[20][20],b[20][20];
int n,m;
printf("Enter the no of rows \n");
scanf("%d",&n);
printf("Enter the no of columns \n");
scanf("%d",&m);
int i,j;
printf("Enter element in  Array A\n");
for(i=0;i<n;i++)
{

  for(j=0;j<m;j++)

    scanf("%d",&a[i][j]);


}
printf("Enter element in Array B\n",i+1);
for(i=0;i<n;i++)
{

  for(j=0;j<m;j++)
{

    scanf("%d",&b[i][j]);
}

}

findSum(a,b,n,m);

}
