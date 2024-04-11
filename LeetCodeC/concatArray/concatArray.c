#include <stdlib.h>
#include <stdio.h>

// Declare global function that will meet problem specifications
// Preconditions:
// 1. nums points to a valid integer array of size numsSize
// 3. returnSize must point to a valid integer 
int* concatArr(int* nums, int numsSize, int* returnSize);

int main()
{
  //initialize the test data
  int nums[3] = {1,2,3};
  // Calculate array size by
  int numsSize = (sizeof(nums) / sizeof(nums[0]));
  
  // Declaring the int returnSizeValue and then assigning the 
  // int pointer returnSize to its value
  int returnSizeValue;
  int* returnSize = &returnSizeValue;

  // Call to concat array 
  // Preconditions: 
  // 1. nums must be a valid int array
  // 2. return size must point to a valid integer
  // Postconditions:
  // 1. Result array must meet the specifications of problem
  concatArr(nums, sizeof(nums), returnSize);
  return 0;
}

  // Call to concat array 
  // Preconditions: 
  // 1. nums must be a valid int array
  // 2. return size must point to a valid integer
  // Postconditions:
  // 1. Result array must meet the specifications of problem
  // 2. resulting array must have a size of numsSize*2 
int* concatArr(int* nums, int numsSize, int* returnSize)
{
  int rSize = 2 * numsSize;
  int* result = (int*) malloc(rSize * sizeof(int));
  // Initialize two pointers
  for(int i=0; i < numsSize; i++)
  {
    result[i] = nums[i];
    result[i + numsSize] = nums[i];
  }
  *returnSize = numsSize*2;
  return result;
}
