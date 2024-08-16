import java.util.Random;
public class nex_permutation {
    public static void reverseArray(int[] arr,int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] permutation(int[] arr,int n){
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverseArray(arr,0,n-1);
            return arr;
        }
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int t=arr[i];
                arr[i]=arr[index];
                arr[index]=t;
                break;
            }
        }
        reverseArray(arr, index+1, n-1);

        return arr;
    }
    public static void main(String[] args) {
        Random ran=new Random();
        int n=6;
        int[] arr=new int[n];
        System.out.println("Array:\n");
        for (int i = 0; i < n; i++) {
            arr[i]=ran.nextInt(6);
            System.out.print(arr[i]+" ");
        }
        int[] per=permutation(arr,n);
        System.out.println("\nNext permutation:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(per[i]+" ");
        }
    }
}
