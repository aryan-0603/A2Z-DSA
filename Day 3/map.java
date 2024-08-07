import java.util.*;
class map{
    public static void main (String[] args){
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        Frequency(arr, n);
    }
    static void Frequency(int[] arr, int n){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int count=entry.getValue();
            int element=entry.getKey();
            if(count>maxFreq){
                maxEle=element;
                maxFreq=count;
            }
            if(count<minFreq){
                minEle=element;
                minFreq=count;
            }
        }        
        System.out.println("Highest frequency "+maxEle);
        System.out.println("Lowest frequency "+minEle);
    }
}