#include<stdio.h>
#include<stdlib.h>

typedef struct node{
    int data;
    struct node * rlink;
    struct node * llink;
}* Node;

Node insert(Node Head, int data){
    Node temp =(struct node *) malloc(sizeof(struct node));
    temp->data=data;
    temp->rlink=NULL;
    temp->llink=NULL;
    if(Head==NULL)
        return temp;
    Node cur=Head;
    while(cur->rlink)
    {
        cur=cur->rlink;
    }
    cur->rlink=temp;
    temp->llink=cur;
    return Head;
}

Node display(Node Head){
    Node cur=Head;
    while(cur)
    {   printf("%d -->",cur->data);
        cur=cur->rlink;
    }
}

int check(Node Head,int a){
    Node cur=Head;

    while(cur!=NULL)
    {   if(cur->data==a)
            return 1;
        cur=cur->rlink;
    }

    return 0;
}

void main(){
    int n;
    Node HeadA=NULL;
    printf("Enter elements of List A");
    scanf("%d",&n);
    while(n>0)
        {   int data;
            printf("Enter data\n");
            scanf("%d",&data);
            HeadA=insert(HeadA,data);
            n--;}

    Node HeadB=NULL;
    printf("Enter elements of List B");
    scanf("%d",&n);
    while(n>0)
        {   int data;
            printf("Enter data\n");
            scanf("%d",&data);
            HeadB=insert(HeadB,data);
            n--;}

    Node HeadC=NULL;
    Node cur=HeadB;
    while(cur)
    {
        if(check(HeadA,cur->data))
            HeadC=insert(HeadC,cur->data);
        cur=cur->rlink;
    }

    display(HeadC);
}
