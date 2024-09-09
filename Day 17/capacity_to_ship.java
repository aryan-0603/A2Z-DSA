public class capacity_to_ship {
    private static int leastdays(int[] arr, int cap) {
        int days=1,load=0;
        for (int i = 0; i < arr.length; i++) {
            if(load+arr[i]>cap){
                days+=1;
                load=arr[i];
            }            
            else
                load+=arr[i];
        }
        return days;
    }
    public static int leastWeightCapacity(int[] arr,int cap){
        int low=Integer.MIN_VALUE,high=0;
        for (int idx = 0; idx < arr.length; idx++) {
            high+=arr[idx];
            low=Math.max(low,arr[idx]);   
        }
        while(low<=high){
            int mid=(low+high)/2;
            int days=leastdays(arr,mid);
            if(days<=cap)
                high=mid-1;
            else   
                low=mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
