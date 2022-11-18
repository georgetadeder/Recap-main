package algorithms;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 2, 8, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate element is: " + arr[i]);
                }
            }

        }
    }
}
