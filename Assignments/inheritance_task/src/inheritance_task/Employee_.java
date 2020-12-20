package inheritance_task;

public class Employee_ extends Person_ {
	
	private String designation;
	private double salary;
	private Project_ project;
	private Address_ permanentAddress;
	private Address_ presentAddress;
	

	public Employee_(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	

	public Employee_(int id, String name, String designation, double salary, Project_ project,
			Address_ permanentAddress, Address_ presentAddress) {
		super(id, name);
		this.designation = designation;
		this.salary = salary;
		this.project = project;
		this.permanentAddress = permanentAddress;
		this.presentAddress = presentAddress;
	}


	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Project_ getProject() {
		return project;
	}

	public void setProject(Project_ project) {
		this.project = project;
	}

	public Address_ getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address_ permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Address_ getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address_ presentAddress) {
		this.presentAddress = presentAddress;
	}

	@Override
	public String toString() {
		return "Employee_ [designation=" + designation + ", salary=" + salary + ", project=" + project
				+ ", permanentAddress=" + permanentAddress + ", presentAddress=" + presentAddress + "]";
	}
	
	
	
	
	
	

}
