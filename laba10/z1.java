import java.io.*;
public class z1 {
    public static int A(String input){
        int lat = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                lat+=1;
            }
        }
        return lat;
    }
    public static Boolean B(String stroka, String posled){
        if (stroka.contains(posled)){
            return true;
        }
        return false;
    }
    public static Boolean C(String stroka){
        int Kol_Zap = 0;
        for (int i = 0; i < stroka.length(); i++) {
            char c = stroka.charAt(i);
            if (stroka.contains(",")) {
                Kol_Zap+=1;
            }
        }
        if ( Kol_Zap>=2){
            return true;
        }
        return false;
    }
    public static Boolean D(String stroka){
        if (stroka.contains("во") | stroka.contains("ов") ){
            return true;
        }
        return false;
    }
    public static Boolean E(String input){

        for (int i = 0; i < input.length()-3; i++) {
            char a = input.charAt(i+2);
            char b = input.charAt(i+1);
            char c = input.charAt(i);
            if ((b == a) || (c == b)) {
                return true;
            }
        }
        return false;
    }
    public static boolean f(String stroka){
        for( int i = 2; i<stroka.length()-2; i++){
            char a = stroka.charAt(i);
            char b = stroka.charAt(i+1);
            if((Character.isLowerCase(a) && Character.isUpperCase(b))||(Character.isLowerCase(b) && Character.isUpperCase(a))){
                for(int j=i+1; j< stroka.length()-1; j++){
                    char c = stroka.charAt(j);
                    char d = stroka.charAt(j+1);
                    if((c=='0' && d=='0')){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        File file= new File("C:\\Users\\Мишка\\Desktop\\z1.txt");
        BufferedReader fread = new BufferedReader(new FileReader(file));
        FileWriter fwrite = new FileWriter(file,true);
        String str = fread.readLine();
        String str1 = fread.readLine();
        fwrite.write("\n\nВЫВОД\nКоличество латинских букв = " + A(str)+"\n");
        if (B(str,str1)){
            fwrite.write("Данная последовательность " + str1 + "' входит в строку\n");
        }
        else {
            fwrite.write("Данная последовательность " + str1 + "' не входит в строку\n");
        }
        if (C(str)){
            fwrite.write("Колличество запятых в строке две и более\n");
        }
        else {
            fwrite.write("Запятых нет или меньше двух\n");
        }
        if (D(str)){
            fwrite.write("Последовательности <во> или <ов> есть в строке\n");
        }
        else {
            fwrite.write("Последовательностей <во> или <ов> нет в строке\n");
        }
        if (E(str)){
            fwrite.write("В строке есть одинаковые рядом стоящие символы\n");
        }
        else {
            fwrite.write("В строке нет одинаковых рядом стоящих символов\n");
        }
        if(f(str)){
            fwrite.write("Строка удовлетворяет условию е из задания\n");
        }
        else {
            fwrite.write("Строка не удовлетворяет условию е из задания\n");
        }
        fwrite.close(); fread.close();
    }

}