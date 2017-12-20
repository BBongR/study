package string클래스;

public class switch문구성_String인스턴스기반 {
	public static void main(String[] args) {

		String str = "two";

		switch (str) {
		
		case "one":
			System.out.println("one");
			break;
			
		case "two":
			System.out.println("two");
			break;
			
		default:
			System.out.println("default");
			
		}
	}

}
