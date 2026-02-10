#include<stdio.h>
#include<ctype.h>
#include<string.h>
#include <stdlib.h>

int isNumeric(char s[])
{
    int i,flag=1;

    if(strlen(s)==0)
    {
        flag=0; // FLAG WILL RETURN 0 IF STRING IS EMPTY
        return flag;
    }
    for(i=0;i<strlen(s);i++)
    {
        
        if (isdigit(s[i])==0)
        {
            flag = -1; // WILL RETURN -1 IF STRING CONTAINS CHARACTERS.
            break;
        }
    }
    return flag; // WILL RETURN 1 IF STRING CONTAINS NUMBERS.
}


int main()
{
int i,j,s,result;
char arr1[4][100]={"piya","riya","sneha","rupsha"};
int arr2[4]={1,2,3,4};
printf("enter the string:");
char ch[20];
gets(ch);


if(isNumeric(ch)==0)
{
    printf("No input provided.");
}
else if (isNumeric(ch)==-1)
{
    for(i=0;i<4;i++)
    {
        if(strcmp(arr1[i],ch)==0);
        {
            s=i;
            break;
        }
    }
    printf("Roll no of %s is %d ",ch,arr2[s]);

}

else
{
    for(i=0;i<4;i++)
    {
        if(atoi(ch)==arr2[i])
        {
            s=i;
            break;
        }
    }
    printf("Roll no: %d and Name: %s",atoi(ch),arr1[s]);
}


    



    
     

return 0;
}