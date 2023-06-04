import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите массив символов: ");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();
        int upper = 0;
        boolean sequence = false;
        boolean commas = false;
        boolean vo = false;
        boolean num = false;
        boolean ij = false;
        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            if (Character.isUpperCase(currentChar)) {
                upper++;
            }
            if (Character.toLowerCase(currentChar) == 'ю') {
                sequence = true;
            }
            if (currentChar == ',') {
                if (i + 1 < characters.length && characters[i + 1] == ',') {
                    commas = true;
                    break;
                }
            }
            if (i + 1 < characters.length) {
                char nextChar = characters[i + 1];
                if ((currentChar == 'в' && nextChar == 'о') || (currentChar == 'о' && nextChar == 'в')) {
                    vo = true;
                }
                if (Character.isDigit(currentChar) && currentChar == nextChar) {
                    num = true;
                }
                if (Character.isLetter(currentChar) && Character.isLetter(nextChar)) {
                    if (Character.toLowerCase(currentChar) == Character.toLowerCase(nextChar)) {
                        if (i + 2 < characters.length && nextChar == 'o' && characters[i + 2] == '0') {
                            ij = true;
                        }
                    }
                }
            }
        }
        System.out.println("Количество латинских прописных букв: " + upper);
        System.out.println("Буква 'ю' " + (sequence ? "входит" : "не входит") + " в последовательность");
        System.out.println("Среди символов " + (commas ? "есть две и более запятых" : "нет двух и более запятых"));
        System.out.println("Среди символов " + (vo ? "есть пара соседствующих букв 'во' или 'ов'" : "нет пары соседствующих букв 'во' или 'ов'"));
        System.out.println("Среди символов " + (num ? "есть пара соседствующих одинаковых цифр" : "нет пары соседствующих одинаковых цифр"));
        System.out.println("Существуют ли такие i и j, что 1 < i < j < п и что s_i, s_i+1 - одинаковые буквы отличающиеся регистром, а s_j, s_j+1 - это 0? " + (ij ? "Да" : "Нет"));
    }
}
