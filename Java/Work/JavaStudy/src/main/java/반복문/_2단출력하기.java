package 반복문;

public class _2단출력하기 {
    public static void main(String[] args) {
        
//        2단을 출력하시오
        for (int i = 1; i <= 9; i++) {
            System.out.println(2 + " * " + i + " = " + 2 * i);
        }
    
        System.out.println("------------------");
        
//        2단을 가로로 출력하는 프로그램을 만드시오.
//        끝날 때는 마침표를 붙인다.
//        2*1=2, 2*2=4, 2*3=6, …, 2*9=18.
        
        for (int i = 1; i <= 9; i++) {
            System.out.print(2 + " * " + i + " = " + 2 * i);
            if (i < 9) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }
    
}
