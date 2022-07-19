import java.util.Scanner;

public class NumberEighteen {

    //18. In a numerical matrix, swap two columns of any columns, i.e. put all elements of one column on
    // the corresponding positions of the other, and move its elements of the second to the first. Column numbers enters
    // user from the keyboard.

    private int numOneColumn, numTwoColumn;

    public int getNumOneColumn() {
        return numOneColumn;
    }

    public void setNumOneColumn(int numOneColumn) {
        this.numOneColumn = numOneColumn;
    }

    public int getNumTwoColumn() {
        return numTwoColumn;
    }

    public void setNumTwoColumn(int numTwoColumn) {
        this.numTwoColumn = numTwoColumn;
    }

    public void numberColumns() {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        System.out.println("Select column 1");
        if (sc.hasNextInt()) {
            numOneColumn = sc.nextInt();
            System.out.println("Select column 2");
            numTwoColumn = sc.nextInt();
            while (bool) {
                if (numOneColumn > Util.getColumn()|| numOneColumn == 0 || numTwoColumn > Util.getColumn()
                        || numTwoColumn == 0 || numOneColumn == numTwoColumn) {
                    numberColumns();
                } else {
                    bool = false;
                }
            }
        } else {
            System.out.println("Enter an integer");
            numberColumns();
        }
    }

    public void swapColumn(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == numOneColumn - 1) {
                    int q = array[i][numOneColumn - 1];
                    array[i][numOneColumn - 1] = array[i][numTwoColumn - 1];
                    array[i][numTwoColumn - 1] = q;
                }
            }
        }
    }

    public static void main(String[] args) {

        NumberEighteen numberEighteen = new NumberEighteen();
        Util.squareArrayLength();
        int[][] array18 = new int[Util.getLine()][Util.getColumn()];
        Util.squareArrayPullRandomInt(array18);
        Util.squareArrayShow(array18);
        numberEighteen.numberColumns();
        numberEighteen.swapColumn(array18);
        Util.squareArrayShow(array18);

    }
}
