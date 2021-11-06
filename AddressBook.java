package addressBook;

public class AddressBook {
	private int srno;
	private String fname;
	private String lname;
	private String addres;
	private String state;
	private int zip;
	private long phone;
	private String email;

	AddressBook(int srno, String fname, String lname, String addres, String state, int zip, long phone, String email) {
		this.srno = srno;
		this.fname = fname;
		this.lname = lname;
		this.addres = addres;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}

	public int getSrno() {
		return srno;
	}

	public String getfname() {
		return fname;
	}

	public String getlname() {
		return lname;
	}

	public String getaddress() {
		return addres;
	}

	public String getstate() {
		return state;
	}

	public int getzip() {
		return zip;
	}

	public double getphone() {
		return phone;
	}

	public String getemail() {
		return email;
	}

	@Override
	public String toString() {
		return "srno=" + srno + ", fname=" + fname + ", lname=" + lname + ", addres=" + addres + ", state="
				+ state + ", zip=" + zip + ", phone=" + phone + ", email=" + email;
	}

	
}
