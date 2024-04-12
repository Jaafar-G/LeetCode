#include <stdio.h>
#include "solution.h" 

// Function to run test cases
void runTestCase(int testCaseNum, int param1, char* param2, int expected) {
    int result = solution(param1, param2);
    if (result == expected) {
        printf("Test Case %d Passed\n", testCaseNum);
    } else {
        printf("Test Case %d Failed: Expected %d, but got %d\n", testCaseNum, expected, result);
    }
}

int main() {
    // Test Case 1
    runTestCase(1, 10, "example", 15); // Example test case, adjust parameters and expected result

    // Test Case 2
    runTestCase(2, 20, "another example", 25); // Example test case, adjust parameters and expected result

    // Add more test cases as needed

    return 0;
}

