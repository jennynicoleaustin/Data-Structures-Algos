package org.example;

public class Main {

    public static int minimum(int x, int y, int z) {
        return Integer.min(Integer.min(x, y), z);
    }

    // Function to find the size of the largest square submatrix of 1's
    // present in a given binary matrix
    public static int findLargestSquare(int[][] matrix) {
        // base case - TODO: If the matrix is empty, then the size of the largest matrix is 0
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        // `T[i][j]` stores the size of maximum square
        // submatrix ending at `matrix[i][j]`
        int[][] tempSquare = new int[matrix.length][matrix[0].length];

        // `max` stores the size of the largest square submatrix of 1's
        int largestArea = 0;

        // fill in a bottom-up manner
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                tempSquare[i][j] = matrix[i][j];

                // if we are not at the first row or first column and the
                // current cell has value 1
                if (i > 0 && j > 0 && matrix[i][j] == 1) {
                    // the largest square submatrix ending at `mat[i][j]` will be
                    // 1 plus minimum of largest square submatrix
                    // ending at `mat[i][j-1]`, `mat[i-1][j]` and `mat[i-1][j-1]`

                    tempSquare[i][j] = minimum(tempSquare[i][j - 1], tempSquare[i - 1][j],
                            tempSquare[i - 1][j - 1]) + 1;
                }

                // update largestArea size found so far
                if (largestArea < tempSquare[i][j]) {
                    largestArea = tempSquare[i][j];
                }
            }
        }

        // return size of the largest square matrix
        return largestArea;
    }

    public static void main(String[] args) {
        // input matrix
        int matrix[][] =
                {
                        {0, 0, 1, 0, 1, 1},
                        {0, 1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 1, 1},
                        {1, 1, 0, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1},
                        {1, 1, 0, 1, 1, 1},
                        {1, 0, 1, 1, 1, 1},
                        {1, 1, 1, 0, 1, 1}
                };

        System.out.print("The size of largest square submatrix of 1's is " +
                findLargestSquare(matrix));
    }
}

