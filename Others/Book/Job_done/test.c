#include <stdio.h>
#include <ctype.h>
#include <string.h>

int isNumeric(char s[])
{
    int i,flag=1;

    if(strlen(s)==0)
    {
        flag=0;
        return flag;
    }
    for(i=0;i<strlen(s);i++)
    {
        
        if (isdigit(s[i])==0)
        {
            flag = -1;
            break;
        }
    }
    return flag;
}

int main()
{
    int i;
    char arr [50] = "santadip";
    char num [50] = "12345678";
   
    if (isNumeric(arr)==0)
    {
        printf("String is empty.");
        printf("%d",isNumeric(arr));
    }
    else if (isNumeric(arr)==1)
    {
        printf("It has numbers.");
        printf("%d",isNumeric(arr));
    }
    else
    {
        printf("It does not have numbers.");
        printf("%d",isNumeric(arr));
    }
    return 0;
}