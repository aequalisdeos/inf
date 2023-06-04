import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class z6 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Мишка\\Desktop\\z6.txt";
        String outputFile = "C:\\Users\\Мишка\\Desktop\\z6_1.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true));
            String line;
            Map<String, Integer> clubCountMap = new HashMap<>();
            int totalPoints = 0;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length >= 2) {
                    String club = data[1];
                    int points = Integer.parseInt(data[3]);
                    clubCountMap.put(club, clubCountMap.getOrDefault(club, 0) + 1);
                    totalPoints += points;
                }
            }
            reader.close();
            writer.newLine();
            writer.write("Количество волейболистов по клубам:");
            writer.newLine();
            for (Map.Entry<String, Integer> entry : clubCountMap.entrySet()) {
                String club = entry.getKey();
                int count = entry.getValue();
                writer.write(club + ": " + count);
                writer.newLine();
            }
            writer.write("Общая результативность в очках: " + totalPoints);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
