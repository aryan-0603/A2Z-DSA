import java.util.Random;

public class insertion {
    public static void main(String[] args) {
        int n=10;
        int[] arr=new int[n];
        Random ran=new Random();
        System.out.println("Original array:");
        for(int i=0;i<10;i++){
            arr[i]=ran.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i <n; i++) {
            int j=i;
            while( j>0 && arr[j-1]>arr[j]){
                int t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
                j--;
            }
        }
        System.out.println("\nAfter swap:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
