import java.util.Scanner;
public class z8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите  номер дня недели");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Женя подметает пол");
                break;
            case 2:
                System.out.println("Кирилл моет посуду");
                break;
            case 3:
                System.out.println("Лиза протирает пыль");
                break;
            case 4:
                System.out.println("Петя протирает стёкла");
                break;
            case 5:
                System.out.println("Маша моет пол");
                break;
            case 6:
                System.out.println("Женя моет ванную");
                break;
            case 7:
                System.out.println("Кирилл готовит ужин");
                break;
            default:
                System.out.println("В неделе только 7 дней!");
                break;
        }
    }
}
