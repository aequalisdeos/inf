import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = scan.nextInt();
        int mass[] = new int[n];
        System.out.println("Введите элементы массива");
        for(int i =0; i<n; i++) {
            mass[i] = scan.nextInt();
        }
        int sch = 0;
        for(int i =0; i<n; i++) {
            if(i%2==0)
                if(mass[i]%2==0)
                    sch++;
        }
        System.out.println("Количество чётных значений - "+sch);
    }
}
