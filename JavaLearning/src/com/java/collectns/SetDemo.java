package com.java.collectns;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Different Set Classes
		
		// Random Class is used to generate the random numbers for given upper bond 
		Random obj = new Random();

		// HashSet stores the elements in its own order
		HashSet<Integer> hSet = new HashSet<>();
		
		//LinkedHashSet stores the elements in generated order
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		
		//TreeSet stores the elements in sorting order
		TreeSet<Integer> ts=new TreeSet<>();
		
		for (int i = 0; i <= 5; i++) {
			int number = obj.nextInt(20);
			System.out.println("Numbers: " +number);
			hSet.add(number);
			lhs.add(number);
			ts.add(number);
			
		}
		System.out.println("HashSet Elements: " +hSet);
		System.out.println("LinkedHashSet Elements: " +lhs);
		System.out.println("LinkedHashSet Elements: " +ts);
		
		
		

	}

}
