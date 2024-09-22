#include<stdio.h>
int main()
    {

    int num;
    scanf("%d",&num);
    for(int i=0;i<num;i++)
    {
         char word[500];
         scanf("%s",word);
         int length = strlen(word);
         int d=length-2;

         if(length<11)
        {
            printf("%s\n",word);
        }
    else
        {
            printf("%c%d%c\n",word[0],d,word[length-1]);
        }

    }

        return 0;
    }


