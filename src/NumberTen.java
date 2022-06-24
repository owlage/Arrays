public class NumberTen {

    //10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
    // (освободившиеся элементы заполнить нулями).

    private int[] arrayDivided;
    private int[] arrayZero;

    public int[] getArrayDivided() {
        return arrayDivided;
    }

    public void setArrayDivided(int[] arrayDivided) {
        this.arrayDivided = arrayDivided;
    }

    public int[] getArrayZero() {
        return arrayZero;
    }

    public void setArrayZero(int[] arrayZero) {
        this.arrayZero = arrayZero;
    }

    public void newArray(int[] arr) {
        if (arr.length % 2 == 0) {
            setArrayDivided(new int[arr.length / 2]);
        } else {
            setArrayDivided(new int[arr.length / 2 + 1]);
        }
    }

    //fill the new array skipping every second element from the given array
    public void fillingANewArray(int[] arr) {
        int j = 0;
        for (int i = 0; i <= getArrayDivided().length - 1; i++) {
            getArrayDivided()[i] = arr[j];
            j += 2;
        }
    }

    //free elements are filled with zeros
    public void zeroPadding(int[] arr) {
        setArrayZero(new int[arr.length]);
        for (int i = 0; i < getArrayZero().length; i += 2) {
            getArrayZero()[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        NumberTen numberTen = new NumberTen();
        System.out.println("Enter the length of the array");
        int[] array10 = new int[Util.scannerNumber()];
        Util.randomArray50(array10);
        System.out.print("Array:     ");
        Util.arrayShow(array10);
        numberTen.newArray(array10);
        System.out.println("An array without every second element of the original array: ");
        numberTen.fillingANewArray(array10);
        Util.arrayShow(numberTen.arrayDivided);
        System.out.println("New array:");
        numberTen.zeroPadding(array10);
        Util.arrayShow(numberTen.arrayZero);
    }

}
