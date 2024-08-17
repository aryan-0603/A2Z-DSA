// To print given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle
import java.util.Random;
public class pascal_var1 {
    public static int NcR(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public static void main(String[] args) {
        Random ran=new Random();
        int a=ran.nextInt(6)+1;
        int b=ran.nextInt(6)+1;
        System.out.println("Element at "+a+" row and "+b+" column is "+NcR(a,b));
    }
}
