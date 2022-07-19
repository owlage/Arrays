public class NumberTwentyThree {

    //23. Sort the columns of the matrix in ascending and descending order of element values.

    public void sortArraysColumnAscending(int[][] array) {
        System.out.println("Ascending: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    if (array[j - 1][k] >= array[j][k]) {
                        int q = array[j - 1][k];
                        array[j - 1][k] = array[j][k];
                        array[j][k] = q;
                    }
                }
            }
        }
        Util.squareArrayShow(array);
    }

    public void sortArraysColumnDescending(int [][] array){
        System.out.println("Descending:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    if (array[j - 1][k] <= array[j][k]) {
                        int q = array[j - 1][k];
                        array[j - 1][k] = array[j][k];
                        array[j][k] = q;
                    }
                }
            }
        }
        Util.squareArrayShow(array);
    }

    public static void main(String[] args) {

        NumberTwentyThree numberTwentyThree = new NumberTwentyThree();
        Util.squareArrayLength();
        int[][] array23 = new int[Util.getLine()][Util.getColumn()];
        Util.squareArrayPullRandomInt(array23);
        Util.squareArrayShow(array23);
        System.out.println();
        numberTwentyThree.sortArraysColumnDescending(array23);
        numberTwentyThree.sortArraysColumnAscending(array23);

    }
}
