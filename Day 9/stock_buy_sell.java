public class stock_buy_sell {
    public static int maxProfit(int[] arr){
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min, arr[i]);
            max=Math.max(max,arr[i]-min);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }
}
