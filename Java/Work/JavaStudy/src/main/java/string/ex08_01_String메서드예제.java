package string;

import java.util.Arrays;

public class ex08_01_String메서드예제 {
    
    public static void main(String[] args) {
        
        // 도전 1. 문자열 치환:
        // ÷(\u00F7) --> /, ×(\u00D7) --> * 바꾸기
        System.out.println("------------도전 1--------------");
        String temp = "\u00F7 \t \u00D7 ";
        System.out.println("치환 전 : " + temp); // " ÷ × "
        
        temp = temp.replace("÷", "/");
        temp = temp.replace("×", "*");
        System.out.println("치환 후 : " + temp); // " / * "
        
        // 도전 2. 형변환. 문자열 정수로 바꾸기.
        // 문자열 "3"을 정수 3으로 바꾸시오. 구글 검색
        System.out.println("------------도전 2--------------");
        String temp2 = "3";
        
        int num = Integer.valueOf(temp2);
        System.out.println(num);
        
        // 도전 3. 문자열에서 가장 큰 수를 찾으시오.
        System.out.println("------------도전 3--------------");
        String temp3 = "74 874 9883 73 9 73646 774";
        
        String[] str = temp3.split(" ");
        
        int[] arr = new int[str.length];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }
        
//        for (int i = 0; i < str.length; i++) {
//            String s = str[i];
//            
//            int n = Integer.valueOf(s);
//            
//            arr[i] = n;
//        }
        
        Arrays.sort(arr);
        
        System.out.println("가장 큰 수: " + arr[arr.length - 1]);
    }
    
}
