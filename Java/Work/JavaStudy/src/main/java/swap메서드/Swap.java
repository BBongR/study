package swap메서드;

public class Swap {
    public static void main(String[] args) {

//      swap() 메서드 내에서 아무리 a와 b를 교환해도 받은 복사본을 교환할 뿐이지 원래의 a, b를 교환하는 것이 아니다.
//      호출하는 쪽의 인자와 호출되는 쪽의 인자는 서로 다른 메모리에 저장되어 있어 아무 관계가 없다.
//
//      main의 x방      main의 y방
//         
//        ｜                 ｜
//        ｜     복사발생    ｜
//        ｜                 ｜
//        ∨                 ∨
//      
//      swap의 x방      swap의 y방
        
        int x = 7;
        int y = 9;
        
        System.out.printf("swap전: x: %d, y: %d\n", x, y);
        swap(x, y);
        System.out.printf("swap후: x: %d, y: %d\n", x, y);
    }
    
    private static void swap(int x, int y) {
        
//        int temp = 0; 
        int temp = x;
        x = y;
        y = temp;
        
        System.out.printf("swap안: x: %d, y: %d\n", x, y);
    }
}
