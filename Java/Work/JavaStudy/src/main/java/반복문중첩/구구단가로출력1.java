package 반복문중첩;

public class 구구단가로출력1 {  
    public static void main(String[] args) {

//      2단부터 9단까지의 구구단을 출력하는 프로그램을 만드시오
        
//        2*1=2,  2*2=4,   2*3=6,   2*4=8,   ....,  2*9=18.
//        3*1=3,  3*2=6,   3*3=9,   3*4=12,  ....,  3*9=27.
//        .
//        .
//        .
//        9*1=9,  9*2=18,  9*3=27,  9*4=36,  ....,  9*9=81.
        
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                if (j < 9)
                    System.out.print(", ");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
    
}
