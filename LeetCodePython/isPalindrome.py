# Author - Jaafar Gharib
# Date 1/14/2024
# Problem 9 - Palindrome Number
# This is my implementation of isPalindrome for integers.
# My intuition was to convert the integer to a string as 
# this would only be one line and would perform well.


def isPalindrome(x:int) -> bool:

    # Conver integer to reversed string
    reversed = str(x)[::-1]

    # Compare to see if equal -- Int must be casted to a string for comparison
    return reversed == str(x)
