package fdsafdsa;

import java.util.Scanner;

public class N1부터N2까지의합 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 수 를 입력하세요: ");
		int a = scanner.nextInt();

		System.out.print("두번째 수를 입력하세요: ");
		int b = scanner.nextInt();

		int sum = 0;

		for (int i = a; i <= b; i++) {
			System.out.print(i);

			if (i < b) {
				System.out.print(" + ");
			}else {
				System.out.print(" = ");
			}
			
			sum = sum + i;
		}

		System.out.println(sum);
	}

}
