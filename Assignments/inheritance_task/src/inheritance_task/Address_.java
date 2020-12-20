package inheritance_task;

public class Address_ {
	
	private int aid;
	private String streetName;
	private String city;
	private int zip;
	
	public Address_() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address_(int aid, String streetName, String city, int zip) {
		super();
		this.aid = aid;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address_ [aid=" + aid + ", streetName=" + streetName + ", city=" + city + ", zip=" + zip + "]";
	}
	
	

}
