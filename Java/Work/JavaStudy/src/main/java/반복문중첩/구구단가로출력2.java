package 반복문중첩;

public class 구구단가로출력2 { 
    public static void main(String[] args) {

//      2단부터 9단까지의 구구단을 출력하는 프로그램을 만드시오
        
//       2*1=2,   3*1=3,   4*1=4,  ...,  9*1=9.
//       2*2=4,   3*2=6,   4*2=8,  ...,  9*2=18.
//       .
//       .
//       .
//       2*9=18,  3*9=27,  4*9=36, ...,  9*9=81.
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %d", j, i, i * j);
                
                if (j < 9)
                    System.out.print(", ");
                else
                    System.out.print(".");
                
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
}
