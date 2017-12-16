package 메서드;

import java.util.Scanner;

public class 사칙연산메서드 { 
    public static void main(String[] args) {

//        두 개의 정수를 입력받고, 두 수의 덧셈, 뺄셈, 곱셈, 나눗셈 결과를 출력하는 프로그램을 작성하시오.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("두 개의 정수를 입력하시오: ");
        String str1 = sc.next();
        String str2 = sc.next();
        
        int x = Integer.valueOf(str1);
        int y = Integer.valueOf(str2);
        
        System.out.println(add(x, y));
        System.out.println(minus(x, y));
        System.out.println(mul(x, y));
        System.out.println(div(x, y));
    }
    
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
    
    public static int minus(int x, int y) {
        int result = x - y;
        return result;
    }
    
    public static int mul(int x, int y) {
        int result = x * y;
        return result;
    }
    
    public static double div(int x, int y) {
        double result = (double) x / y;
        return result;
    }
}
