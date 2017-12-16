package string;

public class Test1 {
    
    public static void main(String[] args) {
        
        String s = "Hello my friend.";
        
        // Test 1 : my를 추출한 후 길이를 구하시오
        System.out.println("------------Test 1--------------");
        String s1 = s.replace("my", "");
        System.out.println(s1.length());
        
        // Test 2 : friend. 를 지우시오
        System.out.println("------------Test 2--------------");
        System.out.println(s.replace(" friend.", ""));
        
        // Test 3 : 문자열의 마지막 "n"의 index를 구하시오
        System.out.println("------------Test 3--------------");
        System.out.println(s.indexOf("n"));
        
        // Test 4 : friend를 child로 바꾼뒤 문자열에 child가 존재하는지 검증하시오
        System.out.println("------------Test 4--------------");
        
        s = s.replace("friend", "child");
        System.out.println(s);
        
        System.out.println("child가 존재 하는가: " + s.contains("child"));
        
        // Test 5 : 문자열 뒤에 Bye를 추가 한 뒤에 Hello를 뺀 나머지 문자열의 길이를 구하시오
        System.out.println("------------Test 5--------------");
        
        s = s.concat(" Bye");
        System.out.println(s);
        
        System.out.println("Hello를 뺀 문자열의 길이: " + s.substring(5).length());
        
    }
    
}
