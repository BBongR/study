package 메서드;

import java.util.Scanner;

public class Add메서드 {
    public static void main(String[] args) {
        
//        Scanner를 이용하여 정수 2개를 입력받아 변수 x 와 y에 저장한다.
//        입력받은 정수 x 와 y를 메서드의 매개변수로 넘기고 두 정수의
//        합을 되돌려주는 add 메서드를 작성하시오 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("x의 값을 입력하시오: ");
        int x = sc.nextInt();
        System.out.print("y의 값을 입력하시오: ");
        int y = sc.nextInt();
        
        int result = add(x, y);
        System.out.println("합: " + result);
    }
    
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
}
