package javaCore;

public class StudentDetails {
	//instance variables
	int sid;
	String sname;
	long sphone;
	boolean graduate;
	
	//Parameterized constructor
	public StudentDetails(int sid, String sname, long sphone, boolean graduate) {
		this.sid = sid;
		this.sname = sname;
		this.sphone = sphone;
		this.graduate = graduate;
	}
}
