package javaCollections;

import java.util.LinkedHashSet;

public class HashSetEg {
	public static void main(String[] args) {
		//creation of linkedlist obj
				LinkedHashSet<String> ll = new LinkedHashSet<String>();
				ll.add("jan"); //adding elements
				ll.add("feb");
				ll.add("mar");
				ll.add("apr");
				ll.add("may");
				ll.add("jan"); //duplicate values
				ll.add("june");
				ll.add("july");
				ll.add(null);
				ll.add("aug");
				ll.add("sept");
				ll.add("oct");
				ll.add("nov");
				ll.add("dec");
				
				//traverse using foreach
				for(String a : ll) {
					System.out.println(a);
				}
	}

}
