public class sqrt {
    public static int floorSqrt(int n){
        long low=1,high=n;
        while(low<=high){
            long mid=(low+high)/2;
            long value=mid*mid;
            if(value<=(long)n)
                low=mid+1;
            else
                high=mid-1;
        }
        return (int)high;
    }
    public static void main(String[] args) {
        int n = 288;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
