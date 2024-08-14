//Find the number that appears once, and the other numbers twice

public class single_occ {
    public static int missing(int[] arr) {
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor^=arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,2,4,5,2,4,1,3,2};
        System.out.println(missing(arr))
;    }
}
