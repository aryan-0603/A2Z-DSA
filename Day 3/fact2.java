//Find all factorial numbers less than or equal to n

class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        recurSion(1,1,list,n);
        return list;
    }
    static void recurSion(long temp, long factorial, ArrayList<Long> list, long n){
        if(factorial>n){
            return;
        }
        factorial *=temp;
        if(factorial <= n  ){
            list.add(factorial);
        }
        recurSion(++temp,factorial,list,n);
    }
}


 
