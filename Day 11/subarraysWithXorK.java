import java.util.HashMap;

public class subarray_with_XORK {
    public static int subarraysWithXorK(int[] arr,int k){
        int n=arr.length;
        int xr=0;
        int count=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        hash.put(xr,1);
        for(int i=0;i<n;i++){
            xr^=arr[i];
            int x=xr^k;
            if(hash.containsKey(x)){
                count+=hash.get(x);
            }
            if(hash.containsKey(xr)){
                hash.put(xr,hash.get(xr)+1);
            }
            else
                hash.put(xr,1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
