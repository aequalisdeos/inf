import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в 16-ой системе счисления");
        String str1 = sc.next();
        if(isValid(str1)){
            System.out.println("Число в 2-ой системе счисление");
            System.out.println(hexToBinary(str1));
        }
        else {
            System.out.println("Число не в 16-ой системе счисления, повторите ввод!");
        }
    }
    public static String hexToBinary(String number) {
        return Long.toBinaryString((Long.parseLong(number, 16)));
    }
    private static boolean isValid(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!(c >= '0' && c <= '9') && !(c >= 'A' && c <= 'E')) {
                return false;
            }
        }
        return true;
    }
}
