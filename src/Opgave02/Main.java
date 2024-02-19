package Opgave02;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalidrom("ABBA"));
        System.out.println(isPalidrom("BanaB"));
        System.out.println(isPalidrom("Benn"));
        System.out.println(isPalidrom("nanen"));
        System.out.println(isPalidrom("B"));
        System.out.println(isPalidrom(""));

    }

    public static boolean isPalidrom(String candidate) {

        return isPalidrom(candidate, 0, candidate.length() - 1);
    }

    private static boolean isPalidrom(String candidate, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (candidate.charAt(start) != candidate.charAt(end)) {
            return false;
        }
        start++;
        end--;
        return isPalidrom(candidate, start, end);
    }
}
