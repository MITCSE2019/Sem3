#include <stdio.h>
#include <stdlib.h>


typedef struct node{
	int data;
	struct node * llink;
	struct node * rlink;
} * Node;


Node create(Node tree)
{
	int data;
	printf("Enter value (-1 for Null)\n");
	scanf("%d",&data);
	if(data==-1)
		return tree;
	if(!tree)
	{
		tree=malloc(sizeof(struct node));
		tree->rlink=NULL;
		tree->llink=NULL;
		tree->data=data;
	}

	printf("\nGoing to Left branch of %d\n",tree->data);
	tree->llink=create(tree->llink);
	printf("\nGoing to Right branch of %d\n",tree->data);
	tree->rlink=create(tree->rlink);
	return tree;
}

Node preorder(Node tree)
{
    Node cur=tree,t[20];
    int top=-1;

    while(1)
    {
        while(cur)
        {
            printf("%d ",cur->data);
            t[++top]=cur;
            cur=cur->llink;
        }
        if(top!=-1)
        {
            cur=t[top--];
            cur=cur->rlink;
        }
        else
            return;
    }
}

Node postorder(Node tree)
{
    struct stack
    {
        Node address;
        int flag;
    };

    Node cur=tree;
    struct stack t[20];
    int top=-1;

    while(1)
    {
        while(cur)
        {
            t[++top].address=cur;
            t[top].flag=1;
            cur=cur->llink;
        }

        while(t[top].flag<0)
        {
            cur=t[top--].address;
            printf("%d ",cur->data);
            if(top==-1)
                return;
        }

        cur=t[top].address;
        cur=cur->rlink;
        t[top].flag=-1;
    }
}

Node inorder(Node tree)
{
    Node cur=tree,t[20];
    int top=-1;

    while(1)
    {
        while(cur)
        {
            t[++top]=cur;
            cur=cur->llink;
        }
        if(top!=-1)
        {
            cur=t[top--];
            printf("%d ",cur->data);
            cur=cur->rlink;
        }
        else
            return;
    }
}

void main()
{
	Node tree = NULL;
	tree=create(tree);
	printf("\nInorder\n");
	inorder(tree);
	printf("\n\nPreorder\n");
	preorder(tree);
	printf("\n\nPostorder\n");
	postorder(tree);
}
