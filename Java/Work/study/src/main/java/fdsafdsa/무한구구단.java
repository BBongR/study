package fdsafdsa;

import java.util.Scanner;

public class 무한구구단 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (;;) {

			System.out.print("시작단: ");
			int s = scanner.nextInt();

			if (s == 0) {
				break;
			}

			System.out.print("종료단: ");
			int e = scanner.nextInt();

			if (e == 0) {
				break;
			}

			if (s > e) {

				int temp = s;
				s = e;
				e = temp;

			}

			for (int i = s; i <= e; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.print(i + "*" + j + "=" + i * j + ", ");
				}
				System.out.println();
			}

		}

	}

}
