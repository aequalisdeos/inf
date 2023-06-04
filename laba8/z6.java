import java.util.Scanner;
public class z6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            boolean hasNegative = false;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < 0) {
                    hasNegative = true;
                    break;
                }
            }

            if (hasNegative) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] -= matrix[n - 1][j];
                }
            } else {
                for (int j = 0; j < m; j += 2) {
                    matrix[i][j] = -matrix[i][j];
                }
            }
        }

        System.out.println("Преобразованная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
