/*
* * *
* * *
* * *
  */
public class Solution {
    public static void nForest(int n) {
        String str="";
        for(int i=0; i<n; i++) {
            str += "* ";
        }
        for(int i=0; i<n; i++) {
            System.out.println(str);
        }  
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
* 
* *
* * *
 */
public class Solution {
    public static void nForest(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
