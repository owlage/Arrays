public class NumberNineteen {

    //19. Given a matrix of non-negative numbers. Calculate the sum of the elements in each column. Determine which
    // column contains maximum amount.

    public int sumColumn(int[][] array) {
        int sumMax1 = 0;
        int sumMax2 = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                sumMax1 += array[j][i];
            }
            if (sumMax2 < sumMax1) {
                sumMax2 = sumMax1;
            }
            sumMax1 = 0;
        }

        return sumMax2;
    }

    public int columnMaxSum(int[][] array, int maxSum) {
        int numColumn = 0;
        int sumMax1 = 0;
        int counterColumn = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                sumMax1 += array[j][i];
                if (maxSum == sumMax1) {
                    numColumn = counterColumn;
                }
            }
            counterColumn++;
            sumMax1 = 0;
        }
        return numColumn + 1;
    }

    public static void main(String[] args) {

        NumberNineteen numberNineteen = new NumberNineteen();
        Util.squareArrayLength();
        int[][] array19 = new int[Util.getLine()][Util.getColumn()];
        Util.squareArrayPullRandomInt(array19);
        Util.squareArrayShow(array19);
        System.out.println("Column " + numberNineteen.columnMaxSum(array19, numberNineteen.sumColumn(array19)) +
                " has the largest sum of numbers = " + numberNineteen.sumColumn(array19));

    }
}
