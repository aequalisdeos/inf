import java.util.Scanner;
public class z61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество клиник ");
        int aud = in.nextInt();
        in.nextLine();
        String[][] str = new String[aud][15];
        for (int i = 0; i < aud; i++) {
            System.out.print("Введите район " + (i+1) + " клиники: ");
            str[i][0] = in.nextLine();
            System.out.print("Введите номер " + (i+1) + " клиники: ");
            str[i][1] = in.nextLine();
            System.out.print("Введите количество работников " + (i+1) + " клиники : ");
            str[i][2] = in.nextLine();
            System.out.print("Введите количество врачей " + (i+1) + " клиники: ");
            str[i][3] = in.nextLine();
            System.out.print("Введите количество врачей высшей категории  " + (i+1) + " клиники: ");
            str[i][4] = in.nextLine();
            System.out.print("Введите количество врачей прошедших повышение квалификации за последние 5 лет в " + (i+1) + " клинике: ");
            str[i][5] = in.nextLine();
            System.out.print("Введите общее число пациентов в базе " + (i+1) + " клиники: ");
            str[i][6] = in.nextLine();
            System.out.print("Введите число пациентов собак " + (i+1) + " клиники: ");
            str[i][7] = in.nextLine();
            System.out.print("Введите общее число пациентов кошек " + (i+1) + " клиники: ");
            str[i][8] = in.nextLine();
            System.out.print("Введите наличие рентгена для " + (i+1) + " клиники: ");
            str[i][9] = in.nextLine();
            System.out.print("Введите наличие компьютеров в " + (i+1) + " клинике да / нет: ");
            str[i][10] = in.nextLine();
            if (str[i][10].equalsIgnoreCase("да")) {
                System.out.print("Введите количество компьютеров в " + (i+1) + " клинике: ");
                str[i][11] = in.nextLine();
            } else {
                str[i][11] = "0";
            }
            System.out.print("Введите число клеток для передержки животных " + (i+1) + " клиники: ");
            str[i][12] = in.nextLine();
            System.out.print("Введите средний суммарный доход клиник " + (i+1) + " клиники: ");
            str[i][13] = in.nextLine();
            System.out.print("Введите общая стоимость оборудования клиники." + (i+1) + " клиники: ");
            str[i][14] = in.nextLine();
        }
        int ShetZifr = 0;
        for (int i = 0; i<aud; i++){
            boolean isOnlyDigits = true;
            for(int j = 0; j < str[i][1].length() && isOnlyDigits; j++) {
                if(!Character.isDigit(str[i][1].charAt(j))) {
                    isOnlyDigits = false;
                }
            }
            if(isOnlyDigits){
                ShetZifr += 0;
            }
        }
        System.out.println( "Количество клиник с номером: " + ShetZifr);
        int ScetKlinpoL = 0;
        int ScetKlinpoZn = 0;
        int ScetKlinpoAMZ = 0;
        int ScetKlinpoHTZ = 0;
        for (int i = 0; i<aud; i++){
            if(str[i][4].valueOf(i).charAt(0)>2){
                switch (str[i][0]){
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
        for (int i = 0; i<aud; i++){
            if((str[i][3].valueOf(i).charAt(0)/100*30>str[i][5].valueOf(i).charAt(0)) && str[i][6].valueOf(i).charAt(0)>100){
                KL +=1;
            }
        }
        System.out.println( "Количество клиник повышение прошли более 30 % врачей и более 100 пациентов: " + KL);
        int Kw = 0;
        for (int i = 0; i<aud; i++){
            if((str[i][14].valueOf(i).charAt(0)>5000000)){
                if (str[i][9]=="есть"){
                    Kw +=1;
                }
            }
        }
        System.out.println( "Количество клиник есть рентген и общая стоимость оборудования более 5000000: " + Kw);
    }
}
