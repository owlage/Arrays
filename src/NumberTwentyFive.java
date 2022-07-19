public class NumberTwentyFive {

    //25. Find the largest element of the matrix and replace all odd elements with it.

    private int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    //search for the max number in the matrix
    public void maxDefine(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                if (array[j][k] > max) {//
                    max = array[j][k];
                }
            }
        }
        System.out.println("Max number in array = " + max);
    }

    // check for an odd number
    public void maxInsteadNotEven(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }
    }

    public static void main(String[] args) {

        NumberTwentyFive numberTwentyFive = new NumberTwentyFive();
        Util.squareArrayLength();
        int[][] array25 = new int[Util.getLine()][Util.getColumn()];
        Util.squareArrayPullRandomInt(array25);
        Util.squareArrayShow(array25);
        numberTwentyFive.maxDefine(array25);
        numberTwentyFive.maxInsteadNotEven(array25);
        Util.squareArrayShow(array25);

    }
}
