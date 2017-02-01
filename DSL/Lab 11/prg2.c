#include <stdio.h>
#include <stdlib.h>
#include <math.h>

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

int height(Node tree)
{
	if(!tree) return -1;
	return 1+ (height(tree->llink)>height(tree->rlink)?height(tree->llink):height(tree->rlink));
}

void printLevel(Node tree, int level)
{
    if (!tree)
        return;
    if (level == 1)
        {printf("%d ",tree->data);
    	 return;}
    else if (level > 1)
    {
        printLevel(tree->llink, level-1);
        printLevel(tree->rlink, level-1);
    }
}



levelorder(Node tree)
{
	int h = height(tree);
	int i;
	for (i=0; i<=h; i++)
	   {printf("Level %d : ",i+1); 
	   	printLevel(tree, i+1);
	    printf("\n");
	   }
	

}



void main()
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

	levelorder(tree);
}