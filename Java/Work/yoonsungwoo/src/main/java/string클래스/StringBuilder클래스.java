package string클래스;

public class StringBuilder클래스 {
	public static void main(String[] args) {

		StringBuilder stbuf = new StringBuilder("123");

		stbuf.append("45678"); // 문자열 덧붙이기
		System.out.println(stbuf.toString());
		
		stbuf.delete(0, 2); // 문자열 일부 삭제
		System.out.println(stbuf);
		
		stbuf.replace(0, 3, "AB"); // 문자열 일부 교체
		System.out.println(stbuf);
		
		stbuf.reverse(); // 문자열 내용 뒤집기
		System.out.println(stbuf);
		
		String str = stbuf.substring(2, 4);
		System.out.println(str);
	}

}
