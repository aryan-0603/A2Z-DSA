//search element in rotated sorted array with duplicate elements

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class rotated_array_2 {
    public static boolean search(ArrayList<Integer> arr, int k){
        int n=arr.size();
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(mid)==k){
                return true;
            }
            if(Objects.equals(arr.get(low), arr.get(mid)) && Objects.equals(arr.get(mid), arr.get(high))){
                low=low+1;
                high=high-1;
                continue;
            }
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=k && k<=arr.get(mid))
                    high=mid-1;
                else
                    low=mid+1;
            }
            else{
                if(arr.get(mid)<=k && k<=arr.get(high))
                    low=mid+1;
                else
                    high=mid-1;
            }
    }
    return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>(Arrays.asList(7, 8, 1, 2, 3, 3, 3, 4, 5, 6));
        int k = 10;
        boolean ans = search(arr, k);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
