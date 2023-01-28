package org.example.otherPrep;

// A quality agent is responsible for inspecting samples of the finished products in a production line. Each sample contains defective and non-defective products represented by 1 and 0 respectively. After placing the product samples sequentially in a two-dimensional square matrix of product samples, determine the size of the largest square area of defective products.


import java.util.List;

public class ProductDefects {

    //    Find the largest area square of all 1s.
    public static int largestArea(List<List<Integer>> matrix) {
        int largestArea = 0;
        int size = matrix.size();
        // Make a matrix for storing the size values, that is 1 row and 1 column larger than the original matrix
        // purpose of this row and column is to handle the out of bound cases as iterating through.
        int dpMatrix [][]  = new int [size + 1] [size + 1];

        // fill the dpMatrix based on the minimum value of the 3 adjacent indexes +1.
        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (matrix.get(i).get(j) == 1) {
                    dpMatrix[i][j] = 1 + Math.min(dpMatrix[i][j-1], Math.min(dpMatrix[i-1][j], dpMatrix[i-1][j-1]));
                    if (largestArea < dpMatrix[i][j]) {
                        largestArea = dpMatrix[i][j];
                    }
                }
            }
        }
//NOPE AGAIN

        System.out.println(largestArea);
        return largestArea;
    }


} // ProductDefects

// Notes from YouTube
// - DP (Dynamic programing) can only be used if we use the previously calculated solution to build the current solution.