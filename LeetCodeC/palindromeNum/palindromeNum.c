#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

bool isPalindrome(int x);


int x = 121;
int main(int argc, char *argv[])
{

  printf("%d\n", isPalindrome(x));

  return EXIT_SUCCESS;
}


bool isPalindrome(int x)
{
  if (x < 0) {return false;}
  if (x < 10) {return true;}

  int last  = x;
  int first = x; 

  printf("first:%d\n", first);
  while(first >= 10)
  {
    last  = last%10;
    first = first/10;
    printf("first:%d\n", first);
    if(last != first){return false;}
  }

  printf("first:%d\n", first);
  return true;
}
