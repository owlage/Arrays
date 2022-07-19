public class NumberFifteen {

    //15. Form a square matrix of order n according to a given pattern (n is even):

    public void arrays5Matrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - i; j++) {
                array[i][j] = i + 1;
            }
        }
    }


    public static void main(String[] args) {

        NumberFifteen numberFifteen = new NumberFifteen();
        Util.newArrayCubeLength();
        int array15[][] = new int[Util.getCubeArrayLength()][Util.getCubeArrayLength()];
        numberFifteen.arrays5Matrix(array15);
        Util.squareArrayShow(array15);

    }
}
