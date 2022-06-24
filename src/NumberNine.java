public class NumberNine {

    //9. In an array of integers with n elements, find the most frequently occurring number.
    // If there are several such numbers, then determine the smallest of them.

    public int getNumber(int[] array) {
        int[] arrayCoincidences = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int z = 0;
            //pass through the array looking for the number of matches and store the data in a new array
            for (int k : array) {
                if (array[i] == k) {
                    arrayCoincidences[i] = z++;
                }
            }
        }
        int numberOfMatches = arrayCoincidences[0];
        int moreCommon = array[0];
        for (int i = 0; i < arrayCoincidences.length; i++) {
            if (arrayCoincidences[i] > numberOfMatches) {  //check for number of matches
                numberOfMatches = arrayCoincidences[i];
                moreCommon = array[i];
            }
            if (arrayCoincidences[i] == numberOfMatches && array[i] < moreCommon) { // finding the minimum number
                moreCommon = array[i];
            }
        }
        return moreCommon;
    }

    public static void main(String[] args) {
        NumberNine numberNine = new NumberNine();
        System.out.println("Enter the length of the array");
        int [] array9 = new int [Util.scannerNumber()];
        Util.randomArray50(array9);
        System.out.print("Array:     ");
        Util.arrayShow(array9);
        System.out.println("The smallest of the most common number: " + numberNine.getNumber(array9));

    }
}
