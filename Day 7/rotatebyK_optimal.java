import java.util.Random;

public class rotatebyK_optimal {
    public static void reverse(int arr[],int start,int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int arr[],int n,int d) {
        d=d%n;                   //for right rotation
        reverse(arr, 0, d-1);    //reverse(nums, 0, n - 1);
        reverse(arr, d, n-1);    //reverse(nums, 0, d - 1);
        reverse(arr, 0, n-1);    //reverse(nums, d, n - 1); 
    }
    public static void main(String args[]){
     int n = 10;
        int[] arr = new int[n];
        Random ran = new Random();
        System.out.println("Original array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = ran.nextInt(40);
            System.out.print(arr[i] + " ");
        }
        int d=ran.nextInt(10);
        rotate(arr,n,d);
        System.out.println("\nAfter rotation by "+d+": ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
