public class min_in_rotated {
    public static int findMin(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                min=Math.min(min,arr[low]);
                break;
            }
            if(arr[low]<=arr[mid]){
                min=Math.min(min,arr[low]);
                low=mid+1;
            }
            else if(arr[mid]<=arr[high]){
                min=Math.min(min,arr[low]);
                high=mid-1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }
}
