package anudip.entity;

public class Customer {
	private int cid;
	private String cname;
	private long cphone;
	private String caddr;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getCphone() {
		return cphone;
	}

	public void setCphone(long cphone) {
		this.cphone = cphone;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}

	public Customer(int cid, String cname, long cphone, String caddr) {
		this.cid = cid;
		this.cname = cname;
		this.cphone = cphone;
		this.caddr = caddr;
	}
}
