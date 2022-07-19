import java.util.Scanner;

public class NumberFourteen {

    //14.Generate a square matrix of order n according to a given pattern (n is even):

    public void newArrayCube(int[][] array) {
        int k = 1;
        int y = Util.getCubeArrayLength();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = k;
                    k++;
                }
                k = 1;
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = y;
                    y--;
                }
                y = Util.getCubeArrayLength();
            }
        }
    }


    public void arraysShow(int[][] array) {
        for (int[] doubles : array) {
            for (int aDouble : doubles) {
                System.out.print(aDouble + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] argv) {

        NumberFourteen numberFourteen = new NumberFourteen();
        Util.newArrayCubeLength();
        int[][] array14 = new int[Util.getCubeArrayLength()][Util.getCubeArrayLength()];
        numberFourteen.newArrayCube(array14);
        numberFourteen.arraysShow(array14);


    }

}
