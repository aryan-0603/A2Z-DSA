import java.util.Random;

public class quick {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partitionPoint(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    public static int partitionPoint(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Move i to the right until an element greater than the pivot is found
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            // Move j to the left until an element less than or equal to the pivot is found
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                // Swap elements at i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot with the element at j
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
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

        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
