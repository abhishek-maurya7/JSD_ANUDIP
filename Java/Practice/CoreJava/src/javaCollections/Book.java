package javaCollections;

public class Book implements Comparable<Book>{
	String bname;
	long bprice;
	
	public Book(String bname, long bprice) {
		this.bname = bname;
		this.bprice = bprice;
	}

	@Override
	public int compareTo(Book bk) {
		return bname.compareTo(bk.bname);
	}

}
