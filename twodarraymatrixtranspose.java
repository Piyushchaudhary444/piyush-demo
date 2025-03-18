public class twodarraymatrixtranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposed = transpose(matrix);

        for (int[] row : transposed) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
/*
 swapping element in a matrix 
 sorting a 2d array matrix using 1d array and without 1 d array
 set matrix zeroes 
 rotate a matrix
 print matri in snake pattern
 matrix boundary traversal
 sum of diagonal in matrix
 rotate a matrix by 180 degree counter clockwise
 range some query 2d immutable
 matrix block sum

 n=5 , print bakward numbers 
 
 */
