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

Node insert(int item,Node tree)
{
    Node temp,cur,prev;

    temp=malloc(sizeof(struct node));
    temp->data=item;
    temp->llink=temp->rlink=NULL;

    if(!tree)
        return NULL;

    prev=NULL;
    cur=tree;

    while(cur)
    {
        prev=cur;

        if(item==cur->data)
        {
            printf("Duplicate elements not allowed\n");
            free(temp);
            return tree;
        }
        if(item<cur->data)
        	cur=cur->llink;
        else
        	cur=cur->rlink;
    }
    if(item<prev->data)
    	prev->llink=temp;
    else
    	prev->rlink=temp;
    return tree;
}

Node postorder(Node tree)
{
	Node cur=tree;
	if(!tree)
		return;
	postorder(tree->llink);
	postorder(tree->rlink);
	printf("%d ",tree->data);
}

Node delete(Node tree, int item)
{
	Node cur,parent,suc,q;
	if(!tree)
	{
		printf("Tree is empty! Item not found\n");
		return tree;
	}
	parent=NULL,cur=tree;
	while(cur)
	{
		if(item==cur->data)break;
		parent=cur;
		cur=(item<cur->data)?cur->llink:cur->rlink;
	}
	if(!cur)
	{
		printf("Item not found\n");
		return tree;
	}
	if(!cur->llink)
		q=cur->rlink;
	else if(cur->rlink)
		q=cur->llink;
	else
	{
		suc=cur->rlink;
		while(suc->llink)
			suc=suc->llink;
		suc->llink=cur->llink;

		q=cur->rlink;
	}
	if(!parent)return q;

	if(cur==parent->llink)
		parent->llink=q;
	else
		parent->rlink=q;
	free(cur);
	return tree;
}

main()
{
	printf("Enter no of nodes\n");
	int n;
	scanf("%d",&n);
	Node tree=NULL;
	printf("Enter node\n");
	while(n>0)
	{
	
		int node;
		scanf("%d",&node);
		tree=createBst(tree,node);
		n--;
	}

	postorder(tree);

	printf("Enter node to insert\n");
	int node;
	scanf("%d",&node);
	tree=insert(node,tree);
	postorder(tree);
	printf("Enter element to be deleted\n");
	scanf("%d",&node);
	tree=delete(tree,node);
	postorder(tree);
}
