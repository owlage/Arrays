public class NumberThree {

    //3. An array of real numbers is given, the dimension of which is N. Calculate how many negative,
    // positive and zero elements.

    private int positive = 0, negative = 0, zeroElement = 0;

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }

    public int getNegative() {
        return negative;
    }

    public void setNegative(int negative) {
        this.negative = negative;
    }

    public int getZeroElement() {
        return zeroElement;
    }

    public void setZeroElement(int zeroElement) {
        this.zeroElement = zeroElement;
    }

    public int positive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                setPositive(getPositive() + 1);
            }
        }
        return positive;
    }

    public int negative(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                setNegative(getNegative() + 1);
            }
        }
        return negative;
    }

    public int equally(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                setZeroElement(getZeroElement() + 1);
            }
        }
        return zeroElement;
    }

    public static void main(String[] args) {

        NumberThree numberThree = new NumberThree();
        System.out.println("Enter the length of the array");
        int [] array3 = new int [Util.scannerNumber()];
        Util.randomArray100(array3);
        System.out.print("Array: ");
        Util.arrayShow(array3);
        System.out.println("Positive numbers = " + numberThree.positive(array3));
        System.out.println("Negative numbers = " + numberThree.negative(array3));
        System.out.println("Equal zero = " + numberThree.equally(array3));

    }

}
