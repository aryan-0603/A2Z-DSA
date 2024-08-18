import java.util.ArrayList;
import java.util.List;

public class majority_n_by_3 {
    public static List<Integer> majorityElement(int [] arr){
        int c1=0,c2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(c1==0 && el2!=arr[i]){
                c1=1;
                el1=arr[i];
            }
            else if(c2==0 && el1!=arr[i]){
                c2=1;
                el2=arr[i];
            }
            else if(arr[i]==el1)
                c1++;
            else if(arr[i]==el2)
                c2++;
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==el1)
                c1++;
            if(arr[i]==el2)
                c2++;
        }
        int min=(int)(n/3)+1;
        if(c1>=min)
            ans.add(el1);
        if(c2>=min)
            ans.add(el2);
        return ans;
}
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
