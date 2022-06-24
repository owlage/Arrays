public class NumberFive {

    //5. Integers a1 ,a2 ,...,an are given. Print only those numbers for which ai > i.

    public void inputAI(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        NumberFive numberFive = new NumberFive();
        System.out.println("Enter the length of the array");
        int [] array5 = new int [Util.scannerNumber()];
        Util.randomArray50(array5);
        System.out.print("Array:     ");
        Util.arrayShow(array5);
        System.out.print("a[i] > i : ");
        numberFive.inputAI(array5);

    }
}
