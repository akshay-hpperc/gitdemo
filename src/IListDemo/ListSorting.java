package IListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {
	public static void main(String[] args) {
		
		
		//ascending Order
		List<String> list = new ArrayList<String>();
		
		list.add("Akshay");
		list.add("Nagesh");
		list.add("Shubham");
		list.add("Abhi");
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(7);
		list2.add(4);
		list2.add(8);
		list2.add(3);
		list2.add(2);
		
		
		System.out.println("Before Sorting: " +list +"\n" + list2);
		Collections.sort(list);
		
		Collections.sort(list2);
		
		System.out.println("After Sorting: " +list +"\n" + list2);
		
		
		//Descending Order
		
		Collections.sort(list,Collections.reverseOrder());
		Collections.sort(list2,Collections.reverseOrder());
		System.out.println("Descending Ordr: " + list + "\n" + list2);
		
	}
}
