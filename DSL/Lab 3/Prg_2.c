#include<stdio.h>

void main()
{
    int n,i;
     printf("Enter size ");
    scanf("%d",&n);

    int * a= calloc(n,sizeof(int));
    printf("Enter elements\n");
    for(i=0;i<n;i++)
        scanf("%d",(a+i));
    int *first;
int *last=(a+n-1);
int * mid;
int no;
   printf("Enter element you want to search\n");
scanf("%d",&no);

for(first=a;first<last;)
{
    mid=first+(last-first)/2;
    if(no>*mid)
        first=mid;
    else if(no<*mid)
        last=mid;
    else if(no==*mid)
        {
            printf("Element is at %d",mid+1-a);
            break;
        }
        }
}
