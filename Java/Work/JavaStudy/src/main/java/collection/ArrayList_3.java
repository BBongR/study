package collection;

import java.util.*;

public class ArrayList_3 {

	public static void main(String[] args) {

		int pos = 0;
		String value = "";

		/* List 선언 */
		List<String> list = null;

		list = new ArrayList<>();

		System.out.println("--------------도전 1--------------");
		/*
		 * C: 추가. 검색: "자바 arraylist 추가" MILK, BREAD, BUTTER 순으로 추가
		 */
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		System.out.println("C: 추가 >> " + list);

		System.out.println("--------------도전 2--------------");
		/*
		 * APPLE 삽입. 검색: "자바 arraylist 삽입" 특정 위치에 추가하기 "BREAD" 앞에 "APPLE" 삽입 "BREAD" 가
		 * 들어있는 방번호 찾기
		 */
		list.add(list.indexOf("BREAD"), "APPLE");
		System.out.println("C: BREAD 앞에 APPLE 삽입 >> " + list);

		System.out.println("--------------도전 3--------------");
		/*
		 * R: 읽기 BUTTER 값을 출력하시오. "BUTTER" 가 들어있는 방번호 찾기
		 */
		value = String.valueOf(list.indexOf("BUTTER"));
		System.out.println("R: 읽기 >> " + value);

		System.out.println("--------------도전 4--------------");
		/*
		 * U: 수정. 검색: "자바 arraylist 수정" "BREAD" 를 "GRAPE"로 변경 "BREAD" 가 들어있는 방번호 찾기
		 */
		list.set(list.indexOf("BREAD"), "GRAPE");
		System.out.println("U: BREAD 를 GRAPE로 수정 >> " + list);

		System.out.println("--------------도전 5--------------");
		/*
		 * D: 인덱스로 삭제. 검색: "자바 arraylist 삭제" 인덱스를 이용하여 GRAPE 를 삭제
		 */
		list.remove(2);
		System.out.println("D: BUTTER 를 삭제 >> " + list);

		System.out.println("--------------도전 6--------------");
		/*
		 * D: 값으로 찾아서 삭제. 검색: "자바 arraylist 값으로 삭제" 값으로 MILK를 찾아서 삭제하시오
		 */
		list.remove(list.indexOf("MILK"));
		System.out.println("D: 값으로 MILK를 찾아서 삭제 >> " + list.toString());

		System.out.println("--------------도전 7--------------");
		/*
		 * P: 리스트를 for문으로 출력. 검색: "자바 arraylist for 출력" 검색: "자바 arraylist 크기"
		 */
		System.out.print("P: 리스트를 for문으로 출력 : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}

		System.out.println();
		System.out.println("--------------도전 8--------------");
		/*
		 * P: 리스트를 for-each문으로 출력.
		 */
		System.out.print("P: 리스트를 for-each문으로 출력 : ");
		for (String string : list) {
			System.out.print(string + ", ");
		}

		System.out.println();
		// 테스트용 데이터 생성을 위한 코드. 수정하지 마시오.
		for (int i = 0; i < 4; i++) {
			list.add("APPLE");
			list.add("BANNA");
		}

		System.out.println("--------------도전 9--------------");
		/*
		 * S: 검색: "자바 ArrayList 검색 첫번째 APPLE을 찾으시오. List<String> 선언한 경우
		 * Collections.binarySearch() 오작동.
		 */
		pos = list.indexOf("APPLE");
		System.out.println("APPLE 검색 : " + pos);

		System.out.println("--------------도전 10--------------");
		/*
		 * S: 오름차순 정렬. 검색: "자바 ArrayList 오름차순 정렬"
		 */
		Collections.sort(list);
		System.out.println("S: 오름차순 정렬 >> " + list.toString());

		System.out.println("--------------도전 11--------------");
		/*
		 * S: 내림차순 정렬. 검색: "자바 ArrayList 내림차순 정렬"
		 */
		Collections.reverse(list);
		System.out.println("S: 내림차순 정렬 >> " + list.toString());

		System.out.println("--------------도전 12--------------");
		/*
		 * 검색2. APPLE 이 몇개 있나요?
		 */
		int count = 0;
		count = list.indexOf("APPLE");
		System.out.println("S: APPLE 이 몇개 있나요? >> " + count);

		System.out.println("--------------도전 13--------------");
		/*
		 * 리스트를 배열로 변환하시오. toArray() 사용 "자바 ArrayList 배열 변환 검색"
		 */
		String[] s = new String[list.size()];
		list.toArray(s);

		System.out.println("--------------도전 14--------------");
		/*
		 * 변환된 배열을 for 문으로 출력.
		 */
		System.out.println("P : 변환 결과를 for 문으로 출력 ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + ", ");
		}

		System.out.println();
		System.out.println("--------------도전 15--------------");
		/*
		 * 변환된 배열을 for each 문으로 출력.
		 */
		System.out.println("P : 변환 결과를 for each 문으로 출력 : ");
		for (String string : s) {
			System.out.print(string + ", ");
		}

		System.out.println();
		System.out.println("--------------도전 16--------------");
		/*
		 * list의 모든 값을 삭제하시오
		 */
		list.clear();
		list.removeAll(list);

		System.out.println("D: list의 모든 값을 삭제하시오 >> " + list);
	}
}
