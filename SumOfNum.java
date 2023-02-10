package com.git;

public class SumOfNum {

	public static void main (String[]args) {
		int num=12345;
		int sum=0;
		while(num>0) {
			int n=num%10;
			sum=sum+n;
			num/=10;
		}
		System.out.println("Sum of num is "+sum);
		
	}
	
}
