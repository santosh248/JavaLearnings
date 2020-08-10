package com.java.learning;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to sum of array contents
		int a[]= {2,3,4,5,6};
		int sum = sumOfArray(a);
		System.out.println("Sum of Array: " +sum);

	}

	public static int sumOfArray(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum =sum+a[i];
		}
			
		return sum;
	}

}
