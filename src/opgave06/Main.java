package opgave06;

public class Main {
    public static int flyt(int n) {
        if (n == 1) {
            return 1;
        } else {
            return flyt(n - 1) + 1 + flyt(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(flyt(4));
        System.out.println(flyt(7));
        System.out.println(flyt(23));

    }

}
