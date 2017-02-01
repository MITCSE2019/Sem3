#include<stdio.h>

int db(int d)
{static int b=0;
if(d==1||d==0)
    return d;
int t=d%2;
b=db(d/2)*10+t;
return b;

}

void main()
{
printf("Enter decimal");
int dec;
scanf("%d",&dec);
printf("%d",db(dec));
}
