package com.java.collectns;

import java.util.ArrayList;
import java.util.List;

public class ArrayLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		// Adding values using add()
		list.add("Hello");
		list.add("World");
		int i = list.size();

		System.out.println(list);
		System.out.println(i);
		list.set(1, "WorldBye");
		System.out.println(list);

		List<Integer> list2 = new ArrayList<Integer>();

		for (i = 5; i <= 50; i = i + 5) {
			list2.add(i);
		}
		System.out.println("List: " + list2);

		// adding a element/number in between list
		list2.add(4, 28);
		System.out.println("List: " + list2);

		// replacing an element in the list using set()
		list2.set(3, 21);
		System.out.println("List: " + list2);
		
		list2.remove(3);
		System.out.println("List after deletion: " + list2);

		// Adding contents from one list to other list using addAll()
		List<Integer> list3 = new ArrayList<>();
		list3.add(111);
		list3.add(111);
		list3.add(121);
		list3.add(131);

		System.out.println("List3 Contents: " + list3);

		list2.addAll(2, list3);
		System.out.println("Updated List2 after adding List3 contents: " + list2);
		list2.get(0);
		System.out.println(list2);
		
		//Searching contents from the List using contains()
		if(list2.contains(111)){
			System.out.println("List2 contains given element");
		}else{
			System.out.println("List2 doesn't contain the element");
		}
		
	}

}
