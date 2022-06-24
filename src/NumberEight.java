public class NumberEight {

    //8. Given a sequence of integers a1 ,a2 ,..., an. Form a new sequence
    // removing from the original those members that are equal to min(a1 ,a2 ,..., an).

    //search for the minimum element of the array
    public int minNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //how many elements in the array equal to the minimum element, create a new array
    public int woundedMin(int[] array) {
        int counter = 0; //
        int min = minNumber(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                counter++;
            }
        }
        return counter;
    }

    //create a new array from the old one that did not contain equal mins to the element
    public void fillInNewArray(int[] arrayFull, int[] newArray, int min) {
        int j = 0;
        for (int i = 0; i < arrayFull.length; i++) {
            if (arrayFull[i] != min) {
                newArray[j++] = arrayFull[i];
            }
        }
    }

    public static void main(String[] args) {
        NumberEight numberEight = new NumberEight();
        System.out.println("Enter the length of the array");
        int [] array8 = new int [Util.scannerNumber()];
        Util.randomArray50(array8);
        System.out.print("Array:     ");
        Util.arrayShow(array8);
        int [] newArray = new int[array8.length - numberEight.woundedMin(array8)];
        numberEight.fillInNewArray(array8, newArray, numberEight.minNumber(array8));
        System.out.println("Min number = " + numberEight.minNumber(array8));
        System.out.print("New array: ");
        Util.arrayShow(newArray);
    }
}
