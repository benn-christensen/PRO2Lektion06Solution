package Opgave05;

public class Main {
    public static void main(String[] args) {
        System.out.print("   ");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("-----------------------------");
        for (int n = 0; n < 8; n++) {
            System.out.print(n + " |");
            for (int m = 0; m <= n; m++) {
                System.out.printf("%3d", binomial(n, m));
            }
            System.out.println();
        }
    }

    public static int binomial(int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        }
        return binomial(n - 1, m) + binomial(n - 1, m - 1);
    }
}
