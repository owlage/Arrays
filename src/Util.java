import java.util.Scanner;

public class Util {

    static private int numOne = 0, line, column, cubeArrayLength;
    static private double numDoubOne = 0;

    public static int getLine() {
        return line;
    }

    public static void setLine(int line) {
        Util.line = line;
    }

    public static int getColumn() {
        return column;
    }

    public static void setColumn(int column) {
        Util.column = column;
    }

    public static int getCubeArrayLength() {
        return cubeArrayLength;
    }

    public static void setCubeArrayLength(int cubeArrayLength) {
        Util.cubeArrayLength = cubeArrayLength;
    }


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
        for (int aArray : array) {
            System.out.print(aArray + " ");
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

    static void squareArrayShow(int[][] arr) {
        System.out.println("Array:");
        for (int[] array : arr) {
            for (int aInt : array) {
                if (aInt < 10) {
                    System.out.print(aInt + "  ");
                } else {
                    System.out.print(aInt + " ");
                }
            }
            System.out.println();
        }
    }

    static void newArrayCubeLength() {
        System.out.println("Enter a number to create an array:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            cubeArrayLength = sc.nextInt();
            if (cubeArrayLength % 2 != 0) {
                newArrayCubeLength();
                if (cubeArrayLength < 2) {
                    newArrayCubeLength();
                }
            }
        } else {
            System.out.println("Enter the number");
            newArrayCubeLength();
        }
    }

    static void squareArrayLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines in the array:");
        if (sc.hasNextInt()) {
            setLine(sc.nextInt());
            System.out.println("Enter the number of array columns:");
            if (sc.hasNextInt()) {
                setColumn(sc.nextInt());
            }
        } else {
            System.out.println("Enter an integer");
            squareArrayLength();
        }
        if (line < 1 || column < 1) {
            System.out.println("The number of rows and columns cannot be less than 1");
            squareArrayLength();
        }
    }

    static void squareArrayPullRandomInt(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 99 + 1);
            }
        }

    }
}
