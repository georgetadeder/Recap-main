package algorithms;


import java.util.Arrays;

public class BubbleSort {
    static  void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2, 9, 3, 10};
        System.out.println("Original array: " + Arrays.toString(array));

        for(int i=0; i < array.length; i++){

        }
        System.out.println();
        bubbleSort(array);
        System.out.println("Array After Bubble Sort:");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
