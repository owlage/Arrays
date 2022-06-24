public class NumberTwo {

// 2.Given a sequence of real numbers a1 ,a2 ,..., an. Replace all its terms greater than the given Z,
// this number. Count the number of replacements.

    private int z,numberOfOperations;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int sumMethod(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > getZ()) {
                array[i] = getZ();
                numberOfOperations++;
            }
        }
       return numberOfOperations;
    }

    public static void main(String[] args) {
        NumberTwo numberTwo = new NumberTwo();
        System.out.println("Enter the length of the array");
        int[] array2 = new int[Util.scannerNumber()];
        numberTwo.setZ(Util.scannerNumber());
        System.out.print("Array: ");
        Util.arrayFillIn(array2);
        System.out.print("Number of operations: ");
        System.out.println(numberTwo.sumMethod(array2));
        Util.arrayShow(array2);

    }
}
