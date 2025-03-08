import java.util.Scanner;

public class multiplicationMatrix {
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int column1 = matrix1[0].length;
        int row2 = matrix2.length;
        int column2 = matrix2[0].length;

        int[][] resultMatrix = new int[row1][column2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < column1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int row1 = sc.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int column1 = sc.nextInt();
        System.out.print("Enter the number of rows for the second matrix: ");
        int row2 = sc.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");  // Fixed prompt
        int column2 = sc.nextInt();

        if (column1 != row2) {
            System.out.println("Matrix multiplication is not possible.");
            System.exit(0);
        }

        int[][] matrix1 = new int[row1][column1];
        int[][] matrix2 = new int[row2][column2];

        System.out.println("Enter the elements in the first matrix: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements in the second matrix: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("The result of matrix multiplication is: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
