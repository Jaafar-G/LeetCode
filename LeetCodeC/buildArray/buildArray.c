#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

// Declaration of function buildArray
int* buildArray(int* nums, int numsSize, int* returnSize);

//Global variable to store return size of the buildArray function.
int returnSizeValue;

void printArray(int *arr, int* returnSize);

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
  int *newArray = buildArray(nums, numsSize, returnSize);
  if (newArray == NULL) {
          printf("Failed to allocate newArray.\n");
          return 1; // Exit with error code
      }
  printArray(newArray, returnSize);
  free(newArray); //clen up

  return 0;
}


// Given a zero-based permutation nums (0-indexed),
// build an array ans of the same length where 
// ans[i] = nums[nums[i]] for each 0 <= i < nums.length
// Preconditions: 
//1. result array must be of size of returnSize
//2. nums points to a valid integer array of size numsSize
//3. returnSize is not NULL
// Postcondition:
// 1. result[i] = nums[nums[i]] 
// 2. resulting array size == returnSize.
int* buildArray(int* nums, int numsSize, int* returnSize)
{
  // Preconditions 2 
  assert(nums != NULL);
  //Precondition 3
  assert(returnSize != NULL);

  // Safe to derefference pointer here
  *returnSize = numsSize;

  //Allocate memory for array
  int* result = (int*) malloc(numsSize * sizeof(int));
  if(result ==NULL)
  {
    printf("Could not allocate memory for result!...");
    return NULL;
  }

  //for loop to iterate through array assigning the correct values described by problems
  for(int i = 0; i < numsSize; i++)
  //@loop_invariant 0 <= i < numsSize
  {
    //Catch error
    if(nums[i]<0 || nums[i] >= numsSize)
    {
      free(result); //Clean up memory
      return NULL;
    }
    result[i] = nums[nums[i]];
  }

  //return the resulted array
  return result;
}

void printArray(int* arr, int* returnSize)
{
  printf("New array: ");
  for (int i = 0; i < *returnSize; i++) 
  {
    printf("%d ", arr[i]);
  }
  printf("\n");
}
