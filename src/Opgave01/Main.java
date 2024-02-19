package Opgave01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myInts = new ArrayList<>(List.of());
        System.out.println(numberOfEvenNumbers(myInts));
    }

    public static int numberOfEvenNumbers(ArrayList<Integer> listOfInts) {
        return numberOfEvenNumbers(listOfInts, 0);
    }

    private static int numberOfEvenNumbers(ArrayList<Integer> listOfInts, int index) {
        if (index == listOfInts.size()) {
            return 0;
        }
        if (listOfInts.get(index) % 2 == 0) {
            index++;
            return 1 + numberOfEvenNumbers(listOfInts, index);
        } else {
            index++;
            return 0 + numberOfEvenNumbers(listOfInts, index);
        }
    }
}

