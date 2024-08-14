
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class intersection {
    public static ArrayList<Integer> intersectionofSortedArrays(int[] arr1,int[] arr2,int n1,int n2){
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j])
                i++;
            else if(arr1[i]>arr2[j])
                j++;
            else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Random ran = new Random();
        int n1 = ran.nextInt(10) + 1; 
        int n2 = ran.nextInt(10) + 1; 
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            arr1[i] = ran.nextInt(7);
        }
        
        for (int i = 0; i < n2; i++) {
            arr2[i] = ran.nextInt(7);
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println("Array 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println("\nArray 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        ArrayList<Integer> u = intersectionofSortedArrays(arr1, arr2, n1, n2);
        System.out.println("\nIntersection of arrays:");
        for (int val : u) {
            System.out.print(val + " ");
        }
    }
}

