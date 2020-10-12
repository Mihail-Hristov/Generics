package Box;

import Box.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            Box<String> input = new Box<>(scanner.nextLine());
            System.out.println(input.toString());
        }


    }
}
