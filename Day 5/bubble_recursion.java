import java.util.Random;

public class bubble_recursion {
    public static void bubble_sort(int[] arr,int n){
        if(n==1)
        return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubble_sort(arr,n-1);
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

        bubble_sort(arr,n);

        System.out.println("\nSorted array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
