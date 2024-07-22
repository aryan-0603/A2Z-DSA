//Step 1-Lecture 1- for loop CN practice question

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1;
		for(int i=2;i<n;i++){
			int c=a+b;
			a=b;b=c;
		}
		System.out.println(b);
	}

}
