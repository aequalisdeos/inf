import java.util.Random;
import java.util.Scanner;
public class z7 {
    public static void main(String[] args) {
        Random run = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int g = n;
        int mas[][] = new int [n][n];
        while (g !=0){
            for(int i = 0; i< mas.length; i++){
                for( int j = 0; j<g; j++){
                    mas [i][j]= run.nextInt(20);
                }
                g = g-1;
            }
        }
        G(mas);
    }

    public static void G(int[][] A){
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A.length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
