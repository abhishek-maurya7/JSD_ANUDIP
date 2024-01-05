package javaCollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListEg {
	
	public static void main(String args[]) {
		//creation of linkedlist obj
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("jan"); //adding elements
		ll.add("feb");
		ll.add("mar");
		ll.add("apr");
		ll.add("may");
		ll.add("jan"); //duplicate values
		ll.remove(5);
		ll.add("june");
		ll.add("july");
		ll.add("aug");
		ll.add("sept");
		ll.add("oct");
		ll.add("nov");
		ll.add("dec");
		
		//traverse using foreach
		for(String a : ll) {
			System.out.println(a);
		}
		
		//asc sorting
		// Collections.sort(ll);
		// System.out.println(ll);
		
		//traverse using list iterator
		ListIterator<String> itr = ll.listIterator();
		//forward
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------- ");
		System.out.println();
		// backward
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
