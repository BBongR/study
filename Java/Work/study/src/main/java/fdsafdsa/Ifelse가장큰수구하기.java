package fdsafdsa;

import java.util.Scanner;

public class Ifelse가장큰수구하기 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째수를 입력하세요. ");
		int a = scanner.nextInt();

		System.out.print("두번째수를 입력하세요. ");
		int b = scanner.nextInt();

		System.out.print("세번째수를 입력하세요. ");
		int c = scanner.nextInt();

		if (a > b && a > c) {
			System.out.println("입력 받은 수중 가장 큰 수는 " + a + "입니다.");
		} else if (b > a && b > c) {
			System.out.println("입력 받은 수중 가장 큰 수는 " + b + "입니다.");
		} else /* if (c > a && c > b) */ {
			System.out.println("입력 받은 수중 가장 큰 수는 " + c + "입니다.");
		}

		if (a > b) {
			if (a > c) {
				System.out.println("입력 받은 수중 가장 큰 수는 " + a + "입니다.");
			} else {
				System.out.println("입력 받은 수중 가장 큰 수는 " + c + "입니다.");
			}
		} else {
			if (b > c) {
				System.out.println("입력 받은 수중 가장 큰 수는 " + b + "입니다.");
			} else {
				System.out.println("입력 받은 수중 가장 큰 수는 " + c + "입니다.");
			}
		}

		int max1 = (a > b) ? a : b;
		int max2 = (b > c) ? b : c;
		int max3 = (max1 > max2) ? max1 : max2;
		System.out.println("입력 받은 수중 가장 큰 수는 " + max3 + "입니다.");
	}

}
