import java.util.Random;
public class selection {
    public static void main(String args[]){
        int n=10;
        int[] arr=new int[n];
        Random ran=new Random();
        System.out.println("Original array:");
        for(int i=0;i<10;i++){
            arr[i]=ran.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i <= n-2; i++) {
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;            
        }
        System.out.println("\nAfter swap:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
