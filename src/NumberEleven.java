public class NumberEleven {

    //11. Given a matrix. Display all odd columns whose first element is greater than the last.

    public void columnSearch(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 != 0) { //search for odd columns
                    if (array[0][j] > array[array.length - 1][j]) {//comparison of the 1st and last number in the column
                        if (array[i][j] < 10) {//for the beauty of the output, put a space instead of numbers
                            System.out.print(array[i][j] + "  ");
                        } else {
                            System.out.print(array[i][j] + " ");
                        }
                    } else {
                        System.out.print("   ");
                    }
                }
                if (j % 2 == 0) {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        NumberEleven numberEleven = new NumberEleven();
        Util.squareArrayLength();
        int[][] array11 = new int[Util.getLine()][Util.getColumn()];
        Util.squareArrayPullRandomInt(array11);
        Util.squareArrayShow(array11);
        System.out.println("All odd columns whose first element is greater than the last.");
        numberEleven.columnSearch(array11);

    }
}
