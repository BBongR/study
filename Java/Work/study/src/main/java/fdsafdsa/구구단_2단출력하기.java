package fdsafdsa;

public class 구구단_2단출력하기 {
	public static void main(String[] args) {

		int dan = 2;

		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + " * " + i + " = " + dan * i);
			if (i < 9)
				System.out.print(", ");
		}
	}

}
