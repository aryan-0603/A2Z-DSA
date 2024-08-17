//Print the n-th row of Pascal’s triangle.
import java.util.Random;
public class pascal_var2 {
    public static void n_th_row(int n) {
        int ans=1;
        System.out.print(ans+" ");
        for (int i = 1; i < n; i++) {
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        Random ran=new Random();
        int n=ran.nextInt(8)+1;
        n_th_row(n);
    }
}
