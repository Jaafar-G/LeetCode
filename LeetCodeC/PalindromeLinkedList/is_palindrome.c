#include <stdlib.h>
#include <stdio.h>
#include <assert.h>
#include <stdbool.h>

//Definition for singly-linked ListNode.
  struct ListNode {
      int val;
      struct ListNode *next;
  };


bool isPalindrome(struct ListNode *head) 
{
  if(head == NULL || head->next == NULL) return true;

  struct ListNode *current = head;
  while(current->next != NULL)
  {
    if(current->val == current->next->val)
    {
      struct ListNode *mid = current->next;
      struct ListNode *lo  = head;
      while(mid->next != NULL)
      { 
        if(lo->val != mid->next->val)
        {
          return false;
        }
        else return true;
      }
    }
    current = current->next;
  }
  return false; 
}
