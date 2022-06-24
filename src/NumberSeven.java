public class NumberSeven {

    //7. Real numbers a1 ,a2 ,..., an are given. Find: max(a1 + a2, a2 + a2n-1, ... , an + an+1)

    public int max(int[] array) {
        int max = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > max) {
                max = array[i] + array[array.length - i - 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        NumberSeven numberSeven = new NumberSeven();
        System.out.println("Enter the length of the array");
        int[] array7 = new int[Util.scannerNumber()];
        Util.randomArray50(array7);
        System.out.print("Array:     ");
        Util.arrayShow(array7);
        System.out.print("Max = " + numberSeven.max(array7));


    }
}
