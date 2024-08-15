// To sort array or such data structure with three elements randomly re-occuring

import java.util.Arrays;

public class dutch_national_flag {
    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) { 
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid); 
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high); 
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 2, 0, 2, 1, 1, 0, 2, 1, 0, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
