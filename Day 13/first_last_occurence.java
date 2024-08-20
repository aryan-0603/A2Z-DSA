
import java.util.Arrays;

class first_last_occurence {
    public static int lowerBound(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[]{-1,-1};
        int lb=lowerBound(nums, n, target);
        int ub=upperBound(nums, n, target);
        if(lb==n||nums[lb]!=target){
            return ans;
        }
        ans[0]=lb;
        ans[1]=ub-1;
        return ans;
    }
    public static void main(String args[]) {
        int key = 13;
        int[] v = {3,4,13,13,13,20,40};
        int[] a=searchRange(v,key);
        System.out.println(Arrays.toString(a));
    }
}
