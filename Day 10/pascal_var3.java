import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class pascal_var3 {
    public static List<Integer> generateRow(int row) {
        long ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(1);
        for(int col=1;col<row;col++){
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    public static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> ans=new ArrayList<>();
        for(int row=1;row<=n;row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
    public static void main(String[] args) {
        Random ran= new Random();
        int n = ran.nextInt(10)+1;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
