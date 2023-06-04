import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начальный номер катушки (шесть символов)");
        int n = in.nextInt();
        int sum = 0;
        for(int i = n; i <= 999999; i++) {
            int number1 = i/100000;
            int number2 = (i/10000)%10;
            int number3 = (i/1000)%10%10;
            int number4 = (i/100)%10%10%10;
            int number5 = (i/10)%10%10%10%10;
            int number6 = i%10%10%10%10;
            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
            }
        }
        System.out.println(sum + " счастливых билетов");
    }
}
