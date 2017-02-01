#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct node{
char a[40];
struct node * rlink;
struct node * llink;
}* Node;

Node insert(Node Head,char a[40]){
    Node cur=Head->llink, temp=malloc(sizeof(struct node));
    strcpy(temp->a,a);
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
    printf("\n\nLink List\n");
    Node cur=Head->rlink;
    while(cur!=Head)
    {
        printf("%s\n",cur->a);
        cur=cur->rlink;
    }
}

swap(Node Head)
{
    Node cur=Head;
    do
    {
        Node next=cur->rlink;
        Node prev=cur->llink;
        cur->rlink=prev;
        cur->llink=next;
        cur=next;
    }
    while(cur!=Head);
}

main(){
    Node Head=malloc(sizeof(struct node));
    Head->rlink=Head;
    Head->llink=Head;

    int n;
    printf("Enter number of Words\n");
    scanf("%d",&n);


    printf("Enter word\n");
    while(n>0)
    {
        char a[40];
        scanf("%s",a);
        Head=insert(Head,a);
        n--;
    }

    display(Head);
    swap(Head);
    display(Head);
}


