public class NumberSixteen {

    //16. Form a square matrix of order n according to the given pattern (n is even):

    public void newArray16(int[][] array) {
        int b = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j && j <= array.length - i || i >= j && j >= array.length - i - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {

        NumberSixteen numberSixteen = new NumberSixteen();
        Util.newArrayCubeLength();
        int[][] array16 = new int[Util.getCubeArrayLength()][Util.getCubeArrayLength()];
        numberSixteen.newArray16(array16);
        Util.squareArrayShow(array16);

    }
}
