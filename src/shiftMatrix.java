import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class shiftMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rowSize: ");
        int rowSize = scan.nextInt();
        System.out.println("Enter the colSize: ");
        int colSize = scan.nextInt();
        char[][] chars = new char[rowSize][colSize];
        Random random = new Random();
        char ch;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                boolean isOne = random.nextBoolean();
                if (isOne) {
                    chars[i][j] = '1';
                } else {
                    chars[i][j] = '0';
                }

            }
        }
        printMatrix(chars);
        shiftChars(chars, 4);
        printMatrix(chars);


    }

    private static void shiftChars(char[][] chars, int shiftAmount) {
        int lastRow = chars.length - 1;
        int lastCol = chars[0].length - 1;
        int rowDecrement = shiftAmount / (lastCol + 1);
        int startRow = lastRow - rowDecrement;
        int colDecrement = shiftAmount % (lastCol + 1);
        int startCol = lastCol - colDecrement;
        // find the starting position
        if (startRow < 0 || startCol < 0) {
            System.out.println("Shifting amount is  too much for this matrix");
            return;
        }



        int i = startRow;
        int j = startCol;                              //1 1 + 1 -> 2 0

        while (i >= 0) {
         //   System.out.println("shift amount is " + shiftAmount);
           // System.out.println("lastcol is: " + lastCol);
            while (j >= 0) {
                System.out.println("startRow: " + i);
                System.out.println("startCol: " + j);
                int shiftedRowAmount = shiftAmount;
                int shiftedColAmount = shiftAmount ;
               // System.out.println("shiftedrow: "+shiftedRowAmount);
                //System.out.println("shiftedcol: "+shiftedColAmount);
                if (j >=lastCol) // alt satıra geç demek
                {
                    System.out.println("hellooo");
                    shiftedRowAmount++;
                }
                System.out.println("i index: "+(i + shiftedRowAmount/(lastCol+1)));
                System.out.println("j index: "+(j + shiftedColAmount)%(lastCol+1));
                chars[i + shiftedRowAmount/(lastCol+1)][(j + shiftedColAmount)%(lastCol+1)] = chars[i][j];

                j--;

            }
            j = lastCol;
            i--;
        }


    }

    private static void printMatrix(char[][] chars) {
        for (char[] arr : chars) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
