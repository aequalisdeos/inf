import java.lang.String;
import java.lang.Character;
import java.util.Scanner;
import static java.lang.System.out;
public class z1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int N = 15;
        char masChar [] = new char[N];
        System.out.println("Введите элементы массива по одному символу");
        for (int i=0; i<N; i++) {
            masChar[i] = Simvol();
        }
        for (int i=0; i<=masChar.length-1;i++)
            if (Character.isLowerCase(masChar[i]) == true) {
                masChar[i] = Character.toUpperCase(masChar[i]);
            } else if (Character.isUpperCase(masChar[i]) == true) {
                masChar[i] = Character.toLowerCase(masChar[i]);
            }
        printMas(masChar);
    }
    public static char Simvol() {
        char ch = ' ';
        String S = in.next();
        if(S.length()==1)
            ch = S.charAt(0);
        else
            while (S.length()!=1) {
                System.out.println("Вы ввели несколько символов, попробуйте ещё раз");
                S = in.next();
                if(S.length()==1)
                    ch = S.charAt(0);
            }
            return ch;
    }
    public static void printMas(char[] array) {
        for (int i=0; i<array.length; i++) {
            out.print(array[i]+"\t");
        }
        out.println();
    }
}

