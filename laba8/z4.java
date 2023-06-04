import java.util.Scanner;
public class z4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Исходный массив:");
        printArray(array);

        int iterations = shakerSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);
        System.out.println("Количество итераций: " + iterations);
    }

    public static int shakerSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        boolean swapped;
        int iterations = 0;

        do {
            swapped = false;

            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
                iterations++;
            }
            right--;

            for (int i = right; i > left; i--) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    swapped = true;
                }
                iterations++;
            }
            left++;
        } while (swapped);

        return iterations;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}