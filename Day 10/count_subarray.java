
import java.util.HashMap;
import java.util.Map;

public class count_subarray {
    public static int findAllSubarraysWithGivenSum(int[] arr,int k){
        Map<Integer,Integer> ans=new HashMap<>();
        int preSum=0;
        int count=0;
        ans.put(0,1);
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            int remove=preSum-k;
            count+=ans.getOrDefault(remove,0);
            ans.put(preSum,ans.getOrDefault(preSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
