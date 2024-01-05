package javaCollections;

import java.util.ArrayList; //import package
import java.util.Iterator;

public class arrayListEg {
	public static void main(String[] args) {
		//creation of arraylist 
		ArrayList<Integer> aa = new ArrayList<Integer>();
		
		System.out.println(aa.isEmpty()); //true, as no elements in list
		
		//adding elements to integer list
		aa.add(1234);
		aa.add(5678);
		aa.add(0, 9876); //value at 0 index
		aa.add(5678); //duplicate value
		aa.add(3456);
		aa.add(2345);
		aa.add(6784);
		aa.add(1297);
		aa.add(1,07);
		aa.add(3,9);
		
		System.out.println(aa.isEmpty()); //false
		
		//traversing using for loop
		for(int i=0;i<aa.size();i++) {
			System.out.println(aa.get(i));
		}
		
		//creating String arraylist
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("abc");
		al2.add("def");
		al2.add("ghj");
		al2.add("lkj");
		al2.add("mno");
		al2.add("qwe");
		al2.remove(0); //remove element at index 0
		al2.add("def");
		al2.add("11aaa");
		al2.add("xyz");
		
		System.out.println(al2);  //printing al2
		
		//adding new elements to existing arraylist
		al2.add("tyu");
		al2.add("uio");
		al2.remove(5); //remove an element at index 5
		
		//traversing using foreach loop
		for(String a : al2) {
			System.out.println(a);
		}
		
		Iterator<String> ii = al2.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
	}
}
