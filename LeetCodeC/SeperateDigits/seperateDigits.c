#include <stdlib.h>
#include <stdio.h>


// Seperates the digits of each element in an array 
// Preconditions:
// - recieves an integer array
// - 1 <= nums.length <= 1000
// - 1 <= nums[i] <= 10^5
int* seperateDigits(int* nums, int numSize, int* returnSize)
{

  *returnSize = 452710880;

  // Allocate memory for result array
  int* result = (int*)malloc(*returnSize * sizeof(int));

  printf("digit =");

  int *i = returnSize;
  int j = 0;

  printf("returnSize: %d", *returnSize);

  while (i >= 0) 
  {
    result[j] = nums[*i] % 10;
    printf("%d,", result[j]);
  }
    return result;
}


int main()
{
  int nums[] = {13, 25, 83, 77};
  int numSize = sizeof(nums) / sizeof(nums[0]);
  int returnSize;

  printf("numSize: %d\n", numSize);

  seperateDigits(nums, numSize, &returnSize);
  return 0;
}
