import java.lang.String;
import java.util.Scanner;
public class z5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        int num = count(str);
        System.out.println("Количество символов цифр: " + num);
    }
    private static int count(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
