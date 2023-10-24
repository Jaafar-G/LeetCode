#include <stdlib.h>
#include <stdio.h>

// Declare global function that will meet problem specifications
// Preconditions:
// 1. nums points to a valid array
// 2. numsSize is >= 0
// 3. returnSize is specified and 
int* concatArr(int* nums, int numsSize, int* returnSize);

int main()
{
  //initialize the test data
  int nums[3] = {1,2,3};
  int numsSize = (sizeof(nums) / sizeof(nums[0]));
  int returnSizeValue;
  int* returnSize = &returnSizeValue;


  concatArr(nums, sizeof(nums), returnSize);
  return 0;
}


int* concatArr(int* nums, int numsSize, int* returnSize)
{
  *returnSize = numsSize;



}
