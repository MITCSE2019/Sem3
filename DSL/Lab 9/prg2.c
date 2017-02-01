#include<stdio.h>
#include<stdlib.h>

typedef struct node{
int a;
struct node * rlink;
struct node * llink;
}* Node;

Node insert(Node Head,int a){
    Node cur=Head->llink, temp=malloc(sizeof(struct node));
    temp->a=a;
    temp->rlink=NULL;
    temp->llink=NULL;
    while(cur->rlink!=Head)
        cur=cur->rlink;
    cur->rlink=temp;
    temp->llink=cur;
    temp->rlink=Head;
    Head->llink=temp;
    return Head;
}

display(Node Head)
{
    Node cur=Head->rlink;
    while(cur!=Head)
    {
        printf("%d",cur->a);
        cur=cur->rlink;
    }
}


add(Node HeadA,Node HeadB)
{
    Node HeadC=malloc(sizeof(struct node));
    HeadC->a=0;
    HeadC->rlink=HeadC;
    HeadC->llink=HeadC;

    int c=0;
    int s;
    Node curA=HeadA->llink, curB=HeadB->llink;
    while(curA!=HeadA && curB!=HeadB)
    {
        s=curA->a+curB->a+c;
        c=s/10;
        s%=10;
        HeadC=insert(HeadC,s);
        curA=curA->llink;
        curB=curB->llink;
    }


    while(curA!=HeadA)
    {
        s=curA->a+c;
        c=s/10;
        s%=10;
        HeadC=insert(HeadC,s);
        curA=curA->llink;
    }

    while(curB!=HeadB)
    {
        s=curB->a+c;
        c=s/10;
        s%=10;
        HeadC=insert(HeadC,s);
        curB=curB->llink;
    }

    if(c)
        HeadC=insert(HeadC,c);

    Node cur=HeadC->llink;
    while(cur!=HeadC)
    {
        printf("%d",cur->a);
        cur=cur->llink;
    }
}

main(){
    Node HeadA=malloc(sizeof(struct node));
    HeadA->a=0;
    HeadA->rlink=HeadA;
    HeadA->llink=HeadA;

    Node HeadB=malloc(sizeof(struct node));
    HeadB->a=0;
    HeadB->rlink=HeadB;
    HeadB->llink=HeadB;

    int n;
    printf("Enter length of Number 1\n");
    scanf("%d",&n);
    HeadA->a=n;

    printf("Enter number\n");
    while(n>0)
    {
        int num;
        scanf("%d",&num);
        HeadA=insert(HeadA,num);
        n--;
    }

    printf("\nEnter length of Number 2\n");
    scanf("%d",&n);
    HeadB->a=n;

    printf("Enter number\n");
    while(n>0)
    {
        int num;
        scanf("%d",&num);
        HeadB=insert(HeadB,num);
        n--;
    }

    printf("\nThe numbers added\n");
    add(HeadA,HeadB);
}

