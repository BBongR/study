package collection;

import java.util.*;

public class HashMap_3 {
	public static void main(String[] args) {

		Map<String, String> map = null;

		map = new HashMap<String, String>();
		// map = new Hashtable<String, String>();
		// map = new TreeMap<String, String>();

		System.out.println("--------------도전 1--------------");
		/*
		 * C: 추가. 검색: "자바 HashMap 추가"
		 *
		 * 송중기 이광수 송혜교
		 */
		map.put("0", "송중기");
		map.put("1", "이광수");
		map.put("2", "송혜교");
		System.out.println(" C: 추가 >> " + map.toString()); // 모든 항목을 출력한다.

		System.out.println("--------------도전 2--------------");
		/*
		 * C: 삽입. 검색: "자바 HashMap 삽입"
		 *
		 * 유재석 삽입 되나 안되나? X
		 */
		map.put("1", "유재석");
		System.out.println(map.toString()); // 모든 항목을 출력한다.

		System.out.println("--------------도전 3--------------");
		/*
		 * R: 읽기
		 *
		 * 송혜교만 출력
		 */
		System.out.println(map.get("2"));
		System.out.println(map.containsValue("송혜교"));

		System.out.println("--------------도전 4--------------");
		/*
		 * U: 수정.변경. 검색: "자바 HashMap 수정"
		 *
		 * 이광수를 하하로 변경
		 */
		map.put("1", "하하");
		map.replace("1", "하하");
		System.out.println(map.toString());

		System.out.println("--------------도전 5--------------");
		/*
		 * D: 키 값으로 삭제. 검색: "자바 HashMap 삭제"
		 *
		 * 송혜교를 삭제
		 */
		map.remove("2");
		map.remove("2", "송혜교");
		System.out.println(map.toString());

		System.out.println("--------------도전 6--------------");
		// for문으로 Map 출력하기. 방법1
		// iterator()를 이용하는 방식은 루프안에서 map 데이터를 삭제할때 사용.
		// http://stove99.tistory.com/96
		for (int i = 0; i < map.size(); i++) {
			System.out.print(map.get(String.valueOf(i)) + ", ");
		}

		System.out.println();
		System.out.println("--------------도전 7--------------");
		// foreach문으로 Map 출력하기. 방법2
		// keySet() 보다 빠르다.
		// http://stove99.tistory.com/96
		for (String key : map.keySet()) {
			System.out.printf("키:%s, 값:%s\n", key, map.get(key));
		}

		System.out.println();
		System.out.println("--------------도전 8--------------");
		// foreach문으로 Map 출력하기. 방법3
		// http://stove99.tistory.com/96
		for (String values : map.values()) {
			System.out.print(values + ", ");
		}

		System.out.println();
		System.out.println("--------------도전 9--------------");
		// S: HashMap 검색. "자바 HashMap 검색"
		// S: 키로 검색 containsKey() 사용
		System.out.println(map.containsKey("1"));

		System.out.println("--------------도전 10--------------");
		// S: 값으로 검색 containsValue() 사용
		System.out.println(map.containsValue("하하"));

		System.out.println("--------------도전 11--------------");
		// S: HashMap 오름차순 정렬. 검색: "자바 HashMap 오름차순 정렬"
		// http://huskdoll.tistory.com/5/

		// S: HashMap 내림차순 정렬. 검색: "자바 HashMap 내림차순 정렬"
		// http://huskdoll.tistory.com/5
		TreeMap<String, String> treeMapReverse = new TreeMap<String, String>(Collections.reverseOrder());
		treeMapReverse.putAll(map);

		Iterator<String> treeMapReverseIter = treeMapReverse.keySet().iterator();
		for (; treeMapReverseIter.hasNext();) {

			String key = treeMapReverseIter.next();
			String value = treeMapReverse.get(key);

			System.out.println(key + " : " + value);
		}
	}
}
