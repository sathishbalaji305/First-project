package com.git;

public class PrimeNum {

	public static void main(String[]args) {
		int a=53;
		int count = 0;
		for(int i=2;i<=a/2;i++) {
			if (a%i==0){
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime Number");
		}
		else {
			System.out.println("Not a prime Number");
		}
	}
	
}
