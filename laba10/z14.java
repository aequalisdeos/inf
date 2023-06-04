import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class z14 {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Мишка\\Desktop\\Variant_5,15.txt";
        List<List<Double>> data = new ArrayList<>();
        BufferedReader fread = new BufferedReader(new FileReader(filename));
        String line;
        boolean flag = false;
        while ((line = fread.readLine()) != null) {
            if (line.contains("UX")) {
                flag = true;
                continue;
            }
            if (flag) {
                String[] correct = fread.readLine().split("-0\\.");
                for (int i = 1; i < correct.length; i++) {
                    correct[i] = "\\s-0." + correct[i];
                }
                String s = getString(correct).replaceFirst("\\s+", "");
                String[] values = s.trim().split("\\s+");
                List<Double> row = new ArrayList<>();
                for (int i = 1; i < values.length; i++) {
                    row.add(Double.parseDouble(values[i]));
                }
                data.add(row);
            }
        }
        fread.close();
        List<Double> maxValues = new ArrayList<>();
        List<Double> minValues = new ArrayList<>();
        List<Double> avgValues = new ArrayList<>();
        List<List<Double>> deviations = new ArrayList<>();
        for (int i = 0; i < data.get(0).size(); i++) {
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;
            double sum = 0;
            for (List<Double> row : data) {
                double value = row.get(i);
                max = Math.max(max, value);
                min = Math.min(min, value);
                sum += value;
            }
            double avg = sum / data.size();
            maxValues.add(max);
            minValues.add(min);
            avgValues.add(avg);

            List<Double> deviation = new ArrayList<>();
            for (List<Double> row : data) {
                deviation.add(row.get(i) - avg);
            }
            deviations.add(deviation);
        }
        FileWriter fwr = new FileWriter(filename, true);
        fwr.write("\nМаксимальные значения: " + maxValues.toString() + "\n");
        fwr.write("Минимальные значения: " + minValues.toString() + "\n");
        fwr.write("Средние значения: " + avgValues.toString() + "\n");
        fwr.write("Отклонения:\n");
        for (List<Double> deviation : deviations) {
            fwr.write(deviation.toString() + "\n");
        }
        fwr.flush();
        fwr.close();
    }
    public static String getString(String[] mas) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < mas.length; i++) {
            stringBuilder.append(mas[i]);
        }
        return stringBuilder.toString();
    }
}
