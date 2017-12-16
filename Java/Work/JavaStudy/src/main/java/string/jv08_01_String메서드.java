package string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class jv08_01_String메서드 {
    
    public static void main(String[] args) {
        
        // 0번째부터 12번째 자리까지 있음.
        // prov 길이는 13이다.
        String prov = "A barking Dog";
        
        System.out.println("------------도전 1--------------");
        // 문자열 길이: 13이 출력
        System.out.println("길이: " + prov.length());
        
        System.out.println("------------도전 2--------------");
        // 문자열 추출 : bar
        System.out.println("추출: " + prov.substring(2, 5));
        
        System.out.println("------------도전 3--------------");
        // Dog 를 출력하시오
        System.out.println(prov.substring(10)); // 인자 1개 넣으면 입력한 값 앞에 전부 지우고 추출
        System.out.println(prov.substring(10, 13)); // 인자 2개 넣으면 첫번째 인덱스 부터 두번째 인덱스 앞까지 추출
        System.out.println(prov.substring(10, prov.length()));
        
        System.out.println("------------도전 4--------------");
        // 문자열 추출 :
        // "A barking Dog"에서 마지막 g 빼고 "A barking Do" 를 출력하시오.
        System.out.println(prov.subSequence(0, prov.length() - 1));
        
        System.out.println("------------도전 5--------------");
        // 한개 문자 추출
        // --> 문자열 반환: b 를 추출하시오.
        System.out.println("substring로 추출: " + prov.substring(2, 3));
        
        // --> 문자 한개 반환: b 를 추출하시오.
        System.out.println("charAt로 추출: " + prov.charAt(2));
        
        System.out.println("------------도전 6--------------");
        // 문자열 결합 : +
        // "A barking Dog never Bites!"를 출력하시오.
        System.out.println("concat으로 결합: " + prov.concat(" never Bites!"));
        System.out.println("+로 결합: " + prov + " never Bites!");
        
        System.out.println("------------도전 7--------------");
        // 빈 문자열 확인 :
        System.out.println("prov는 빈문자열인가? " + prov.isEmpty());
        
        System.out.println("------------도전 8--------------");
        // 문자열 포함 여부 확인:
        System.out.println("Dog가 포함되었는가? " + prov.contains("Dog"));
        
        System.out.println("------------도전 9--------------");
        // 문자열 치환 :
        // Dog --> Cat 으로 바꾸시오
        System.out.println(prov.replace("Dog", "Cat"));
        
        System.out.println("------------도전 10--------------");
        // 문자열 자르기: split()은 배열로 돌려준다.
        // 지정한 문자로 문자열을 나눈다.(배열로 반환)
        // 문자열 prov 를 공백을 기준으로 자르고 결과를 출력하시오.
        String[] str = prov.split(" ");
        
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
            if (i < str.length - 1)
                System.out.print(", ");
        }
        
        System.out.println("------------도전 11--------------");
        // 문자열 공백 제거 : trim() 문자열의 끝과 맨 앞에 공백을 제거하는 메서드
        String s = " 가나다 라마바 ";
        s = s.trim();
        System.out.println(s);
        
        System.out.println("------------도전 12--------------");
        // 문자열 비교 :
        String str1 = "자바 프로그래밍 공부";
        String str2 = "자바 프로그래밍 공부";
        String str3 = new String("자바 프로그래밍 공부");
        
        if (str1.equals(str2))
            System.out.println("equal: same");
        else
            System.out.println("equal: not same");
        
        if (str1.equals(str3))
            System.out.println("equal: same");
        else
            System.out.println("equal: not same");
        
        if (str1 == str2)
            System.out.println("==: same");
        else
            System.out.println("==: not same");
        
        if (str1 == str3)
            System.out.println("==: same");
        else
            System.out.println("==: not same");
        
        System.out.println("------------도전 13--------------");
        // 문자열 치환 : replaceAll(). 정규표현식을 사용한 패턴 치환
        // 정규 표현식: ^ --> 시작
        // $ --> 끝
        // []
        String s1 = "가나다라 abcd 1234 zzxxcc";
        
        String s2 = s1.replaceAll(s1, "네이버 다음 네이트 카카오톡");
        System.out.println(s2);
        
        System.out.println("------------도전 14--------------");
        // String.format() 사용법
        // %s : 문자열
        // %d : 정수
        // %f : 부동소수점
        // %c : 문자한개
        // %tc: 날짜와 시간 전부 표시
        // %tr: 시간만 표시할때
        // %A %B %C 요일,월,일 표시
        
        String z1 = String.format("S_%d", 369);
        System.out.println(z1);
        String z2 = String.format("%,d", 100000000);
        System.out.println(z2);
        String z3 = String.format("%05d", 30);
        System.out.println(z3);
        String z4 = String.format("%.2f", 33333.33333);
        System.out.println(z4);
        String z5 = String.format("%,.2f", 3333333.33333);
        System.out.println(z5);
        
        System.out.println("------------도전 15--------------");
        // 날짜 출력 포맷 지정 하기: SimpleDateFormat 클래스 사용
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String dt = dateFormat.format(date);
        System.out.println(dt);
    }
    
}
