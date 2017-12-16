package 반복문무한;

import java.util.Scanner;

public class 무한구구단 {
    public static void main(String[] args) {

//        시작 단수와 종료 단수를 입력받고, 해당 단에 해당하는 구구단을 출력하는 프로그램을 작성하시오.
//        시작단이 종료단보다 큰 경우에도 가능하게 하시오.
//        출력은 작은단부터 큰단 순으로 구구단을 출력하시오.
//        입력받는 정수에 "0"이 있는 경우에만 프로그램을 종료하고 아니면
//        계속 새로운 시작 단과 종료단를 입력받아 출력하게 하시오.
        
        Scanner sc = new Scanner(System.in);
        
        for (;;) {
            
            System.out.print("시작 단수를 입력하시오: ");
            int s = sc.nextInt();
            
            if (s == 0)
                break;
            
            System.out.print("종료 단수를 입력하시오: ");
            int e = sc.nextInt();
            
            if (e == 0)
                break;
            
            if (s > e) {
                int temp = s;
                s = e;
                e = temp;
            }
            
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j <= e; j++) {
                    System.out.printf("%d * %d = %d\t", j, i, j * i);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
