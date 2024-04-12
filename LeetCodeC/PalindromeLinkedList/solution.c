#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include "solution.h" 

//Solution function implementation
bool solution(struct ListNode * head) 
{
  //Edge Cases
  if(head == NULL || head->next == NULL) return true;
  struct ListNode *current = head;
  int count = 0;

  while(current->next != NULL)
  {
    count = count+current->val;
    printf("count: %d\n", count);
    if(current->val == current->next->val)
    {    
      struct ListNode *mid = current->next;
      while(mid->next != NULL)
      {
        if (mid->val != count%10)
        {
          return false;
        }
        if(mid->next->val == head->val) return true;
        else mid = mid->next;
      }
      return false;
    }
    current = current->next;
    count = 10 * count;
  }
  return false;
}
