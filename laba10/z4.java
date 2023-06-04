import java.util.ArrayList;
import java.io.*;
public class z4 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:\\Users\\Мишка\\Desktop\\z4.txt");
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("[_.,;:\\n\\t!?]");
                for (String word : lineWords) {
                    if (isBalanced(word)) {
                        words.add(word);
                    }
                }
            }
        }
        File outputFile = new File("C:\\Users\\Мишка\\Desktop\\z4_1.txt");
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (String word : words) {
                writer.println(word);
            }
        }
    }
    public static boolean isBalanced(String word) {
        int numglas = 0;
        int numsoglas = 0;
        String glasnie = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        String soglasnie = "бвгджзйклмнпрстфхцчшщъьБВГДЖЗЙКЛМНПРСТФХЦЧШЩЪЬ";
        for (char c : word.toCharArray()) {
            if (glasnie.indexOf(c) != -1) {
                numglas++;
            } else if (soglasnie.indexOf(c) != -1) {
                numsoglas++;
            }
        }

        return numglas < numsoglas;
    }
}
