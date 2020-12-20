package inheritance_task;

public class Run {
	
	public static void main(String[] args) {
		
		Project_ p1=new Project_(1011, "project name", "Client");
		
		Employee_ e1=new Employee_(101, "name", "Idk", 50000, p1, null, null);
		System.out.println(e1);
	}

}
