#include<stdio.h>

void main()
{
int width,i,j,t;
printf("Enter width ");
scanf("%d",&width);
int ** a =calloc(width,sizeof(int *));
for(i=0;i<width;i++)
{   printf("Enter size of column %d ",i+1);
    scanf("%d",&t);
    a[i]=calloc(t+1,sizeof(int));
    a[i][0]=t;
}
a[i]=NULL;

for(i=0;i<width;i++)
{
   for(j=1;j<=a[i][0];j++)
    scanf("%d",&a[i][j]);
}

for(i=0;i<width;i++)
{
   for(j=1;j<=a[i][0];j++)
    printf("%d ",a[i][j]);
    printf("\n");
}
}

