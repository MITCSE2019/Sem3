#include<stdio.h>
#include<stdlib.h>

typedef struct node {
char data;
struct node * link;
}* Node;

Node insert(char item,Node head)
{
    (head->data)++;
    Node temp= (struct node *)malloc (sizeof(struct node));
    temp->data=item;
    temp->link=NULL;

    Node cur=head->link;
    while(cur->link!=head)
        cur=cur->link;

    cur->link=temp;
    temp->link=head;
    return head;
}

Node display(Node head)
{
    if(head->link==head)
    {
        printf("List is empty\n");
        return;
    }

    Node temp=head->link;
    while(temp!=head)
    {
        printf("%c ",temp->data);
        temp=temp->link;
    }
    printf("\n");
}

int check(Node head,char c)
{
    Node temp=head->link;
    while(temp!=head)
    {
        if(temp->data==c)
            return 0;
        temp=temp->link;
    }
    return 1;
}
void main()
{
    struct node ** head =(struct node **) calloc(2,sizeof(struct node*));
    head[0]=(struct node *) malloc (sizeof(struct node));
    head[0]->link=head[0];
    head[0]->data=0;

    head[1]=(struct node *) malloc (sizeof(struct node));
    head[1]->link=head[1];
    head[1]->data=0;

    int i=0,j=0,n;
    char item;

    printf("Enter elements of List A\n");
    scanf("%d",&n);
    while(i!=n)
    {
        printf("Enter data\n");
        scanf(" %c",&item);
        head[0]=insert(item,head[0]);
        i++;
    }
    display(head[0]);
    i=0;
    printf("Enter elements of List B\n");
    scanf("%d",&n);
    while(i!=n)
    {
        printf("Enter data\n");
        scanf(" %c",&item);
        head[1]=insert(item,head[1]);
        i++;
    }
    display(head[1]);


    Node cur[2];
    for(i=0;i<2;i++)
        cur[i]=head[i]->link;

   Node list = (struct node*)malloc(sizeof(struct node));
   list->data=0;
   list->link=list;

    printf("Union of two Lists\n");
   while(cur[0]!=head[0])
   {
       char c= cur[0]->data;
       if(check(list,c))
        insert(c,list);
        cur[0]=cur[0]->link;

   }
   while(cur[1]!=head[1])
   {
       char c=cur[1]->data;
       if(check(list,c))
        insert(c,list);
        cur[1]=cur[1]->link;
   }

    display(list);
   }
