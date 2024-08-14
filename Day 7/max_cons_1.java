public class max_cons_1 {
    public static int count(int[] arr){
        int c=0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                c++;
            else
                c=0;
            max=Math.max(max, c);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(count(arr));
    }
}
