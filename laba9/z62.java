import java.util.Scanner;
public class z62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите данные по клиникам через запятую: ");
        String str = in.nextLine();
        String[] cls = str.split(",");
        int abc = cls.length / 15;
        String[][] room = new String[abc][15];
        int c = 0;
        for (int i = 0; i < abc; i++) {
            room[i][0] = cls[c++];
            room[i][1] = cls[c++];
            room[i][2] = cls[c++];
            room[i][3] = cls[c++];
            room[i][4] = cls[c++];
            room[i][5] = cls[c++];
            room[i][6] = cls[c++];
            room[i][7] = cls[c++];
            room[i][8] = cls[c++];
            room[i][9] = cls[c++];
            room[i][10] = cls[c++];
            if (room[i][10].equalsIgnoreCase("да")) {
                room[i][11] = cls[c++];
            } else {
                room[i][11] = "0";
            }
            room[i][12] = cls[c++];
            room[i][13] = cls[c++];
            room[i][14] = cls[c++];
        }
        int ShetZifr = 0;
        for (int i = 0; i < abc; i++) {
            boolean isOnlyDigits = true;
            for (int j = 0; j < room[i][1].length() && isOnlyDigits; j++) {
                if (!Character.isDigit(room[i][1].charAt(j))) {
                    isOnlyDigits = false;
                }
            }
            if (isOnlyDigits) {
                ShetZifr += 0;
            }
        }
        System.out.println("Количество клиник с номером: " + ShetZifr);
        int ScetKlinpoL = 0;
        int ScetKlinpoZn = 0;
        int ScetKlinpoAMZ = 0;
        int ScetKlinpoHTZ = 0;
        for (int i = 0; i < abc; i++) {
            if (room[i][4].valueOf(i).charAt(0) > 2) {
                switch (room[i][0]) {
                    case "Ленинский":
                        ScetKlinpoL +=1;
                        break;
                    case "Индустриальный":
                        ScetKlinpoZn +=1;
                        break;
                    case "Мотовилихинский":
                        ScetKlinpoAMZ +=1;
                        break;
                    case "Кировский":
                        ScetKlinpoHTZ +=1;
                        break;
                }
            }
        }
        System.out.println( "Количество клиник  по Ленинскому р-ну: " + ScetKlinpoL);
        System.out.println( "Количество клиник  по Индустриальному р-ну: " + ScetKlinpoZn);
        System.out.println( "Количество клиник  по Мотовилихинскому р-ну: " + ScetKlinpoHTZ);
        System.out.println( "Количество клиник  по Кировскому р-ну: " + ScetKlinpoAMZ);
        int KL = 0;
        for (int i = 0; i < abc; i++) {
            if ((room[i][3].valueOf(i).charAt(0) / 100 * 30 > room[i][5].valueOf(i).charAt(0)) && room[i][6].valueOf(i).charAt(0) > 100) {
                KL += 1;
            }
        }
        System.out.println("Количество клиник повышение прошли более 30 % врачей и более 100 пациентов: " + KL);
        int Kw = 0;
        for (int i = 0; i < abc; i++) {
            if ((room[i][14].valueOf(i).charAt(0) > 5000000)) {
                if (room[i][9] == "есть") {
                    Kw += 1;
                }
            }
        }
        System.out.println("Количество клиник есть рентген и общая стоимость оборудования более 5000000: " + Kw);
    }
}

