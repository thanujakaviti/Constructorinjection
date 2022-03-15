package in.jt;

public class Student {
	private int sid;
	private String sname;
	private Address address;
	
	
	public Student() {
		super();
		System.out.println("Student :: Constructor");
	}
	
	
	
	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("Student :: Parameterized Constructor");
		System.out.println("Address Object Injecting into Student Object");
	}



	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
   
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + "]";
	}
	
	
	
	//alt+shift+s  : for developing toString(), setter and getters , constructors
}
