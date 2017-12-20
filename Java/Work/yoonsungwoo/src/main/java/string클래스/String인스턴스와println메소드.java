package string클래스;

public class String인스턴스와println메소드 {
	public static void main(String[] args) {

		String str1 = new String("Simple String");
		String str2 = "The Best String";

		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println();

		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();

		showString("Funny String"); // 스트링 인스턴스의 생성으로 이어지고 그 인스턴스의 참조값이
		                            // 실제로는 showString에 인자로 전달이 되어서
		                            // str이라는 참조 변수가 Funny String의 인스턴스를 가르키는 구조
	}

	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}
}
