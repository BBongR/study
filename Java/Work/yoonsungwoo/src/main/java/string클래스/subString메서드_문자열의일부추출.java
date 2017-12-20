package string클래스;

public class subString메서드_문자열의일부추출 {
	public static void main(String[] args) {

		// 인덱스는 0 부터 시작

		String str1 = "abcdefg";
		str1 = str1.substring(2); // 인덱스 2 이후의 내용으로 이뤄진 문자열을 반환
		System.out.println(str1); // 새로 만들어서 반환! String은 Immutable!

		String str2 = "abcdefg";
		str2 = str2.substring(2, 4); // 인덱스 2부터 3까지 문자열을 반환
		System.out.println(str2);    // 인덱스 4 앞 까지 4는 포함 안됨!
	}

}
