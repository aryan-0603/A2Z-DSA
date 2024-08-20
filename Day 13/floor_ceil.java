public class floor_ceil {
    public static int floor(int[] arr,int x){
        int n=arr.length;
        int ans=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;
            }
            else    
            high=mid-1;
        }
        return ans;
    }
    public static int ceil(int[] arr,int x){
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
        int c = ceil(arr, x);
        int f = floor(arr, x);
        System.out.println("The floor and ceil are "+arr[f]+" & "+arr[c]+" respectively.");
    }
}
