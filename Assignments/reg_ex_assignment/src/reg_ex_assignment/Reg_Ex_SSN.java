package reg_ex_assignment;

public class Reg_Ex_SSN {
	
	public static void main(String[] args) {
		
		String SSN = "123-45-6789";
		if(SSN.matches("[0-9]{3}\\-[0-9]{2}\\-[0-9]{4}")) {
			System.out.println (SSN+ " is a valid SSN");
		}else {
			System.out.println(SSN+ " is an invalid SSN");
		}

	}

}
