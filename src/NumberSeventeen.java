import java.text.DecimalFormat;

public class NumberSeventeen {

    //17. Form a square matrix of order N according to the rule:

    public int matrixForm(double[][] array) {
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                array[i][j] = Math.sin((i * i - j * j) / Util.getCubeArrayLength());
                if (array[i][j] > 0.0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public void showDoubleArray(double[][] array) {
        DecimalFormat dF = new DecimalFormat("#.##");
        for (double[] doubles : array) {
            for (double aDouble : doubles) {
                if (aDouble < 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
                System.out.format("%.2f", aDouble);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        NumberSeventeen numberSeventeen = new NumberSeventeen();
        Util.newArrayCubeLength();
        double[][] array17 = new double[Util.getCubeArrayLength()][Util.getCubeArrayLength()];
        System.out.println("Number of positive elements: " + numberSeventeen.matrixForm(array17));
        numberSeventeen.showDoubleArray(array17);


    }
}
