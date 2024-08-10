import java.util.Arrays;
import java.util.Random;
public class duplicates {
    public static int dup(int[] arr,int n){
        int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[j]!=arr[i]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        return j;
    }
        public static void main(String args[]) {
        int n = 10;
        int[] arr = new int[n];
        Random ran = new Random();
        System.out.println("Original array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = ran.nextInt(6);
            Arrays.sort(arr);
            System.out.print(arr[i] + " ");
        }
        int a=dup(arr, n);
        System.out.println("Unique elements:"+a);
    }
}
