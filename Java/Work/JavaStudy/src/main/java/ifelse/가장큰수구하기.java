package ifelse;

import java.util.Scanner;

public class 가장큰수구하기 {
    public static void main(String[] args) {
        
//        정수 3개를 입력 받고 그 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
//        값을 비교할 때 중첩 if-else나 연속 if-else를 이용하시오.
//        단 3개의 수는 다른 것으로 가정.
//
//        INPUT                                     OUTPUT
//        첫 번째 수를 입력하세요. 1                입력받은 수중 가장 큰 수는 5입니다
//        두 번째 수를 입력하세요. 4
//        세 번째 수를 입력하세요. 5

        Scanner sc = new Scanner(System.in);
        
        System.out.print("첫 번째 수를 입력하세요: ");
        int first = sc.nextInt();
        System.out.print("두 번째 수를 입력하세요: ");
        int two = sc.nextInt();
        System.out.print("세 번째 수를 입력하세요: ");
        int three = sc.nextInt();
        
        // 연속 if-else 
        if (first > two && first > three) {
            System.out.println("가장 큰 수는: " + first + "입니다.");
        } else if (two > three) {
            System.out.println("가장 큰 수는: " + two + "입니다.");
        } else {
            System.out.println("가장 큰 수는: " + three + "입니다.");
        }
        
        // 중첩 if-else
        if (first > two) {
            if (first > three) {
                System.out.println("가장 큰 수는: " + first + "입니다.");
            } else {
                System.out.println("가장 큰 수는: " + three + "입니다.");
            }
        } else {
            if (two > three) {
                System.out.println("가장 큰 수는: " + two + "입니다.");
            } else {
                System.out.println("가장 큰 수는: " + three + "입니다.");
            }
        }
    }
    
}
