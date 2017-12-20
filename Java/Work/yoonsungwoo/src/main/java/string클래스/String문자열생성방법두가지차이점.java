package string클래스;

public class String문자열생성방법두가지차이점 {
	public static void main(String[] args) {

		String str1 = "Simple String";
		String str2 = "Simple String";

		String str3 = new String("Simple String");
		String str4 = new String("Simple String");

		if (str1 == str2) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}

		if (str3 == str4) {
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		} else {
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		}

		System.out.println("-----------------------------------------");

//	    String 인스턴스는 Immutable 인스턴스!
//	    따라서 생성되는 인스턴스의 수를 최소화 한다.
//		Immutable: 한번 생성되면 바꿀 수 없다.

		String s1 = "Simple String";
		String s2 = s1; // s1이 가르키고 있는 주소(참조)값을 s2도 가르킴
		
		System.out.println(s1);
		System.out.println(s2);
		s1 = "Hello String"; // Immutable이므로 새로 생성되어 s1이 가르킴
		System.out.println(s1);
		System.out.println(s2);
		
//		새로운 인스턴스가 필요 할 때에는 new를 사용하여 생성하라!
//		String s1 = "Simple String";
//		String s2 = new String("Simple String");
	}

}
