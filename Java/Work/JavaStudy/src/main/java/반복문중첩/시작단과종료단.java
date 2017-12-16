package 반복문중첩;

import java.util.Scanner;

public class 시작단과종료단 {
    public static void main(String[] args) {
 
//        시작 단수와 종료 단수를 입력받고, 해당 단에 해당하는 구구단을 출력하는 프로그램을 작 성하시오.
//        시작단이 종료단보다 큰 경우에도 가능하게 하시오.
//        출력은 작은단부터 큰단 순으로 구구단을 출력하시오.
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("시작 단수를 입력하시오: ");
        int s = sc.nextInt();
        System.out.print("종료 단수를 입력하시오: ");
        int e = sc.nextInt();
        
        if (s > e) {
            int temp = s;
            s = e;
            e = temp;
        }
        
        for (int i = 1; i <= 9; i++) {
            for (int j = s; j <= e; j++) {
                System.out.printf("%d * %d = %d", j, i, j * i);
                if (j < e)
                    System.out.print(", ");
                else
                    System.out.print(".");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
}
