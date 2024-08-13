import java.util.Random;

public class rotatebyK {
    public static void rotate(int[] arr, int n, int d) {
        int[] temp=new int[d];
        System.arraycopy(arr, 0, temp, 0, d);
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
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