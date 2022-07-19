import java.util.Arrays;

public class NumberTwentyTwo {

    //22. Sort the rows of the matrix in ascending and descending order of element values.

    public void sortArraysLineDescending(int[][] array) {
        System.out.println("Rows in ascending order");
        //create an array with a length equal to the length of the column, we will sort each row in it
        int[] arrayTwo = new int[Util.getColumn()];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTwo[j] = array[i][j];//into a one-dimensional array we write values from a row of a two-dimensional array
                if (j == array[i].length - 1) {
                    Arrays.sort(arrayTwo);
                    for (int k = 0; k < array[i].length; k++) {//rewrite the sorted array into a two-dimensional string
                        array[i][k] = arrayTwo[k];
                        if (array[i][k] < 10) {
                            System.out.print(array[i][k] + "  ");
                        } else {
                            System.out.print(array[i][k] + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }


    public void sortArraysLineAscending(int[][] array) {
        System.out.println("Rows descending");
        int index = 0;
        int[] arrayTwo = new int[Util.getColumn()];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTwo[j] = array[i][j];
                ++index;
                if (j == array[i].length - 1) {
                    Arrays.sort(arrayTwo);
                    for (int k = 0; k < array[i].length; k++) {
                        array[i][k] = arrayTwo[--index];
                        if (array[i][k] < 10) {
                            System.out.print(array[i][k] + "  ");
                        } else {
                            System.out.print(array[i][k] + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        NumberTwentyTwo numberTwentyTwo = new NumberTwentyTwo();
        Util.squareArrayLength();
        int[][] array22 = new int[Util.getLine()][Util.getColumn()];
        Util.squareArrayPullRandomInt(array22);
        Util.squareArrayShow(array22);
        System.out.println();
        numberTwentyTwo.sortArraysLineDescending(array22);
        numberTwentyTwo.sortArraysLineAscending(array22);

    }
}
