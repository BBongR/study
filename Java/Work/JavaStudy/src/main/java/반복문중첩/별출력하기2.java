package 반복문중첩;

public class 별출력하기2 {
    public static void main(String[] args) {
        
//      아래 그림과 같이 별표를 출력하시오.
//        
//        *
//        **
//        ***
//        ****
//        *****
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("----------------------------");
        
//        *****
//        ****
//        ***
//        **
//        *
        
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("----------------------------");
        
//          *
//         **
//        ***
//       ****
//      *****
        
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println("----------------------------");
        
//      *****
//       ****
//        ***
//         **
//          *
        
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > 0; j--) {
                if (j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
