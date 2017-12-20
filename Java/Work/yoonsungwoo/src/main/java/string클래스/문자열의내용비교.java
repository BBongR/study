package string클래스;

public class 문자열의내용비교 {
	public static void main(String[] args) {

		String str1 = "Lexicographically";
		String str2 = "lexicographically";
		int cmp;

		if (str1 == str2) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

		System.out.println("---------------------------------");

		cmp = str1.compareTo(str2);
		if (cmp == 0) {
			System.out.println("두 문자열은 일치합니다.");
		} else if (cmp < 0) {
			System.out.println("사전의 앞에 위치하는 문자: " + str1);
		} else {
			System.out.println("사전의 앞에 위치하는 문자: " + str2);
		}

		System.out.println("---------------------------------");

		if (str1.compareToIgnoreCase(str2) == 0)
			System.out.println("두 문자열은 같습니다.");
		else
			System.out.println("두 문자열은 다릅니다.");
	}

}
