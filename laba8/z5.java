import java.util.Scanner;
public class z5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean swap = true;
        while (swap) {
            System.out.print("Введите количество строк матрицы: ");
            int rows = scanner.nextInt();

            System.out.print("Введите количество столбцов матрицы: ");
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int minColumn = findMinColumn(matrix);

            if (minColumn == columns - 1) {
                System.out.println("Столбец с наименьшим элементом совпадает с последним столбцом.");
                System.out.println("Пожалуйста, введите матрицу заново.");
            } else {
                swapColumns(matrix, minColumn, columns - 1);
                swap = false;

                System.out.println("Результат:");
                printMatrix(matrix);
            }
        }
    }

    private static int findMinColumn(int[][] matrix) {
        int minColumn = 0;
        int minElement = matrix[0][0];

        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] < minElement) {
                minElement = matrix[0][j];
                minColumn = j;
            }
        }

        return minColumn;
    }

    private static void swapColumns(int[][] matrix, int column1, int column2) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = temp;
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
