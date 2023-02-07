package com.git;

public class PalindromeNum {

	public static void main(String[]args) {
		
		int num=123454321;
		int temp=num;
		int rev=0;
		while(num>0) {
			int n=num%10;
			rev=(rev*10)+n;
			num/=10;
		}
		if (rev==temp) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		
		}
	}
	
}
