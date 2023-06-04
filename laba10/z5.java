import java.io.*;
public class z5 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Мишка\\Desktop\\z5_1.txt");
        File file2 = new File("C:\\Users\\Мишка\\Desktop\\z5_2.txt");
        BufferedReader fread = new BufferedReader(new FileReader(file));
        FileWriter fwrite = new FileWriter(file2, true);
        StringBuilder line = new StringBuilder();
        while (fread.ready()) {
            line.append(fread.readLine());
        }
        String[] predlozhenie = String.valueOf(line).split("\\.");
        for (int i = 0; i < predlozhenie.length; i++) {
            String pred1 = predlozhenie[i];
            String[] slovo = predlozhenie[i].split("\\s+");
            for (int j = 0; j < slovo.length; j++) {
                if (slovo[j].length() >= 2) {
                    if (slovo[j].contains("-")) {
                        fwrite.write(slovo[j] + ".");
                    }
                }
            }
        }
        fwrite.close();
    }
}
