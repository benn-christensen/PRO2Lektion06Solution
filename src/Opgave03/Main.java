package Opgave03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> sortedInts = new ArrayList<>(List.of(-13, 0, 4, 12, 209, 10001, 10002, 33300, 1010010));
        System.out.println(contains(sortedInts, 42));
        System.out.println(contains(sortedInts, 33300));
    }

    private static boolean contains(ArrayList<Integer> sortedInts, int searchElement) {
        return contains(sortedInts, searchElement, 0, sortedInts.size() - 1);
    }

    private static boolean contains(ArrayList<Integer> sortedInts, int searchElement, int start, int end) {
        if (start >= end) {
            return false;
        }
        int midPoint = start + (end - start) / 2;
        if (sortedInts.get(midPoint) == searchElement) {
            return true;
        } else if (sortedInts.get(midPoint) < searchElement){
            return contains(sortedInts, searchElement, midPoint + 1, end);
        } else {

            return contains(sortedInts, searchElement, start, midPoint - 1);
        }
    }
}
