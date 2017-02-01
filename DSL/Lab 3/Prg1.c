#include<stdio.h>

int gcd(int x,int y)
{
 if (y==0)
    return x;
       return gcd(y, x%y);


}

void main()
{
 int x,y;
 printf("Enter numbers\n");
 scanf("%d",&x);
 scanf("%d",&y);
printf("Gcd of %d and %d is %d",x,y,gcd(x,y));
}
