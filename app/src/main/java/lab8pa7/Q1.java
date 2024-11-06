package lab8pa7;

public class Q1 {
    public void rotate(int[][] matrix) {
        // make the rows into the columns
        // [1,2,3][4,5,6][7,8,9] becomes [1,4,7][2,5,8][3,6,9]
        // nested loop that takes the first value for first row, second for second, etc.
        // use temp variable to swap numbers

        // reverse the rows
        // [1,4,7][2,5,8][3,6,9] becomes [7,4,1][8,5,2][9,6,3]
        // do another nested loop that reverses the list
        // use temp variable to swap numbers
        
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}
