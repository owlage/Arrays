public class NumberTwenty {


//20. Find the positive elements of the main diagonal of a square matrix.

    public void minusArraysPull(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
    }

    public void arraysShowTen(int[][] array) {
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 0) {
                    if (array[i][j] < 10) {
                        System.out.print("  " + array[i][j] + "  ");
                    } else {
                        System.out.print(" " + array[i][j] + "  ");
                    }
                }
                if (array[i][j] < 0) {
                    if (array[i][j] > -10) {
                        System.out.print(" " + array[i][j] + "  ");
                    } else {
                        System.out.print(array[i][j] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void diagonalArraysPlus(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 0 && i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        NumberTwenty numberTwenty = new NumberTwenty();
        Util.squareArrayLength();
        int[][] array20 = new int[Util.getColumn()][Util.getLine()];
        numberTwenty.minusArraysPull(array20);
        numberTwenty.arraysShowTen(array20);
        System.out.println("positive elements of the main diagonal:");
        numberTwenty.diagonalArraysPlus(array20);

    }
}
