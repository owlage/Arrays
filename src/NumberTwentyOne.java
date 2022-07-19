public class NumberTwentyOne {

/*21. Fill a 10x20 matrix with random numbers from 0 to 15. Display the matrix itself and row numbers,
in which the number 5 occurs three or more times.
 */

    static void arraysEleven10X20(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int countNum5 = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 15);
                if (array[i][j] < 10) {
                    System.out.print(" " + array[i][j] + " ");
                    if (array[i][j] == 5) {
                        countNum5++;
                    }
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            if (countNum5 >= 3) {
                System.out.println("Deadline " + (i + 1) + " contains" + " number 5, more than three");
            } else {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        int[][] arrays21 = new int[10][20];
        arraysEleven10X20(arrays21);

    }
}
