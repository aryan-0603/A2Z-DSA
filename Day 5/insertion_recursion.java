import java.util.*;

public class insertion_recursion {
    static void insertion_sort(int[] arr, int i, int n) {
        
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort(arr, i + 1, n);

    }
    public static void main(String args[]) {
        int n = 10;
        int[] arr = new int[n];
        Random ran = new Random();
        System.out.println("Original array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = ran.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        insertion_sort(arr, 0, n);
        System.out.println("\nAfter insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
