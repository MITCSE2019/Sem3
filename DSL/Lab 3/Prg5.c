#include<stdio.h>

int sum(int *a,int n)
{if(0>n)
return 0;
return (a[n]+sum(a,n-1));
}

void main()
{
    int n,i;
    printf("Enter size ");
    scanf("%d",&n);
    int *a=calloc(n,sizeof(int));
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("Sum is %d",sum(a,n-1));
}
