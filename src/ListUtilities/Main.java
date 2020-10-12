package ListUtilities;

import ListUtilities.ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 2, 4,6, 7 - 1, -10);

        Integer minValue = ListUtilities.getMin(integers);
        System.out.println(minValue);

        Integer maxValue = ListUtilities.getMax(integers);
        System.out.println(maxValue);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "eho", "Misho", "Ivan", "Gergana");

        String maxString = ListUtilities.getMax(strings);

        System.out.println(maxString);

        String minString = ListUtilities.getMin(strings);
        System.out.println(minString);

    }
}
