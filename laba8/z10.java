public class z10 {
    public static void main(String[] args) {
        int N[][] = {{5, 7, 2, -3, 8, 0, 6},
                {5, 2, -3, 3, 2, -1, 1},
                {0, 0, 0, 0, 0, 0, 0}};
        for (int i = 0; i < 7; i++) {
            int x = N[0][i];
            int y = N[1][i];
            if (figura_1_obl(x, y) | figura_2_obl(x, y)) {
                N[2][i] = 1;

            } else if (figura_1_gr(x, y) | figura_2_gr(x, y)) {
                N[2][i] = 0;
            } else {
                N[2][i] = -1;
            }
        }
        G(N);
    }

    public static boolean figura_1_obl(int x, int y) {

        if ((x > 5 & y > 0 & y < (-2.5) * x + 17.5) | (y > x - 7 & y < 0 & y > (-
                1 / 3f) * x + 1) | (y > 0 & y > (-x) - 3 & y < (-1 / 3f) * x + (5 / 3f))
                | (y > -1 & y < x - 3 & y < (-1 / 3f) * x + 1) | (y < -1 &
                Math.pow(x - 4, 2) + Math.pow(y + 1, 2) < 4)) {
            return true;
        }
        return false;
    }

    public static boolean figura_1_gr(int x, int y) {

        if ((x == 5 | y == 0 | y == -2.5 * x + 17.5 | y == x - 7 | y == 0 | y == (-
                1 / 3f) * x + 1 | y == 0 | y == -x - 3 | y == (-1 / 3f) * x + (5 / 3f)
                | y == -1 | y == x - 3 | y == (-1 / 3f) * x + 1 | Math.pow(x -
                4, 2) + Math.pow(y + 1, 2) == 4) & (y >= -3 & y <= 5 & x >= 2 & x <= 7)) {
            return true;
        }
        return false;
    }

    public static boolean figura_2_obl(int x, int y) {

        if ((y > 3.5 * x - 3 & y < 2 * x & y > -x - 3) | (y > 2 * x & y > -x - 3 & y < ((1 / 3f) * x)
                | (y > (1 / 3f) * x & y < x + 2 & y < -x)
                | (y > -x & y > 2 * x & y < 0.5 * x + 1.5) | (y > 0.5 * x + 1.5 & y < -
                0.5 * x + 2.5 & x > -1) | (x > -1 & Math.pow(x + 1, 2) + Math.pow(y - 3, 2) < 4))) {
            return true;
        }
        return false;
    }

    public static boolean figura_2_gr(int x, int y) {

        if ((y == 3.5 * x - 3 | y == 2 * x | y == -x - 3 | y == 2 * x | y == -x - 3 |
                y == (1 / 3f) * x | y == (1 / 3f) * x | y == x + 2 | y == -x
                | y == -x | y == 2 * x | y == 0.5 * x + 1.5 | y == 0.5 * x + 1.5 | y == -
                0.5 * x + 2.5 | x == -1 | x == -1 | Math.pow(x + 1, 2) + Math.pow(y - 3, 2) == 4)
                & (y >= -3 & y <= 5 & x >= -3 & x <= 2)) {
            return true;
        }
        return false;
    }

    public static void G(int[][] A) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}