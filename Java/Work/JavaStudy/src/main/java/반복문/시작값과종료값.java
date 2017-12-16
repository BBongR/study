package 반복문;

import java.util.Scanner;

public class 시작값과종료값 {
    public static void main(String[] args) {

//        정수 2개를 입력받고 "시작 값" 부터 "종료 값" 까지 의 합계를 구하시오.
        
//        INPUT                                          INPUT
//        시작 값을 입력하세요. 1                         시작값을 입력하세요. 4
//        종료 값을 입력하세요. 4                         종료값을 입력하세요. 1
//       
//        OUTPUT                                         OUTPUT
//        1부터 4까지의 합계는 10입니다                  1부터 4까지의 합계는 10입니다    

        Scanner sc = new Scanner(System.in);
        
        System.out.print("시작 값을 입력하세요: ");
        int s = sc.nextInt();
        System.out.print("종료 값을 입력하세요: ");
        int e = sc.nextInt();
        
        int sum = 0;
        
        if (s > e) {
            int temp = s;
            s = e;
            e = temp;
        }
        
        for (int i = s; i <= e; i++) {
            sum += i;
        }
        
        System.out.printf("%d부터 %d까지의 합계는 %d입니다.", s, e, sum);
    }
    
}
