package title_case_task;

public class Title_Case {

	public static void main(String[] args) {
		
		String s = "hello my name is Matt and I am enjoying learning java so far";
		StringBuffer sb=new StringBuffer();
		String ar[]=s.split(" ");
		for(int i = 0; i<ar.length; i++) {
			sb.append(ar[i].substring(0, ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
			
		}
		System.out.println(sb.toString());

	}

}
