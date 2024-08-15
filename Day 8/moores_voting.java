// To find majority element in array (>n/2)

public class moores_voting{
    public static int majority(int[] arr) {
        int count=0,element=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                element=arr[i];
                count=1;
            }
            else if(arr[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 1, 1, 2, 2};
        System.out.println(majority(arr));
    }
}
