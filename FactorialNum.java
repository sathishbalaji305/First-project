package com.git;

public class FactorialNum {

	public static void main(String[]args) {
		int a =6;
		int fact=1;
		while(a>0) {
			fact=fact*a;
			a-=1;
			
		}
		System.out.println("factorial of 6 is "+fact);
	}
	
}
