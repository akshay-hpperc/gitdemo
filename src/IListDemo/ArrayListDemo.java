package IListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("U1");
		arrayList.add("U5");
		arrayList.add("U3");
		arrayList.add("U4");
		arrayList.add("U2");

		//System.out.println(arrayList);

		//1. Iterate the array list using iterator
		
//		Iterator iterator = arrayList.iterator();
//
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//
//		}
		
		//2. Iterate the array list using forEach
		
		/*
		 * for (String list : arrayList) { System.out.println(list); }
		 */
		
		//3. Get and Set ArrayList
		/*
		 * System.out.println(arrayList.get(2)); System.out.println(arrayList.set(2,
		 * "u22")); System.out.println(arrayList);
		 */
		
		 //3. How to Sort ArrayList
			/*
			 * System.out.println("before sort" +arrayList); Collections.sort(arrayList);
			 * System.out.println("after sort " +arrayList);
			 */		
		
		
	}
}
