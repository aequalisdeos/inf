import java.util.Scanner;
import static java.lang.System.exit;

public class z12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = in.nextInt();
        double[][] arr = new double[n][n];
        double[][] arr_1 = new double[n][n];

        System.out.println("Введите элементы массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }

        System.out.println("Введите элементы обратного массива");
        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_1[i].length; j++) {
                arr_1[i][j] = in.nextDouble();
            }
        }

        int[][] e = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    e[i][j] += arr[i][k] * arr_1[k][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (e[i][i] != 1 || e[i][j] != 0 || e[n - i - 1][n - 1 - j] != 0) {
                    System.out.println("Повторите попытку");
                    exit(0);
                }
            }
        }

        System.out.println("Всё получилось");
    }
}
