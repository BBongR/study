package fdsafdsa;

public class 별출력하기 {
	public static void main(String[] args) {

		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 10; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }

		// for (int i = 0; i < 10; i++) {
		// for (int j = 0; j < 10; j++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }

//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		int k = 0;
		int z = 0;

		while (k < 10) {
			while (z <= k) {
				System.out.print("*");
				z++;
			}
			k++;
			System.out.println();
		}
	}

}
