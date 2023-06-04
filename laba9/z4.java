import java.util.ArrayList;
import java.util.Scanner;
public class z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = scanner.nextInt();
        char[][] matrix = new char[n][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.next().charAt(0);
            }
        }
        ArrayList<String> cor = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (checkRow(matrix[i], cor)) {
                count++;
            }
        }
        for (int j = 0; j < n; j++) {
            char[] column = new char[n];
            for (int i = 0; i < n; i++) {
                column[i] = matrix[i][j];
            }
            if (checkRow(column, cor)) {
                count++;
            }
        }
        System.out.println("Количество правильно вычисленных выражений: " + count);
        System.out.println("Количество неправильно вычисленных выражений: " + cor.size());
        System.out.println("Неправильно вычисленные выражения:");
        for (String expression : cor) {
            System.out.println(expression);
        }
    }
    private static boolean checkRow(char[] row, ArrayList<String> incorrectExpressions) {
        StringBuilder expression = new StringBuilder();
        boolean exp = true;
        for (char c : row) {
            if (Character.isDigit(c)) {
                expression.append(c);
            } else if (c == '.') {
                expression.append(c);
            } else if (c == 's') {
                expression.append(c);
            } else if (c == 'o') {
                expression.append(c);
            } else if (c == '(') {
                expression.append(c);
            } else if (c == ')') {
                expression.append(c);
            } else if (c == '=') {
                expression.append(c);
            } else if (c == ' ') {
            } else {
                exp = false;
                break;
            }
        }
        if (exp && eva(expression.toString())) {
            return true;
        } else {
            incorrectExpressions.add(expression.toString());
            return false;
        }
    }
    private static boolean eva(String expression) {
        return false;
    }
}
