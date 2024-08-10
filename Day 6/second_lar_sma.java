import java.util.Random;

public class second {
    public static void second_lar_sma(int[] arr, int n){
        int largest=Integer.MIN_VALUE;
        int sec_largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int sec_smallest=Integer.MAX_VALUE;     
        for(int i=0;i<n;i++){
            smallest=Math.min(smallest, arr[i]);
            largest=Math.max(largest, arr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]<sec_smallest && arr[i]!=smallest)
                sec_smallest=arr[i];
            if(arr[i]>sec_largest && arr[i]!=largest)
                sec_largest=arr[i];
        }
        System.out.println("\nSecond largest:"+sec_largest);
        System.out.println("Second smallest:"+sec_smallest);
    }
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        Random ran = new Random();
        System.out.println("Array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = ran.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        second_lar_sma(arr, n);
    }
}
