import java.util.Random;
public class bubble {
    public static void main(String[] args) {
        int n=10;
        int[] arr=new int[n];
        Random ran=new Random();
        System.out.println("Original array:");
        for(int i=0;i<10;i++){
            arr[i]=ran.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        for (int i = n-1; i>=1; i--) {
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("\nAfter swap:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
