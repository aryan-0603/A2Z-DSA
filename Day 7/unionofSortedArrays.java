import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class union {
    public static ArrayList<Integer> unionofSortedArrays(int[] arr1, int[] arr2, int n1, int n2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // Process remaining elements of arr1
        while (i < n1) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Process remaining elements of arr2
        while (j < n2) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        int n1 = ran.nextInt(10) + 1; 
        int n2 = ran.nextInt(10) + 1; 
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            arr1[i] = ran.nextInt(7);
        }
        
        for (int i = 0; i < n2; i++) {
            arr2[i] = ran.nextInt(7);
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println("Array 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println("\nArray 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        ArrayList<Integer> u = unionofSortedArrays(arr1, arr2, n1, n2);
        System.out.println("\nUnion of arrays:");
        for (int val : u) {
            System.out.print(val + " ");
        }
    }
}
