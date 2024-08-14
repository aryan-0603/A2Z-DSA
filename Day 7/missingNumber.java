public class missing {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++){
          xor2=xor2^nums[i];
          xor1=xor1^(i+1);
        }  
        xor1=xor1^(n+1);
        return (xor1^xor2);
      }
      public static void main(String[] args) {
          int[] arr={1,2,3,5,6,7,8};
          System.out.println(missingNumber(arr));
      }
}
