#include<ctype.h>
#include<math.h>
#include<string.h>

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
    char prefix[50],c;
    int i,op1,op2;
    printf("Enter expression \n");
    scanf("%s",prefix);
    i=strlen(prefix)-1;
    while(i!=-1)
    {   c=prefix[i--];
        if(isdigit(c))
            push(c-'0');
        else
        {
            op1=pop();
            op2=pop();
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
