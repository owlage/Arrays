public class NumberOne {

    //1.The array A [N] contains natural numbers. Find the sum of those elements that are multiples of a given K.

    private int multiple;

    public int getMultiple() {
        return multiple;
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public int multiplicity(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % getMultiple() == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberOne numberOne = new NumberOne();
        System.out.println("Enter the length of the array");
        int[] array = new int[Util.scannerNumber()];
        System.out.println("Enter a multiple");
        numberOne.setMultiple(Util.scannerNumber());
        System.out.print("Array: ");
        Util.arrayFillIn(array);
        System.out.print("Sum of elements = ");
        System.out.println(numberOne.multiplicity(array));


    }
}
