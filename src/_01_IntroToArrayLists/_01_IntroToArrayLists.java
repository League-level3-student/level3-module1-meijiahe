package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> arrlist = new ArrayList<String>();
		//2. Add five Strings to your list
		arrlist.add("A");
		arrlist.add("B");
		arrlist.add("C");
		arrlist.add("D");
		arrlist.add("aeE");
		//3. Print all the Strings using a standard for-loop
		//for (int i=0;i<arrlist.size();i++) {
			//System.out.println(arrlist.get(i));
		//}
		
		//4. Print all the Strings using a for-each loop
		//for (String object: arrlist) {
			//System.out.println(object);
		//}
		//5. Print only the even numbered elements in the list.
		//for (int i=0;i<arrlist.size();i++) {
			//if(i%2==0) {
				//System.out.println(i);
			//}
		//}
		//6. Print all the Strings in reverse order.
		//for (int i =arrlist.size() - 1; i >= 0; i--) {
	       // System.out.println(arrlist.get(i));
	   // }

		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0;i<arrlist.size();i++) {
			if (arrlist.get(i).contains("e")) {
				System.out.println(arrlist.get(i));
			}
		}
	}

	private static Object print(String n) {
		// TODO Auto-generated method stub
		return null;
	}
}
