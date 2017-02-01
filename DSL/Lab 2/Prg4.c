#include<stdio.h>

typedef
struct comp{
int r;
int i;
}C;

C add(C a,C b)
{
C c;
c.r=a.r+b.r;
c.i=a.i+b.i;
return c;
}
C mult(C a,C b)
{
C c;
c.r=a.r*b.r-a.i*b.i;
c.i=a.i*b.r+b.i*a.r;
return c;
}

C sub(C a,C b)
{
C c;
c.r=a.r-b.r;
c.i=a.i-b.i;
return c;
}


void main()
{
C a,b;
printf("A\n");
scanf("%d",&a.r);
scanf("%d",&a.i);
printf("B\n");
scanf("%d",&b.r);
scanf("%d",&b.i);
C c=add(a,b);
printf("Added\n");
printf("%d + i%d",c.r,c.i);
c=mult(a,b);
printf("\nMultiplied\n");
printf("%d + i%d",c.r,c.i);
c=sub(a,b);
printf("\nSubtracted\n");
printf("%d + i%d",c.r,c.i);

}
