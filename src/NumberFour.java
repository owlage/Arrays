public class NumberFour {

    //4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

    private int numMax = 0, numMin;

    public int getNumMax() {
        return numMax;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public int getNumMin() {
        return numMin;
    }

    public void setNumMin(int numMin) {
        this.numMin = numMin;
    }


    public void maxAndMin(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] >= getNumMax()) {
                setNumMax(array[i]);
            }
            if (array[i] <= getNumMin()) {
                setNumMin(array[i]);
            }
        }
    }

    public void swap(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == getNumMax()) {
                array[i] = getNumMin();
            } else if(array[i] == getNumMin()){
                array[i] = getNumMax();
            }
        }
    }

    public static void main(String[] args) {
        NumberFour numberFour = new NumberFour();
        System.out.println("Enter the length of the array");
        int [] array4 = new int [Util.scannerNumber()];
        Util.randomArray100(array4);
        System.out.print("Array:     ");
        Util.arrayShow(array4);
        numberFour.maxAndMin(array4);
        numberFour.swap(array4);
        System.out.print("New array: ");
        Util.arrayShow(array4);
        System.out.println("Number max: " + numberFour.getNumMax());
        System.out.print("Number min: " + numberFour.getNumMin());



    }
}

