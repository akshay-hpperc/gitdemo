package IListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComapreListDemo {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();

		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");

		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");

		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);

		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);

		boolean val = list1.equals(list2); // find equal or not
		boolean result = list3.equals(list4);
		System.out.println(val);
		System.out.println(result);

		list2.removeAll(list1); // find missing
		list3.removeAll(list4);
		System.out.println(list2);
		System.out.println(list3);
		
		//revese arraylist
		Collections.reverse(list1);
		System.out.println("Reverse List: " +list1);
		

	}
}
