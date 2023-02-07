package com.git;

public class CountDigits {

	public static void main(String[]args) {
		int num=64835297;
		int count=0;
		while(num>0) {
			count++;
			num/=10;
			}
		System.out.println("The Number of Digits in the Number = " + count);
		}
}
