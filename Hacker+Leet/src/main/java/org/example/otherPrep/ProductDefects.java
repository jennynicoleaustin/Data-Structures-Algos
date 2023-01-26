package org.example.otherPrep;

// A quality agent is responsible for inspecting samples of the finished products in a production line. Each sample contains defective and non-defective products represented by 1 and 0 respectively. After placing the product samples sequentially in a two-dimensional square matrix of product samples, determine the size of the largest square area of defective products.


import java.util.List;

public class ProductDefects {

    //    Find the largest area square of all 1s.
    public static int largestArea(List<List<Integer>> matrix) {
        int largestArea = 0;
        int matrixSize = matrix.size(); // since the original problem specifies that the passed matrix is a SQUARE, you only need to obtain a single size.
        // Create a square matrix to hold temp values as you iterate through the original matrix
        int[][] tempMatrix = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i > 0 && j > 0) {
                    if (matrix.get(i).get(j) == 1){
                        tempMatrix[i][j] = 1 + Math.min(tempMatrix[i-1][j], tempMatrix[i][j-1]);
                    }
                } else {
                    if (matrix.get(i).get(j) == 1) {
                        tempMatrix[i][j] = 1;
                    }
                    largestArea = Math.max(largestArea, tempMatrix[i][j]);
                }
            }
        }
        System.out.println(largestArea);
        return largestArea;
    }
//NOPE!

} // ProductDefects
