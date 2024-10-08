public class longest {
    public static int getLongestSubarray(int []a, long k) {
    int left=0,right=0;
    int maxLen=0; 
    int sum=a[0];
    int n=a.length;
    while(right<n){
        while(left<=right && sum>k){
            sum-=a[left];
            left++;
        }
        if(sum==k){
            maxLen=Math.max(maxLen,right-left+1);
        }
        right++;
        if(right<n){
            sum+=a[right];
        }
    }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 3, 1, 1, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
