public class smallest_divisor {
    public static int findMax(int [] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static int sumbyd(int[] arr,int div){
        int sum=0;
        for (int idx = 0; idx < arr.length; idx++) {
            sum+=Math.ceil((double)arr[idx]/(double)div);
        }
        return sum;
    }
    public static int smallestDivisor(int[] arr,int limit){
        int n=arr.length;
        if(n>limit)
            return -1;
        int low=1,high=findMax(arr);
        while(low<=high){
            int mid=((low+high)/2);
            if(sumbyd(arr, mid)<=limit)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
