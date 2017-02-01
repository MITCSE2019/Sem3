#include<ctype.h>
#include<math.h>

#define MAX 50

int stac[MAX];
int top=-1;

push(int ele)
{
    stac[++top]=ele;
}

int pop()
{
    return stac[top--];
}

main()
{
    char postfix[50],c;
    int i=0,op1,op2;
    printf("Enter expression\n");
    scanf("%s",postfix);
    while((c=postfix[i++])!='\0')
    {
        if(isdigit(c))
            push(c-'0');
        else
        {
            op2=pop();
            op1=pop();
            switch(c)
            {
                case '+':push (op1+op2);
                         break;
                case '-':push (op1-op2);
                         break;
                case '*':push (op1*op2);
                         break;
                case '/':push (op1/op2);
                         break;
                case '%':push (op1%op2);
                         break;
                case '$':push (pow(op1,op2));
                         break;

            }
        }
    }
    printf("Ans is %d",stac[top]);

}
