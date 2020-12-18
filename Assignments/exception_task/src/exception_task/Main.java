package exception_task;

public class Main {
	
	//Custom Checked Exception for Drivers License

	public static void main(String[] args) {
		DL_Passport_Validation DLP=new DL_Passport_Validation();
		try {
			if (DLP.isValidDL("T98765432")) {
				System.out.println("Drivers License Validated");
			}
		} catch (DL_Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Custom Unchecked Exception for Passport card no.
		try {
			if(DLP.isValidPassport("C12345678")) {
				System.out.println("Passport Card no. Validated");
			}
		}catch (Passport_Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
