#include<stdio.h>

void increment(int *x)
{(*x)++;}

char * toUpper(char *name)
{
char *p=name;
while (* name)
{if(*name>='a'&&*name<='z')
    *name-=32;
name++;}

return p;
}

void allocateMemory(int ** a)
{
    a= malloc(sizeof(int *));
    printf("\nInt ** %p\nInt * %p",&a,a);

}

void main()
{
int n;
char name[20];
printf("Enter no\n");
scanf("%d",&n);
increment(&n);
printf("Incremented value %d",n);

printf("\nEnter name\n");
scanf("%s",&name);
char * s =toUpper(name);
printf("%s",s);

int *t;
allocateMemory(&t);
}
