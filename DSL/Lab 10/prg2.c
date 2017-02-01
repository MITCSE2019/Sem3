#include <stdio.h>
#include <stdlib.h>

typedef struct node{
	int data;
	struct node * llink;
	struct node * rlink;
} * Node;

Node createBst (Node tree, int data)
{

	Node p;
	if(tree==NULL)
	    {
	        tree=malloc(sizeof(struct node));
	        tree->data=data;
	        tree->llink=tree->rlink=NULL;
	    }
	    else if(data>tree->data)
	        tree->rlink=createBst(tree->rlink,data);
	    else if(data<tree->data)
	        tree->llink=createBst(tree->llink,data);
	return tree;
}

int inorder(Node tree, int ele)
{
	static int flag=0;
	if(!tree)
		return flag;
	if(tree)
	{
		inorder(tree->llink,ele);
		if(tree->data==ele)
			{flag=1;
			 return flag;}
		inorder(tree->rlink,ele);
	}
}

int it_inorder(Node tree,int ele)
{
	Node cur=tree;
	int flag=0;

	while(cur!=NULL)
	{
		if(cur->data==ele)
			return flag=1;
		else if(cur->data>ele)
			cur=cur->llink;
		else
			cur=cur->rlink;
	}
}

main()
{
	printf("Enter no of nodes\n");
	int n;
	scanf("%d",&n);
	Node tree=NULL;
	while(n>0)
	{
		printf("Enter node\n");
		int node;
		scanf("%d",&node);
		tree=createBst(tree,node);
		n--;
	}

	printf("Enter element to search\n");
	int element;
	scanf("%d",&element);
	printf("Via recursive\n");
	if(inorder(tree,element))
		printf("Element found\n");
	else
		printf("Element not found\n");

	printf("Via iterative\n");
	if(it_inorder(tree,element))
		printf("Element found\n");
	else
		printf("Element not found\n");
}
