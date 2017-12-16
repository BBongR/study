package 반복문중첩;

public class 별출력하기1 {
    public static void main(String[] args) {

//        아래 그림과 같이 별표를 출력하시오.
//        
//        ********** 
//        ********** 
//        **********
//        **********
//        **********
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
