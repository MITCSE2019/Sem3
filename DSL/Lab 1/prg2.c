#include<stdio.h>


void main()
{
int a[20];
int n;
printf("Enter the no of elements\n");
scanf("%d",&n);
int i,j;
for(i=0;i<n;i++)
{
    printf("Enter element %d\n",i+1);
    scanf("%d",&a[i]);
}


printf("Unsorted array is\n");
for(i=0;i<n;i++)
    printf("%d ",a[i]);

for(i=0;i<n-1;i++)
{

    for(j=0;j<(n-i-1);j++)
    {
        if(a[j+1]<a[j])
            {int t=a[j+1];
             a[j+1]=a[j];
             a[j]=t;}
    }


}
printf("\nSorted array in ascending order is\n");
for(i=0;i<n;i++)
    printf("%d ",a[i]);


}
