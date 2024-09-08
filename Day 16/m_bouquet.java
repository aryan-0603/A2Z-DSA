public class m_bouquet {
    public static boolean possible(int[] arr,int day,int m,int k){
        int n=arr.length;
        int count=0,no_of_b=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day)
                count++;
            else{
                no_of_b+=(count/k);
                count=0;
            }
        }
        no_of_b+=(count/k);
        return (no_of_b>=m);
    }
    public static int roseGarden(int[] arr,int k, int m){
        long val=(long)k*m;
        if(val>arr.length)
            return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int idx = 0; idx < arr.length; idx++) {
            min=Math.min(min,arr[idx]);
            max=Math.max(max,arr[idx]);            
        }
        int low=min,high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr, mid, m, k))
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}
