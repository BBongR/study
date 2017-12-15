package fdsafdsa;

public class 별출력하기 {
<<<<<<< HEAD
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
=======
    public static void main(String[] args) {
        
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i > j)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
        
        for (int i = 1; i < 5; i++) {
            
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
>>>>>>> 0bf64377c24ef58619a4fc5f614584adcf84399e
}
