package com.java.learning;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to multiply

		int multi = multiply(6, 10);
		System.out.println("Multiplication: " + multi);

	}

	public static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k = 1;
		int multi = 0;
		while (k <= j) {
			multi = multi + i;
			
		//	System.out.println(i k multi);
			System.out.print(i);
			System.out.print("X"+k);
			System.out.println("="+multi);
			k++;
		}

		return multi;
	}

}
