#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "solution.h" 


struct ListNode* createLinkedList(int* arr, int size) {
    if (size == 0) return NULL;
    struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* current = head;
    for (int i = 0; i < size; i++) {
        current->val = arr[i];
        if (i < size - 1) {
            current->next = (struct ListNode*)malloc(sizeof(struct ListNode));
            current = current->next;
        } else {
            current->next = NULL;
        }
    }
    return head;
}

void runTestCase(int testCaseNum, struct ListNode* head, bool expected) {
    bool result = solution(head);
    printf("Test Case %d: %s\n", testCaseNum, (result == expected) ? "Passed" : "Failed");
}

int main() {
    // Define the test cases
    int values1[] = {1, 2, 2, 1};
    int values2[] = {1, 2};
    int values3[] = {1, 1, 1, 1};
    int values4[] = {1, 2, 3, 2, 1};

    // Create linked lists
    struct ListNode* head1 = createLinkedList(values1, sizeof(values1) / sizeof(values1[0]));
    struct ListNode* head2 = createLinkedList(values2, sizeof(values2) / sizeof(values2[0]));
    struct ListNode* head3 = createLinkedList(values3, sizeof(values3) / sizeof(values3[0]));
    struct ListNode* head4 = createLinkedList(values4, sizeof(values4) / sizeof(values4[0]));
    struct ListNode* head5 = NULL;

    // Run test cases
    runTestCase(1, head1, true);
    runTestCase(2, head2, false);
    runTestCase(3, head3, true);
    runTestCase(4, head4, true);
    runTestCase(5, head5, true); // An empty list is technically a palindrome
  
    return 0;
}
