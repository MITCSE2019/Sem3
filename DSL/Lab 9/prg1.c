#include<stdio.h>
#include<stdlib.h>

typedef struct node{
int c;
int e;
struct node * next;
}* Node;

Node insert(Node Head,int c,int e)
{   (Head->e)++;
    (Head->c)++;
    Node cur=Head, temp = malloc(sizeof(struct node));
    temp->c=c;
    temp->e=e;
    temp->next=NULL;
    while(cur->next!=Head)
        cur=cur->next;
    cur->next=temp;
    temp->next=Head;
    return Head;
}

display(Node Head)
{
    Node cur=Head->next;
    if(cur!=Head)
    {   printf("%dx^%d ",cur->c,cur->e);
        cur=cur->next;}
    while(cur!=Head)
        {   printf("+ %dx^%d ",cur->c,cur->e);
            cur=cur->next;}
}

Node subtract(Node HeadA,Node HeadB,char c)
{
    Node HeadC=malloc(sizeof(struct node));
    HeadC->c=0;
    HeadC->e=0;
    HeadC->next=HeadC;
    Node curA=HeadA->next;
    Node curB=HeadB->next;
    while(curA!=HeadA && curB!=HeadB)
    {
        if((curA->e)==(curB->e))
        {   if(c=='-')
            HeadC=insert(HeadC,(curA->c)-(curB->c),(curA->e));
            else if(c=='+')
             HeadC=insert(HeadC,(curA->c)+(curB->c),(curA->e));
            curA=curA->next;
            curB=curB->next;}
        else if((curA->e)>(curB->e))
        {
            HeadC=insert(HeadC,(curA->c),(curA->e));
            curA=curA->next;
        }
        else
        {   if(c=='-')
            HeadC=insert(HeadC,(-(curB->c)),(curB->e));
            if(c=='+')
            HeadC=insert(HeadC,(curB->c),(curB->e));
            curB=curB->next;
        }
    }

    while(curA!=HeadA){
        HeadC=insert(HeadC,(curA->c),(curA->e));
        curA=curA->next;
    }

    while(curB!=HeadB){
        HeadC=insert(HeadC,(curB->c),(curB->e));
        curB=curB->next;
    }
    return HeadC;
}

Node multiply(Node HeadA,Node HeadB)
{
    Node curA=HeadA->next;
    Node curB=HeadB->next;
    Node * arr=(Node *)calloc(HeadB->e,sizeof(Node));
    int i=0;
    for(;i<HeadB->e;i++)
    {
        arr[i]=malloc(sizeof(struct node));
        arr[i]->c=0;
        arr[i]->e=0;
        arr[i]->next=arr[i];
    }
    i=0;
    for(;i<HeadB->e;i++)
    {
        while(curA!=HeadA)
        {
            arr[i]=insert(arr[i],curB->c*curA->c,curB->e+curA->e);
            curA=curA->next;
        }
        curA=HeadA->next;
        curB=curB->next;
    }
    i=0;
    for(;i<HeadB->e-1;i++)
        {arr[i+1]=subtract(arr[i],arr[i+1],'+');}
    return arr[HeadB->e-1];

}

void main()
{
    Node HeadA=malloc(sizeof(struct node));
    int n,c,e;

    Node HeadB=malloc(sizeof(struct node));

    int i=0;
    while(i!=4)
    {
        printf("\n1. Enter 2 polynomials\n2. Subtraction\n3. Multiplication\n4. Exit\n");
        scanf("%d",&i);
        switch(i){
            case 1:     HeadA->c=0;
                        HeadA->e=0;
                        HeadA->next=HeadA;
                        HeadB->c=0;
                        HeadB->e=0;
                        HeadB->next=HeadB;
                        printf("Enter length of polynomial A\n");
                        scanf("%d",&n);
                        while(n>0){
                         n--;
                        printf("Enter (Coeff & Exp)\n");
                        scanf("%d",&c);
                        scanf("%d",&e);
                        HeadA=insert(HeadA,c,e);
                        }
                        display(HeadA);
                        printf("\nEnter length of polynomial B\n");
                        scanf("%d",&n);
                        while(n>0){
                            n--;
                            printf("Enter (Coeff & Exp)\n");
                            scanf("%d",&c);
                            scanf("%d",&e);
                            HeadB=insert(HeadB,c,e);
                        }
                        display(HeadB);
            break;
            case 2:         printf("\nSubtracted (A-B)\n");
                            Node HeadC=subtract(HeadA,HeadB,'-');
                            display(HeadC);
            break;
            case 3:    printf("\nMultiplied (A*B)\n");
                       Node HeadD=multiply(HeadA,HeadB);
                       display(HeadD);;
            default:;
        }
    }
}
