package 반복문무한;

import java.util.Scanner;

public class 정수를입력받아출력 {
    public static void main(String[] args) {
        
//        키보드에서 정수를 입력받아 출력하는 프로그램을 작성하시오.
//        단, 입력된 정수값이 음수인 경우에만 프로그램을 종료하시오.
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("정수를 입력하시오: ");
            int num = sc.nextInt();
            
            if (num < 0)
                break;
            
            System.out.println("입력한 값은 " + num + "입니다.");
            System.out.println();
        }
    }
    
}
