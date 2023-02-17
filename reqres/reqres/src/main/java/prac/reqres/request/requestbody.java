package prac.reqres.request;

public class requestbody {
	private int id;
	private long pin;
	private String address;
	private String name;
	private String email_id;
	private String phonenum;
	public requestbody(int id, long pin, String address, String name, String email_id, String phonenum) {
		super();
		this.id = id;
		this.pin = pin;
		this.address = address;
		this.name = name;
		this.email_id = email_id;
		this.phonenum = phonenum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	
}