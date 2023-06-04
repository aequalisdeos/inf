import java.lang.String;
import java.util.Scanner;
public class z7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String Str = in.nextLine();
        char[] charStr = Str.toCharArray();
        for (int i = 0; i<charStr.length; i++){
            if(charStr[i] == '*' ){
                charStr[i] = String.valueOf(i).charAt(0);
            }
        }
        Str = String.valueOf(charStr);
        System.out.println(Str);
    }
}

