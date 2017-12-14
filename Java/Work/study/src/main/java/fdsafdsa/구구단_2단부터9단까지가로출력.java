package fdsafdsa;

public class 구구단_2단부터9단까지가로출력 {
    public static void main(String[] args) {
        
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " * " + j + " = " + i * j);
                if (j < 9) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    
}
