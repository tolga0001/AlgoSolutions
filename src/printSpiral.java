public class printSpiral {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4,5}, {6, 7, 8, 9,10}, { 11, 12, 13, 14,15}, {16, 17, 18, 19,20}};
        printSpiralMatrix(a);
// 1  2   3   4  5      1 2    3 4
// 6  7   8  9 10       5 6   7   8
// 11 12 13 14 15       9 10  11 12
// /                      13
// 16 17 18  19 20


// 21 22 23 24 25
    }

    private static void printSpiralMatrix(int[][] matrix) {
        int current_row_len = matrix.length - 1;
        int current_col_len = matrix[0].length - 1;
        int start_i = 0, start_j = 0;

        while (current_row_len > 0) {
            printLeftToRight(matrix, start_i, start_j, current_col_len);
            printUpToBottom(matrix, start_i, start_j + current_col_len, current_row_len);
            printRightToLeft(matrix, start_i + current_row_len, start_j + current_col_len, current_col_len);
            printDownToUp(matrix, start_i + current_row_len, start_j, current_row_len);
            // after printing the first square go to other ones
            start_i++;
            start_j++;
            current_row_len -= 2;
            current_col_len -= 2;


        }
    }

    private static void printDownToUp(int[][] matrix, int curr_row, int curr_col, int currentLen) {
        for (int i = 0; i < currentLen; i++) {
            System.out.print(matrix[curr_row - i][curr_col] + " ");

        }
    }

    private static void printRightToLeft(int[][] matrix, int curr_row, int curr_col, int currentLen) {
        for (int j = 0; j < currentLen; j++) {
            System.out.print(matrix[curr_row][curr_col - j] + " ");

        }

    }

    private static void printUpToBottom(int[][] matrix, int curr_row, int curr_col, int currentLen) {
        for (int i = 0; i < currentLen; i++) {
            System.out.print(matrix[i + curr_row][curr_col] + " ");
        }
    }

    private static void printLeftToRight(int[][] matrix, int curr_row, int curr_col, int size) {
        for (int j = 0; j < size; j++) {
            System.out.print(matrix[curr_row][j + curr_col] + " ");
        }
    }
}