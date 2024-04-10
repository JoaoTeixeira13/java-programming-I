import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = { 3, 1, 5, 99, 3, 12 };
        // int smallest = smallest(array);
        // int indexOfSmallest = indexOfSmallest(array);
        // System.out.println("smallest number " + smallest + " located at index " +
        // indexOfSmallest);

        // int[] numbers = { -1, 6, 9, 8, 12 };
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        // int[] numbers = { 3, 2, 5, 4, 8 };

        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 1, 0);
        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 0, 3);
        // System.out.println(Arrays.toString(numbers));

        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfsmallest = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfsmallest = i;
            }
        }

        return indexOfsmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startingIndex) {
        int indexOfsmallest = startingIndex;
        int smallest = table[startingIndex];

        for (int i = startingIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfsmallest = i;
            }
        }

        return indexOfsmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int container = array[index1];
        array[index1] = array[index2];
        array[index2] = container;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, indexOfSmallest, i);
        }
    }

}
