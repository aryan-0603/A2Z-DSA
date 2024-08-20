public class binary_search_iterative {
    public static int binarySearch(int [] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(x==arr[mid])
                return mid;
            else if(x>arr[mid])
                low=mid+1;
            else 
                high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}
