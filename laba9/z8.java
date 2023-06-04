import java.util.ArrayList;
import java.util.Arrays;
public class z8 {
    public static void main(String[] args) {
        String text = "На улице идёт дождь. Летит птица. Небо отчистилось и дождь закончился";
        String text1[] = text.split("\\.");
        ArrayList<String> replace = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < text1.length; i++) {
            String text2[] = text1[i].split(" ");
            for(int j = 0; j<text2.length; j++){
                words.add(text2[j]);
            }
        }
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))&&(words.get(i)!=" ")) {
                    replace.add(words.get(i));
                }
            }
        }
        replace.removeAll(Arrays.asList("", null));
        for(int i = 0; i < text1.length; i++) {
            for(int j = 0; j<replace.size(); j++){
                if(text1[i].contains(replace.get(j))==true){
                    result.add(text1[i]);
                }
            }
        }
        System.out.println(text);
        System.out.println(result);
    }
}
