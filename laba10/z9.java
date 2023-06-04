import java.io.*;
public class z9{
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Мишка\\Desktop\\z9.txt");
        BufferedReader fread = new BufferedReader(new FileReader(file));
        BufferedWriter fwrite = new BufferedWriter(new FileWriter(file,true));
        int abc=0;
        while (fread.ready()){
            fread.readLine();
            abc++;
        }
        fread.close();
        int i =0;
        String[][] room = new String[abc][15];
        BufferedReader fread1 = new BufferedReader(new FileReader(file));
        while (i!=abc-1) {
            String[] clasi = fread1.readLine().split(",");
            int c = 0;
            room[i][0] = clasi[c++];
            room[i][1] = clasi[c++];
            room[i][2] = clasi[c++];
            room[i][3] = clasi[c++];
            room[i][4] = clasi[c++];
            room[i][5] = clasi[c++];
            room[i][6] = clasi[c++];
            room[i][7] = clasi[c++];
            room[i][8] = clasi[c++];
            room[i][9] = clasi[c++];
            room[i][10] = clasi[c++];
            if (room[i][10].equalsIgnoreCase("да")) {
                room[i][11] = clasi[c++];
            } else {
                room[i][11] = "0";
            }
            room[i][12] = clasi[c++];
            room[i][13] = clasi[c++];
            room[i][14] = clasi[c++];
            i++;
        }
        int ShetZifr = 0;
        for (int k = 0; k < abc; k++) {
            boolean isOnlyDigits = true;
            for (int j = 0; j < room[k][1].length() && isOnlyDigits; j++) {
                if (!Character.isDigit(room[k][1].charAt(j))) {
                    isOnlyDigits = false;
                }
            }
            if (isOnlyDigits) {
                ShetZifr += 0;
            }
        }
        int ScetKlinpoL = 0;
        int ScetKlinpoZn = 0;
        int ScetKlinpoAMZ = 0;
        int ScetKlinpoHTZ = 0;
        for (int k = 0; k < abc; k++) {
            if (room[k][4].valueOf(k).charAt(0) > 2) {
                switch (room[k][0]) {
                    case "Лененский":
                        ScetKlinpoL += 1;
                        break;
                    case "Центральный":
                        ScetKlinpoZn += 1;
                        break;
                    case "Чмз":
                        ScetKlinpoAMZ += 1;
                        break;
                    case "Чтз":
                        ScetKlinpoHTZ += 1;
                        break;
                }
            }
        }
        int KL = 0;
        for (int k = 0; k < abc; k++) {
            if ((room[k][3].valueOf(k).charAt(0) / 100 * 30 > room[k][5].valueOf(i).charAt(0)) && room[k][6].valueOf(k).charAt(0) > 100) {
                KL += 1;
            }
        }
        System.out.println("Количество клиник повышение прошли более 30 % врачей и более 100 пациентов " + KL);
        int Kw = 0;
        for (int k = 0; k < abc; k++) {
            if ((room[k][14].valueOf(k).charAt(0) > 5000000)) {
                if (room[k][9] == "есть") {
                    Kw += 1;
                }
            }
        }
        fwrite.write("Количество клиник с номером \n" + ShetZifr);
        fwrite.write("Количество клиник  по Центральному р-ну \n" + ScetKlinpoZn);
        fwrite.write("Количество клиник  по Индустриальному р-ну \n" + ScetKlinpoHTZ);
        fwrite.write("Количество клиник  по Мотовилихинском р-ну \n" + ScetKlinpoAMZ);
        fwrite.write("Количество клиник  по Ленинскому р-ну \n" + ScetKlinpoL);
        fwrite.write("Количество клиник есть рентген и общая стоимость оборудования более 5000000 \n" + Kw);
        fwrite.close();
    }
}
