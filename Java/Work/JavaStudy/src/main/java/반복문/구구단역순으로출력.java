package 반복문;

import java.util.Scanner;

public class 구구단역순으로출력 {
    public static void main(String[] args) {
        
//        사용자로부터 입력받은 숫자에 해당하는 구구단을
//        역순으로 출력하는 프로그램을 만드시오
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("출력할 단수를 입력: ");
        int dan = sc.nextInt();
        
        for(int i = 9; i>=1; i--) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
    
}
