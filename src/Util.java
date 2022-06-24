import java.util.Scanner;

public class Util {

    static private int numOne = 0;
    static private double numDoubOne = 0;

    static int scannerNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than zero");
        if (scanner.hasNextInt()) {
            numOne = scanner.nextInt();
            if (numOne < 1) {
                System.out.println("Please enter a number greater than zero");
                scannerNumber();
            }
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerNumber();
        }
        return numOne;
    }

    static double scannerDoubleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        if (scanner.hasNextDouble()) {
            numDoubOne = scanner.nextDouble();
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerDoubleNumber();
        }
        return numDoubOne;
    }

    static void arrayFillIn(int[] array) {
        System.out.println("Array:");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void arrayShow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void randomArray100(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }
    }

    static void randomArray50(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
        }
    }
}
