import java.util.Random;
public class rotateby1 {
    public static void rotate(int arr[],int n){
        int temp=arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
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
        rotate(arr,n);
        System.out.println("\nAfter rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
