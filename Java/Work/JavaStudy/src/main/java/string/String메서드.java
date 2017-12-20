package string;

public class String메서드 {
	public static void main(String[] args) {

		String sTmp1 = "ABC";
		String sTmp2 = "abc";

		System.out.println(sTmp1.compareTo(sTmp2));
		System.out.println(sTmp1.compareToIgnoreCase(sTmp2));
		
		char[]  x = sTmp1.toCharArray();
		System.out.println(x);
	}

}
