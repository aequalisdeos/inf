import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class z13 {
    public static void main(String[] args) {
        int k = 3;
        int n = 2;
        int m = 3;
        double[][][] matrices = readMatricesFromFile("C:\\Users\\Мишка\\Desktop\\z13_1.txt", k, n, m);
        double[][] matrices1 = readMatricesFromFile1("C:\\Users\\Мишка\\Desktop\\z13_2.txt", k, n);
        String filePath = "C:\\Users\\Мишка\\Desktop\\z13_3.txt";
        for (int i = 0; i < k; i++) {
            System.out.println("Матрица " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    System.out.print(matrices[i][j][l] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Матрица " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                System.out.println(matrices1[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            double[][] vspom = new double[n][m];
            double[] vspom2 = new double[n];
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    vspom[j][l] = matrices[i][j][l];
                }
                vspom2[j] = matrices1[i][j];
            }
            System.out.println("Умножение матрицы " + (i + 1) + " из первого файла и матрицы " + (i + 1) + " из второго файла:");
            double[] matrixesitog =multiplyMatrices(vspom,vspom2);
            writeArrayToFile(matrixesitog, filePath);
            System.out.println("Матрица успешно записана в файл.");
            for (int p = 0; p < matrixesitog.length; p++) {
                System.out.println(matrixesitog[p]);
            }
            System.out.println();
        }
    }
    public static void writeArrayToFile(double[] array, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            StringBuilder line = new StringBuilder();
            for (double element : array) {
                line.append(element).append("\t");
            }
            writer.write(line.toString().trim());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static double[] multiplyMatrices(double[][] matrix1, double[] matrix2) {
        int n = matrix1.length;
        int m = matrix1[0].length;
        if (n != matrix2.length) {
            throw new IllegalArgumentException("Несовместимые размерности матрицы и массива");
        }
        double[] result = new double[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i]+=matrix1[j][i]*matrix2[j];
            }
        }
        return result;
    }
    public static double[][][] readMatricesFromFile(String filename, int k, int n, int m) { //чтение матриц вида n на m
        double[][][] matrices = new double[k][n][m];
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int currentMatrix = 0;
            int currentRow = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.trim().split("\\s+");
                for (int i = 0; i < values.length; i++) {
                    matrices[currentMatrix][currentRow][i] = Double.parseDouble(values[i]);
                }
                currentRow++;
                if (currentRow == n) {
                    currentMatrix++;
                    currentRow = 0;
                }
                if (currentMatrix == k) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrices;
    }
    public static double[][] readMatricesFromFile1(String filename, int k, int n) {
        double[][] matrices1 = new double[k][n];
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int currentMatrix = 0;
            int currentRow = 0;

            while ((line = reader.readLine()) != null) {
                double value = Double.parseDouble(line.trim());
                matrices1[currentMatrix][currentRow] = value;
                currentRow++;
                if (currentRow == n) {
                    currentMatrix++;
                    currentRow = 0;
                }
                if (currentMatrix == k) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrices1;
    }
}
