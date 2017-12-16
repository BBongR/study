package 반복문중첩;

public class 구구단세로출력 {
    public static void main(String[] args) {
  
//        2단부터 9단까지의 구구단을 출력하는 프로그램을 만드시오
        
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
    
}
