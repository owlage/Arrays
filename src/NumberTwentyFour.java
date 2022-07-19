public class NumberTwentyFour {

/*24. Form a random matrix m x n, consisting of zeros and ones,
moreover, in each column, the number of ones is equal to the number of the column.
 */

    static void zeroAndOne(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) { //find the diagonal of the matrix and fill in the string "1" from it
                    for (int k = j; k < array[i].length; k++) {
                        array[i][k] = 1;
                        System.out.print(array[i][k] + " ");
                    }
                    // if you remove the line, the array overflows, I don't quite understand why this happens
                    //but this line solves the problem
                    j = array[i].length;
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Util.squareArrayLength();
        int[][] array24 = new int[Util.getLine()][Util.getColumn()];
        zeroAndOne(array24);

    }
}
