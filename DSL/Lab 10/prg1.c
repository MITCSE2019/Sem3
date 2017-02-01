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

inorder(Node tree)
{
	if(tree)
	{
		inorder(tree->llink);
		printf("%d\t",tree->data);
		inorder(tree->rlink);
	}	
}

preorder(Node tree)
{
	if(tree)
	{
		printf("%d\t",tree->data);
		preorder(tree->llink);
		preorder(tree->rlink);
	}
}

postorder(Node tree)
{
	if(tree)
	{
		postorder(tree->llink);
		postorder(tree->rlink);
		printf("%d\t",tree->data);
	}
}

void main()
{
	Node tree = NULL;
	tree=create(tree);
	printf("\nInorder\n");
	inorder(tree);
	printf("\nPreorder\n");
	preorder(tree);
	printf("\nPostorder\n");
	postorder(tree);
}