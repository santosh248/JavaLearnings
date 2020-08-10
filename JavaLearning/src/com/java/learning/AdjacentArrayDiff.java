package com.java.learning;

public class AdjacentArrayDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to multiply

		int a[] = { 2, 8, 9, 15, 19, 31 };
		int diff = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] > diff) {
				diff = a[i + 1] - a[i];
			}

		}
		System.out.println("Max difference: " + diff);
	}

}
