import java.util.ArrayList;
public class z10 {
    public static void main(String[] args) {
        String text = "Название 1; сайт 1; 57456; 57456543; 456, Дом 6; 5;10000; 21." +
                "Название 2; сайт 2; 574567; 45677; 456654, Дом 2; 5;100000; 22." +
                "Название 3; сайт 3; 574568; 57676; 45676454, Дом 8; 7;1000; 23." +
                "Название 4; сайт 4; 574567; 23456745674; 456654, Дом 4; 5;100000; 24." +
                "Название 5; сайт 5; 574567; 45673; 456734555, Дом 10; 5;1000; 25.";
        int count1 =0;
        int count2 =0;
        ArrayList<String> str = new ArrayList<>();
        String [] text1 = text.split("\\.");
        for (int i = 0; i<text1.length; i++){
            String [] text2= text1[i].split(";");
            if(text2[3].startsWith(text2[2])){
                count1+=1;
            }
            int tr =text2[4].length()-1;
            if(text2[2].endsWith(String.valueOf(text2[4].charAt(tr)))){
                count2+=1;
            }
            if(Integer.parseInt(text2[6])>10000){
                str.add(text2[0]);
            }
        }
        System.out.println("Количество организаций в которых первые 5 цифр факса совпадает с номером телефона: " + count1);
        System.out.println( "Количество организаций где последняя цифра телефона совпадает с последней цифрой номера дома: " + count2);
        System.out.println( "Компании, количество сотрудников у которых больше 10000: " + str);
    }
}
