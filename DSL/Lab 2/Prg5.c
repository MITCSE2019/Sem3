#include<stdio.h>
typedef struct {
struct {
char first[20];
char last[20];
}name;
int rollno;
}Stu ;



void Sort(Stu s[10],int n)
{
int i,j,k;

for(i=0;i<n-1;i++)

for(j=0;j<(n-i-1);j++)

    if(s[j+1].rollno<s[j].rollno)

       {

       Stu t=s[j+1];
        s[j+1]=s[j];
        s[j]=t;}






for(i=0;i<n;i++)
{
    printf("\nStudent %d\nRoll no %d\nFirstName\n%s\nLastName\n%s",i+1,s[i].rollno,s[i].name.first,s[i].name.last);

}
}


void main()
{
Stu s[10];
printf("No of Students");
int n,i;
scanf("%d",&n);
for(i=0;i<n;i++)
{
    printf("Student %d\nRoll no ",i+1);
    scanf("%d",&s[i].rollno);
    printf("FirstName\n");
    scanf("%s",s[i].name.first);
    printf("LastName\n");
    scanf("%s",s[i].name.last);
}
Sort(s,n);
}
