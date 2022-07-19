import java.util.Scanner;

public class NumberThirteen {

    //13. Given a matrix. Print the k-th row and p-th column of the matrix.


    private int line,column;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void numberLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a square matrix row:");
        if (sc.hasNextInt()) {
            setLine(sc.nextInt());
            if (getLine() > Util.getLine()) {
                System.out.println("You have exceeded the array!");
                numberLine();
            }
        } else {
            System.out.println("Enter an integer");
            numberLine();
        }
    }

    public void numberColumn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a square matrix column:");
        if (sc.hasNextInt()) {
            setColumn(sc.nextInt());
            if (getColumn() > Util.getColumn()) {
                System.out.println("You have exceeded the array!");
                numberColumn();
            }
        } else {
            System.out.println("Enter an integer");
            numberColumn();
        }
    }

    public void arrayLineAndColumn(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == getLine() - 1 | j == getColumn() - 1) {
                    if (a[i][j] < 10) {
                        System.out.print(a[i][j] + "  ");
                    } else {
                        System.out.print(a[i][j] + " ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberThirteen numberThirteen = new NumberThirteen();
        Util.squareArrayLength();
        int[][] array13 = new int[Util.getLine()][Util.getColumn()];
        Util.squareArrayPullRandomInt(array13);
        Util.squareArrayShow(array13);
        numberThirteen.numberLine();
        numberThirteen.numberColumn();
        numberThirteen.arrayLineAndColumn(array13);
    }
}
