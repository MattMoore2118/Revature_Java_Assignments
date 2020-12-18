package wrappers_task;

public class Wrappers_with_DLF {

	public static void main(String[] args) {
		//Double
		System.out.println("Double Wrapper Task");
		Double d1=5.5;
		Double d2=5.5;
		Double d3=4.3;
//		System.out.println("d1 : "+d1);
//		System.out.println("d2 : "+d2);
//		System.out.println("d3 : "+d3);
		
		System.out.println(Double.compare(d1, d2));
		System.out.println(Double.compare(d2, d3));
		System.out.println(Double.compare(d1, 7.78));
		
		String s1 = "3.69";
		double gpa=Double.parseDouble(s1);
		System.out.println("GPA : "+gpa);
		
		int a=d1.intValue();
		float b=d1.floatValue();
		System.out.println("Turning d1 into an int: a = "+a);
		System.out.println("Turning d1 into a float: b = "+b);
		
		
		//Long
		System.out.println("\nLong Wrapper Task");
		Long L1 = 89734950293L;
		Long L2 = 42367465782L;
		
		System.out.println(L1.compareTo(L2));
		System.out.println(L2.compareTo(L1));
		String s2 = "52319754561";
		long num=Long.parseLong(s2);
		System.out.println("s2 as a Long: "+num);
		System.out.println("L1 as an int: "+L1.intValue());
		System.out.println("L1 as a float: "+L1.floatValue());
		//Unsure about these Long values being converted with L1.int/L1.float values?
		
		//Float
		System.out.println("\nFloat Wrapper Task");
		Float f1 = 42.563723f;
		Float f2 = 27.839456f;
		System.out.println(f1.compareTo(f2));
		System.out.println(f2.compareTo(f1));
		String s3 = "123.456789";
		float num2=Float.parseFloat(s3);
		System.out.println("s3 as a float: "+num2);
		System.out.println("f1 as an int: "+f1.intValue());
		System.out.println("f1 as a long: "+f1.longValue());
		
		
	}

}
