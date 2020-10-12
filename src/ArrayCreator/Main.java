package ArrayCreator;

import ArrayCreator.ArrayCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = ArrayCreator.create(6, "Misho");
        Integer[] arr2 = ArrayCreator.create(7, 4);

        for (Integer temp : arr2) {
            System.out.println(temp);
        }

        for (String item : arr) {
            System.out.println(item);
        }

        for (Integer element : ArrayCreator.create(Integer.class, 9, 10)){
            System.out.println(element);
        }

        System.out.println();
    }
}
