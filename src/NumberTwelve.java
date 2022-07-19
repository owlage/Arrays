public class NumberTwelve {

    //12. Given a square matrix. Display the elements that are on the diagonal.

    public void diagonal(int[][] array) {
        int x = array.length - 1; // last element of the string, in "x" for convenience
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == x) {
                    if (array[i][j] < 10) {
                        System.out.print(array[i][j] + "  ");
                    } else {
                        System.out.print(array[i][j] + " ");
                    }
                } else {
                    System.out.print("   ");
                }

            }
            x--;
            System.out.println();

        }
    }

    public static void main(String[] args) {

        NumberTwelve numberTwelve = new NumberTwelve();
        Util.squareArrayLength();
        int[][] array12 = new int[Util.getLine()][Util.getColumn()];
        Util.squareArrayPullRandomInt(array12);
        Util.squareArrayShow(array12);
        numberTwelve.diagonal(array12);

    }
}
