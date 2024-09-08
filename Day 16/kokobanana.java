public class kokobanana {
    public static int findMax(int [] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int calcHours(int [] arr, int h){
        int hour=0;
        for (int i = 0; i < arr.length; i++) {
            hour+=Math.ceil((double)arr[i]/(double)h);    
        }
        return hour;
    }
    public static int minimumRateToEatBananas(int [] arr,int h){
        int low=1,high=findMax(arr);
        while(low<=high){
            int mid=(low+high)/2;
            int min_hour=calcHours(arr, mid);
            if(min_hour<=h)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
