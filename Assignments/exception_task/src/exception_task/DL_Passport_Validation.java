package exception_task;

public class DL_Passport_Validation {

	public boolean isValidDL(String DL) throws DL_Exception {
		if(!DL.matches("[A-Z]{1}[0-9]{8}")) {
			throw new DL_Exception("Drivers License "+DL+" is invalid in VA");
		}
		
		return true;

	}
	
	public boolean isValidPassport(String passport) throws Passport_Exception{
		
		if(!passport.matches("[C]{1}[0-9]{8}")) {
			throw new Passport_Exception("Passport card no. "+passport+" is invalid");
		}
		
		return true;
	}

}
