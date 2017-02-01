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

int first=0;
int last=n-1;
int mid;
int no;
printf("Enter element you want to search\n");
scanf("%d",&no);

for(first=0;first<last;)
{
    mid=(first+last)/2;
    if(no>a[mid])
        first=mid;
    else if(no<a[mid])
        last=mid;
    else if(no==a[mid])
        {
            printf("Element is at %d",mid+1);
            break;
        }
        }

}


