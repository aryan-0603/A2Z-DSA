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
/*
1
2 2 
3 3 3
 */
public class Solution {
    public static void nTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
  *
 ***
*****
 */
 public class Solution {
    public static void nStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
1 2 3
1 2
1
 */
 public class Solution {
    public static void nNumberTriangle(int n) {
         for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
 *****
  ***
   *
 */
 public class Solution {
    public static void nStarTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
****
*  *
*  *
****
 */
public class Solution {
    public static void getStarPattern(int n) {
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            }
            else{
                for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            }
            System.out.println();
            }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

 
