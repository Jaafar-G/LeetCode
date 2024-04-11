# Given a matrix of integers that simulates the pixels of an image
# rotate its elements 90 degress to the right in place 
# Should be order O(n^2) time complexity && O(1) space complexity
# Preconditions:
# @requires matrixSize == matrixColSize (width == height, must be square)
# @requires 0 <= matrixSize && matrixSize <= 20  (defines valid matrix size)
# @requires 0 <= matrixColSize && matrixColSize <= 20 (defines valid matrix size)
# @requires -1000 <= matrix[i][j] && matrix[i][j] <= 1000  (requiresments of each element in matrix)
# Postconditions:
# @ensures resultSize == resultColSize (width == height, must be square)
# @ensures 0 <= resultSize && resultSize <= 20  (defines valid result size)
# @ensures matrix[i][offset-j] == reuslt[i][j] (for each row [i] in the given matrix 
#                                                     the result should have the respective 
#                                                     row as the reversed index column)
class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
       # Preconditions
        assert matrix, "Input matrix cannot be empty"
        matrix_size = len(matrix)
        assert 0 <= matrix_size <= 20, "Matrix size must be between 0 and 20"
        assert all(len(row) == matrix_size for row in matrix), "Matrix must be square"

        for i in range(len(matrix)):
            #@loop_invariant 0<= i && i < len(matrix)
            for j in range(i+1, len(matrix), 1):
                assert(-1000 <= matrix[i][j] and matrix[i][j] < 1000)
            #@loop_invariant 0 <= j && j < len(matrix)
            #@loop_invariant -1000 <= matrix[i][j] && matrix[i][j] < 1000
                temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
        
        for i in range(len(matrix)):
            assert(-1000 <= matrix[i][j] and matrix[i][j] < 1000)
            #@loop_invariant 0<= i && i < len(matrix)
            #@loop_invariant -1000 <= matrix[i][j] && matrix[i][j] < 1000
            matrix[i] = matrix[i][::-1]

        # Postconditions
        assert len(matrix) == matrix_size, "Result size is not equal to the input size"
        assert all(len(row) == matrix_size for row in matrix), "Result matrix is not square"
