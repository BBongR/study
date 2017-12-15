package fdsafdsa;

import java.util.Scanner;

public class 무한입력 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (;;) {
			System.out.print("정수를 입력하세요: ");
			int x = scanner.nextInt();

			if (x >= 0) {
				System.out.println(x);
			} else {
				break;
			}
		}
	}

}
