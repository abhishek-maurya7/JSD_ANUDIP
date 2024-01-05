package javaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEg {
	public static void main(String[] args) {
		Book b = new Book("java", 800);
		Book b1 = new Book("core java", 500);
		Book b2 = new Book("adv java", 1000);
		Book b3= new Book("web design", 900);
		Book b4 = new Book("php", 460);
		Book b5 = new Book("spring", 900);
		Book b6 = new Book("angular", 1200);
		Book b7 = new Book("react",12800);
		Book b8 = new Book("python", 800);
		Book b9 = new Book("sql", 880);
		
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(b);
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		al.add(b6);
		al.add(b7);
		al.add(b8);
		al.add(b9);
		
		for(Book bbb : al) {
			System.out.println(bbb.bname + "  "  + bbb.bprice);
		}
		
		System.out.println("--------------------");
		System.out.println("Sorted list");
		
		Collections.sort(al);
		for(Book bbb : al) {
			System.out.println(bbb.bname + "  "  + bbb.bprice);
		}
	}

}
