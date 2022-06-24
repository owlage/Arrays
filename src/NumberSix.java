public class NumberSix {

    //6. Given a sequence of N real numbers. Calculate the sum of numbers,
    // whose serial numbers are prime numbers.

    public int sumOfPrimeNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j <= array[i] / 2; j++) {
                if (array[i] % j == 0) {
                    break;
                } else if (j == array[i] / 2) {
                    sum += array[i];
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        NumberSix numberSix = new NumberSix();
        System.out.println("Enter the length of the array");
        int[] array6 = new int[Util.scannerNumber()];
        Util.randomArray50(array6);
        System.out.print("Array:     ");
        Util.arrayShow(array6);
        System.out.println("Sum of prime numbers = " + numberSix.sumOfPrimeNumbers(array6));
    }
}
