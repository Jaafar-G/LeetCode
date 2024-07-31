#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>


struct ListNode {
  int val;
  struct ListNode *next;
};


struct ListNode* createNode(int data) {
  struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));  
  if (newNode == NULL) {
    printf("Memory allocation failed\n");
    exit(1);
  }
  newNode->val = data;
  newNode->next = NULL;
  return newNode;
}


void printList(struct ListNode* head) {
  struct ListNode* current = head; 
  while (current != NULL) {
    printf("%d -> ", current->val);
    current = current->next;
  }
  printf("NULL\n");
}


int get_len(struct ListNode* head)
{
  int len = 0;
  for(struct ListNode* i=head; i!=NULL; i=i->next) {
    len++;
  }
  return len;
}


struct ListNode* rotateRight(struct ListNode* head, int k) {
  int len = get_len(head);
  int n = k;
  printf("len: %d\n", len);
  printf("k %d\n", k);

  if(len <= 1) {
    return head;
  }

  if(k >= len) {
    n = k % len;
    printf("n: %d\n", n);
  }

  printf("n: %d\n", n);
  if (n == 0) {
    printf("n: %d\n", n);
    return head;
  }

  int startIndex = len-n;
  struct ListNode* newHead = NULL;
  struct ListNode* newTail = NULL;
  struct ListNode* startNode = head;
  struct ListNode* cur = head;

  for(int count = 0; count < len-1; count++) {
    printf("Iteration count -------------------: %d\n", count);
    printf("startIndex: %d\n", startIndex);
    printf("cur: %d\n", cur->val);

    if (count == startIndex-1) {
      newTail = cur;
      newHead = cur->next;
      printf("newTail: %d\n", newTail->val);
      printf("newHead: %d\n", newHead->val);
      printf("cur: %d\n", cur->val);
    }
    cur = cur->next;
  }
  newTail->next = NULL;
  cur->next = head;
  head = newHead;
  return head;
}

int main() {
  //test
  struct ListNode* head = createNode(1);
  //struct ListNode* head = createNode(1);
  head->next = createNode(2);
  //head->next = createNode(2);
  //head->next->next = createNode(2);
  //head->next->next = createNode(3);
  //head->next->next->next  = createNode(4);
  //head->next->next->next->next   = createNode(5);
  //head->next->next->next->next->next    = createNode(5);
  
  printList(head);
  int len = get_len(head);
  head = rotateRight(head, 2);
  printList(head);
  
  return 0;
}
