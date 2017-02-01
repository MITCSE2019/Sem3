#include<stdio.h>
void push(char stac[],char ele,int *top)
{
    stac[++(*top)]=ele;
}

char pop(char stac[],int *top)
{
    return(stac[(*top)--]);
}

int pri(char x)
{
    if(x==')')
        return 0;
    else if(x=='+'||x=='-')
        return 1;
    else if(x=='*'||x=='/'||x=='%')
        return 2;
    else if(x=='$')
        return 3;
}

void main()
{
    char infix[20],prefix[20],stac[20],c,x;
    int top=-1,i,j=0;
    printf("Enter Infix Expression : ");
    scanf("%s",infix);
    for(i=strlen(infix)-1;i>=0;i--)
    {
        c=infix[i];
        if(isalnum(c))
            prefix[j++]=c;
        else if(top==-1)
            push(stac,c,&top);
        else if(c==')')
        {
            while(stac[top]!='(')
                    prefix[j++]=pop(stac,&top);
            x=pop(stac,&top);
        }
        else if(stac[top]=='$'&&c=='$')
        {
            pop(stac,&top);
            push(stac,c,&top);
        }
        else
        {
            while(pri(c)<pri(stac[top]))
                prefix[j++]=pop(stac,&top);
            push(stac,c,&top);
        }
    }
    while(top>-1)
        prefix[j++]=pop(stac,&top);
    prefix[j]='\0';

    printf("The Prefix Expression Is : ");
    for(i=strlen(prefix)-1;i>=0;i--)
        printf("%c",prefix[i]);
}
