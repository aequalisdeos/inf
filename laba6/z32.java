public class z32 {
    public static void main(String[] args) {
        double Pr=1;
        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                Pr *= j;
            }
        }
        System.out.println("Произведение произведений равно " + Pr);
    }
}
