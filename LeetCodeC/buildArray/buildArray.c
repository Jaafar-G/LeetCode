#include <stdio.h>
#include <stdlib.h>

// Declaration of function buildArray
// precondition: Nums must be a valid integer array of size numSize.
// precondition: returnSize must point to a valid integer.
int* buildArray(int* nums, int numsSize, int* returnSize);

//Global variable to store return size of the buildArray function.
int returnSizeValue;

int main()
{
  //initialize variables
  int nums[] = {0,2,1,5,3,4};
  // numsSize is the size of the array divided by the size of the type in bytes
  int numsSize = sizeof(nums) / sizeof(nums[0]);
  // Initialize a pointer to store the return size of the result of buildArray
  int* returnSize = &returnSizeValue;

  // call buildArray with the test data to create new array that satisfies specifications
  // Postcondition: an array is returned of size sizeof(numsSize)
  buildArray(nums, numsSize, returnSize);
  return 0;
}


//buildArray function to form array of correct values
// Preconditions: 
//1. result array must be of size sizeof(nums)
//2. nums points to a valid intefer array of size numsSize
//3. returnSize points to a valid integer
// Postcondition:
// 1. The returned array's value are rearranged according to the problems specification.
// 2. returned array size is set to size of nums.
int* buildArray(int* nums, int numsSize, int* returnSize)
{
  // set a pointer to numsSize
  *returnSize = numsSize;

  // allocate a block of memory that is the number of elements multiplied by bytes of type int.
  // memory block is casted to an int pointer and set to result to hold resulting array.
  int* result = (int*) malloc(numsSize * sizeof(int));

  //for loop to iterate through array assigning the correct values described by problems
  for(int i = 0; i < numsSize; i++)
  {
    result[i] = nums[nums[i]];
  }

  //return the resulted array
  return result;
}
