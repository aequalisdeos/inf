import java.util.Arrays;
public class z11 {
    public static void main(String[] args) {
        String[] strings = {"  Hello ", " World  ", "  Java 123 "};
        // Удаление пробелов в начале и конце каждой строки
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
        // Замена всех гласных символов на символ '*'
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("[aeiouAEIOU]", "*");
        }
        // Замена всех цифр на символ '#'
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\\d", "#");
        }
        System.out.println(Arrays.toString(strings));
    }
}
