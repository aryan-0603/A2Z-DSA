public class search_insert_pos {
    public static int searchInsert(int[] arr,int x){
        int n=arr.length;
        int ans=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1; 
            }
            else    
                low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7};
        int x = 6;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }
}