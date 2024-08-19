public class max_product_subarray {
    public static int maxProductSubArray(int[] arr){
        int n=arr.length;
        int pre=1;int suff=1;
        long ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0)
                pre=1;
            if(suff==0)
                suff=1;
            pre*=arr[i];
            suff*=arr[n-i-1];
            ans=(int)Math.max(ans,Math.max(pre,suff));
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }
}
