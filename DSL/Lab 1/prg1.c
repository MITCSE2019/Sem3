#include<stdio.h>


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
int no;
printf("Enter element you want to search\n");
scanf("%d",&no);
int flag=0;
for(i=0;i<n;i++)
{
    if(a[i]==no)
        {
        printf("Element is at position %d",i+1);
        flag=1;}

}
if(flag==0)
    printf("Invalid element");

}
