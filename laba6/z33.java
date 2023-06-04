public class z33 {
    public static void main(String[] args) {
        double S=0, Prj=1, Prk=1;
        for (int i=1; i<=8; i++) {
            for (int j = i; j <= 8; j++) {
                for (int k = 1; k <= 2*i; k++) {
                    Prk *= (2*j*i - k);
                }
                Prj *= Prk;
                Prk = 1;
            }
            S += Prj;
            Prj=1;
        }
        System.out.println("Сумма произведения произведений - " + S);
    }
}
