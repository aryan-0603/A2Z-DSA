import java.util.ArrayList;
import java.util.Random;
public class merge {
    public static void mergeArray(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
            while(left<=mid){
                temp.add(arr[left]);
                left++;
            }
            while(right<=high){
                temp.add(arr[right]);
                right++;
            }
            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
        }    
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high)
        return ;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        mergeArray(arr, low, mid, high);
    }
    public static void main(String args[]){
        int n=10;
        int[] arr=new int[n];
        Random ran=new Random();
        System.out.println("Original array:");
        for(int i=0;i<10;i++){
            arr[i]=ran.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        merge.mergeSort(arr,0,n-1);
        System.out.println("\nAfter swap:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
