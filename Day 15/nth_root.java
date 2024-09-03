public class nth_root {
    public static int func(int mid,int n,int m){
        long asn=1;
        for (int i = 1; i <=n; i++) {
            asn*=mid;
            if(asn>m)
                return 2;
        }
        if(asn==m)
            return 1;
        return 0;
    }
    public static int NthRoot(int n,int m){
        int low=1,high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int mid_n=func(mid,n,m);
            if(mid_n==1)
                return mid;
            else if(mid_n==0)
                low=mid+1;
            else 
                high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
}
