package string클래스;

public class concat메서드_문자열연결시키기 {
	public static void main(String[] args) {

		String str1 = "Coffee";
		String str2 = "Bread";
                                      // String 인스턴스는 Immutable 인스턴스!
		String str3 = str1.concat(str2); // st1에 st2의 문자를 덧 붙여서 새로운 문자를 생성하여 st3이 가르킴
		System.out.println(str3);
		
		String str4 = "Fresh".concat(str3);
		System.out.println(str4);
	}

}
