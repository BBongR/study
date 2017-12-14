package fdsafdsa;

import java.util.Scanner;

public class 구구단_2단역순으로출력 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("출력할 단 수를 입력: ");
		int a = scanner.nextInt();

		for (int i = 9; i >= 1; i--) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}

}
