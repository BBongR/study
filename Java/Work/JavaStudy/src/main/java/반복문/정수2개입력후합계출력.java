package 반복문;

import java.util.Scanner;

public class 정수2개입력후합계출력 {
    public static void main(String[] args) {

//        1 이상의 정수 n1과 n2를 입력받는다. 그리고 n1부터 입력받은 정수 n2까지의 합을 계산해서
//        그 결과를 출력하는 프로그램을 작성하시오
        
//        INPUT                            OUTPUT
//        정수를 입력하세요. 1 5           1+2+3+4+5 = 15  
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수를 입력하세요: ");
        String str1 = sc.next();
        String str2 = sc.next();
        int su1 = Integer.valueOf(str1);
        int su2 = Integer.valueOf(str2);
        
        int sum = 0;
        
        for (int j = su1; j <= su2; j++) {
            System.out.print(j);
            
            if (j < su2) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
            
            sum += j;
        }
        
        System.out.println(sum);
        
        System.out.println("---------------------------");
        
//        int sum2 = 0;
//        
//        System.out.print("정수를 입력하세요: ");
//        int n1 = sc.nextInt();
//        System.out.print("정수를 입력하세요: ");
//        int n2 = sc.nextInt();
//        
//        for (int i = n1; i <= n2; i++) {
//            System.out.print(i);
//            
//            if (i < su2) {
//                System.out.print(" + ");
//            } else {
//                System.out.print(" = ");
//            }
//            
//            sum2 += i;
//        }
//        
//        System.out.println(sum2);
    }
    
}
