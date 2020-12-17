package reg_ex_assignment;

public class Reg_Ex_DL {

	public static void main(String[] args) {
		
		String DL="T98765432";
		if(DL.matches("[A-Z]{1}[0-9]{8}")) {
			System.out.println(DL +": Valid VA License Customer Identifier");
		}
		else {
			System.out.println(DL +": Invalid VA License Customer Identifier");
		}

	}

}
